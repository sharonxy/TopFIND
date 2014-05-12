
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByInteractorListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByInteractorListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryResponse" type="{http://psi.hupo.org/mi/psicquic}queryResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByInteractorListResponse", propOrder = {
    "queryResponse"
})
@XmlRootElement(name = "getByInteractorListReponse")
public class GetByInteractorListReponse {

    @XmlElement(required = true)
    protected QueryResponse queryResponse;

    /**
     * Gets the value of the queryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResponse }
     *     
     */
    public QueryResponse getQueryResponse() {
        return queryResponse;
    }

    /**
     * Sets the value of the queryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResponse }
     *     
     */
    public void setQueryResponse(QueryResponse value) {
        this.queryResponse = value;
    }

}
