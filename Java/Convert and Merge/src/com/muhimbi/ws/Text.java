
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
 * <p>Java class for Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Text">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontStyle" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}FontStyle" minOccurs="0"/>
 *         &lt;element name="WordWrap" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}WordWrap" minOccurs="0"/>
 *         &lt;element name="HAlign" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HAlign" minOccurs="0"/>
 *         &lt;element name="VAlign" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}VAlign" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "content",
    "fontFamilyName",
    "fontSize",
    "fontStyle",
    "wordWrap",
    "hAlign",
    "vAlign"
})
public class Text
    extends Element
{

    @XmlElementRef(name = "Content", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "FontFamilyName", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fontFamilyName;
    @XmlElementRef(name = "FontSize", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> fontSize;
    @XmlList
    @XmlElement(name = "FontStyle")
    protected List<String> fontStyle;
    @XmlElement(name = "WordWrap")
    protected WordWrap wordWrap;
    @XmlElement(name = "HAlign")
    protected HAlign hAlign;
    @XmlElement(name = "VAlign")
    protected VAlign vAlign;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = ((JAXBElement<String> ) value);
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

}
