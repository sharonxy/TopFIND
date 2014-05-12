
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="blockSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultInfo", propOrder = {
    "firstResult",
    "totalResults",
    "resultType",
    "blockSize"
})
public class ResultInfo {

    protected int firstResult;
    protected int totalResults;
    @XmlElement(required = true)
    protected String resultType;
    protected int blockSize;

    /**
     * Gets the value of the firstResult property.
     * 
     */
    public int getFirstResult() {
        return firstResult;
    }

    /**
     * Sets the value of the firstResult property.
     * 
     */
    public void setFirstResult(int value) {
        this.firstResult = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     */
    public int getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     */
    public void setTotalResults(int value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     */
    public int getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     */
    public void setBlockSize(int value) {
        this.blockSize = value;
    }

}
