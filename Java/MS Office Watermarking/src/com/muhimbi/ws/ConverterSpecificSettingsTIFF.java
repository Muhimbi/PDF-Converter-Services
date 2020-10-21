
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_TIFF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_TIFF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="PaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageMargins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoRotatePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScaleMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}ContentScale" minOccurs="0"/>
 *         &lt;element name="SourceFileResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_TIFF", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "paperSize",
    "pageMargins",
    "autoRotatePage",
    "scaleMode",
    "sourceFileResolution"
})
public class ConverterSpecificSettingsTIFF
    extends ConverterSpecificSettings
{

    @XmlElementRef(name = "PaperSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paperSize;
    @XmlElementRef(name = "PageMargins", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageMargins;
    @XmlElement(name = "AutoRotatePage")
    protected Boolean autoRotatePage;
    @XmlElement(name = "ScaleMode")
    @XmlSchemaType(name = "string")
    protected ContentScale scaleMode;
    @XmlElementRef(name = "SourceFileResolution", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceFileResolution;

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
        this.paperSize = value;
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
        this.pageMargins = value;
    }

    /**
     * Gets the value of the autoRotatePage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRotatePage() {
        return autoRotatePage;
    }

    /**
     * Sets the value of the autoRotatePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRotatePage(Boolean value) {
        this.autoRotatePage = value;
    }

    /**
     * Gets the value of the scaleMode property.
     * 
     * @return
     *     possible object is
     *     {@link ContentScale }
     *     
     */
    public ContentScale getScaleMode() {
        return scaleMode;
    }

    /**
     * Sets the value of the scaleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentScale }
     *     
     */
    public void setScaleMode(ContentScale value) {
        this.scaleMode = value;
    }

    /**
     * Gets the value of the sourceFileResolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceFileResolution() {
        return sourceFileResolution;
    }

    /**
     * Sets the value of the sourceFileResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceFileResolution(JAXBElement<String> value) {
        this.sourceFileResolution = value;
    }

}
