
package org.hupo.psi.mi.psicquic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dbRefListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dbRefListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbRefList" type="{http://psi.hupo.org/mi/psicquic}dbRefList"/>
 *         &lt;element name="resultType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dbRefListRequest", propOrder = {
    "dbRefList",
    "resultType",
    "firstResult",
    "blockSize"
})
public class DbRefListRequest {

    @XmlElement(required = true)
    protected DbRefList dbRefList;
    @XmlElement(required = true)
    protected String resultType;
    @XmlElement(defaultValue = "0")
    protected int firstResult;
    @XmlElement(defaultValue = "50")
    protected int blockSize;

    /**
     * Gets the value of the dbRefList property.
     * 
     * @return
     *     possible object is
     *     {@link DbRefList }
     *     
     */
    public DbRefList getDbRefList() {
        return dbRefList;
    }

    /**
     * Sets the value of the dbRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbRefList }
     *     
     */
    public void setDbRefList(DbRefList value) {
        this.dbRefList = value;
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
