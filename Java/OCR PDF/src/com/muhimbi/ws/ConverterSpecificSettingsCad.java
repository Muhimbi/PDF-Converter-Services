
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_Cad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_Cad">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="PaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForegroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CadConversionElements" type="{http://types.muhimbi.com/2010/11/22}ArrayOfCadConversionElement" minOccurs="0"/>
 *         &lt;element name="PageMargins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmptyLayoutDetectionMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}CadEmptyLayoutDetectionMode" minOccurs="0"/>
 *         &lt;element name="LayoutSortOrder" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}CadLayoutSortOrder" minOccurs="0"/>
 *         &lt;element name="ExternalReferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_Cad", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "paperSize",
    "backgroundColor",
    "foregroundColor",
    "cadConversionElements",
    "pageMargins",
    "emptyLayoutDetectionMode",
    "layoutSortOrder",
    "externalReferences"
})
public class ConverterSpecificSettingsCad
    extends ConverterSpecificSettings
{

    @XmlElementRef(name = "PaperSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> paperSize;
    @XmlElementRef(name = "BackgroundColor", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> backgroundColor;
    @XmlElementRef(name = "ForegroundColor", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> foregroundColor;
    @XmlElementRef(name = "CadConversionElements", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<ArrayOfCadConversionElement> cadConversionElements;
    @XmlElementRef(name = "PageMargins", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> pageMargins;
    @XmlElement(name = "EmptyLayoutDetectionMode")
    protected CadEmptyLayoutDetectionMode emptyLayoutDetectionMode;
    @XmlElement(name = "LayoutSortOrder")
    protected CadLayoutSortOrder layoutSortOrder;
    @XmlElementRef(name = "ExternalReferences", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> externalReferences;

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
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackgroundColor(JAXBElement<String> value) {
        this.backgroundColor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the foregroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForegroundColor() {
        return foregroundColor;
    }

    /**
     * Sets the value of the foregroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForegroundColor(JAXBElement<String> value) {
        this.foregroundColor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cadConversionElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCadConversionElement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCadConversionElement> getCadConversionElements() {
        return cadConversionElements;
    }

    /**
     * Sets the value of the cadConversionElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCadConversionElement }{@code >}
     *     
     */
    public void setCadConversionElements(JAXBElement<ArrayOfCadConversionElement> value) {
        this.cadConversionElements = ((JAXBElement<ArrayOfCadConversionElement> ) value);
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

    /**
     * Gets the value of the emptyLayoutDetectionMode property.
     * 
     * @return
     *     possible object is
     *     {@link CadEmptyLayoutDetectionMode }
     *     
     */
    public CadEmptyLayoutDetectionMode getEmptyLayoutDetectionMode() {
        return emptyLayoutDetectionMode;
    }

    /**
     * Sets the value of the emptyLayoutDetectionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CadEmptyLayoutDetectionMode }
     *     
     */
    public void setEmptyLayoutDetectionMode(CadEmptyLayoutDetectionMode value) {
        this.emptyLayoutDetectionMode = value;
    }

    /**
     * Gets the value of the layoutSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CadLayoutSortOrder }
     *     
     */
    public CadLayoutSortOrder getLayoutSortOrder() {
        return layoutSortOrder;
    }

    /**
     * Sets the value of the layoutSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CadLayoutSortOrder }
     *     
     */
    public void setLayoutSortOrder(CadLayoutSortOrder value) {
        this.layoutSortOrder = value;
    }

    /**
     * Gets the value of the externalReferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalReferences() {
        return externalReferences;
    }

    /**
     * Sets the value of the externalReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalReferences(JAXBElement<String> value) {
        this.externalReferences = ((JAXBElement<String> ) value);
    }

}
