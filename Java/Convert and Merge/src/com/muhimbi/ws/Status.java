
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://types.muhimbi.com/2018/01/11}ArrayOfStatusResultItem" minOccurs="0"/>
 *         &lt;element name="MaximumInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", namespace = "http://types.muhimbi.com/2018/01/11", propOrder = {
    "items",
    "maximumInstances",
    "currentInstances"
})
public class Status {

    @XmlElementRef(name = "Items", namespace = "http://types.muhimbi.com/2018/01/11", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStatusResultItem> items;
    @XmlElement(name = "MaximumInstances")
    protected Integer maximumInstances;
    @XmlElement(name = "CurrentInstances")
    protected Integer currentInstances;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatusResultItem> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusResultItem }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfStatusResultItem> value) {
        this.items = ((JAXBElement<ArrayOfStatusResultItem> ) value);
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
     * Gets the value of the currentInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentInstances() {
        return currentInstances;
    }

    /**
     * Sets the value of the currentInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentInstances(Integer value) {
        this.currentInstances = value;
    }

}
