
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_InfoPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_InfoPath">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="StripDotNETCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StripDataObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConversionViews" type="{http://types.muhimbi.com/2010/11/22}ArrayOfInfoPathView" minOccurs="0"/>
 *         &lt;element name="AutoTrustForms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProcessFullTrustForms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseNativePrintEngine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultPaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForcePaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultPageOrientation" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageOrientation" minOccurs="0"/>
 *         &lt;element name="ForcePageOrientation" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageOrientation" minOccurs="0"/>
 *         &lt;element name="XSNData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="AttachmentMergeMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MergeMode" minOccurs="0"/>
 *         &lt;element name="UnsupportedAttachmentBehaviour" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}UnsupportedFileBehaviour" minOccurs="0"/>
 *         &lt;element name="BreakMergeOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeAttachmentTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcludeAttachmentTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_InfoPath", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "stripDotNETCode",
    "stripDataObjects",
    "convertAttachments",
    "conversionViews",
    "autoTrustForms",
    "processFullTrustForms",
    "useNativePrintEngine",
    "defaultPaperSize",
    "forcePaperSize",
    "defaultPageOrientation",
    "forcePageOrientation",
    "xsnData",
    "attachmentMergeMode",
    "unsupportedAttachmentBehaviour",
    "breakMergeOnError",
    "includeAttachmentTypes",
    "excludeAttachmentTypes"
})
public class ConverterSpecificSettingsInfoPath
    extends ConverterSpecificSettings
{

    @XmlElement(name = "StripDotNETCode")
    protected Boolean stripDotNETCode;
    @XmlElement(name = "StripDataObjects")
    protected Boolean stripDataObjects;
    @XmlElement(name = "ConvertAttachments")
    protected Boolean convertAttachments;
    @XmlElementRef(name = "ConversionViews", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInfoPathView> conversionViews;
    @XmlElement(name = "AutoTrustForms")
    protected Boolean autoTrustForms;
    @XmlElement(name = "ProcessFullTrustForms")
    protected Boolean processFullTrustForms;
    @XmlElement(name = "UseNativePrintEngine")
    protected Boolean useNativePrintEngine;
    @XmlElementRef(name = "DefaultPaperSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> defaultPaperSize;
    @XmlElementRef(name = "ForcePaperSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> forcePaperSize;
    @XmlElement(name = "DefaultPageOrientation")
    protected PageOrientation defaultPageOrientation;
    @XmlElement(name = "ForcePageOrientation")
    protected PageOrientation forcePageOrientation;
    @XmlElementRef(name = "XSNData", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<byte[]> xsnData;
    @XmlElement(name = "AttachmentMergeMode")
    protected MergeMode attachmentMergeMode;
    @XmlElement(name = "UnsupportedAttachmentBehaviour")
    protected UnsupportedFileBehaviour unsupportedAttachmentBehaviour;
    @XmlElement(name = "BreakMergeOnError")
    protected Boolean breakMergeOnError;
    @XmlElementRef(name = "IncludeAttachmentTypes", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> includeAttachmentTypes;
    @XmlElementRef(name = "ExcludeAttachmentTypes", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> excludeAttachmentTypes;

    /**
     * Gets the value of the stripDotNETCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStripDotNETCode() {
        return stripDotNETCode;
    }

    /**
     * Sets the value of the stripDotNETCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStripDotNETCode(Boolean value) {
        this.stripDotNETCode = value;
    }

    /**
     * Gets the value of the stripDataObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStripDataObjects() {
        return stripDataObjects;
    }

    /**
     * Sets the value of the stripDataObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStripDataObjects(Boolean value) {
        this.stripDataObjects = value;
    }

    /**
     * Gets the value of the convertAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertAttachments() {
        return convertAttachments;
    }

    /**
     * Sets the value of the convertAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertAttachments(Boolean value) {
        this.convertAttachments = value;
    }

    /**
     * Gets the value of the conversionViews property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfoPathView }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInfoPathView> getConversionViews() {
        return conversionViews;
    }

    /**
     * Sets the value of the conversionViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInfoPathView }{@code >}
     *     
     */
    public void setConversionViews(JAXBElement<ArrayOfInfoPathView> value) {
        this.conversionViews = ((JAXBElement<ArrayOfInfoPathView> ) value);
    }

    /**
     * Gets the value of the autoTrustForms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoTrustForms() {
        return autoTrustForms;
    }

    /**
     * Sets the value of the autoTrustForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoTrustForms(Boolean value) {
        this.autoTrustForms = value;
    }

    /**
     * Gets the value of the processFullTrustForms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessFullTrustForms() {
        return processFullTrustForms;
    }

    /**
     * Sets the value of the processFullTrustForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessFullTrustForms(Boolean value) {
        this.processFullTrustForms = value;
    }

    /**
     * Gets the value of the useNativePrintEngine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNativePrintEngine() {
        return useNativePrintEngine;
    }

    /**
     * Sets the value of the useNativePrintEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNativePrintEngine(Boolean value) {
        this.useNativePrintEngine = value;
    }

    /**
     * Gets the value of the defaultPaperSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultPaperSize() {
        return defaultPaperSize;
    }

    /**
     * Sets the value of the defaultPaperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultPaperSize(JAXBElement<String> value) {
        this.defaultPaperSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the forcePaperSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForcePaperSize() {
        return forcePaperSize;
    }

    /**
     * Sets the value of the forcePaperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForcePaperSize(JAXBElement<String> value) {
        this.forcePaperSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defaultPageOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PageOrientation }
     *     
     */
    public PageOrientation getDefaultPageOrientation() {
        return defaultPageOrientation;
    }

    /**
     * Sets the value of the defaultPageOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOrientation }
     *     
     */
    public void setDefaultPageOrientation(PageOrientation value) {
        this.defaultPageOrientation = value;
    }

    /**
     * Gets the value of the forcePageOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PageOrientation }
     *     
     */
    public PageOrientation getForcePageOrientation() {
        return forcePageOrientation;
    }

    /**
     * Sets the value of the forcePageOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOrientation }
     *     
     */
    public void setForcePageOrientation(PageOrientation value) {
        this.forcePageOrientation = value;
    }

    /**
     * Gets the value of the xsnData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getXSNData() {
        return xsnData;
    }

    /**
     * Sets the value of the xsnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setXSNData(JAXBElement<byte[]> value) {
        this.xsnData = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the attachmentMergeMode property.
     * 
     * @return
     *     possible object is
     *     {@link MergeMode }
     *     
     */
    public MergeMode getAttachmentMergeMode() {
        return attachmentMergeMode;
    }

    /**
     * Sets the value of the attachmentMergeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeMode }
     *     
     */
    public void setAttachmentMergeMode(MergeMode value) {
        this.attachmentMergeMode = value;
    }

    /**
     * Gets the value of the unsupportedAttachmentBehaviour property.
     * 
     * @return
     *     possible object is
     *     {@link UnsupportedFileBehaviour }
     *     
     */
    public UnsupportedFileBehaviour getUnsupportedAttachmentBehaviour() {
        return unsupportedAttachmentBehaviour;
    }

    /**
     * Sets the value of the unsupportedAttachmentBehaviour property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsupportedFileBehaviour }
     *     
     */
    public void setUnsupportedAttachmentBehaviour(UnsupportedFileBehaviour value) {
        this.unsupportedAttachmentBehaviour = value;
    }

    /**
     * Gets the value of the breakMergeOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakMergeOnError() {
        return breakMergeOnError;
    }

    /**
     * Sets the value of the breakMergeOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakMergeOnError(Boolean value) {
        this.breakMergeOnError = value;
    }

    /**
     * Gets the value of the includeAttachmentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncludeAttachmentTypes() {
        return includeAttachmentTypes;
    }

    /**
     * Sets the value of the includeAttachmentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncludeAttachmentTypes(JAXBElement<String> value) {
        this.includeAttachmentTypes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the excludeAttachmentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcludeAttachmentTypes() {
        return excludeAttachmentTypes;
    }

    /**
     * Sets the value of the excludeAttachmentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcludeAttachmentTypes(JAXBElement<String> value) {
        this.excludeAttachmentTypes = ((JAXBElement<String> ) value);
    }

}
