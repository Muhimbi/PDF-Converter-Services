
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_PdfFormsDataImporter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_PdfFormsDataImporter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="PdfTemplateData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="PdfTemplateURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PdfTemplateUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PdfTemplateDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PdfTemplatePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flatten" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BooleanEnum" minOccurs="0"/>
 *         &lt;element name="ReadOnly" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BooleanEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_PdfFormsDataImporter", namespace = "http://types.muhimbi.com/2014/04/16", propOrder = {
    "pdfTemplateData",
    "pdfTemplateURL",
    "pdfTemplateUserName",
    "pdfTemplateDomain",
    "pdfTemplatePassword",
    "flatten",
    "readOnly"
})
public class ConverterSpecificSettingsPdfFormsDataImporter
    extends ConverterSpecificSettings
{

    @XmlElementRef(name = "PdfTemplateData", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> pdfTemplateData;
    @XmlElementRef(name = "PdfTemplateURL", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfTemplateURL;
    @XmlElementRef(name = "PdfTemplateUserName", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfTemplateUserName;
    @XmlElementRef(name = "PdfTemplateDomain", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfTemplateDomain;
    @XmlElementRef(name = "PdfTemplatePassword", namespace = "http://types.muhimbi.com/2014/04/16", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdfTemplatePassword;
    @XmlElement(name = "Flatten")
    @XmlSchemaType(name = "string")
    protected BooleanEnum flatten;
    @XmlElement(name = "ReadOnly")
    @XmlSchemaType(name = "string")
    protected BooleanEnum readOnly;

    /**
     * Gets the value of the pdfTemplateData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPdfTemplateData() {
        return pdfTemplateData;
    }

    /**
     * Sets the value of the pdfTemplateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPdfTemplateData(JAXBElement<byte[]> value) {
        this.pdfTemplateData = value;
    }

    /**
     * Gets the value of the pdfTemplateURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdfTemplateURL() {
        return pdfTemplateURL;
    }

    /**
     * Sets the value of the pdfTemplateURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdfTemplateURL(JAXBElement<String> value) {
        this.pdfTemplateURL = value;
    }

    /**
     * Gets the value of the pdfTemplateUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdfTemplateUserName() {
        return pdfTemplateUserName;
    }

    /**
     * Sets the value of the pdfTemplateUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdfTemplateUserName(JAXBElement<String> value) {
        this.pdfTemplateUserName = value;
    }

    /**
     * Gets the value of the pdfTemplateDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdfTemplateDomain() {
        return pdfTemplateDomain;
    }

    /**
     * Sets the value of the pdfTemplateDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdfTemplateDomain(JAXBElement<String> value) {
        this.pdfTemplateDomain = value;
    }

    /**
     * Gets the value of the pdfTemplatePassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdfTemplatePassword() {
        return pdfTemplatePassword;
    }

    /**
     * Sets the value of the pdfTemplatePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdfTemplatePassword(JAXBElement<String> value) {
        this.pdfTemplatePassword = value;
    }

    /**
     * Gets the value of the flatten property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getFlatten() {
        return flatten;
    }

    /**
     * Sets the value of the flatten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setFlatten(BooleanEnum value) {
        this.flatten = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setReadOnly(BooleanEnum value) {
        this.readOnly = value;
    }

}
