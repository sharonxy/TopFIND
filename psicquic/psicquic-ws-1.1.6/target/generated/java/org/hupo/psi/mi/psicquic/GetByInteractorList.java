
package org.hupo.psi.mi.psicquic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByInteractorList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByInteractorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbRef" type="{http://psi.hupo.org/mi/psicquic}dbRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="infoRequest" type="{http://psi.hupo.org/mi/psicquic}requestInfo"/>
 *         &lt;element name="operand">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AND"/>
 *               &lt;enumeration value="OR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByInteractorList", propOrder = {
    "dbReves",
    "infoRequest",
    "operand"
})
@XmlRootElement(name = "getByInteractorList")
public class GetByInteractorList {

    @XmlElement(name = "dbRef")
    protected List<DbRef> dbReves;
    @XmlElement(required = true)
    protected RequestInfo infoRequest;
    @XmlElement(required = true)
    protected String operand;

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

    /**
     * Gets the value of the infoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RequestInfo }
     *     
     */
    public RequestInfo getInfoRequest() {
        return infoRequest;
    }

    /**
     * Sets the value of the infoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInfo }
     *     
     */
    public void setInfoRequest(RequestInfo value) {
        this.infoRequest = value;
    }

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperand(String value) {
        this.operand = value;
    }

}
