
package org.hupo.psi.mi.psicquic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dbRefList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dbRefList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbRef" type="{http://psi.hupo.org/mi/psicquic}dbRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dbRefList", propOrder = {
    "dbReves"
})
public class DbRefList {

    @XmlElement(name = "dbRef", required = true)
    protected List<DbRef> dbReves;

    /**
     * Gets the value of the dbReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DbRef }
     * 
     * 
     */
    public List<DbRef> getDbReves() {
        if (dbReves == null) {
            dbReves = new ArrayList<DbRef>();
        }
        return this.dbReves;
    }

}
