
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All experiments in which the interactions of this entry have been determined
 *             
 * 
 * <p>Java class for experimentDescriptionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentDescriptionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentDescription" type="{http://psi.hupo.org/mi/mif}experimentDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentDescriptionList", propOrder = {
    "experimentDescriptions"
})
public class ExperimentDescriptionList {

    @XmlElement(name = "experimentDescription")
    protected List<ExperimentDescription> experimentDescriptions;

    /**
     * Gets the value of the experimentDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentDescription }
     * 
     * 
     */
    public List<ExperimentDescription> getExperimentDescriptions() {
        if (experimentDescriptions == null) {
            experimentDescriptions = new ArrayList<ExperimentDescription>();
        }
        return this.experimentDescriptions;
    }

}
