
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
 * <p>Java class for OCRSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCRSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Performance" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OCRPerformance" minOccurs="0"/>
 *         &lt;element name="WhiteList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlackList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paginate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Regions" type="{http://types.muhimbi.com/2013/08/01}ArrayOfOCRRegion" minOccurs="0"/>
 *         &lt;element name="OutputType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OCROutputType" minOccurs="0"/>
 *         &lt;element name="OCREngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OCREngineSpecificSettings" type="{http://types.muhimbi.com/2010/11/22}OCREngineSpecificSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCRSettings", namespace = "http://types.muhimbi.com/2013/08/01", propOrder = {
    "language",
    "performance",
    "whiteList",
    "blackList",
    "paginate",
    "regions",
    "outputType",
    "ocrEngine",
    "ocrEngineSpecificSettings"
})
public class OCRSettings {

    @XmlElementRef(name = "Language", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElement(name = "Performance")
    @XmlSchemaType(name = "string")
    protected OCRPerformance performance;
    @XmlElementRef(name = "WhiteList", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> whiteList;
    @XmlElementRef(name = "BlackList", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blackList;
    @XmlElement(name = "Paginate")
    protected Boolean paginate;
    @XmlElementRef(name = "Regions", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOCRRegion> regions;
    @XmlList
    @XmlElement(name = "OutputType")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> outputType;
    @XmlElementRef(name = "OCREngine", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ocrEngine;
    @XmlElementRef(name = "OCREngineSpecificSettings", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class, required = false)
    protected JAXBElement<OCREngineSpecificSettings> ocrEngineSpecificSettings;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Gets the value of the performance property.
     * 
     * @return
     *     possible object is
     *     {@link OCRPerformance }
     *     
     */
    public OCRPerformance getPerformance() {
        return performance;
    }

    /**
     * Sets the value of the performance property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCRPerformance }
     *     
     */
    public void setPerformance(OCRPerformance value) {
        this.performance = value;
    }

    /**
     * Gets the value of the whiteList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhiteList() {
        return whiteList;
    }

    /**
     * Sets the value of the whiteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhiteList(JAXBElement<String> value) {
        this.whiteList = value;
    }

    /**
     * Gets the value of the blackList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlackList() {
        return blackList;
    }

    /**
     * Sets the value of the blackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlackList(JAXBElement<String> value) {
        this.blackList = value;
    }

    /**
     * Gets the value of the paginate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaginate() {
        return paginate;
    }

    /**
     * Sets the value of the paginate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaginate(Boolean value) {
        this.paginate = value;
    }

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRRegion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOCRRegion> getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRRegion }{@code >}
     *     
     */
    public void setRegions(JAXBElement<ArrayOfOCRRegion> value) {
        this.regions = value;
    }

    /**
     * Gets the value of the outputType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutputType() {
        if (outputType == null) {
            outputType = new ArrayList<String>();
        }
        return this.outputType;
    }

    /**
     * Gets the value of the ocrEngine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOCREngine() {
        return ocrEngine;
    }

    /**
     * Sets the value of the ocrEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOCREngine(JAXBElement<String> value) {
        this.ocrEngine = value;
    }

    /**
     * Gets the value of the ocrEngineSpecificSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OCREngineSpecificSettings }{@code >}
     *     
     */
    public JAXBElement<OCREngineSpecificSettings> getOCREngineSpecificSettings() {
        return ocrEngineSpecificSettings;
    }

    /**
     * Sets the value of the ocrEngineSpecificSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OCREngineSpecificSettings }{@code >}
     *     
     */
    public void setOCREngineSpecificSettings(JAXBElement<OCREngineSpecificSettings> value) {
        this.ocrEngineSpecificSettings = value;
    }

}
