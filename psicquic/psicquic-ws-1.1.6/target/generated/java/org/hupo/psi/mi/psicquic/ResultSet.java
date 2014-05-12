
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import psidev.psi.mi.xml254.jaxb.EntrySet;


/**
 * <p>Java class for resultSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrySet" type="{http://psi.hupo.org/mi/mif}entrySet" minOccurs="0"/>
 *         &lt;element name="mitab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultSet", propOrder = {
    "entrySet",
    "mitab"
})
public class ResultSet {

    protected EntrySet entrySet;
    protected String mitab;

    /**
     * Gets the value of the entrySet property.
     * 
     * @return
     *     possible object is
     *     {@link EntrySet }
     *     
     */
    public EntrySet getEntrySet() {
        return entrySet;
    }

    /**
     * Sets the value of the entrySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntrySet }
     *     
     */
    public void setEntrySet(EntrySet value) {
        this.entrySet = value;
    }

    /**
     * Gets the value of the mitab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitab() {
        return mitab;
    }

    /**
     * Sets the value of the mitab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitab(String value) {
        this.mitab = value;
    }

}
