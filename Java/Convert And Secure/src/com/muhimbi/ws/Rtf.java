
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rtf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rtf">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="RtfData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rtf", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "rtfData"
})
public class Rtf
    extends Element
{

    @XmlElementRef(name = "RtfData", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<String> rtfData;

    /**
     * Gets the value of the rtfData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtfData() {
        return rtfData;
    }

    /**
     * Sets the value of the rtfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtfData(JAXBElement<String> value) {
        this.rtfData = ((JAXBElement<String> ) value);
    }

}
