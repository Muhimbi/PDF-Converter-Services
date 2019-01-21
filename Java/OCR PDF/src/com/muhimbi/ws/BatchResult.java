
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OCRResult" type="{http://types.muhimbi.com/2013/08/01}OCRResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResult", propOrder = {
    "file",
    "fileName",
    "ocrResult"
})
public class BatchResult {

    @XmlElementRef(name = "File", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<byte[]> file;
    @XmlElementRef(name = "FileName", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "OCRResult", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<OCRResult> ocrResult;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFile(JAXBElement<byte[]> value) {
        this.file = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ocrResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OCRResult }{@code >}
     *     
     */
    public JAXBElement<OCRResult> getOCRResult() {
        return ocrResult;
    }

    /**
     * Sets the value of the ocrResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OCRResult }{@code >}
     *     
     */
    public void setOCRResult(JAXBElement<OCRResult> value) {
        this.ocrResult = ((JAXBElement<OCRResult> ) value);
    }

}
