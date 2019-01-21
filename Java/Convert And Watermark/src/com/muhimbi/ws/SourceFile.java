
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="OpenOptions" type="{http://types.muhimbi.com/2009/10/06}OpenOptions" minOccurs="0"/>
 *         &lt;element name="ConversionSettings" type="{http://types.muhimbi.com/2009/10/06}ConversionSettings" minOccurs="0"/>
 *         &lt;element name="MergeSettings" type="{http://types.muhimbi.com/2009/10/06}FileMergeSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceFile", propOrder = {
    "file",
    "openOptions",
    "conversionSettings",
    "mergeSettings"
})
public class SourceFile {

    @XmlElementRef(name = "File", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<byte[]> file;
    @XmlElementRef(name = "OpenOptions", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<OpenOptions> openOptions;
    @XmlElementRef(name = "ConversionSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<ConversionSettings> conversionSettings;
    @XmlElementRef(name = "MergeSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<FileMergeSettings> mergeSettings;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFile(JAXBElement<byte[]> value) {
        this.file = ((JAXBElement<byte[]> ) value);
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
        this.openOptions = ((JAXBElement<OpenOptions> ) value);
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
        this.conversionSettings = ((JAXBElement<ConversionSettings> ) value);
    }

    /**
     * Gets the value of the mergeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileMergeSettings }{@code >}
     *     
     */
    public JAXBElement<FileMergeSettings> getMergeSettings() {
        return mergeSettings;
    }

    /**
     * Sets the value of the mergeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileMergeSettings }{@code >}
     *     
     */
    public void setMergeSettings(JAXBElement<FileMergeSettings> value) {
        this.mergeSettings = ((JAXBElement<FileMergeSettings> ) value);
    }

}
