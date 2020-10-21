
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
    "primeOCRAccuracyLevelProxy"
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

}
