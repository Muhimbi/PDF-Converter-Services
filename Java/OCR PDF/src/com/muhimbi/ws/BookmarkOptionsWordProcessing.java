
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookmarkOptions_WordProcessing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookmarkOptions_WordProcessing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2009/10/06}BookmarkOptions">
 *       &lt;sequence>
 *         &lt;element name="UseHeadingStyles" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BooleanEnum" minOccurs="0"/>
 *         &lt;element name="UseOutlineLevels" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BooleanEnum" minOccurs="0"/>
 *         &lt;element name="UpperBookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LowerBookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookmarkMappings" type="{http://types.muhimbi.com/2010/11/22}ArrayOfBookmarkMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookmarkOptions_WordProcessing", propOrder = {
    "useHeadingStyles",
    "useOutlineLevels",
    "upperBookmarkLevel",
    "lowerBookmarkLevel",
    "bookmarkMappings"
})
public class BookmarkOptionsWordProcessing
    extends BookmarkOptions
{

    @XmlElement(name = "UseHeadingStyles")
    protected BooleanEnum useHeadingStyles;
    @XmlElement(name = "UseOutlineLevels")
    protected BooleanEnum useOutlineLevels;
    @XmlElement(name = "UpperBookmarkLevel")
    protected Integer upperBookmarkLevel;
    @XmlElement(name = "LowerBookmarkLevel")
    protected Integer lowerBookmarkLevel;
    @XmlElementRef(name = "BookmarkMappings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<ArrayOfBookmarkMapping> bookmarkMappings;

    /**
     * Gets the value of the useHeadingStyles property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getUseHeadingStyles() {
        return useHeadingStyles;
    }

    /**
     * Sets the value of the useHeadingStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setUseHeadingStyles(BooleanEnum value) {
        this.useHeadingStyles = value;
    }

    /**
     * Gets the value of the useOutlineLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getUseOutlineLevels() {
        return useOutlineLevels;
    }

    /**
     * Sets the value of the useOutlineLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setUseOutlineLevels(BooleanEnum value) {
        this.useOutlineLevels = value;
    }

    /**
     * Gets the value of the upperBookmarkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpperBookmarkLevel() {
        return upperBookmarkLevel;
    }

    /**
     * Sets the value of the upperBookmarkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpperBookmarkLevel(Integer value) {
        this.upperBookmarkLevel = value;
    }

    /**
     * Gets the value of the lowerBookmarkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowerBookmarkLevel() {
        return lowerBookmarkLevel;
    }

    /**
     * Sets the value of the lowerBookmarkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowerBookmarkLevel(Integer value) {
        this.lowerBookmarkLevel = value;
    }

    /**
     * Gets the value of the bookmarkMappings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBookmarkMapping }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBookmarkMapping> getBookmarkMappings() {
        return bookmarkMappings;
    }

    /**
     * Sets the value of the bookmarkMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBookmarkMapping }{@code >}
     *     
     */
    public void setBookmarkMappings(JAXBElement<ArrayOfBookmarkMapping> value) {
        this.bookmarkMappings = ((JAXBElement<ArrayOfBookmarkMapping> ) value);
    }

}
