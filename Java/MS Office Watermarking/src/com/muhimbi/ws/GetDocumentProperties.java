
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
 *         &lt;element name="getDocumentPropertiesRequest" type="{http://types.muhimbi.com/2009/10/06}GetDocumentPropertiesRequest" minOccurs="0"/>
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
    "getDocumentPropertiesRequest"
})
@XmlRootElement(name = "GetDocumentProperties", namespace = "http://services.muhimbi.com/2009/10/06")
public class GetDocumentProperties {

    @XmlElementRef(name = "getDocumentPropertiesRequest", namespace = "http://services.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<GetDocumentPropertiesRequest> getDocumentPropertiesRequest;

    /**
     * Gets the value of the getDocumentPropertiesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetDocumentPropertiesRequest }{@code >}
     *     
     */
    public JAXBElement<GetDocumentPropertiesRequest> getGetDocumentPropertiesRequest() {
        return getDocumentPropertiesRequest;
    }

    /**
     * Sets the value of the getDocumentPropertiesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetDocumentPropertiesRequest }{@code >}
     *     
     */
    public void setGetDocumentPropertiesRequest(JAXBElement<GetDocumentPropertiesRequest> value) {
        this.getDocumentPropertiesRequest = value;
    }

}
