
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entrySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entrySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" type="{http://psi.hupo.org/mi/mif}entry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}int" fixed="2" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" fixed="5" />
 *       &lt;attribute name="minorVersion" type="{http://www.w3.org/2001/XMLSchema}int" fixed="4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrySet", propOrder = {
    "entries"
})
@XmlRootElement(name = "entrySet")
public class EntrySet {

    @XmlElement(name = "entry", required = true)
    protected List<Entry> entries;
    @XmlAttribute(required = true)
    protected int level;
    @XmlAttribute(required = true)
    protected int version;
    @XmlAttribute
    protected Integer minorVersion;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entry }
     * 
     * 
     */
    public List<Entry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<Entry>();
        }
        return this.entries;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinorVersion() {
        if (minorVersion == null) {
            return  4;
        } else {
            return minorVersion;
        }
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorVersion(Integer value) {
        this.minorVersion = value;
    }

}
