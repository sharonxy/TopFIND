
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes inferred interactions, usually combining data from more than one experiment.
 *                 Examples: 1: Show the topology of binary interactions within a complex. 2: Interaction inferred from
 *                 multiple experiments which on their own would not support the interaction. Example: A-B in experiment 1,
 *                 B-C- in experiment 2, A-C is the inferred interaction.
 *             
 * 
 * <p>Java class for inferredInteractionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inferredInteractionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inferredInteraction" type="{http://psi.hupo.org/mi/mif}inferredInteraction" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inferredInteractionList", propOrder = {
    "inferredInteractions"
})
public class InferredInteractionList {

    @XmlElement(name = "inferredInteraction", required = true)
    protected List<InferredInteraction> inferredInteractions;

    /**
     * Gets the value of the inferredInteractions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inferredInteractions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInferredInteractions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InferredInteraction }
     * 
     * 
     */
    public List<InferredInteraction> getInferredInteractions() {
        if (inferredInteractions == null) {
            inferredInteractions = new ArrayList<InferredInteraction>();
        }
        return this.inferredInteractions;
    }

}
