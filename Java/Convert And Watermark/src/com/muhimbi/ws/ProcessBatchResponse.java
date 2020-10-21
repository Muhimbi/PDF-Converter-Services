
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
 *         &lt;element name="ProcessBatchResult" type="{http://types.muhimbi.com/2009/10/06}BatchResults" minOccurs="0"/>
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
    "processBatchResult"
})
@XmlRootElement(name = "ProcessBatchResponse", namespace = "http://services.muhimbi.com/2009/10/06")
public class ProcessBatchResponse {

    @XmlElementRef(name = "ProcessBatchResult", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<BatchResults> processBatchResult;

    /**
     * Gets the value of the processBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatchResults }{@code >}
     *     
     */
    public JAXBElement<BatchResults> getProcessBatchResult() {
        return processBatchResult;
    }

    /**
     * Sets the value of the processBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatchResults }{@code >}
     *     
     */
    public void setProcessBatchResult(JAXBElement<BatchResults> value) {
        this.processBatchResult = value;
    }

}
