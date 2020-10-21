
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Line">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="EndX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "endX",
    "endY"
})
public class Line
    extends Element
{

    @XmlElementRef(name = "EndX", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endX;
    @XmlElementRef(name = "EndY", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endY;

    /**
     * Gets the value of the endX property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndX() {
        return endX;
    }

    /**
     * Sets the value of the endX property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndX(JAXBElement<String> value) {
        this.endX = value;
    }

    /**
     * Gets the value of the endY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndY() {
        return endY;
    }

    /**
     * Sets the value of the endY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndY(JAXBElement<String> value) {
        this.endY = value;
    }

}
