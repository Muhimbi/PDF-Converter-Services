
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTypeConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationTypeConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OperationType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumRunDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationTypeConfiguration", namespace = "http://types.muhimbi.com/2018/01/11", propOrder = {
    "operationType",
    "description",
    "enabled",
    "maximumInstances",
    "maximumRunDuration"
})
public class OperationTypeConfiguration {

    @XmlElement(name = "OperationType")
    protected OperationType operationType;
    @XmlElementRef(name = "Description", namespace = "http://types.muhimbi.com/2018/01/11", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "MaximumInstances")
    protected Integer maximumInstances;
    @XmlElement(name = "MaximumRunDuration")
    protected Integer maximumRunDuration;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperationType(OperationType value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the maximumInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumInstances() {
        return maximumInstances;
    }

    /**
     * Sets the value of the maximumInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumInstances(Integer value) {
        this.maximumInstances = value;
    }

    /**
     * Gets the value of the maximumRunDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumRunDuration() {
        return maximumRunDuration;
    }

    /**
     * Sets the value of the maximumRunDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumRunDuration(Integer value) {
        this.maximumRunDuration = value;
    }

}
