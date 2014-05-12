
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of confidence values.
 * 
 * <p>Java class for confidenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confidenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confidence" type="{http://psi.hupo.org/mi/mif}confidence" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confidenceList", propOrder = {
    "confidences"
})
public class ConfidenceList {

    @XmlElement(name = "confidence", required = true)
    protected List<Confidence> confidences;

    /**
     * Gets the value of the confidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Confidence }
     * 
     * 
     */
    public List<Confidence> getConfidences() {
        if (confidences == null) {
            confidences = new ArrayList<Confidence>();
        }
        return this.confidences;
    }

}
