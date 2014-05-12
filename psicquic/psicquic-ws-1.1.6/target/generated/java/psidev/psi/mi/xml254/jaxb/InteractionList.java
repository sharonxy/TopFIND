
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of interactions
 * 
 * <p>Java class for interactionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interactionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interaction" type="{http://psi.hupo.org/mi/mif}interaction" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interactionList", propOrder = {
    "interactions"
})
public class InteractionList {

    @XmlElement(name = "interaction", required = true)
    protected List<Interaction> interactions;

    /**
     * Gets the value of the interactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interaction }
     * 
     * 
     */
    public List<Interaction> getInteractions() {
        if (interactions == null) {
            interactions = new ArrayList<Interaction>();
        }
        return this.interactions;
    }

}
