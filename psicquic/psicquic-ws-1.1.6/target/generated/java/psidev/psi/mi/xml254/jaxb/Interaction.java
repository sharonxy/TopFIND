
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A molecular interaction.
 * 
 * <p>Java class for interaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://psi.hupo.org/mi/mif}names" minOccurs="0"/>
 *         &lt;element name="xref" type="{http://psi.hupo.org/mi/mif}xref" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="availabilityRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="availability" type="{http://psi.hupo.org/mi/mif}availability"/>
 *         &lt;/choice>
 *         &lt;element name="experimentList" type="{http://psi.hupo.org/mi/mif}experimentList" minOccurs="0"/>
 *         &lt;element name="participantList" type="{http://psi.hupo.org/mi/mif}participantList"/>
 *         &lt;element name="inferredInteractionList" type="{http://psi.hupo.org/mi/mif}inferredInteractionList" minOccurs="0"/>
 *         &lt;element name="interactionType" type="{http://psi.hupo.org/mi/mif}cvType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intraMolecular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="negative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="confidenceList" type="{http://psi.hupo.org/mi/mif}confidenceList" minOccurs="0"/>
 *         &lt;element name="parameterList" type="{http://psi.hupo.org/mi/mif}parameterList" minOccurs="0"/>
 *         &lt;element name="attributeList" type="{http://psi.hupo.org/mi/mif}attributeList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="imexId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interaction", propOrder = {
    "names",
    "xref",
    "availability",
    "availabilityRef",
    "experimentList",
    "participantList",
    "inferredInteractionList",
    "interactionTypes",
    "modelled",
    "intraMolecular",
    "negative",
    "confidenceList",
    "parameterList",
    "attributeList"
})
public class Interaction {

    protected Names names;
    protected Xref xref;
    protected Availability availability;
    protected Integer availabilityRef;
    protected ExperimentList experimentList;
    @XmlElement(required = true)
    protected ParticipantList participantList;
    protected InferredInteractionList inferredInteractionList;
    @XmlElement(name = "interactionType")
    protected List<CvType> interactionTypes;
    protected Boolean modelled;
    @XmlElement(defaultValue = "false")
    protected Boolean intraMolecular;
    @XmlElement(defaultValue = "false")
    protected Boolean negative;
    protected ConfidenceList confidenceList;
    protected ParameterList parameterList;
    protected AttributeList attributeList;
    @XmlAttribute
    protected String imexId;
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
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Availability }
     *     
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Availability }
     *     
     */
    public void setAvailability(Availability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the availabilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailabilityRef() {
        return availabilityRef;
    }

    /**
     * Sets the value of the availabilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailabilityRef(Integer value) {
        this.availabilityRef = value;
    }

    /**
     * Gets the value of the experimentList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentList }
     *     
     */
    public ExperimentList getExperimentList() {
        return experimentList;
    }

    /**
     * Sets the value of the experimentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentList }
     *     
     */
    public void setExperimentList(ExperimentList value) {
        this.experimentList = value;
    }

    /**
     * Gets the value of the participantList property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantList }
     *     
     */
    public ParticipantList getParticipantList() {
        return participantList;
    }

    /**
     * Sets the value of the participantList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantList }
     *     
     */
    public void setParticipantList(ParticipantList value) {
        this.participantList = value;
    }

    /**
     * Gets the value of the inferredInteractionList property.
     * 
     * @return
     *     possible object is
     *     {@link InferredInteractionList }
     *     
     */
    public InferredInteractionList getInferredInteractionList() {
        return inferredInteractionList;
    }

    /**
     * Sets the value of the inferredInteractionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InferredInteractionList }
     *     
     */
    public void setInferredInteractionList(InferredInteractionList value) {
        this.inferredInteractionList = value;
    }

    /**
     * Gets the value of the interactionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvType }
     * 
     * 
     */
    public List<CvType> getInteractionTypes() {
        if (interactionTypes == null) {
            interactionTypes = new ArrayList<CvType>();
        }
        return this.interactionTypes;
    }

    /**
     * Gets the value of the modelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModelled() {
        return modelled;
    }

    /**
     * Sets the value of the modelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModelled(Boolean value) {
        this.modelled = value;
    }

    /**
     * Gets the value of the intraMolecular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraMolecular() {
        return intraMolecular;
    }

    /**
     * Sets the value of the intraMolecular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntraMolecular(Boolean value) {
        this.intraMolecular = value;
    }

    /**
     * Gets the value of the negative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegative() {
        return negative;
    }

    /**
     * Sets the value of the negative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegative(Boolean value) {
        this.negative = value;
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
     * Gets the value of the imexId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImexId() {
        return imexId;
    }

    /**
     * Sets the value of the imexId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImexId(String value) {
        this.imexId = value;
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
