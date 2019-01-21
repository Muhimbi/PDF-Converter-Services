
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QRCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCorrectionLevel" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}ErrorCorrectionLevel" minOccurs="0"/>
 *         &lt;element name="InputMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}BarcodeInputMode" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}QRCodeVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRCode", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "text",
    "errorCorrectionLevel",
    "inputMode",
    "version"
})
public class QRCode
    extends Element
{

    @XmlElementRef(name = "Text", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> text;
    @XmlElement(name = "ErrorCorrectionLevel")
    protected ErrorCorrectionLevel errorCorrectionLevel;
    @XmlElement(name = "InputMode")
    protected BarcodeInputMode inputMode;
    @XmlElement(name = "Version")
    protected QRCodeVersion version;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the errorCorrectionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCorrectionLevel }
     *     
     */
    public ErrorCorrectionLevel getErrorCorrectionLevel() {
        return errorCorrectionLevel;
    }

    /**
     * Sets the value of the errorCorrectionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCorrectionLevel }
     *     
     */
    public void setErrorCorrectionLevel(ErrorCorrectionLevel value) {
        this.errorCorrectionLevel = value;
    }

    /**
     * Gets the value of the inputMode property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeInputMode }
     *     
     */
    public BarcodeInputMode getInputMode() {
        return inputMode;
    }

    /**
     * Sets the value of the inputMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeInputMode }
     *     
     */
    public void setInputMode(BarcodeInputMode value) {
        this.inputMode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeVersion }
     *     
     */
    public QRCodeVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeVersion }
     *     
     */
    public void setVersion(QRCodeVersion value) {
        this.version = value;
    }

}
