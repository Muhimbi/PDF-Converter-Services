
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
 *         &lt;element name="sourceFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="openOptions" type="{http://types.muhimbi.com/2009/10/06}OpenOptions" minOccurs="0"/>
 *         &lt;element name="conversionSettings" type="{http://types.muhimbi.com/2009/10/06}ConversionSettings" minOccurs="0"/>
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
    "sourceFile",
    "openOptions",
    "conversionSettings"
})
@XmlRootElement(name = "ApplyWatermark", namespace = "http://services.muhimbi.com/2009/10/06")
public class ApplyWatermark {

    @XmlElementRef(name = "sourceFile", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> sourceFile;
    @XmlElementRef(name = "openOptions", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenOptions> openOptions;
    @XmlElementRef(name = "conversionSettings", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ConversionSettings> conversionSettings;

    /**
     * Gets the value of the sourceFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSourceFile() {
        return sourceFile;
    }

    /**
     * Sets the value of the sourceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSourceFile(JAXBElement<byte[]> value) {
        this.sourceFile = value;
    }

    /**
     * Gets the value of the openOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}
     *     
     */
    public JAXBElement<OpenOptions> getOpenOptions() {
        return openOptions;
    }

    /**
     * Sets the value of the openOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}
     *     
     */
    public void setOpenOptions(JAXBElement<OpenOptions> value) {
        this.openOptions = value;
    }

    /**
     * Gets the value of the conversionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}
     *     
     */
    public JAXBElement<ConversionSettings> getConversionSettings() {
        return conversionSettings;
    }

    /**
     * Sets the value of the conversionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConversionSettings }{@code >}
     *     
     */
    public void setConversionSettings(JAXBElement<ConversionSettings> value) {
        this.conversionSettings = value;
    }

}
