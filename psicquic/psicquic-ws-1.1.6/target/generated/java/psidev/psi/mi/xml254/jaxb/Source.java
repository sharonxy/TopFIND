
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Desciption of the source of the entry, usually an organisation
 *             
 * 
 * <p>Java class for source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="names" type="{http://psi.hupo.org/mi/mif}names" minOccurs="0"/>
 *         &lt;element name="bibref" type="{http://psi.hupo.org/mi/mif}bibref" minOccurs="0"/>
 *         &lt;element name="xref" type="{http://psi.hupo.org/mi/mif}xref" minOccurs="0"/>
 *         &lt;element name="attributeList" type="{http://psi.hupo.org/mi/mif}attributeList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="release">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "source", propOrder = {
    "names",
    "bibref",
    "xref",
    "attributeList"
})
public class Source {

    protected Names names;
    protected Bibref bibref;
    protected Xref xref;
    protected AttributeList attributeList;
    @XmlAttribute
    protected String release;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar releaseDate;

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
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

}
