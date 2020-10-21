
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BreakOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PDFProfile" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFProfile" minOccurs="0"/>
 *         &lt;element name="OpenPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityOptions" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}SecurityOptions" minOccurs="0"/>
 *         &lt;element name="Watermarks" type="{http://types.muhimbi.com/2010/05/17}ArrayOfWatermark" minOccurs="0"/>
 *         &lt;element name="OmitErrorPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OutputFormatSpecificSettings" type="{http://types.muhimbi.com/2013/01/14}OutputFormatSpecificSettings" minOccurs="0"/>
 *         &lt;element name="TOCSettings" type="{http://types.muhimbi.com/2013/01/14}TOCSettings" minOccurs="0"/>
 *         &lt;element name="DocumentStartPage" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}DocumentStartPage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeSettings", propOrder = {
    "breakOnError",
    "pdfProfile",
    "openPassword",
    "ownerPassword",
    "securityOptions",
    "watermarks",
    "omitErrorPages",
    "outputFormatSpecificSettings",
    "tocSettings",
    "documentStartPage"
})
public class MergeSettings {

    @XmlElement(name = "BreakOnError")
    protected Boolean breakOnError;
    @XmlElement(name = "PDFProfile")
    @XmlSchemaType(name = "string")
    protected PDFProfile pdfProfile;
    @XmlElementRef(name = "OpenPassword", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> openPassword;
    @XmlElementRef(name = "OwnerPassword", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerPassword;
    @XmlList
    @XmlElement(name = "SecurityOptions")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> securityOptions;
    @XmlElementRef(name = "Watermarks", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWatermark> watermarks;
    @XmlElement(name = "OmitErrorPages")
    protected Boolean omitErrorPages;
    @XmlElementRef(name = "OutputFormatSpecificSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<OutputFormatSpecificSettings> outputFormatSpecificSettings;
    @XmlElementRef(name = "TOCSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<TOCSettings> tocSettings;
    @XmlElement(name = "DocumentStartPage")
    @XmlSchemaType(name = "string")
    protected DocumentStartPage documentStartPage;

    /**
     * Gets the value of the breakOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreakOnError() {
        return breakOnError;
    }

    /**
     * Sets the value of the breakOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreakOnError(Boolean value) {
        this.breakOnError = value;
    }

    /**
     * Gets the value of the pdfProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PDFProfile }
     *     
     */
    public PDFProfile getPDFProfile() {
        return pdfProfile;
    }

    /**
     * Sets the value of the pdfProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFProfile }
     *     
     */
    public void setPDFProfile(PDFProfile value) {
        this.pdfProfile = value;
    }

    /**
     * Gets the value of the openPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenPassword() {
        return openPassword;
    }

    /**
     * Sets the value of the openPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenPassword(JAXBElement<String> value) {
        this.openPassword = value;
    }

    /**
     * Gets the value of the ownerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerPassword() {
        return ownerPassword;
    }

    /**
     * Sets the value of the ownerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerPassword(JAXBElement<String> value) {
        this.ownerPassword = value;
    }

    /**
     * Gets the value of the securityOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecurityOptions() {
        if (securityOptions == null) {
            securityOptions = new ArrayList<String>();
        }
        return this.securityOptions;
    }

    /**
     * Gets the value of the watermarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWatermark }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWatermark> getWatermarks() {
        return watermarks;
    }

    /**
     * Sets the value of the watermarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWatermark }{@code >}
     *     
     */
    public void setWatermarks(JAXBElement<ArrayOfWatermark> value) {
        this.watermarks = value;
    }

    /**
     * Gets the value of the omitErrorPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmitErrorPages() {
        return omitErrorPages;
    }

    /**
     * Sets the value of the omitErrorPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmitErrorPages(Boolean value) {
        this.omitErrorPages = value;
    }

    /**
     * Gets the value of the outputFormatSpecificSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OutputFormatSpecificSettings }{@code >}
     *     
     */
    public JAXBElement<OutputFormatSpecificSettings> getOutputFormatSpecificSettings() {
        return outputFormatSpecificSettings;
    }

    /**
     * Sets the value of the outputFormatSpecificSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OutputFormatSpecificSettings }{@code >}
     *     
     */
    public void setOutputFormatSpecificSettings(JAXBElement<OutputFormatSpecificSettings> value) {
        this.outputFormatSpecificSettings = value;
    }

    /**
     * Gets the value of the tocSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TOCSettings }{@code >}
     *     
     */
    public JAXBElement<TOCSettings> getTOCSettings() {
        return tocSettings;
    }

    /**
     * Sets the value of the tocSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TOCSettings }{@code >}
     *     
     */
    public void setTOCSettings(JAXBElement<TOCSettings> value) {
        this.tocSettings = value;
    }

    /**
     * Gets the value of the documentStartPage property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStartPage }
     *     
     */
    public DocumentStartPage getDocumentStartPage() {
        return documentStartPage;
    }

    /**
     * Sets the value of the documentStartPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStartPage }
     *     
     */
    public void setDocumentStartPage(DocumentStartPage value) {
        this.documentStartPage = value;
    }

}
