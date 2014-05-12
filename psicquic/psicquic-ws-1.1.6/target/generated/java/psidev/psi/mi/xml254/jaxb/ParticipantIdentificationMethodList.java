
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The method(s) by which this participant has been determined. If this element is present,
 *                 its value supersedes experimentDescription/ participantIdentificationMethod.
 *             
 * 
 * <p>Java class for participantIdentificationMethodList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantIdentificationMethodList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantIdentificationMethod" type="{http://psi.hupo.org/mi/mif}participantIdentificationMethod" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participantIdentificationMethodList", propOrder = {
    "participantIdentificationMethods"
})
public class ParticipantIdentificationMethodList {

    @XmlElement(name = "participantIdentificationMethod", required = true)
    protected List<ParticipantIdentificationMethod> participantIdentificationMethods;

    /**
     * Gets the value of the participantIdentificationMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantIdentificationMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantIdentificationMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantIdentificationMethod }
     * 
     * 
     */
    public List<ParticipantIdentificationMethod> getParticipantIdentificationMethods() {
        if (participantIdentificationMethods == null) {
            participantIdentificationMethods = new ArrayList<ParticipantIdentificationMethod>();
        }
        return this.participantIdentificationMethods;
    }

}
