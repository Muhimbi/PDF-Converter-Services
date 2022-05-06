
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentPropertiesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentPropertiesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="OpenOptions" type="{http://types.muhimbi.com/2009/10/06}OpenOptions" minOccurs="0"/>
 *         &lt;element name="PropertySettings" type="{http://types.muhimbi.com/2009/10/06}ArrayOfDocumentPropertySetting" minOccurs="0"/>
 *         &lt;element name="IgnoreErrors" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}BooleanEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentPropertiesRequest", propOrder = {
    "sourceFile",
    "openOptions",
    "propertySettings",
    "ignoreErrors"
})
public class GetDocumentPropertiesRequest {

    @XmlElementRef(name = "SourceFile", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> sourceFile;
    @XmlElementRef(name = "OpenOptions", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenOptions> openOptions;
    @XmlElementRef(name = "PropertySettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentPropertySetting> propertySettings;
    @XmlElement(name = "IgnoreErrors")
    @XmlSchemaType(name = "string")
    protected BooleanEnum ignoreErrors;

    /**
     * Gets the value of the sourceFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getSourceFile() {
        return sourceFile;
    }

    /**
     * Sets the value of the sourceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setSourceFile(JAXBElement<byte[]> value) {
        this.sourceFile = value;
    }

    /**
     * Gets the value of the openOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}
     *     
     */
    public JAXBElement<OpenOptions> getOpenOptions() {
        return openOptions;
    }

    /**
     * Sets the value of the openOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenOptions }{@code >}
     *     
     */
    public void setOpenOptions(JAXBElement<OpenOptions> value) {
        this.openOptions = value;
    }

    /**
     * Gets the value of the propertySettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentPropertySetting }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentPropertySetting> getPropertySettings() {
        return propertySettings;
    }

    /**
     * Sets the value of the propertySettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentPropertySetting }{@code >}
     *     
     */
    public void setPropertySettings(JAXBElement<ArrayOfDocumentPropertySetting> value) {
        this.propertySettings = value;
    }

    /**
     * Gets the value of the ignoreErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getIgnoreErrors() {
        return ignoreErrors;
    }

    /**
     * Sets the value of the ignoreErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setIgnoreErrors(BooleanEnum value) {
        this.ignoreErrors = value;
    }

}
