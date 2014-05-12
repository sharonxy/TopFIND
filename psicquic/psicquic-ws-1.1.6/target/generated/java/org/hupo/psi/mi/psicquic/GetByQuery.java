
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "getByQuery", propOrder = {
    "query",
    "infoRequest"
})
@XmlRootElement(name = "getByQuery")
public class GetByQuery {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(required = true)
    protected RequestInfo infoRequest;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
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
