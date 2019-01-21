
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pdf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pdf">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="PdfData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pdf", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "pdfData"
})
public class Pdf
    extends Element
{

    @XmlElementRef(name = "PdfData", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<byte[]> pdfData;

    /**
     * Gets the value of the pdfData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPdfData() {
        return pdfData;
    }

    /**
     * Sets the value of the pdfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPdfData(JAXBElement<byte[]> value) {
        this.pdfData = ((JAXBElement<byte[]> ) value);
    }

}
