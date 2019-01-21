
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebServiceFaultException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebServiceFaultException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExceptionType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}WebServiceExceptionType" minOccurs="0"/>
 *         &lt;element name="ExceptionDetails" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceFaultException", propOrder = {
    "exceptionType",
    "exceptionDetails"
})
public class WebServiceFaultException {

    @XmlElement(name = "ExceptionType")
    protected WebServiceExceptionType exceptionType;
    @XmlElementRef(name = "ExceptionDetails", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> exceptionDetails;

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
     * Gets the value of the exceptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getExceptionDetails() {
        return exceptionDetails;
    }

    /**
     * Sets the value of the exceptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setExceptionDetails(JAXBElement<ArrayOfstring> value) {
        this.exceptionDetails = ((JAXBElement<ArrayOfstring> ) value);
    }

}
