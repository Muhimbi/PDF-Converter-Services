
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="ImageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "imageData"
})
public class Image
    extends Element
{

    @XmlElementRef(name = "ImageData", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<byte[]> imageData;

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setImageData(JAXBElement<byte[]> value) {
        this.imageData = ((JAXBElement<byte[]> ) value);
    }

}
