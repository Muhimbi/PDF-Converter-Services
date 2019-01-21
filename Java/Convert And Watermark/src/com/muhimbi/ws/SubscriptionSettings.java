
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForceTrialWatermark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionSettings", namespace = "http://types.muhimbi.com/2015/04/13", propOrder = {
    "subscriptionID",
    "forceTrialWatermark"
})
public class SubscriptionSettings {

    @XmlElementRef(name = "SubscriptionID", namespace = "http://types.muhimbi.com/2015/04/13", type = JAXBElement.class)
    protected JAXBElement<String> subscriptionID;
    @XmlElement(name = "ForceTrialWatermark")
    protected Boolean forceTrialWatermark;

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriptionID(JAXBElement<String> value) {
        this.subscriptionID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the forceTrialWatermark property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceTrialWatermark() {
        return forceTrialWatermark;
    }

    /**
     * Sets the value of the forceTrialWatermark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceTrialWatermark(Boolean value) {
        this.forceTrialWatermark = value;
    }

}
