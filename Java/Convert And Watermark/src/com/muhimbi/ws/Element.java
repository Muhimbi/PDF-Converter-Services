
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HPosition" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}HPosition" minOccurs="0"/>
 *         &lt;element name="VPosition" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}VPosition" minOccurs="0"/>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScaleMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}ScaleMode" minOccurs="0"/>
 *         &lt;element name="ScaleX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScaleY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transparency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "hPosition",
    "vPosition",
    "x",
    "y",
    "width",
    "height",
    "zOrder",
    "scaleMode",
    "scaleX",
    "scaleY",
    "rotation",
    "transparency",
    "lineColor",
    "lineWidth",
    "fillColor"
})
@XmlSeeAlso({
    Ellipse.class,
    Rtf.class,
    Rectangle.class,
    Text.class,
    Image.class,
    Line.class,
    LinearBarcode.class,
    QRCode.class,
    Pdf.class,
    Container.class
})
public class Element {

    @XmlElement(name = "HPosition")
    @XmlSchemaType(name = "string")
    protected HPosition hPosition;
    @XmlElement(name = "VPosition")
    @XmlSchemaType(name = "string")
    protected VPosition vPosition;
    @XmlElementRef(name = "X", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> x;
    @XmlElementRef(name = "Y", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> y;
    @XmlElementRef(name = "Width", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> width;
    @XmlElementRef(name = "Height", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> height;
    @XmlElement(name = "ZOrder")
    protected Integer zOrder;
    @XmlElement(name = "ScaleMode")
    @XmlSchemaType(name = "string")
    protected ScaleMode scaleMode;
    @XmlElementRef(name = "ScaleX", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scaleX;
    @XmlElementRef(name = "ScaleY", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scaleY;
    @XmlElementRef(name = "Rotation", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rotation;
    @XmlElementRef(name = "Transparency", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transparency;
    @XmlElementRef(name = "LineColor", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineColor;
    @XmlElementRef(name = "LineWidth", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineWidth;
    @XmlElementRef(name = "FillColor", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fillColor;

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
        this.x = value;
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
        this.y = value;
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
        this.width = value;
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
        this.height = value;
    }

    /**
     * Gets the value of the zOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZOrder() {
        return zOrder;
    }

    /**
     * Sets the value of the zOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZOrder(Integer value) {
        this.zOrder = value;
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
        this.scaleX = value;
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
        this.scaleY = value;
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
        this.rotation = value;
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
        this.transparency = value;
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
        this.lineColor = value;
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
        this.lineWidth = value;
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
        this.fillColor = value;
    }

}
