
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
    "ignorePortfolioCoverSheet"
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

}
