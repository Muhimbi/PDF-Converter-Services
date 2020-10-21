
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusRequestItems" type="{http://types.muhimbi.com/2018/01/11}ArrayOfStatusRequestItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRequest", namespace = "http://types.muhimbi.com/2018/01/11", propOrder = {
    "statusRequestItems"
})
public class StatusRequest {

    @XmlElementRef(name = "StatusRequestItems", namespace = "http://types.muhimbi.com/2018/01/11", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatusRequestItem> statusRequestItems;

    /**
     * Gets the value of the statusRequestItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusRequestItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatusRequestItem> getStatusRequestItems() {
        return statusRequestItems;
    }

    /**
     * Sets the value of the statusRequestItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusRequestItem }{@code >}
     *     
     */
    public void setStatusRequestItems(JAXBElement<ArrayOfStatusRequestItem> value) {
        this.statusRequestItems = value;
    }

}
