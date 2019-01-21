
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
 *         &lt;element name="GetStatusResult" type="{http://types.muhimbi.com/2018/01/11}Status" minOccurs="0"/>
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
    "getStatusResult"
})
@XmlRootElement(name = "GetStatusResponse", namespace = "http://services.muhimbi.com/2009/10/06")
public class GetStatusResponse {

    @XmlElementRef(name = "GetStatusResult", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<Status> getStatusResult;

    /**
     * Gets the value of the getStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     
     */
    public JAXBElement<Status> getGetStatusResult() {
        return getStatusResult;
    }

    /**
     * Sets the value of the getStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     
     */
    public void setGetStatusResult(JAXBElement<Status> value) {
        this.getStatusResult = ((JAXBElement<Status> ) value);
    }

}
