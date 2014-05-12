
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A molecule participating in an interaction.
 * 
 * <p>Java class for participant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://psi.hupo.org/mi/mif}names" minOccurs="0"/>
 *         &lt;element name="xref" type="{http://psi.hupo.org/mi/mif}xref" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="interactorRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="interactor" type="{http://psi.hupo.org/mi/mif}interactor"/>
 *           &lt;element name="interactionRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/choice>
 *         &lt;element name="participantIdentificationMethodList" type="{http://psi.hupo.org/mi/mif}participantIdentificationMethodList" minOccurs="0"/>
 *         &lt;element name="biologicalRole" type="{http://psi.hupo.org/mi/mif}cvType" minOccurs="0"/>
 *         &lt;element name="experimentalRoleList" type="{http://psi.hupo.org/mi/mif}experimentalRoleList" minOccurs="0"/>
 *         &lt;element name="experimentalPreparationList" type="{http://psi.hupo.org/mi/mif}experimentalPreparationList" minOccurs="0"/>
 *         &lt;element name="experimentalInteractorList" type="{http://psi.hupo.org/mi/mif}experimentalInteractorList" minOccurs="0"/>
 *         &lt;element name="featureList" type="{http://psi.hupo.org/mi/mif}featureList" minOccurs="0"/>
 *         &lt;element name="hostOrganismList" type="{http://psi.hupo.org/mi/mif}hostOrganismList" minOccurs="0"/>
 *         &lt;element name="confidenceList" type="{http://psi.hupo.org/mi/mif}confidenceList" minOccurs="0"/>
 *         &lt;element name="parameterList" type="{http://psi.hupo.org/mi/mif}parameterList" minOccurs="0"/>
 *         &lt;element name="attributeList" type="{http://psi.hupo.org/mi/mif}attributeList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participant", propOrder = {
    "names",
    "xref",
    "interactionRef",
    "interactor",
    "interactorRef",
    "participantIdentificationMethodList",
    "biologicalRole",
    "experimentalRoleList",
    "experimentalPreparationList",
    "experimentalInteractorList",
    "featureList",
    "hostOrganismList",
    "confidenceList",
    "parameterList",
    "attributeList"
})
public class Participant {

    protected Names names;
    protected Xref xref;
    protected Integer interactionRef;
    protected Interactor interactor;
    protected Integer interactorRef;
    protected ParticipantIdentificationMethodList participantIdentificationMethodList;
    protected CvType biologicalRole;
    protected ExperimentalRoleList experimentalRoleList;
    protected ExperimentalPreparationList experimentalPreparationList;
    protected ExperimentalInteractorList experimentalInteractorList;
    protected FeatureList featureList;
    protected HostOrganismList hostOrganismList;
    protected ConfidenceList confidenceList;
    protected ParameterList parameterList;
    protected AttributeList attributeList;
    @XmlAttribute(required = true)
    protected int id;

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link Names }
     *     
     */
    public Names getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link Names }
     *     
     */
    public void setNames(Names value) {
        this.names = value;
    }

    /**
     * Gets the value of the xref property.
     * 
     * @return
     *     possible object is
     *     {@link Xref }
     *     
     */
    public Xref getXref() {
        return xref;
    }

    /**
     * Sets the value of the xref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xref }
     *     
     */
    public void setXref(Xref value) {
        this.xref = value;
    }

    /**
     * Gets the value of the interactionRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteractionRef() {
        return interactionRef;
    }

    /**
     * Sets the value of the interactionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteractionRef(Integer value) {
        this.interactionRef = value;
    }

    /**
     * Gets the value of the interactor property.
     * 
     * @return
     *     possible object is
     *     {@link Interactor }
     *     
     */
    public Interactor getInteractor() {
        return interactor;
    }

    /**
     * Sets the value of the interactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interactor }
     *     
     */
    public void setInteractor(Interactor value) {
        this.interactor = value;
    }

    /**
     * Gets the value of the interactorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteractorRef() {
        return interactorRef;
    }

    /**
     * Sets the value of the interactorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteractorRef(Integer value) {
        this.interactorRef = value;
    }

    /**
     * Gets the value of the participantIdentificationMethodList property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantIdentificationMethodList }
     *     
     */
    public ParticipantIdentificationMethodList getParticipantIdentificationMethodList() {
        return participantIdentificationMethodList;
    }

    /**
     * Sets the value of the participantIdentificationMethodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantIdentificationMethodList }
     *     
     */
    public void setParticipantIdentificationMethodList(ParticipantIdentificationMethodList value) {
        this.participantIdentificationMethodList = value;
    }

    /**
     * Gets the value of the biologicalRole property.
     * 
     * @return
     *     possible object is
     *     {@link CvType }
     *     
     */
    public CvType getBiologicalRole() {
        return biologicalRole;
    }

    /**
     * Sets the value of the biologicalRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvType }
     *     
     */
    public void setBiologicalRole(CvType value) {
        this.biologicalRole = value;
    }

    /**
     * Gets the value of the experimentalRoleList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalRoleList }
     *     
     */
    public ExperimentalRoleList getExperimentalRoleList() {
        return experimentalRoleList;
    }

    /**
     * Sets the value of the experimentalRoleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalRoleList }
     *     
     */
    public void setExperimentalRoleList(ExperimentalRoleList value) {
        this.experimentalRoleList = value;
    }

    /**
     * Gets the value of the experimentalPreparationList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalPreparationList }
     *     
     */
    public ExperimentalPreparationList getExperimentalPreparationList() {
        return experimentalPreparationList;
    }

    /**
     * Sets the value of the experimentalPreparationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalPreparationList }
     *     
     */
    public void setExperimentalPreparationList(ExperimentalPreparationList value) {
        this.experimentalPreparationList = value;
    }

    /**
     * Gets the value of the experimentalInteractorList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentalInteractorList }
     *     
     */
    public ExperimentalInteractorList getExperimentalInteractorList() {
        return experimentalInteractorList;
    }

    /**
     * Sets the value of the experimentalInteractorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentalInteractorList }
     *     
     */
    public void setExperimentalInteractorList(ExperimentalInteractorList value) {
        this.experimentalInteractorList = value;
    }

    /**
     * Gets the value of the featureList property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureList }
     *     
     */
    public FeatureList getFeatureList() {
        return featureList;
    }

    /**
     * Sets the value of the featureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureList }
     *     
     */
    public void setFeatureList(FeatureList value) {
        this.featureList = value;
    }

    /**
     * Gets the value of the hostOrganismList property.
     * 
     * @return
     *     possible object is
     *     {@link HostOrganismList }
     *     
     */
    public HostOrganismList getHostOrganismList() {
        return hostOrganismList;
    }

    /**
     * Sets the value of the hostOrganismList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostOrganismList }
     *     
     */
    public void setHostOrganismList(HostOrganismList value) {
        this.hostOrganismList = value;
    }

    /**
     * Gets the value of the confidenceList property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceList }
     *     
     */
    public ConfidenceList getConfidenceList() {
        return confidenceList;
    }

    /**
     * Sets the value of the confidenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceList }
     *     
     */
    public void setConfidenceList(ConfidenceList value) {
        this.confidenceList = value;
    }

    /**
     * Gets the value of the parameterList property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterList }
     *     
     */
    public ParameterList getParameterList() {
        return parameterList;
    }

    /**
     * Sets the value of the parameterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterList }
     *     
     */
    public void setParameterList(ParameterList value) {
        this.parameterList = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeList }
     *     
     */
    public AttributeList getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeList }
     *     
     */
    public void setAttributeList(AttributeList value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
