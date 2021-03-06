
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusRequest" type="{http://types.muhimbi.com/2018/01/11}StatusRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusRequest"
})
@XmlRootElement(name = "GetStatus", namespace = "http://services.muhimbi.com/2009/10/06")
public class GetStatus {

    @XmlElementRef(name = "statusRequest", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusRequest> statusRequest;

    /**
     * Gets the value of the statusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusRequest }{@code >}
     *     
     */
    public JAXBElement<StatusRequest> getStatusRequest() {
        return statusRequest;
    }

    /**
     * Sets the value of the statusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusRequest }{@code >}
     *     
     */
    public void setStatusRequest(JAXBElement<StatusRequest> value) {
        this.statusRequest = value;
    }

}
