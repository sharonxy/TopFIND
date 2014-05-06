class ProteinsController < ApplicationController

  require 'graph/path'
  require 'graph/mapMouseHuman'

  hobo_model_controller
  
  caches_page :show
  
  autocomplete :name, :query_scope => [:name_contains, :ac_contains]
  auto_actions :all
  show_actions :filter
  
  def index
  	
    @documentations = Documentation.all.group_by(&:name)
    @perpage = 20
  	quick = 0
  	
  	joins = Array.new
  	includes = Array.new
    conditions = Array.new
    select = ['DISTINCT proteins.*']
    having = Array.new
    andconditions = Array.new
    andqueries = Array.new
    orconditions = Array.new
    orqueries = Array.new
    conditionvars = Hash.new
    
    #take the shortcut when searching for a single existing accession
  	if params[:query].present?
  	  # if it matches the accession number schema
  	  match = params[:query].match(/^[A-Za-z]\w{5}(-\d)?$/).present?
  	  protein = Protein.find_by_ac(params[:query]) if match
  	end
    if protein.present?
     redirect_to protein
    end
    
    
    # else do normal search
    if (params.keys&['query','species','function','modification','chromosome','minntermini','minctermini']).present? && !protein.present?

      #extract species
      if params[:query].present?
  
     
        match = params[:query].match(/(human|mouse|arabidopsis|yeast|ecoli)/)
        if match
           params[:query].gsub!(/((\A|\s)(human|mouse|arabidopsis|yeast|ecoli|)(\z|\s))/,'')
           case match[1]
             when 'human'
               params[:species] = 'Homo sapiens'
             when 'mouse'
               params[:species] = 'Mus musculus'
             when 'arabidopsis'
               params[:species] = 'Arabidopsis thaliana'
             when 'yeast'
               params[:species] = 'Saccharomyces cerevisiae'
             when 'ecoli'
               params[:species] = 'Esherichia coli'
           end
         end  
      end 
      
      #remove chromosome information and return error message if we try unsupported search agains chromosome
      if params[:species].present? && (params[:chromosome].present? || params[:arm].present? || params[:band].present?)
        unless params[:species] == 'Homo sapiens' || params[:species] == 'Mus musculus'
          flash[:notice] = "Search by chromosome location of the encoding gene is currently only supported for<i>Homo sapiens</i> and <i>Mus musculus</i>. Below you see results matching your search without restriction by chromosome location."
          params[:chromosome] =''
          params[:arm] =''
          params[:band] =''
        end
      end     
      
      genename = params[:query].match(/^([a-zA-Z]+)(\s|-|_|)(\d+)$/)
      variations = ['','-','_']
      if genename.present?
        namevariants = variations.map { |c| "#{genename[1]}#{c}#{genename[3]}"}.join("','")
      else
        namevariants = [params[:query]]
      end
  		
      #we always join in those tables when we have a query
      if params[:query].present?
        joins << :proteinnames
      end
      
      #species  
        if params[:species].present?   
          andconditions << "species.name = '#{params[:species]}'" 
          joins <<  :species 
        end
      #//species   
      
      #modification
        if params[:modification].present?
          andconditions << "(kws_terminusmodifications.name = '#{params[:modification]}' OR kws.name = '#{params[:modification]}')"

          joins <<  {:nterms => {:terminusmodification => :kw} }
          joins <<  {:cterms => {:terminusmodification => :kw} }
        end
      #//modification       

      
      #Number of N termini
        if params[:minntermini].present?
          having << "nterminicount >= '#{params[:minntermini]}'"
          select << 'count(nterms.id) as nterminicount'
          joins << :nterms
        end
      #//ntermini 

      #Number of C termini
        if params[:minctermini].present?
          having << "cterminicount >= '#{params[:minctermini]}'"
          select << 'count(cterms.id) as cterminicount'
          joins << :cterms
        end
      #//ctermini
               
 
      #chromosome
        if params[:chromosome].present?
          andconditions << "proteins.chromosome = '#{params[:chromosome]}'" 
        end
        if params[:chromosomeposition].present?
          andconditions << "proteins.band LIKE ?"
          andqueries << "%#{params[:chromosomeposition]}%"
        end
      #//chromosome      
  
      #function
        if params[:function].present?
          if params[:function] == 'protease'
            joins << :substrates
          elsif params[:function] =='inhibitor'
            joins << :inhibited_proteases
          end
        end
      #//function    
      
      # #merops
        # if params[:query].present?
          # orconditions << "meropscode = '#{params[:query]}'"
          # orconditions << "meropsfamily = '#{params[:query]}'"
          # orconditions << "meropssubfamily = '#{params[:query]}'"
        # end
      # #//merops
# 
#       
      # #search for exact matches if we have a query
      # if params[:query].present?
        # if namevariants.present?
          # orconditions << "proteins.name IN ('#{namevariants}')"
          # orconditions << "proteinnames.full IN ('#{namevariants}')"
          # orconditions << "proteinnames.short IN ('#{namevariants}')"   
          # orconditions << "gns.name IN ('#{namevariants}')"  
          # orconditions << "gn_synonyms.synonym IN ('#{namevariants}')"
          # joins << {:gn => :synonyms}     
        # end 
        # orconditions << "proteins.name LIKE ?"
        # orqueries << "%#{params[:query]}%"
        # orconditions << "proteins.ac LIKE ?"
        # orqueries << "%#{params[:query]}%"
        # orconditions << "proteinnames.full LIKE ?"
        # orqueries << "%#{params[:query]}%"
        # orconditions << "proteinnames.short LIKE ?"
        # orqueries << "%#{params[:query]}%"
        # # conditionvars[:likequery] = params[:query]
      # end


      #match to proteinname, gene name, alternate names, merops family or code
      if params[:query].present?
        orconditions << "searchnames.name IN ('#{namevariants}')"
        orconditions << "searchnames.name LIKE ?"
        orqueries << "#{params[:query]}%"
        joins << :searchnames
      end

      
      querystring = Array.new
      querystring << andconditions if andconditions.present?
      querystring << "(#{orconditions.join(' OR ')})" if orconditions.present?
      querystring.compact!
      conditions << querystring.join(' AND ')
      conditions << andqueries
      conditions << orqueries
      conditions = conditions.flatten.compact
      
      res = Protein.scoped :joins => joins, :select => select.join(','), :conditions => conditions, :group => 'proteins.ac', :order => 'proteins.name' , :having => having if having.present?     
      res = Protein.scoped :joins => joins, :select => select.join(','), :conditions => conditions, :group => 'proteins.ac', :order => 'proteins.name'  unless having.present?
      
      if res.first.present? && res.last == res.first
        redirect_to res.first
      else
        hobo_index res 
      end 
    else #if no searchparams present
      hobo_index Protein, :group => 'proteins.ac', :order => 'proteins.name'
    end
  end  		

  
  
  def show
    
    #convert request into :id, :isoform, chain
    @iso = nil
    @chain = nil
    if params[:id].include?('-')
      id = params[:id].split('-').first
      # @iso = Isoform.ac_is(params[:id]).first     
    else
      id = params[:id]
      # @chain = Chain.name_is(params[:chain]).first  
    end
    
    if params.key?(:chain)      
      # @chain = Chain.name_is(params[:chain]).first 
    end
     
   
    # hobo_show @protein = Protein.id_or_ac_or_name_is(id).first  
    hobo_show @protein = Protein.find_by_ac(id)  
     
    @annotations_main = @protein.ccs.main
    @annotations_additional = @protein.ccs.additional
    @documentations = Documentation.all.group_by(&:name)
    params[:ppi].present? ? @ppi = params[:ppi] : @ppi = false


    
    @cleavages = Cleavage.apply_scopes(
      :protease_is => @protein)
    @cleavages = @cleavages.map {|x| x if x.substrate_id}.compact
    
    @cleavagesites = Cleavage.apply_scopes(
      :protease_is => @protein).*.cleavagesite
    @cleavagesites.delete(nil)
    
    @inverse_cleavages = Cleavage.apply_scopes(
      :substrate_is => @protein)
      
    @inhibitions = Inhibition.apply_scopes(
      :inhibitor_is => @protein
      )

    @inverse_inhibitions = Inhibition.apply_scopes(
      :inhibited_protease_is => @protein
      )      
      
    @cterms = Cterm.apply_scopes(
      :protein_is => @protein
      )
      
    @nterms = Nterm.apply_scopes(
      :protein_is => @protein
      )      
    
    analysis = Analysis.new(@protein,
                @cleavages,
                @cleavagesites,
                @inverse_cleavages,
                @inhibitions,
                @inverse_inhibitions,
                @cterms,
                @nterms,
                false,
                [],
                @ppi)
    @network = analysis.graph
    @simplepanel = analysis.simplepanel
    if @protein.isprotease && !@cleavagesites.nil?
      @icelogopath = analysis.icelogo      
      @heatmap = Heatmap.new(@cleavagesites)
    end
    
    
    @params = params
    evidences = @protein.inverse_cleavages.*.evidences << @protein.cleavages.*.evidences << @protein.inhibitions.*.evidences << @protein.inverse_inhibitions.*.evidences << @protein.nterms.*.evidences << @protein.cterms.*.evidences
    evidences = evidences.flatten.uniq
    @filter_directness = evidences.*.directness.flatten.uniq
    @filter_physrel = evidences.*.phys_relevance.flatten.uniq
    @filter_evidencecodes = evidences.*.evidencecodes.flatten.uniq.*.name.uniq
    @filter_confidence_type = evidences.*.confidence_type.flatten.uniq
    @filter_tissues = evidences.*.tissues.flatten.uniq.*.name.uniq
    @filter_sources = evidences.*.evidencesource.flatten.compact.uniq.*.dbname.uniq
    labs = evidences.*.lab
    labs.present? ? @filter_labs = labs.flatten.uniq.compact.sort : @filtere_labs = labs
    @filter_evidences = evidences.*.name.uniq
    @filter_gocomponents = evidences.*.gocomponents.flatten.uniq.*.name.uniq
    @filter_methodologies = evidences.*.methodology.uniq
    @filter_methodsystems = evidences.*.method_system.uniq
    @filter_methodproteasesources = evidences.*.method_protease_source.uniq
    @filter_proteaseassignmentconfidence = evidences.*.proteaseassignment_confidence.uniq
    # @filter_proteaseassignment = ['I no other proteolytic activities present', 'II proteolytic system present but abolished', 'III proteolytic system present but impaired', 'IV proteolytic system present and active','unknown']
     
  end


  def filter
    @params = params
    #remove isofrom from ac
    id = params[:id].split('-').first
    hobo_show @protein = Protein.id_or_ac_or_name_is(id).first  
    ids = nil
    params[:ppi].present? ? @ppi = params[:ppi] : @ppi = false
    
    #filter:
    if params[:phys_rel].present?
    	paramids = Evidence.phys_relevance_in(params[:phys_rel]).*.id 
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:directness].present?
  		paramids = Evidence.directness_in(params[:directness]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:confidence].present?  && params[:confidence_type].present?
      paramids = Evidence.confidence_gte(params[:confidence]).*.id
      paramids2 = Evidence.confidence_type_in(params[:confidence_type]).*.id
      ids.present? ? ids = ids & paramids & paramids2 : ids = paramids & paramids2
    end
    if params[:tissues].present?
  		paramids = Evidence.tissues_tsid_in(params[:tissues]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:evidencecodes].present?
  		paramids = Evidence.evidencecodes_name_in(params[:evidencecodes]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:methodologies].present?
  		paramids = Evidence.methodology_in(params[:methodologies]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:methodsystems].present?
      paramids = Evidence.method_system_in(params[:methodsystems]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:methodproteasesources].present?
      paramids = Evidence.method_protease_source_in(params[:methodproteasesources]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:proteaseassignmentconfidences].present?
      paramids = Evidence.proteaseassignment_confidence_in(params[:proteaseassignmentconfidences]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:sources].present?
  		paramids = Evidence.evidencesource_dbname_in(params[:sources]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:labs].present?
  		paramids = Evidence.lab_in(params[:labs]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:evidences].present?
  		paramids = Evidence.name_in(params[:evidences]).*.id
    	ids.present? ? ids = ids & paramids : ids = paramids
    end
    
    ids.blank? ?  filteredevidences = nil : filteredevidences = ids.uniq

 
    @annotations_main = @protein.ccs.main
    @annotations_additional = @protein.ccs.additional
    @documentations = Documentation.all.group_by(&:name)

    @allcleavages = Cleavage.apply_scopes(
      :protease_is => @protein)
	 @allcleavages = @allcleavages.map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact      
    @cleavagesites = @allcleavages.*.cleavagesite.compact
    
    
    @cleavages = @allcleavages.map {|x| x if x.substrate_id}.compact
    
    @inverse_cleavages = Cleavage.apply_scopes(
      :substrate_is => @protein).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact
      
    @inhibitions = Inhibition.apply_scopes(
      :inhibitor_is => @protein
      ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact

    @inverse_inhibitions = Inhibition.apply_scopes(
      :inhibited_protease_is => @protein
      ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact    
      
    @cterms = Cterm.apply_scopes(
      :protein_is => @protein
      ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact    
      
    @nterms = Nterm.apply_scopes(
      :protein_is => @protein
    ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact         

      
    analysis = Analysis.new(@protein,
                @cleavages,
                @cleavagesites,
                @inverse_cleavages,
                @inhibitions,
                @inverse_inhibitions,
                @cterms,
                @nterms,
                true,
                filteredevidences,
                @ppi)
    @network = analysis.graph
    @simplepanel = analysis.simplepanel

    if @protein.isprotease && !@cleavagesites.nil? && !@cleavagesites.empty?
      @icelogopath = analysis.icelogo('_filtered')      
      @heatmap = Heatmap.new(@cleavagesites)
    end
            
    
    evidences = @protein.inverse_cleavages.*.evidences << @protein.cleavages.*.evidences << @protein.inhibitions.*.evidences << @protein.inverse_inhibitions.*.evidences << @protein.nterms.*.evidences << @protein.cterms.*.evidences
    evidences = evidences.flatten.uniq
    @filter_directness = evidences.*.directness.flatten.uniq
    @filter_physrel = evidences.*.phys_relevance.flatten.uniq
    @filter_confidence_type = evidences.*.confidence_type.flatten.uniq
    @filter_evidencecodes = evidences.*.evidencecodes.flatten.uniq.*.name.sort
    @filter_tissues = evidences.*.tissues.flatten.uniq.*.name.sort
    @filter_evidencecodes = evidences.*.evidencecodes.flatten.uniq.*.name.sort
    @filter_tissues = evidences.*.tissues.flatten.uniq.*.name.sort
    @filter_sources = evidences.*.evidencesource.flatten.compact.uniq.*.dbname.sort
    labs = evidences.*.lab
    labs.present? ? @filter_labs = labs.flatten.uniq.compact.sort : @filtere_labs = labs
    @filter_evidences = evidences.*.name.sort
    @filter_gocomponents = evidences.*.gocomponents.flatten.uniq.*.name.sort
    @filter_methodologies = evidences.*.methodology.uniq
    @filter_methodsystems = evidences.*.method_system.uniq
    @filter_methodproteasesources = evidences.*.method_protease_source.uniq
    @filter_proteaseassignmentconfidence = evidences.*.proteaseassignment_confidence.uniq
    
  end 
  
 
  def apiget
    @params = params
    #remove isofrom from ac
    id = params[:id].split('-').first
    @protein = Protein.id_or_ac_or_name_is(id).first  
    ids = nil
    
    @getfeatures = params.has_key?('get_xcorr_features')
    @getevidences = params.has_key?('get_evidences')
    
    #filter:
    if params[:phys_rel].present?
      filter = true
      paramids = Evidence.phys_relevance_in(params[:phys_rel]).*.id 
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:directness].present?
      filter = true
      paramids = Evidence.directness_in(params[:directness]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:tissues].present?
      filter = true
      paramids = Evidence.tissues_ac_in(params[:tissues]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:evidencecodes].present?
      filter = true
      paramids = Evidence.evidencecodes_name_in(params[:evidencecodes]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    # if params[:methods].present?
      # paramids = Evidence.method_like(params[:methods]).*.id
      # ids.present? ? ids = ids & paramids : ids = paramids
    # end
    # if params[:sources].present?
      # paramids = Evidence.evidencesource_dbname_in(params[:sources]).*.id
      # ids.present? ? ids = ids & paramids : ids = paramids
    # end
    if params[:labs].present?
      filter = true
      paramids = Evidence.lab_in(params[:labs]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    if params[:evidences].present?
      filter = true
      paramids = Evidence.name_in(params[:evidences]).*.id
      ids.present? ? ids = ids & paramids : ids = paramids
    end
    
    ids.blank? ?  filteredevidences = nil : filteredevidences = ids.uniq

 
    @annotations_main = @protein.ccs.main
    @annotations_additional = @protein.ccs.additional
    @documentations = Documentation.all.group_by(&:name)

    unless filter
      @cleavages = Cleavage.apply_scopes(
        :protease_is => @protein)
      @cleavages = @cleavages.map {|x| x if x.substrate_id}.compact
      
      @cleavagesites = Cleavage.apply_scopes(
        :protease_is => @protein).*.cleavagesite
      @cleavagesites.delete(nil)
      
      @inverse_cleavages = Cleavage.apply_scopes(
        :substrate_is => @protein)
        
      @inhibitions = Inhibition.apply_scopes(
        :inhibitor_is => @protein
        )
  
      @inverse_inhibitions = Inhibition.apply_scopes(
        :inhibited_protease_is => @protein
        )      
        
      @cterms = Cterm.apply_scopes(
        :protein_is => @protein
        )
        
      @nterms = Nterm.apply_scopes(
        :protein_is => @protein
        )      
    else 
      #filtered
      @allcleavages = Cleavage.apply_scopes(
        :protease_is => @protein)
      @allcleavages = @allcleavages.map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact      
      @cleavagesites = @allcleavages.*.cleavagesite.compact
      
      
      @cleavages = @allcleavages.map {|x| x if x.substrate_id}.compact
      
      @inverse_cleavages = Cleavage.apply_scopes(
        :substrate_is => @protein).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact
        
      @inhibitions = Inhibition.apply_scopes(
        :inhibitor_is => @protein
        ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact
  
      @inverse_inhibitions = Inhibition.apply_scopes(
        :inhibited_protease_is => @protein
        ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact    
        
      @cterms = Cterm.apply_scopes(
        :protein_is => @protein
        ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact    
        
      @nterms = Nterm.apply_scopes(
        :protein_is => @protein
      ).map {|x| x if (filteredevidences & x.evidences.*.id).present?}.compact         
  
    end #filtered              
    
    evidences = @protein.inverse_cleavages.*.evidences << @protein.cleavages.*.evidences << @protein.inhibitions.*.evidences << @protein.inverse_inhibitions.*.evidences << @protein.nterms.*.evidences << @protein.cterms.*.evidences
    evidences = evidences.flatten.uniq
    
    respond_to do |format|
      format.xml
    end    
    
  end 
  
  def apisearch
    @perpage = 50
    count = params.has_key?('count')
    spec = params[:species]
      
      joins = Array.new
      joins << :species if params[:species].present?
      joins << :nterms if (params[:ntermini_at].present? || params[:ntermini_before].present? || params[:ntermini_after].present?)
      # joins << {:nterms => [:evidences]} if ((params[:directness].present? || params[:relevance].present? || params[:confidence_greater].present?) && (params[:ntermini_at].present? || params[:ntermini_before].present? || params[:ntermini_after].present?))
            
      joins << :cterms if (params[:ctermini_at].present? || params[:ctermini_before].present? || params[:ctermini_after].present?)
      # joins << {:cterms => [:evidences]} if ((params[:directness].present? || params[:relevance].present? || params[:confidence_greater].present?) && (params[:ctermini_at].present? || params[:ctermini_before].present? || params[:ctermini_after].present?))
      
      joins << :cleavages if (params[:cleavages_at].present? || params[:cleavages_before].present? || params[:cleavages_after].present?)
      # joins << {:cleavages => [:evidences]} if ((params[:directness].present? || params[:relevance].present? || params[:confidence_greater].present?) && (params[:cleavages_at].present? || params[:cleavages_before].present? || params[:cleavages_after].present? || params[:cleaved_by].present? || params[:cleaves].present?))

      joins << :inhibitions if (params[:inhibits].present? || params[:inhibited_by].present?)
      joins << :proteases if params[:cleaved_by].present?
      joins << :substrates if params[:cleaves].present?
      joins << :inhibitors if params[:inhibits].present?
      joins << :inhibited_proteases if params[:inhibited_by].present?
    
      
      conditions = Array.new
      conditions << "species.name = '#{params[:species]}'" if params[:species].present?
      conditions << "proteases_proteins.ac IN ('#{params[:cleaved_by]}')" if params[:cleaved_by].present?
      conditions << "substrates_proteins.ac IN ('#{params[:cleaves]}')" if params[:cleaves].present?      
      conditions << "inhibitors_proteins.ac IN ('#{params[:inhibits]}')" if params[:inhibits].present?      
      conditions << "inhibited_proteases_proteins.ac IN ('#{params[:inhibited_by]}')" if params[:inhibited_by].present?
      conditions << "cleavages.pos = '#{params[:cleavages_at]}'" if params[:cleavages_at].present?
      conditions << "cleavages.pos < '#{params[:cleavages_before]}'" if params[:cleavages_before].present?
      conditions << "cleavages.pos > '#{params[:cleavages_after]}'" if params[:cleavages_after].present?
      conditions << "nterms.pos = '#{params[:ntermini_at]}'" if params[:ntermini_at].present?
      conditions << "nterms.pos < '#{params[:ntermini_before]}'" if params[:ntermini_before].present?
      conditions << "nterms.pos > '#{params[:ntermini_after]}'" if params[:ntermini_after].present?
      conditions << "cterms.pos = '#{params[:ctermini_at]}'" if params[:ctermini_at].present?
      conditions << "cterms.pos < '#{params[:ctermini_before]}'" if params[:ctermini_before].present?
      conditions << "cterms.pos > '#{params[:ctermini_after]}'" if params[:ctermini_after].present?
      # conditions << "evidences.directness = '#{params[:directness]}'" if params[:directness].present?
      # conditions << "evidences.phys_relevance = '#{params[:relevance]}'" if params[:relevance].present?
      # conditions << "evidences.confidence >= '#{params[:confidence_greater]}'" if params[:confidence_greater].present?
      
      @proteins = Protein.all :joins => joins, :conditions => conditions.join(' AND ').to_a, :group => 'proteins.ac'  
      @proteins = Protein.all :joins => joins, :conditions => conditions.join(' AND ').to_a, :group => 'proteins.ac' unless params[:site_specific_proteases].present?
      if params[:site_specific_proteases].present? 
      	conditions = Array.new
      	conditions << "pos = '#{params[:position]}'"
      	conditions << "proteins.ac = '#{params[:protein]}'"
      	cs = Cleavage.all :joins => [:substrate], :conditions => conditions.join(' AND ').to_a 
      	acs = cs.map {|c| Protein.ac_is(c.protease.ac).first.ac}.uniq.join("','")
      	@proteins = Protein.all :conditions => ["ac IN ('#{acs}')"]
      end

      
      if count
        @count = @proteins.count
        @pages = (@count/@perpage).ceil
      end
    
      @proteins = @proteins.paginate :page => params[:page], :per_page => @perpage
     
    respond_to do |format|
      format.xml
    end    
  end
    
  def blabla
    start = params["start"]
    targets = params["targets"]
    maxLength = params["maxLength"]
    nwOrg = params["network_org"]
    listOrg = params["list_org"]
            
    if(start != "" && 
        targets != "" &&
        maxLength != "")
        
        # clean up input
        start = start.strip
        targets = targets.split
        maxLength = maxLength.to_i
        if(nwOrg == "human") 
          nwOrg = 1 
          else 
            nwOrg = 2 
            end
        if(listOrg == "human") 
          listOrg = 1 
          else 
            listOrg = 2 
            end
        # map mouse human
        mapper = MapMouseHuman.new()
        map = []
        if(nwOrg > listOrg) # nw is mouse and list is human
          map = mapper.mouse4human(targets)
          targets = map.collect{|x| x["m"]}
          start = mapper.mouse4human([start])[0]["m"]
        elsif(nwOrg < listOrg)  # nw is human and list is mouse
          map = mapper.human4mouse(targets)
          targets = map.collect{|x| x["h"]}
          puts start
          puts [start]
          start = mapper.human4mouse([start])[0]["h"]
        else 
        end
        
        # path finding
        finder = Path.new(maxLength)
        finder.graph_from_sql(nwOrg)
        @allPaths = Hash.new
        targets.each{|target|
          res = finder.find_paths(start, target)
          @allPaths[target] = res.clone
          }
          
        # get gene names
        all_ps = []
        @allPaths.each_value{|v| v.each{|l| all_ps += l}}
        all_ps = all_ps.uniq + @allPaths.keys
        @gnames = finder.get_gene_names(all_ps)
        
        # sort proteins
        @sortet_subs = @allPaths.keys.sort{|x, y| @allPaths[y].size <=> @allPaths[x].size}
        
      else
        puts 'else'
        render :action => 'tryouts'
      end
  end
  
  def tryouts
  end
  
  def tryouts2
    query = ["P08246", "P01009", "P01023", "P09958"]
  end

    

end
