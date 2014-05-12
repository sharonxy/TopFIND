
package psidev.psi.mi.xml254.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experimentalInteractor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentalInteractor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="interactorRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="interactor" type="{http://psi.hupo.org/mi/mif}interactor"/>
 *         &lt;/choice>
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
@XmlType(name = "experimentalInteractor", propOrder = {
    "interactor",
    "interactorRef",
    "experimentRefList"
})
public class ExperimentalInteractor {

    protected Interactor interactor;
    protected Integer interactorRef;
    protected ExperimentRefList experimentRefList;

    /**
     * Gets the value of the interactor property.
     * 
     * @return
     *     possible object is
     *     {@link Interactor }
     *     
     */
    public Interactor getInteractor() {
        return interactor;
    }

    /**
     * Sets the value of the interactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interactor }
     *     
     */
    public void setInteractor(Interactor value) {
        this.interactor = value;
    }

    /**
     * Gets the value of the interactorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteractorRef() {
        return interactorRef;
    }

    /**
     * Sets the value of the interactorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteractorRef(Integer value) {
        this.interactorRef = value;
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
