
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convertersToDiagnose" type="{http://types.muhimbi.com/2009/10/06}ArrayOfDiagnosticRequestItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "convertersToDiagnose"
})
@XmlRootElement(name = "GetDiagnostics", namespace = "http://services.muhimbi.com/2009/10/06")
public class GetDiagnostics {

    @XmlElementRef(name = "convertersToDiagnose", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDiagnosticRequestItem> convertersToDiagnose;

    /**
     * Gets the value of the convertersToDiagnose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticRequestItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiagnosticRequestItem> getConvertersToDiagnose() {
        return convertersToDiagnose;
    }

    /**
     * Sets the value of the convertersToDiagnose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticRequestItem }{@code >}
     *     
     */
    public void setConvertersToDiagnose(JAXBElement<ArrayOfDiagnosticRequestItem> value) {
        this.convertersToDiagnose = ((JAXBElement<ArrayOfDiagnosticRequestItem> ) value);
    }

}
