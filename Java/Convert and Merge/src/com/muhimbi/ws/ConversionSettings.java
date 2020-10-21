
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
 * <p>Java class for ConversionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OutputFormat" minOccurs="0"/>
 *         &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Range" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ConversionRange" minOccurs="0"/>
 *         &lt;element name="Quality" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ConversionQuality" minOccurs="0"/>
 *         &lt;element name="PDFProfile" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFProfile" minOccurs="0"/>
 *         &lt;element name="OpenPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityOptions" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}SecurityOptions" minOccurs="0"/>
 *         &lt;element name="Fidelity" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ConversionFidelities" minOccurs="0"/>
 *         &lt;element name="GenerateBookmarks" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BookmarkGenerationOption" minOccurs="0"/>
 *         &lt;element name="Watermarks" type="{http://types.muhimbi.com/2010/05/17}ArrayOfWatermark" minOccurs="0"/>
 *         &lt;element name="PageOrientation" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageOrientation" minOccurs="0"/>
 *         &lt;element name="ConverterSpecificSettings" type="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings" minOccurs="0"/>
 *         &lt;element name="OutputFormatSpecificSettings" type="{http://types.muhimbi.com/2013/01/14}OutputFormatSpecificSettings" minOccurs="0"/>
 *         &lt;element name="OCRSettings" type="{http://types.muhimbi.com/2013/08/01}OCRSettings" minOccurs="0"/>
 *         &lt;element name="TOCSettings" type="{http://types.muhimbi.com/2013/01/14}TOCSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionSettings", propOrder = {
    "format",
    "startPage",
    "endPage",
    "range",
    "quality",
    "pdfProfile",
    "openPassword",
    "ownerPassword",
    "securityOptions",
    "fidelity",
    "generateBookmarks",
    "watermarks",
    "pageOrientation",
    "converterSpecificSettings",
    "outputFormatSpecificSettings",
    "ocrSettings",
    "tocSettings"
})
public class ConversionSettings {

    @XmlElement(name = "Format")
    @XmlSchemaType(name = "string")
    protected OutputFormat format;
    @XmlElement(name = "StartPage")
    protected Integer startPage;
    @XmlElement(name = "EndPage")
    protected Integer endPage;
    @XmlElement(name = "Range")
    @XmlSchemaType(name = "string")
    protected ConversionRange range;
    @XmlElement(name = "Quality")
    @XmlSchemaType(name = "string")
    protected ConversionQuality quality;
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
    @XmlList
    @XmlElement(name = "Fidelity")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> fidelity;
    @XmlElement(name = "GenerateBookmarks")
    @XmlSchemaType(name = "string")
    protected BookmarkGenerationOption generateBookmarks;
    @XmlElementRef(name = "Watermarks", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWatermark> watermarks;
    @XmlElement(name = "PageOrientation")
    @XmlSchemaType(name = "string")
    protected PageOrientation pageOrientation;
    @XmlElementRef(name = "ConverterSpecificSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ConverterSpecificSettings> converterSpecificSettings;
    @XmlElementRef(name = "OutputFormatSpecificSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<OutputFormatSpecificSettings> outputFormatSpecificSettings;
    @XmlElementRef(name = "OCRSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<OCRSettings> ocrSettings;
    @XmlElementRef(name = "TOCSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<TOCSettings> tocSettings;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat }
     *     
     */
    public OutputFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat }
     *     
     */
    public void setFormat(OutputFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the endPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndPage() {
        return endPage;
    }

    /**
     * Sets the value of the endPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndPage(Integer value) {
        this.endPage = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRange }
     *     
     */
    public ConversionRange getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRange }
     *     
     */
    public void setRange(ConversionRange value) {
        this.range = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionQuality }
     *     
     */
    public ConversionQuality getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionQuality }
     *     
     */
    public void setQuality(ConversionQuality value) {
        this.quality = value;
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
     * Gets the value of the fidelity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fidelity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFidelity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFidelity() {
        if (fidelity == null) {
            fidelity = new ArrayList<String>();
        }
        return this.fidelity;
    }

    /**
     * Gets the value of the generateBookmarks property.
     * 
     * @return
     *     possible object is
     *     {@link BookmarkGenerationOption }
     *     
     */
    public BookmarkGenerationOption getGenerateBookmarks() {
        return generateBookmarks;
    }

    /**
     * Sets the value of the generateBookmarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookmarkGenerationOption }
     *     
     */
    public void setGenerateBookmarks(BookmarkGenerationOption value) {
        this.generateBookmarks = value;
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
     * Gets the value of the pageOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PageOrientation }
     *     
     */
    public PageOrientation getPageOrientation() {
        return pageOrientation;
    }

    /**
     * Sets the value of the pageOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOrientation }
     *     
     */
    public void setPageOrientation(PageOrientation value) {
        this.pageOrientation = value;
    }

    /**
     * Gets the value of the converterSpecificSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConverterSpecificSettings }{@code >}
     *     
     */
    public JAXBElement<ConverterSpecificSettings> getConverterSpecificSettings() {
        return converterSpecificSettings;
    }

    /**
     * Sets the value of the converterSpecificSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConverterSpecificSettings }{@code >}
     *     
     */
    public void setConverterSpecificSettings(JAXBElement<ConverterSpecificSettings> value) {
        this.converterSpecificSettings = value;
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

}
