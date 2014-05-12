
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Refers to a list of experiments within the same entry.
 * 
 * <p>Java class for experimentRefList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentRefList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentRefList", propOrder = {
    "experimentReves"
})
public class ExperimentRefList {

    @XmlElement(name = "experimentRef", type = Integer.class)
    protected List<Integer> experimentReves;

    /**
     * Gets the value of the experimentReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getExperimentReves() {
        if (experimentReves == null) {
            experimentReves = new ArrayList<Integer>();
        }
        return this.experimentReves;
    }

}
