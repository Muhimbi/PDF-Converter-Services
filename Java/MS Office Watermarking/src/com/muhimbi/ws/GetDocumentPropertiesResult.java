
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentPropertiesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentPropertiesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Properties" type="{http://types.muhimbi.com/2009/10/06}ArrayOfDocumentProperty" minOccurs="0"/>
 *         &lt;element name="IgnoredErrors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentPropertiesResult", propOrder = {
    "properties",
    "ignoredErrors"
})
public class GetDocumentPropertiesResult {

    @XmlElementRef(name = "Properties", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentProperty> properties;
    @XmlElementRef(name = "IgnoredErrors", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> ignoredErrors;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentProperty }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentProperty> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentProperty }{@code >}
     *     
     */
    public void setProperties(JAXBElement<ArrayOfDocumentProperty> value) {
        this.properties = value;
    }

    /**
     * Gets the value of the ignoredErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getIgnoredErrors() {
        return ignoredErrors;
    }

    /**
     * Sets the value of the ignoredErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setIgnoredErrors(JAXBElement<ArrayOfstring> value) {
        this.ignoredErrors = value;
    }

}
