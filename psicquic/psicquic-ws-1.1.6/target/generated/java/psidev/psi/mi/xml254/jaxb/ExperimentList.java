
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * List of experiments in which this interaction has been determined.
 * 
 * <p>Java class for experimentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="experimentRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="experimentDescription" type="{http://psi.hupo.org/mi/mif}experimentDescription"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentList", propOrder = {
    "experimentRevesAndExperimentDescriptions"
})
public class ExperimentList {

    @XmlElements({
        @XmlElement(name = "experimentDescription", type = ExperimentDescription.class),
        @XmlElement(name = "experimentRef", type = Integer.class)
    })
    protected List<Object> experimentRevesAndExperimentDescriptions;

    /**
     * Gets the value of the experimentRevesAndExperimentDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentRevesAndExperimentDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentRevesAndExperimentDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentDescription }
     * {@link Integer }
     * 
     * 
     */
    public List<Object> getExperimentRevesAndExperimentDescriptions() {
        if (experimentRevesAndExperimentDescriptions == null) {
            experimentRevesAndExperimentDescriptions = new ArrayList<Object>();
        }
        return this.experimentRevesAndExperimentDescriptions;
    }

}
