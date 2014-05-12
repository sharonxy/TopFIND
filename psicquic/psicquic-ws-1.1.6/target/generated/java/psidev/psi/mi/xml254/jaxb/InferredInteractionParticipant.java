
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Participant of the inferred interaction.
 * 
 * <p>Java class for inferredInteractionParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inferredInteractionParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="participantFeatureRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inferredInteractionParticipant", propOrder = {
    "participantFeatureRef",
    "participantRef"
})
public class InferredInteractionParticipant {

    protected Integer participantFeatureRef;
    protected Integer participantRef;

    /**
     * Gets the value of the participantFeatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipantFeatureRef() {
        return participantFeatureRef;
    }

    /**
     * Sets the value of the participantFeatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipantFeatureRef(Integer value) {
        this.participantFeatureRef = value;
    }

    /**
     * Gets the value of the participantRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipantRef() {
        return participantRef;
    }

    /**
     * Sets the value of the participantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipantRef(Integer value) {
        this.participantRef = value;
    }

}
