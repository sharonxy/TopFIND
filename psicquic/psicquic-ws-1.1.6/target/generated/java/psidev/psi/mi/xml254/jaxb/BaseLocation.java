
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A location on a sequence. Both begin and end can be a defined position, a fuzzy position, or undetermined.
 * 
 * <p>Java class for baseLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="startStatus" type="{http://psi.hupo.org/mi/mif}cvType"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="begin" type="{http://psi.hupo.org/mi/mif}position"/>
 *             &lt;element name="beginInterval" type="{http://psi.hupo.org/mi/mif}interval"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="endStatus" type="{http://psi.hupo.org/mi/mif}cvType"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="end" type="{http://psi.hupo.org/mi/mif}position"/>
 *             &lt;element name="endInterval" type="{http://psi.hupo.org/mi/mif}interval"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="isLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseLocation", propOrder = {
    "startStatus",
    "beginInterval",
    "begin",
    "endStatus",
    "endInterval",
    "end",
    "isLink"
})
public class BaseLocation {

    @XmlElement(required = true)
    protected CvType startStatus;
    protected Interval beginInterval;
    protected Position begin;
    @XmlElement(required = true)
    protected CvType endStatus;
    protected Interval endInterval;
    protected Position end;
    @XmlElement(defaultValue = "false")
    protected Boolean isLink;

    /**
     * Gets the value of the startStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CvType }
     *     
     */
    public CvType getStartStatus() {
        return startStatus;
    }

    /**
     * Sets the value of the startStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvType }
     *     
     */
    public void setStartStatus(CvType value) {
        this.startStatus = value;
    }

    /**
     * Gets the value of the beginInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Interval }
     *     
     */
    public Interval getBeginInterval() {
        return beginInterval;
    }

    /**
     * Sets the value of the beginInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval }
     *     
     */
    public void setBeginInterval(Interval value) {
        this.beginInterval = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBegin(Position value) {
        this.begin = value;
    }

    /**
     * Gets the value of the endStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CvType }
     *     
     */
    public CvType getEndStatus() {
        return endStatus;
    }

    /**
     * Sets the value of the endStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CvType }
     *     
     */
    public void setEndStatus(CvType value) {
        this.endStatus = value;
    }

    /**
     * Gets the value of the endInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Interval }
     *     
     */
    public Interval getEndInterval() {
        return endInterval;
    }

    /**
     * Sets the value of the endInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval }
     *     
     */
    public void setEndInterval(Interval value) {
        this.endInterval = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEnd(Position value) {
        this.end = value;
    }

    /**
     * Gets the value of the isLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLink() {
        return isLink;
    }

    /**
     * Sets the value of the isLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLink(Boolean value) {
        this.isLink = value;
    }

}
