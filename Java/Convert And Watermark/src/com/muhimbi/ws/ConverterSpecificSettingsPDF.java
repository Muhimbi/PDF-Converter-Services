
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_PDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_PDF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="ConvertAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertAttachmentMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFConvertAttachmentMode" minOccurs="0"/>
 *         &lt;element name="IgnorePortfolioCoverSheet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ConverterSpecificSettings_PDF", namespace = "http://types.muhimbi.com/2014/04/16", propOrder = {
    "convertAttachments",
    "convertAttachmentMode",
    "ignorePortfolioCoverSheet",
    "attachmentMergeMode",
    "unsupportedAttachmentBehaviour",
    "breakMergeOnError",
    "includeAttachmentTypes",
    "excludeAttachmentTypes"
})
public class ConverterSpecificSettingsPDF
    extends ConverterSpecificSettings
{

    @XmlElement(name = "ConvertAttachments")
    protected Boolean convertAttachments;
    @XmlElement(name = "ConvertAttachmentMode")
    protected PDFConvertAttachmentMode convertAttachmentMode;
    @XmlElement(name = "IgnorePortfolioCoverSheet")
    protected Boolean ignorePortfolioCoverSheet;
    @XmlElement(name = "AttachmentMergeMode")
    protected MergeMode attachmentMergeMode;
    @XmlElement(name = "UnsupportedAttachmentBehaviour")
    protected UnsupportedFileBehaviour unsupportedAttachmentBehaviour;
    @XmlElement(name = "BreakMergeOnError")
    protected Boolean breakMergeOnError;
    @XmlElementRef(name = "IncludeAttachmentTypes", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class)
    protected JAXBElement<String> includeAttachmentTypes;
    @XmlElementRef(name = "ExcludeAttachmentTypes", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class)
    protected JAXBElement<String> excludeAttachmentTypes;

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
     * Gets the value of the convertAttachmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link PDFConvertAttachmentMode }
     *     
     */
    public PDFConvertAttachmentMode getConvertAttachmentMode() {
        return convertAttachmentMode;
    }

    /**
     * Sets the value of the convertAttachmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFConvertAttachmentMode }
     *     
     */
    public void setConvertAttachmentMode(PDFConvertAttachmentMode value) {
        this.convertAttachmentMode = value;
    }

    /**
     * Gets the value of the ignorePortfolioCoverSheet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnorePortfolioCoverSheet() {
        return ignorePortfolioCoverSheet;
    }

    /**
     * Sets the value of the ignorePortfolioCoverSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorePortfolioCoverSheet(Boolean value) {
        this.ignorePortfolioCoverSheet = value;
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
