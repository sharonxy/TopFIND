
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This element is controlled by the PSI-MI controlled vocabulary "experimentalRole",
 *                 root term id MI:0495.
 *             
 * 
 * <p>Java class for experimentalRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentalRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/mi/mif}cvType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="experimentRefList" type="{http://psi.hupo.org/mi/mif}experimentRefList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentalRole", propOrder = {
    "experimentRefList"
})
public class ExperimentalRole
    extends CvType
{

    protected ExperimentRefList experimentRefList;

    /**
     * Gets the value of the experimentRefList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentRefList }
     *     
     */
    public ExperimentRefList getExperimentRefList() {
        return experimentRefList;
    }

    /**
     * Sets the value of the experimentRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentRefList }
     *     
     */
    public void setExperimentRefList(ExperimentRefList value) {
        this.experimentRefList = value;
    }

}
