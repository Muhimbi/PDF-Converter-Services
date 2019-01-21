
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
 * <p>Java class for Defaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Defaults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HPosition" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HPosition" minOccurs="0"/>
 *         &lt;element name="VPosition" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}VPosition" minOccurs="0"/>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transparency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontStyle" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}FontStyle" minOccurs="0"/>
 *         &lt;element name="HAlign" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HAlign" minOccurs="0"/>
 *         &lt;element name="VAlign" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}VAlign" minOccurs="0"/>
 *         &lt;element name="WordWrap" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}WordWrap" minOccurs="0"/>
 *         &lt;element name="ScaleMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}ScaleMode" minOccurs="0"/>
 *         &lt;element name="ScaleX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScaleY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Defaults", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "hPosition",
    "vPosition",
    "x",
    "y",
    "rotation",
    "transparency",
    "lineColor",
    "lineWidth",
    "fillColor",
    "fontFamilyName",
    "fontSize",
    "fontStyle",
    "hAlign",
    "vAlign",
    "wordWrap",
    "scaleMode",
    "scaleX",
    "scaleY"
})
public class Defaults {

    @XmlElement(name = "HPosition")
    protected HPosition hPosition;
    @XmlElement(name = "VPosition")
    protected VPosition vPosition;
    @XmlElementRef(name = "X", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> x;
    @XmlElementRef(name = "Y", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> y;
    @XmlElementRef(name = "Rotation", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> rotation;
    @XmlElementRef(name = "Transparency", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> transparency;
    @XmlElementRef(name = "LineColor", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> lineColor;
    @XmlElementRef(name = "LineWidth", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> lineWidth;
    @XmlElementRef(name = "FillColor", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fillColor;
    @XmlElementRef(name = "FontFamilyName", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fontFamilyName;
    @XmlElementRef(name = "FontSize", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fontSize;
    @XmlList
    @XmlElement(name = "FontStyle")
    protected List<String> fontStyle;
    @XmlElement(name = "HAlign")
    protected HAlign hAlign;
    @XmlElement(name = "VAlign")
    protected VAlign vAlign;
    @XmlElement(name = "WordWrap")
    protected WordWrap wordWrap;
    @XmlElement(name = "ScaleMode")
    protected ScaleMode scaleMode;
    @XmlElementRef(name = "ScaleX", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> scaleX;
    @XmlElementRef(name = "ScaleY", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> scaleY;

    /**
     * Gets the value of the hPosition property.
     * 
     * @return
     *     possible object is
     *     {@link HPosition }
     *     
     */
    public HPosition getHPosition() {
        return hPosition;
    }

    /**
     * Sets the value of the hPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link HPosition }
     *     
     */
    public void setHPosition(HPosition value) {
        this.hPosition = value;
    }

    /**
     * Gets the value of the vPosition property.
     * 
     * @return
     *     possible object is
     *     {@link VPosition }
     *     
     */
    public VPosition getVPosition() {
        return vPosition;
    }

    /**
     * Sets the value of the vPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VPosition }
     *     
     */
    public void setVPosition(VPosition value) {
        this.vPosition = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setX(JAXBElement<String> value) {
        this.x = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setY(JAXBElement<String> value) {
        this.y = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rotation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRotation(JAXBElement<String> value) {
        this.rotation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transparency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransparency() {
        return transparency;
    }

    /**
     * Sets the value of the transparency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransparency(JAXBElement<String> value) {
        this.transparency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lineColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineColor() {
        return lineColor;
    }

    /**
     * Sets the value of the lineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineColor(JAXBElement<String> value) {
        this.lineColor = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineWidth(JAXBElement<String> value) {
        this.lineWidth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFillColor(JAXBElement<String> value) {
        this.fillColor = ((JAXBElement<String> ) value);
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
     * Gets the value of the hAlign property.
     * 
     * @return
     *     possible object is
     *     {@link HAlign }
     *     
     */
    public HAlign getHAlign() {
        return hAlign;
    }

    /**
     * Sets the value of the hAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link HAlign }
     *     
     */
    public void setHAlign(HAlign value) {
        this.hAlign = value;
    }

    /**
     * Gets the value of the vAlign property.
     * 
     * @return
     *     possible object is
     *     {@link VAlign }
     *     
     */
    public VAlign getVAlign() {
        return vAlign;
    }

    /**
     * Sets the value of the vAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAlign }
     *     
     */
    public void setVAlign(VAlign value) {
        this.vAlign = value;
    }

    /**
     * Gets the value of the wordWrap property.
     * 
     * @return
     *     possible object is
     *     {@link WordWrap }
     *     
     */
    public WordWrap getWordWrap() {
        return wordWrap;
    }

    /**
     * Sets the value of the wordWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordWrap }
     *     
     */
    public void setWordWrap(WordWrap value) {
        this.wordWrap = value;
    }

    /**
     * Gets the value of the scaleMode property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleMode }
     *     
     */
    public ScaleMode getScaleMode() {
        return scaleMode;
    }

    /**
     * Sets the value of the scaleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleMode }
     *     
     */
    public void setScaleMode(ScaleMode value) {
        this.scaleMode = value;
    }

    /**
     * Gets the value of the scaleX property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScaleX() {
        return scaleX;
    }

    /**
     * Sets the value of the scaleX property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScaleX(JAXBElement<String> value) {
        this.scaleX = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scaleY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScaleY() {
        return scaleY;
    }

    /**
     * Sets the value of the scaleY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScaleY(JAXBElement<String> value) {
        this.scaleY = ((JAXBElement<String> ) value);
    }

}
