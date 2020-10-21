
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceFiles" type="{http://types.muhimbi.com/2009/10/06}ArrayOfSourceFile" minOccurs="0"/>
 *         &lt;element name="MergeSettings" type="{http://types.muhimbi.com/2009/10/06}MergeSettings" minOccurs="0"/>
 *         &lt;element name="SplitOptions" type="{http://types.muhimbi.com/2009/10/06}FileSplitOptions" minOccurs="0"/>
 *         &lt;element name="OCRSettings" type="{http://types.muhimbi.com/2013/08/01}OCRSettings" minOccurs="0"/>
 *         &lt;element name="SubscriptionSettings" type="{http://types.muhimbi.com/2015/04/13}SubscriptionSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingOptions", propOrder = {
    "sourceFiles",
    "mergeSettings",
    "splitOptions",
    "ocrSettings",
    "subscriptionSettings"
})
public class ProcessingOptions {

    @XmlElementRef(name = "SourceFiles", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSourceFile> sourceFiles;
    @XmlElementRef(name = "MergeSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<MergeSettings> mergeSettings;
    @XmlElementRef(name = "SplitOptions", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<FileSplitOptions> splitOptions;
    @XmlElementRef(name = "OCRSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<OCRSettings> ocrSettings;
    @XmlElementRef(name = "SubscriptionSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<SubscriptionSettings> subscriptionSettings;

    /**
     * Gets the value of the sourceFiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSourceFile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSourceFile> getSourceFiles() {
        return sourceFiles;
    }

    /**
     * Sets the value of the sourceFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSourceFile }{@code >}
     *     
     */
    public void setSourceFiles(JAXBElement<ArrayOfSourceFile> value) {
        this.sourceFiles = value;
    }

    /**
     * Gets the value of the mergeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MergeSettings }{@code >}
     *     
     */
    public JAXBElement<MergeSettings> getMergeSettings() {
        return mergeSettings;
    }

    /**
     * Sets the value of the mergeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MergeSettings }{@code >}
     *     
     */
    public void setMergeSettings(JAXBElement<MergeSettings> value) {
        this.mergeSettings = value;
    }

    /**
     * Gets the value of the splitOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileSplitOptions }{@code >}
     *     
     */
    public JAXBElement<FileSplitOptions> getSplitOptions() {
        return splitOptions;
    }

    /**
     * Sets the value of the splitOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileSplitOptions }{@code >}
     *     
     */
    public void setSplitOptions(JAXBElement<FileSplitOptions> value) {
        this.splitOptions = value;
    }

    /**
     * Gets the value of the ocrSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OCRSettings }{@code >}
     *     
     */
    public JAXBElement<OCRSettings> getOCRSettings() {
        return ocrSettings;
    }

    /**
     * Sets the value of the ocrSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OCRSettings }{@code >}
     *     
     */
    public void setOCRSettings(JAXBElement<OCRSettings> value) {
        this.ocrSettings = value;
    }

    /**
     * Gets the value of the subscriptionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}
     *     
     */
    public JAXBElement<SubscriptionSettings> getSubscriptionSettings() {
        return subscriptionSettings;
    }

    /**
     * Sets the value of the subscriptionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}
     *     
     */
    public void setSubscriptionSettings(JAXBElement<SubscriptionSettings> value) {
        this.subscriptionSettings = value;
    }

}
