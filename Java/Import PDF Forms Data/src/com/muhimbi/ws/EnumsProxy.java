
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumsProxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumsProxy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="OCRLanguageProxy" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OCRLanguage" minOccurs="0"/>
 *         &lt;element name="PrimeOCR_AccuracyLevelProxy" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR}PrimeOCR_AccuracyLevel" minOccurs="0"/>
 *         &lt;element name="PropertyCategoriesProxy" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PropertyCategories" minOccurs="0"/>
 *         &lt;element name="WordBuiltInPropertiesProxy" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}WordBuiltInProperties" minOccurs="0"/>
 *         &lt;element name="PdfBuiltInProperties" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PdfBuiltInProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumsProxy", namespace = "http://types.muhimbi.com/2013/08/01", propOrder = {
    "ocrLanguageProxy",
    "primeOCRAccuracyLevelProxy",
    "propertyCategoriesProxy",
    "wordBuiltInPropertiesProxy",
    "pdfBuiltInProperties"
})
public class EnumsProxy
    extends ConverterSpecificSettings
{

    @XmlElement(name = "OCRLanguageProxy")
    @XmlSchemaType(name = "string")
    protected OCRLanguage ocrLanguageProxy;
    @XmlElement(name = "PrimeOCR_AccuracyLevelProxy")
    @XmlSchemaType(name = "string")
    protected PrimeOCRAccuracyLevel primeOCRAccuracyLevelProxy;
    @XmlElement(name = "PropertyCategoriesProxy")
    @XmlSchemaType(name = "string")
    protected PropertyCategories propertyCategoriesProxy;
    @XmlElement(name = "WordBuiltInPropertiesProxy")
    @XmlSchemaType(name = "string")
    protected WordBuiltInProperties wordBuiltInPropertiesProxy;
    @XmlElement(name = "PdfBuiltInProperties")
    @XmlSchemaType(name = "string")
    protected PdfBuiltInProperties pdfBuiltInProperties;

    /**
     * Gets the value of the ocrLanguageProxy property.
     * 
     * @return
     *     possible object is
     *     {@link OCRLanguage }
     *     
     */
    public OCRLanguage getOCRLanguageProxy() {
        return ocrLanguageProxy;
    }

    /**
     * Sets the value of the ocrLanguageProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCRLanguage }
     *     
     */
    public void setOCRLanguageProxy(OCRLanguage value) {
        this.ocrLanguageProxy = value;
    }

    /**
     * Gets the value of the primeOCRAccuracyLevelProxy property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeOCRAccuracyLevel }
     *     
     */
    public PrimeOCRAccuracyLevel getPrimeOCRAccuracyLevelProxy() {
        return primeOCRAccuracyLevelProxy;
    }

    /**
     * Sets the value of the primeOCRAccuracyLevelProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeOCRAccuracyLevel }
     *     
     */
    public void setPrimeOCRAccuracyLevelProxy(PrimeOCRAccuracyLevel value) {
        this.primeOCRAccuracyLevelProxy = value;
    }

    /**
     * Gets the value of the propertyCategoriesProxy property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyCategories }
     *     
     */
    public PropertyCategories getPropertyCategoriesProxy() {
        return propertyCategoriesProxy;
    }

    /**
     * Sets the value of the propertyCategoriesProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyCategories }
     *     
     */
    public void setPropertyCategoriesProxy(PropertyCategories value) {
        this.propertyCategoriesProxy = value;
    }

    /**
     * Gets the value of the wordBuiltInPropertiesProxy property.
     * 
     * @return
     *     possible object is
     *     {@link WordBuiltInProperties }
     *     
     */
    public WordBuiltInProperties getWordBuiltInPropertiesProxy() {
        return wordBuiltInPropertiesProxy;
    }

    /**
     * Sets the value of the wordBuiltInPropertiesProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordBuiltInProperties }
     *     
     */
    public void setWordBuiltInPropertiesProxy(WordBuiltInProperties value) {
        this.wordBuiltInPropertiesProxy = value;
    }

    /**
     * Gets the value of the pdfBuiltInProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PdfBuiltInProperties }
     *     
     */
    public PdfBuiltInProperties getPdfBuiltInProperties() {
        return pdfBuiltInProperties;
    }

    /**
     * Sets the value of the pdfBuiltInProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfBuiltInProperties }
     *     
     */
    public void setPdfBuiltInProperties(PdfBuiltInProperties value) {
        this.pdfBuiltInProperties = value;
    }

}
