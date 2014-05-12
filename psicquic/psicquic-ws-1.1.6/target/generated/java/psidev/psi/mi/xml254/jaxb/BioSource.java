
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the biological source of an object, in simple form only the NCBI taxid.
 * 
 * <p>Java class for bioSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bioSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://psi.hupo.org/mi/mif}names" minOccurs="0"/>
 *         &lt;element name="cellType" type="{http://psi.hupo.org/mi/mif}openCvType" minOccurs="0"/>
 *         &lt;element name="compartment" type="{http://psi.hupo.org/mi/mif}openCvType" minOccurs="0"/>
 *         &lt;element name="tissue" type="{http://psi.hupo.org/mi/mif}openCvType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ncbiTaxId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bioSource", propOrder = {
    "names",
    "cellType",
    "compartment",
    "tissue"
})
@XmlSeeAlso({
    HostOrganism.class,
    psidev.psi.mi.xml254.jaxb.Interactor.Organism.class
})
public class BioSource {

    protected Names names;
    protected OpenCvType cellType;
    protected OpenCvType compartment;
    protected OpenCvType tissue;
    @XmlAttribute(required = true)
    protected int ncbiTaxId;

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
     * Gets the value of the cellType property.
     * 
     * @return
     *     possible object is
     *     {@link OpenCvType }
     *     
     */
    public OpenCvType getCellType() {
        return cellType;
    }

    /**
     * Sets the value of the cellType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCvType }
     *     
     */
    public void setCellType(OpenCvType value) {
        this.cellType = value;
    }

    /**
     * Gets the value of the compartment property.
     * 
     * @return
     *     possible object is
     *     {@link OpenCvType }
     *     
     */
    public OpenCvType getCompartment() {
        return compartment;
    }

    /**
     * Sets the value of the compartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCvType }
     *     
     */
    public void setCompartment(OpenCvType value) {
        this.compartment = value;
    }

    /**
     * Gets the value of the tissue property.
     * 
     * @return
     *     possible object is
     *     {@link OpenCvType }
     *     
     */
    public OpenCvType getTissue() {
        return tissue;
    }

    /**
     * Sets the value of the tissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCvType }
     *     
     */
    public void setTissue(OpenCvType value) {
        this.tissue = value;
    }

    /**
     * Gets the value of the ncbiTaxId property.
     * 
     */
    public int getNcbiTaxId() {
        return ncbiTaxId;
    }

    /**
     * Sets the value of the ncbiTaxId property.
     * 
     */
    public void setNcbiTaxId(int value) {
        this.ncbiTaxId = value;
    }

}
