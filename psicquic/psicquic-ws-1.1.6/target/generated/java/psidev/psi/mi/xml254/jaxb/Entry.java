
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://psi.hupo.org/mi/mif}source" minOccurs="0"/>
 *         &lt;element name="availabilityList" type="{http://psi.hupo.org/mi/mif}availabilityList" minOccurs="0"/>
 *         &lt;element name="experimentList" type="{http://psi.hupo.org/mi/mif}experimentDescriptionList" minOccurs="0"/>
 *         &lt;element name="interactorList" type="{http://psi.hupo.org/mi/mif}interactorList" minOccurs="0"/>
 *         &lt;element name="interactionList" type="{http://psi.hupo.org/mi/mif}interactionList"/>
 *         &lt;element name="attributeList" type="{http://psi.hupo.org/mi/mif}attributeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entry", propOrder = {
    "source",
    "availabilityList",
    "experimentList",
    "interactorList",
    "interactionList",
    "attributeList"
})
public class Entry {

    protected Source source;
    protected AvailabilityList availabilityList;
    protected ExperimentDescriptionList experimentList;
    protected InteractorList interactorList;
    @XmlElement(required = true)
    protected InteractionList interactionList;
    protected AttributeList attributeList;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the availabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityList }
     *     
     */
    public AvailabilityList getAvailabilityList() {
        return availabilityList;
    }

    /**
     * Sets the value of the availabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityList }
     *     
     */
    public void setAvailabilityList(AvailabilityList value) {
        this.availabilityList = value;
    }

    /**
     * Gets the value of the experimentList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentDescriptionList }
     *     
     */
    public ExperimentDescriptionList getExperimentList() {
        return experimentList;
    }

    /**
     * Sets the value of the experimentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentDescriptionList }
     *     
     */
    public void setExperimentList(ExperimentDescriptionList value) {
        this.experimentList = value;
    }

    /**
     * Gets the value of the interactorList property.
     * 
     * @return
     *     possible object is
     *     {@link InteractorList }
     *     
     */
    public InteractorList getInteractorList() {
        return interactorList;
    }

    /**
     * Sets the value of the interactorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractorList }
     *     
     */
    public void setInteractorList(InteractorList value) {
        this.interactorList = value;
    }

    /**
     * Gets the value of the interactionList property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionList }
     *     
     */
    public InteractionList getInteractionList() {
        return interactionList;
    }

    /**
     * Sets the value of the interactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionList }
     *     
     */
    public void setInteractionList(InteractionList value) {
        this.interactionList = value;
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

}
