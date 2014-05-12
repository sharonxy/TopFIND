
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultSet" type="{http://psi.hupo.org/mi/psicquic}resultSet"/>
 *         &lt;element name="resultInfo" type="{http://psi.hupo.org/mi/psicquic}resultInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryResponse", propOrder = {
    "resultSet",
    "resultInfo"
})
public class QueryResponse {

    @XmlElement(required = true)
    protected ResultSet resultSet;
    @XmlElement(required = true)
    protected ResultInfo resultInfo;

    /**
     * Gets the value of the resultSet property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSet }
     *     
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Sets the value of the resultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSet }
     *     
     */
    public void setResultSet(ResultSet value) {
        this.resultSet = value;
    }

    /**
     * Gets the value of the resultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getResultInfo() {
        return resultInfo;
    }

    /**
     * Sets the value of the resultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setResultInfo(ResultInfo value) {
        this.resultInfo = value;
    }

}
