
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inferredInteraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inferredInteraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participant" type="{http://psi.hupo.org/mi/mif}inferredInteractionParticipant" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="experimentRefList" type="{http://psi.hupo.org/mi/mif}experimentRefList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inferredInteraction", propOrder = {
    "participants",
    "experimentRefList"
})
public class InferredInteraction {

    @XmlElement(name = "participant", required = true)
    protected List<InferredInteractionParticipant> participants;
    protected ExperimentRefList experimentRefList;

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InferredInteractionParticipant }
     * 
     * 
     */
    public List<InferredInteractionParticipant> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<InferredInteractionParticipant>();
        }
        return this.participants;
    }

    /**
     * Gets the value of the experimentRefList property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentRefList }
     *     
     */
    public ExperimentRefList getExperimentRefList() {
        return experimentRefList;
    }

    /**
     * Sets the value of the experimentRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentRefList }
     *     
     */
    public void setExperimentRefList(ExperimentRefList value) {
        this.experimentRefList = value;
    }

}
