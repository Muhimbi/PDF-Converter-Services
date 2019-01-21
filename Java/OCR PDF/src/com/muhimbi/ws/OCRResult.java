
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCRResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCRResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionTexts" type="{http://types.muhimbi.com/2013/08/01}ArrayOfRegionText" minOccurs="0"/>
 *         &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCRResult", namespace = "http://types.muhimbi.com/2013/08/01", propOrder = {
    "text",
    "regionTexts",
    "pageCount"
})
public class OCRResult {

    @XmlElementRef(name = "Text", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "RegionTexts", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRegionText> regionTexts;
    @XmlElement(name = "PageCount")
    protected Integer pageCount;

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
     * Gets the value of the regionTexts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegionText }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRegionText> getRegionTexts() {
        return regionTexts;
    }

    /**
     * Sets the value of the regionTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegionText }{@code >}
     *     
     */
    public void setRegionTexts(JAXBElement<ArrayOfRegionText> value) {
        this.regionTexts = ((JAXBElement<ArrayOfRegionText> ) value);
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

}
