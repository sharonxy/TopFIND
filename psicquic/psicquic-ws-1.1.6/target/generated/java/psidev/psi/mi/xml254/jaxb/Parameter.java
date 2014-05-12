
package psidev.psi.mi.xml254.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/mi/mif}parameterBase">
 *       &lt;sequence>
 *         &lt;element name="experimentRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uncertainty" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameter", propOrder = {
    "experimentRef"
})
public class Parameter
    extends ParameterBase
{

    protected int experimentRef;
    @XmlAttribute
    protected BigDecimal uncertainty;

    /**
     * Gets the value of the experimentRef property.
     * 
     */
    public int getExperimentRef() {
        return experimentRef;
    }

    /**
     * Sets the value of the experimentRef property.
     * 
     */
    public void setExperimentRef(int value) {
        this.experimentRef = value;
    }

    /**
     * Gets the value of the uncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUncertainty(BigDecimal value) {
        this.uncertainty = value;
    }

}
