
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of all interactors occurring in the entry
 * 
 * <p>Java class for interactorList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interactorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactor" type="{http://psi.hupo.org/mi/mif}interactor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interactorList", propOrder = {
    "interactors"
})
public class InteractorList {

    @XmlElement(name = "interactor")
    protected List<Interactor> interactors;

    /**
     * Gets the value of the interactors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interactor }
     * 
     * 
     */
    public List<Interactor> getInteractors() {
        if (interactors == null) {
            interactors = new ArrayList<Interactor>();
        }
        return this.interactors;
    }

}
