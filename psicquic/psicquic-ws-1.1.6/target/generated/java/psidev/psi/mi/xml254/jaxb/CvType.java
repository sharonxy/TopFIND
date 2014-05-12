
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to an external controlled vocabulary.
 * 
 * <p>Java class for cvType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cvType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://psi.hupo.org/mi/mif}names"/>
 *         &lt;element name="xref" type="{http://psi.hupo.org/mi/mif}xref"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cvType", propOrder = {
    "names",
    "xref"
})
@XmlSeeAlso({
    ExperimentalPreparation.class,
    ExperimentalRole.class,
    ParticipantIdentificationMethod.class
})
public class CvType {

    @XmlElement(required = true)
    protected Names names;
    @XmlElement(required = true)
    protected Xref xref;

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

}
