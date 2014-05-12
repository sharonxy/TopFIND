
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Terms describing the experimental sample preparation.
 * 
 * <p>Java class for experimentalPreparationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentalPreparationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentalPreparation" type="{http://psi.hupo.org/mi/mif}experimentalPreparation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentalPreparationList", propOrder = {
    "experimentalPreparations"
})
public class ExperimentalPreparationList {

    @XmlElement(name = "experimentalPreparation", required = true)
    protected List<ExperimentalPreparation> experimentalPreparations;

    /**
     * Gets the value of the experimentalPreparations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentalPreparations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentalPreparations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentalPreparation }
     * 
     * 
     */
    public List<ExperimentalPreparation> getExperimentalPreparations() {
        if (experimentalPreparations == null) {
            experimentalPreparations = new ArrayList<ExperimentalPreparation>();
        }
        return this.experimentalPreparations;
    }

}
