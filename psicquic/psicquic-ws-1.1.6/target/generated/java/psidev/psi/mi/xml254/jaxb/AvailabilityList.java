
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data availability statements, for example copyrights
 * 
 * <p>Java class for availabilityList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availabilityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availability" type="{http://psi.hupo.org/mi/mif}availability" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availabilityList", propOrder = {
    "availabilities"
})
public class AvailabilityList {

    @XmlElement(name = "availability")
    protected List<Availability> availabilities;

    /**
     * Gets the value of the availabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Availability }
     * 
     * 
     */
    public List<Availability> getAvailabilities() {
        if (availabilities == null) {
            availabilities = new ArrayList<Availability>();
        }
        return this.availabilities;
    }

}
