
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearBarcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearBarcode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BarcodeType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}BarcodeType" minOccurs="0"/>
 *         &lt;element name="OmitStartStopSymbols" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableCheckDigit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowCheckDigit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TextLocation" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}BarcodeTextLocation" minOccurs="0"/>
 *         &lt;element name="BarcodeToTextGapHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontStyle" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}FontStyle" minOccurs="0"/>
 *         &lt;element name="TextAlignment" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HAlign" minOccurs="0"/>
 *         &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearBarcode", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "text",
    "barcodeType",
    "omitStartStopSymbols",
    "disableCheckDigit",
    "showCheckDigit",
    "textLocation",
    "barcodeToTextGapHeight",
    "fontFamilyName",
    "fontSize",
    "fontStyle",
    "textAlignment",
    "margin"
})
public class LinearBarcode
    extends Element
{

    @XmlElementRef(name = "Text", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> text;
    @XmlElement(name = "BarcodeType")
    protected BarcodeType barcodeType;
    @XmlElement(name = "OmitStartStopSymbols")
    protected Boolean omitStartStopSymbols;
    @XmlElement(name = "DisableCheckDigit")
    protected Boolean disableCheckDigit;
    @XmlElement(name = "ShowCheckDigit")
    protected Boolean showCheckDigit;
    @XmlElement(name = "TextLocation")
    protected BarcodeTextLocation textLocation;
    @XmlElementRef(name = "BarcodeToTextGapHeight", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> barcodeToTextGapHeight;
    @XmlElementRef(name = "FontFamilyName", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fontFamilyName;
    @XmlElementRef(name = "FontSize", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fontSize;
    @XmlList
    @XmlElement(name = "FontStyle")
    protected List<String> fontStyle;
    @XmlElement(name = "TextAlignment")
    protected HAlign textAlignment;
    @XmlElementRef(name = "Margin", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> margin;

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
     * Gets the value of the barcodeType property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType }
     *     
     */
    public BarcodeType getBarcodeType() {
        return barcodeType;
    }

    /**
     * Sets the value of the barcodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType }
     *     
     */
    public void setBarcodeType(BarcodeType value) {
        this.barcodeType = value;
    }

    /**
     * Gets the value of the omitStartStopSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOmitStartStopSymbols() {
        return omitStartStopSymbols;
    }

    /**
     * Sets the value of the omitStartStopSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOmitStartStopSymbols(Boolean value) {
        this.omitStartStopSymbols = value;
    }

    /**
     * Gets the value of the disableCheckDigit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableCheckDigit() {
        return disableCheckDigit;
    }

    /**
     * Sets the value of the disableCheckDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableCheckDigit(Boolean value) {
        this.disableCheckDigit = value;
    }

    /**
     * Gets the value of the showCheckDigit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCheckDigit() {
        return showCheckDigit;
    }

    /**
     * Sets the value of the showCheckDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCheckDigit(Boolean value) {
        this.showCheckDigit = value;
    }

    /**
     * Gets the value of the textLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeTextLocation }
     *     
     */
    public BarcodeTextLocation getTextLocation() {
        return textLocation;
    }

    /**
     * Sets the value of the textLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeTextLocation }
     *     
     */
    public void setTextLocation(BarcodeTextLocation value) {
        this.textLocation = value;
    }

    /**
     * Gets the value of the barcodeToTextGapHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarcodeToTextGapHeight() {
        return barcodeToTextGapHeight;
    }

    /**
     * Sets the value of the barcodeToTextGapHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarcodeToTextGapHeight(JAXBElement<String> value) {
        this.barcodeToTextGapHeight = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fontFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFontFamilyName() {
        return fontFamilyName;
    }

    /**
     * Sets the value of the fontFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFontFamilyName(JAXBElement<String> value) {
        this.fontFamilyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFontSize(JAXBElement<String> value) {
        this.fontSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fontStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFontStyle() {
        if (fontStyle == null) {
            fontStyle = new ArrayList<String>();
        }
        return this.fontStyle;
    }

    /**
     * Gets the value of the textAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link HAlign }
     *     
     */
    public HAlign getTextAlignment() {
        return textAlignment;
    }

    /**
     * Sets the value of the textAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link HAlign }
     *     
     */
    public void setTextAlignment(HAlign value) {
        this.textAlignment = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMargin(JAXBElement<String> value) {
        this.margin = ((JAXBElement<String> ) value);
    }

}
