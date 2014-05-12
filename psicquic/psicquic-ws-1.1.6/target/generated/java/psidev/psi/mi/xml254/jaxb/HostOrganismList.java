
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The host organism(s) in which the experiment has been performed.
 * 
 * <p>Java class for hostOrganismList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hostOrganismList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostOrganism" type="{http://psi.hupo.org/mi/mif}hostOrganism" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostOrganismList", propOrder = {
    "hostOrganisms"
})
public class HostOrganismList {

    @XmlElement(name = "hostOrganism", required = true)
    protected List<HostOrganism> hostOrganisms;

    /**
     * Gets the value of the hostOrganisms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostOrganisms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostOrganisms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostOrganism }
     * 
     * 
     */
    public List<HostOrganism> getHostOrganisms() {
        if (hostOrganisms == null) {
            hostOrganisms = new ArrayList<HostOrganism>();
        }
        return this.hostOrganisms;
    }

}
