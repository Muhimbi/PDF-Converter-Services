
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_Presentations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_Presentations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="PrintOutputType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PresentationsPrintOutputType" minOccurs="0"/>
 *         &lt;element name="FrameSlides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_Presentations", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "printOutputType",
    "frameSlides"
})
public class ConverterSpecificSettingsPresentations
    extends ConverterSpecificSettings
{

    @XmlElement(name = "PrintOutputType")
    @XmlSchemaType(name = "string")
    protected PresentationsPrintOutputType printOutputType;
    @XmlElement(name = "FrameSlides")
    protected Boolean frameSlides;

    /**
     * Gets the value of the printOutputType property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationsPrintOutputType }
     *     
     */
    public PresentationsPrintOutputType getPrintOutputType() {
        return printOutputType;
    }

    /**
     * Sets the value of the printOutputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationsPrintOutputType }
     *     
     */
    public void setPrintOutputType(PresentationsPrintOutputType value) {
        this.printOutputType = value;
    }

    /**
     * Gets the value of the frameSlides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrameSlides() {
        return frameSlides;
    }

    /**
     * Sets the value of the frameSlides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrameSlides(Boolean value) {
        this.frameSlides = value;
    }

}
