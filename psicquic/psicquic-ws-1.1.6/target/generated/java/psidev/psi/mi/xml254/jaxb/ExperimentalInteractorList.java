
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes molecules which have been used in specific experiments if these molecules are
 *                 different from the one listed as interactors. Example: The author of a paper makes a statement about
 *                 human proteins, but has really worked with mouse proteins. In this case the human protein would be the
 *                 main interactor, while the experimentalForm would be the mouse protein listed in this element.
 *                 Optionally this can refer to the experiment(s) in which this form has been used.
 *             
 * 
 * <p>Java class for experimentalInteractorList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentalInteractorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentalInteractor" type="{http://psi.hupo.org/mi/mif}experimentalInteractor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentalInteractorList", propOrder = {
    "experimentalInteractors"
})
public class ExperimentalInteractorList {

    @XmlElement(name = "experimentalInteractor", required = true)
    protected List<ExperimentalInteractor> experimentalInteractors;

    /**
     * Gets the value of the experimentalInteractors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentalInteractors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentalInteractors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentalInteractor }
     * 
     * 
     */
    public List<ExperimentalInteractor> getExperimentalInteractors() {
        if (experimentalInteractors == null) {
            experimentalInteractors = new ArrayList<ExperimentalInteractor>();
        }
        return this.experimentalInteractors;
    }

}
