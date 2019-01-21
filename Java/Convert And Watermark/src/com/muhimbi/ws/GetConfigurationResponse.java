
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
 *         &lt;element name="GetConfigurationResult" type="{http://types.muhimbi.com/2009/10/06}Configuration" minOccurs="0"/>
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
    "getConfigurationResult"
})
@XmlRootElement(name = "GetConfigurationResponse", namespace = "http://services.muhimbi.com/2009/10/06")
public class GetConfigurationResponse {

    @XmlElementRef(name = "GetConfigurationResult", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<Configuration> getConfigurationResult;

    /**
     * Gets the value of the getConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Configuration }{@code >}
     *     
     */
    public JAXBElement<Configuration> getGetConfigurationResult() {
        return getConfigurationResult;
    }

    /**
     * Sets the value of the getConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Configuration }{@code >}
     *     
     */
    public void setGetConfigurationResult(JAXBElement<Configuration> value) {
        this.getConfigurationResult = ((JAXBElement<Configuration> ) value);
    }

}
