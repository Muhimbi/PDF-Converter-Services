
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticResultItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExceptionType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}WebServiceExceptionType" minOccurs="0"/>
 *         &lt;element name="ConverterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticResultItem", propOrder = {
    "valid",
    "exceptionType",
    "converterName"
})
public class DiagnosticResultItem {

    @XmlElement(name = "Valid")
    protected Boolean valid;
    @XmlElement(name = "ExceptionType")
    protected WebServiceExceptionType exceptionType;
    @XmlElementRef(name = "ConverterName", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<String> converterName;

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the exceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceExceptionType }
     *     
     */
    public WebServiceExceptionType getExceptionType() {
        return exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceExceptionType }
     *     
     */
    public void setExceptionType(WebServiceExceptionType value) {
        this.exceptionType = value;
    }

    /**
     * Gets the value of the converterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConverterName() {
        return converterName;
    }

    /**
     * Sets the value of the converterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConverterName(JAXBElement<String> value) {
        this.converterName = ((JAXBElement<String> ) value);
    }

}
