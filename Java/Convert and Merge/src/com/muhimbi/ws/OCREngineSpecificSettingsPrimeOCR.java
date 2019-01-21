
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCREngineSpecificSettings_PrimeOCR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCREngineSpecificSettings_PrimeOCR">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}OCREngineSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="AccuracyLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Deskew" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_Deskew" minOccurs="0"/>
 *         &lt;element name="ImageProcessingOptions" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_ImageProcessingOptions" minOccurs="0"/>
 *         &lt;element name="LexicalChecking" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_LexicalChecking" minOccurs="0"/>
 *         &lt;element name="PageQuality" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_PageQuality" minOccurs="0"/>
 *         &lt;element name="PrintType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_PrintType" minOccurs="0"/>
 *         &lt;element name="AutoZone" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_AutoZone" minOccurs="0"/>
 *         &lt;element name="ZoneContent" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_ZoneContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCREngineSpecificSettings_PrimeOCR", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "accuracyLevel",
    "deskew",
    "imageProcessingOptions",
    "lexicalChecking",
    "pageQuality",
    "printType",
    "autoZone",
    "zoneContent"
})
public class OCREngineSpecificSettingsPrimeOCR
    extends OCREngineSpecificSettings
{

    @XmlElement(name = "AccuracyLevel")
    protected Integer accuracyLevel;
    @XmlElement(name = "Deskew")
    protected PrimeOCRDeskew deskew;
    @XmlList
    @XmlElement(name = "ImageProcessingOptions")
    protected List<String> imageProcessingOptions;
    @XmlElement(name = "LexicalChecking")
    protected PrimeOCRLexicalChecking lexicalChecking;
    @XmlElement(name = "PageQuality")
    protected PrimeOCRPageQuality pageQuality;
    @XmlElement(name = "PrintType")
    protected PrimeOCRPrintType printType;
    @XmlElement(name = "AutoZone")
    protected PrimeOCRAutoZone autoZone;
    @XmlElement(name = "ZoneContent")
    protected PrimeOCRZoneContent zoneContent;

    /**
     * Gets the value of the accuracyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccuracyLevel() {
        return accuracyLevel;
    }

    /**
     * Sets the value of the accuracyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccuracyLevel(Integer value) {
        this.accuracyLevel = value;
    }

    /**
     * Gets the value of the deskew property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRDeskew }
     *     
     */
    public PrimeOCRDeskew getDeskew() {
        return deskew;
    }

    /**
     * Sets the value of the deskew property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRDeskew }
     *     
     */
    public void setDeskew(PrimeOCRDeskew value) {
        this.deskew = value;
    }

    /**
     * Gets the value of the imageProcessingOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageProcessingOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageProcessingOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImageProcessingOptions() {
        if (imageProcessingOptions == null) {
            imageProcessingOptions = new ArrayList<String>();
        }
        return this.imageProcessingOptions;
    }

    /**
     * Gets the value of the lexicalChecking property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRLexicalChecking }
     *     
     */
    public PrimeOCRLexicalChecking getLexicalChecking() {
        return lexicalChecking;
    }

    /**
     * Sets the value of the lexicalChecking property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRLexicalChecking }
     *     
     */
    public void setLexicalChecking(PrimeOCRLexicalChecking value) {
        this.lexicalChecking = value;
    }

    /**
     * Gets the value of the pageQuality property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRPageQuality }
     *     
     */
    public PrimeOCRPageQuality getPageQuality() {
        return pageQuality;
    }

    /**
     * Sets the value of the pageQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRPageQuality }
     *     
     */
    public void setPageQuality(PrimeOCRPageQuality value) {
        this.pageQuality = value;
    }

    /**
     * Gets the value of the printType property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRPrintType }
     *     
     */
    public PrimeOCRPrintType getPrintType() {
        return printType;
    }

    /**
     * Sets the value of the printType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRPrintType }
     *     
     */
    public void setPrintType(PrimeOCRPrintType value) {
        this.printType = value;
    }

    /**
     * Gets the value of the autoZone property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRAutoZone }
     *     
     */
    public PrimeOCRAutoZone getAutoZone() {
        return autoZone;
    }

    /**
     * Sets the value of the autoZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRAutoZone }
     *     
     */
    public void setAutoZone(PrimeOCRAutoZone value) {
        this.autoZone = value;
    }

    /**
     * Gets the value of the zoneContent property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRZoneContent }
     *     
     */
    public PrimeOCRZoneContent getZoneContent() {
        return zoneContent;
    }

    /**
     * Sets the value of the zoneContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRZoneContent }
     *     
     */
    public void setZoneContent(PrimeOCRZoneContent value) {
        this.zoneContent = value;
    }

}
