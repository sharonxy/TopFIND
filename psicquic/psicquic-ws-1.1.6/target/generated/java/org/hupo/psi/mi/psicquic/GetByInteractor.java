
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByInteractor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByInteractor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbRef" type="{http://psi.hupo.org/mi/psicquic}dbRef"/>
 *         &lt;element name="infoRequest" type="{http://psi.hupo.org/mi/psicquic}requestInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByInteractor", propOrder = {
    "dbRef",
    "infoRequest"
})
@XmlRootElement(name = "getByInteractor")
public class GetByInteractor {

    @XmlElement(required = true)
    protected DbRef dbRef;
    @XmlElement(required = true)
    protected RequestInfo infoRequest;

    /**
     * Gets the value of the dbRef property.
     * 
     * @return
     *     possible object is
     *     {@link DbRef }
     *     
     */
    public DbRef getDbRef() {
        return dbRef;
    }

    /**
     * Sets the value of the dbRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbRef }
     *     
     */
    public void setDbRef(DbRef value) {
        this.dbRef = value;
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

}
