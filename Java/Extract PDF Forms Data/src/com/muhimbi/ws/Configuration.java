
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Converters" type="{http://types.muhimbi.com/2009/10/06}ArrayOfConverterConfiguration" minOccurs="0"/>
 *         &lt;element name="OperationTypes" type="{http://types.muhimbi.com/2018/01/11}ArrayOfOperationTypeConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "conversionServerAddress",
    "converters",
    "operationTypes"
})
public class Configuration {

    @XmlElementRef(name = "ConversionServerAddress", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conversionServerAddress;
    @XmlElementRef(name = "Converters", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConverterConfiguration> converters;
    @XmlElementRef(name = "OperationTypes", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOperationTypeConfiguration> operationTypes;

    /**
     * Gets the value of the conversionServerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConversionServerAddress() {
        return conversionServerAddress;
    }

    /**
     * Sets the value of the conversionServerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConversionServerAddress(JAXBElement<String> value) {
        this.conversionServerAddress = value;
    }

    /**
     * Gets the value of the converters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConverterConfiguration }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConverterConfiguration> getConverters() {
        return converters;
    }

    /**
     * Sets the value of the converters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConverterConfiguration }{@code >}
     *     
     */
    public void setConverters(JAXBElement<ArrayOfConverterConfiguration> value) {
        this.converters = value;
    }

    /**
     * Gets the value of the operationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperationTypeConfiguration }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOperationTypeConfiguration> getOperationTypes() {
        return operationTypes;
    }

    /**
     * Sets the value of the operationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperationTypeConfiguration }{@code >}
     *     
     */
    public void setOperationTypes(JAXBElement<ArrayOfOperationTypeConfiguration> value) {
        this.operationTypes = value;
    }

}
