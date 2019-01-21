
package com.muhimbi.ws;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_MSG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_MSG">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="ConvertAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HTMLScaleMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}HTMLScaleMode" minOccurs="0"/>
 *         &lt;element name="PlainTextLineBreaks" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MSGPlainTextLineBreaks" minOccurs="0"/>
 *         &lt;element name="BestBodyMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MSGBestBodyMode" minOccurs="0"/>
 *         &lt;element name="EmailAddressDisplayMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MSGEmailAddressDisplayMode" minOccurs="0"/>
 *         &lt;element name="FromEmailAddressDisplayMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MSGEmailAddressDisplayMode" minOccurs="0"/>
 *         &lt;element name="DisplayAttachmentSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BreakOnUnsupportedAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BreakOnUnsupportedEmbeddedObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmbeddedObjectDisplayMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MSGEmbeddedObjectDisplayMode" minOccurs="0"/>
 *         &lt;element name="EmbeddedObjectIconDisplayMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MSGEmbeddedObjectIconDisplayMode" minOccurs="0"/>
 *         &lt;element name="EmbeddedObjectScalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SentDateMissingDisplayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlRenderingEngine" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}HTMLRenderingEngine" minOccurs="0"/>
 *         &lt;element name="WebKitViewPortSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnableWebKitOfflineMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PageMargins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_MSG", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "convertAttachments",
    "paperSize",
    "htmlScaleMode",
    "plainTextLineBreaks",
    "bestBodyMode",
    "emailAddressDisplayMode",
    "fromEmailAddressDisplayMode",
    "displayAttachmentSummary",
    "breakOnUnsupportedAttachment",
    "breakOnUnsupportedEmbeddedObject",
    "embeddedObjectDisplayMode",
    "embeddedObjectIconDisplayMode",
    "embeddedObjectScalePercentage",
    "sentDateMissingDisplayMode",
    "htmlRenderingEngine",
    "webKitViewPortSize",
    "enableWebKitOfflineMode",
    "pageMargins"
})
public class ConverterSpecificSettingsMSG
    extends ConverterSpecificSettings
{

    @XmlElement(name = "ConvertAttachments")
    protected Boolean convertAttachments;
    @XmlElementRef(name = "PaperSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> paperSize;
    @XmlElement(name = "HTMLScaleMode")
    protected HTMLScaleMode htmlScaleMode;
    @XmlElement(name = "PlainTextLineBreaks")
    protected MSGPlainTextLineBreaks plainTextLineBreaks;
    @XmlElement(name = "BestBodyMode")
    protected MSGBestBodyMode bestBodyMode;
    @XmlElement(name = "EmailAddressDisplayMode")
    protected MSGEmailAddressDisplayMode emailAddressDisplayMode;
    @XmlElement(name = "FromEmailAddressDisplayMode")
    protected MSGEmailAddressDisplayMode fromEmailAddressDisplayMode;
    @XmlElement(name = "DisplayAttachmentSummary")
    protected Boolean displayAttachmentSummary;
    @XmlElement(name = "BreakOnUnsupportedAttachment")
    protected Boolean breakOnUnsupportedAttachment;
    @XmlElement(name = "BreakOnUnsupportedEmbeddedObject")
    protected Boolean breakOnUnsupportedEmbeddedObject;
    @XmlElement(name = "EmbeddedObjectDisplayMode")
    protected MSGEmbeddedObjectDisplayMode embeddedObjectDisplayMode;
    @XmlElement(name = "EmbeddedObjectIconDisplayMode")
    protected MSGEmbeddedObjectIconDisplayMode embeddedObjectIconDisplayMode;
    @XmlElement(name = "EmbeddedObjectScalePercentage")
    protected BigDecimal embeddedObjectScalePercentage;
    @XmlElementRef(name = "SentDateMissingDisplayMode", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> sentDateMissingDisplayMode;
    @XmlElement(name = "HtmlRenderingEngine")
    protected HTMLRenderingEngine htmlRenderingEngine;
    @XmlElementRef(name = "WebKitViewPortSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> webKitViewPortSize;
    @XmlElement(name = "EnableWebKitOfflineMode")
    protected Boolean enableWebKitOfflineMode;
    @XmlElementRef(name = "PageMargins", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> pageMargins;

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
     * Gets the value of the paperSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaperSize() {
        return paperSize;
    }

    /**
     * Sets the value of the paperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaperSize(JAXBElement<String> value) {
        this.paperSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the htmlScaleMode property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLScaleMode }
     *     
     */
    public HTMLScaleMode getHTMLScaleMode() {
        return htmlScaleMode;
    }

    /**
     * Sets the value of the htmlScaleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLScaleMode }
     *     
     */
    public void setHTMLScaleMode(HTMLScaleMode value) {
        this.htmlScaleMode = value;
    }

    /**
     * Gets the value of the plainTextLineBreaks property.
     * 
     * @return
     *     possible object is
     *     {@link MSGPlainTextLineBreaks }
     *     
     */
    public MSGPlainTextLineBreaks getPlainTextLineBreaks() {
        return plainTextLineBreaks;
    }

    /**
     * Sets the value of the plainTextLineBreaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSGPlainTextLineBreaks }
     *     
     */
    public void setPlainTextLineBreaks(MSGPlainTextLineBreaks value) {
        this.plainTextLineBreaks = value;
    }

    /**
     * Gets the value of the bestBodyMode property.
     * 
     * @return
     *     possible object is
     *     {@link MSGBestBodyMode }
     *     
     */
    public MSGBestBodyMode getBestBodyMode() {
        return bestBodyMode;
    }

    /**
     * Sets the value of the bestBodyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSGBestBodyMode }
     *     
     */
    public void setBestBodyMode(MSGBestBodyMode value) {
        this.bestBodyMode = value;
    }

    /**
     * Gets the value of the emailAddressDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link MSGEmailAddressDisplayMode }
     *     
     */
    public MSGEmailAddressDisplayMode getEmailAddressDisplayMode() {
        return emailAddressDisplayMode;
    }

    /**
     * Sets the value of the emailAddressDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSGEmailAddressDisplayMode }
     *     
     */
    public void setEmailAddressDisplayMode(MSGEmailAddressDisplayMode value) {
        this.emailAddressDisplayMode = value;
    }

    /**
     * Gets the value of the fromEmailAddressDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link MSGEmailAddressDisplayMode }
     *     
     */
    public MSGEmailAddressDisplayMode getFromEmailAddressDisplayMode() {
        return fromEmailAddressDisplayMode;
    }

    /**
     * Sets the value of the fromEmailAddressDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSGEmailAddressDisplayMode }
     *     
     */
    public void setFromEmailAddressDisplayMode(MSGEmailAddressDisplayMode value) {
        this.fromEmailAddressDisplayMode = value;
    }

    /**
     * Gets the value of the displayAttachmentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayAttachmentSummary() {
        return displayAttachmentSummary;
    }

    /**
     * Sets the value of the displayAttachmentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayAttachmentSummary(Boolean value) {
        this.displayAttachmentSummary = value;
    }

    /**
     * Gets the value of the breakOnUnsupportedAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakOnUnsupportedAttachment() {
        return breakOnUnsupportedAttachment;
    }

    /**
     * Sets the value of the breakOnUnsupportedAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakOnUnsupportedAttachment(Boolean value) {
        this.breakOnUnsupportedAttachment = value;
    }

    /**
     * Gets the value of the breakOnUnsupportedEmbeddedObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakOnUnsupportedEmbeddedObject() {
        return breakOnUnsupportedEmbeddedObject;
    }

    /**
     * Sets the value of the breakOnUnsupportedEmbeddedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakOnUnsupportedEmbeddedObject(Boolean value) {
        this.breakOnUnsupportedEmbeddedObject = value;
    }

    /**
     * Gets the value of the embeddedObjectDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link MSGEmbeddedObjectDisplayMode }
     *     
     */
    public MSGEmbeddedObjectDisplayMode getEmbeddedObjectDisplayMode() {
        return embeddedObjectDisplayMode;
    }

    /**
     * Sets the value of the embeddedObjectDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSGEmbeddedObjectDisplayMode }
     *     
     */
    public void setEmbeddedObjectDisplayMode(MSGEmbeddedObjectDisplayMode value) {
        this.embeddedObjectDisplayMode = value;
    }

    /**
     * Gets the value of the embeddedObjectIconDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link MSGEmbeddedObjectIconDisplayMode }
     *     
     */
    public MSGEmbeddedObjectIconDisplayMode getEmbeddedObjectIconDisplayMode() {
        return embeddedObjectIconDisplayMode;
    }

    /**
     * Sets the value of the embeddedObjectIconDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSGEmbeddedObjectIconDisplayMode }
     *     
     */
    public void setEmbeddedObjectIconDisplayMode(MSGEmbeddedObjectIconDisplayMode value) {
        this.embeddedObjectIconDisplayMode = value;
    }

    /**
     * Gets the value of the embeddedObjectScalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmbeddedObjectScalePercentage() {
        return embeddedObjectScalePercentage;
    }

    /**
     * Sets the value of the embeddedObjectScalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmbeddedObjectScalePercentage(BigDecimal value) {
        this.embeddedObjectScalePercentage = value;
    }

    /**
     * Gets the value of the sentDateMissingDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSentDateMissingDisplayMode() {
        return sentDateMissingDisplayMode;
    }

    /**
     * Sets the value of the sentDateMissingDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSentDateMissingDisplayMode(JAXBElement<String> value) {
        this.sentDateMissingDisplayMode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the htmlRenderingEngine property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLRenderingEngine }
     *     
     */
    public HTMLRenderingEngine getHtmlRenderingEngine() {
        return htmlRenderingEngine;
    }

    /**
     * Sets the value of the htmlRenderingEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLRenderingEngine }
     *     
     */
    public void setHtmlRenderingEngine(HTMLRenderingEngine value) {
        this.htmlRenderingEngine = value;
    }

    /**
     * Gets the value of the webKitViewPortSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebKitViewPortSize() {
        return webKitViewPortSize;
    }

    /**
     * Sets the value of the webKitViewPortSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebKitViewPortSize(JAXBElement<String> value) {
        this.webKitViewPortSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the enableWebKitOfflineMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWebKitOfflineMode() {
        return enableWebKitOfflineMode;
    }

    /**
     * Sets the value of the enableWebKitOfflineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWebKitOfflineMode(Boolean value) {
        this.enableWebKitOfflineMode = value;
    }

    /**
     * Gets the value of the pageMargins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageMargins() {
        return pageMargins;
    }

    /**
     * Sets the value of the pageMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageMargins(JAXBElement<String> value) {
        this.pageMargins = ((JAXBElement<String> ) value);
    }

}
