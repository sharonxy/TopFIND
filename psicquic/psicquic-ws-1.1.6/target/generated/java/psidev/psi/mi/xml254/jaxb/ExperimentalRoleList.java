
package psidev.psi.mi.xml254.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The role(s) of the participant in the interaction, e.g. bait.
 * 
 * <p>Java class for experimentalRoleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentalRoleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="experimentalRole" type="{http://psi.hupo.org/mi/mif}experimentalRole" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentalRoleList", propOrder = {
    "experimentalRoles"
})
public class ExperimentalRoleList {

    @XmlElement(name = "experimentalRole", required = true)
    protected List<ExperimentalRole> experimentalRoles;

    /**
     * Gets the value of the experimentalRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experimentalRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentalRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentalRole }
     * 
     * 
     */
    public List<ExperimentalRole> getExperimentalRoles() {
        if (experimentalRoles == null) {
            experimentalRoles = new ArrayList<ExperimentalRole>();
        }
        return this.experimentalRoles;
    }

}
