
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
 *         &lt;element name="ApplyWatermarkResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "applyWatermarkResult"
})
@XmlRootElement(name = "ApplyWatermarkResponse", namespace = "http://services.muhimbi.com/2009/10/06")
public class ApplyWatermarkResponse {

    @XmlElementRef(name = "ApplyWatermarkResult", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<byte[]> applyWatermarkResult;

    /**
     * Gets the value of the applyWatermarkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getApplyWatermarkResult() {
        return applyWatermarkResult;
    }

    /**
     * Sets the value of the applyWatermarkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setApplyWatermarkResult(JAXBElement<byte[]> value) {
        this.applyWatermarkResult = ((JAXBElement<byte[]> ) value);
    }

}
