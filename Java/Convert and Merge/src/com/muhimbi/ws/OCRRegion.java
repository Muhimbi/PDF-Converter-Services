
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCRRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCRRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCRRegion", namespace = "http://types.muhimbi.com/2013/08/01", propOrder = {
    "x",
    "y",
    "width",
    "height",
    "startPage",
    "endPage",
    "pageInterval",
    "pageRange",
    "id"
})
public class OCRRegion {

    @XmlElementRef(name = "X", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> x;
    @XmlElementRef(name = "Y", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> y;
    @XmlElementRef(name = "Width", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> width;
    @XmlElementRef(name = "Height", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> height;
    @XmlElement(name = "StartPage")
    protected Integer startPage;
    @XmlElement(name = "EndPage")
    protected Integer endPage;
    @XmlElement(name = "PageInterval")
    protected Integer pageInterval;
    @XmlElementRef(name = "PageRange", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> pageRange;
    @XmlElementRef(name = "Id", namespace = "http://types.muhimbi.com/2013/08/01", type = JAXBElement.class)
    protected JAXBElement<String> id;

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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWidth(JAXBElement<String> value) {
        this.width = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeight(JAXBElement<String> value) {
        this.height = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the endPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndPage() {
        return endPage;
    }

    /**
     * Sets the value of the endPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndPage(Integer value) {
        this.endPage = value;
    }

    /**
     * Gets the value of the pageInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageInterval() {
        return pageInterval;
    }

    /**
     * Sets the value of the pageInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageInterval(Integer value) {
        this.pageInterval = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageRange(JAXBElement<String> value) {
        this.pageRange = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

}
