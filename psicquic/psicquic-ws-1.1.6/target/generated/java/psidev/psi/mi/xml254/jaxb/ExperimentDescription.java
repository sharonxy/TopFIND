
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes one set of experimental parameters.
 * 
 * <p>Java class for experimentDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://psi.hupo.org/mi/mif}names" minOccurs="0"/>
 *         &lt;element name="bibref" type="{http://psi.hupo.org/mi/mif}bibref"/>
 *         &lt;element name="xref" type="{http://psi.hupo.org/mi/mif}xref" minOccurs="0"/>
 *         &lt;element name="hostOrganismList" type="{http://psi.hupo.org/mi/mif}hostOrganismList" minOccurs="0"/>
 *         &lt;element name="interactionDetectionMethod" type="{http://psi.hupo.org/mi/mif}cvType"/>
 *         &lt;element name="participantIdentificationMethod" type="{http://psi.hupo.org/mi/mif}cvType" minOccurs="0"/>
 *         &lt;element name="featureDetectionMethod" type="{http://psi.hupo.org/mi/mif}cvType" minOccurs="0"/>
 *         &lt;element name="confidenceList" type="{http://psi.hupo.org/mi/mif}confidenceList" minOccurs="0"/>
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
@XmlType(name = "experimentDescription", propOrder = {
    "names",
    "bibref",
    "xref",
    "hostOrganismList",
    "interactionDetectionMethod",
    "participantIdentificationMethod",
    "featureDetectionMethod",
    "confidenceList",
    "attributeList"
})
public class ExperimentDescription {

    protected Names names;
    @XmlElement(required = true)
    protected Bibref bibref;
    protected Xref xref;
    protected HostOrganismList hostOrganismList;
    @XmlElement(required = true)
    protected CvType interactionDetectionMethod;
    protected CvType participantIdentificationMethod;
    protected CvType featureDetectionMethod;
    protected ConfidenceList confidenceList;
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
     * Gets the value of the bibref property.
     * 
     * @return
     *     possible object is
     *     {@link Bibref }
     *     
     */
    public Bibref getBibref() {
        return bibref;
    }

    /**
     * Sets the value of the bibref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bibref }
     *     
     */
    public void setBibref(Bibref value) {
        this.bibref = value;
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
     * Gets the value of the interactionDetectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CvType }
     *     
     */
    public CvType getInteractionDetectionMethod() {
        return interactionDetectionMethod;
    }

    /**
     * Sets the value of the interactionDetectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvType }
     *     
     */
    public void setInteractionDetectionMethod(CvType value) {
        this.interactionDetectionMethod = value;
    }

    /**
     * Gets the value of the participantIdentificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CvType }
     *     
     */
    public CvType getParticipantIdentificationMethod() {
        return participantIdentificationMethod;
    }

    /**
     * Sets the value of the participantIdentificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvType }
     *     
     */
    public void setParticipantIdentificationMethod(CvType value) {
        this.participantIdentificationMethod = value;
    }

    /**
     * Gets the value of the featureDetectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CvType }
     *     
     */
    public CvType getFeatureDetectionMethod() {
        return featureDetectionMethod;
    }

    /**
     * Sets the value of the featureDetectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvType }
     *     
     */
    public void setFeatureDetectionMethod(CvType value) {
        this.featureDetectionMethod = value;
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
