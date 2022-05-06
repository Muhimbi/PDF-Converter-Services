
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Diagnostics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diagnostics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://types.muhimbi.com/2009/10/06}ArrayOfDiagnosticResultItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagnostics", propOrder = {
    "items"
})
public class Diagnostics {

    @XmlElementRef(name = "Items", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDiagnosticResultItem> items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiagnosticResultItem> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiagnosticResultItem }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfDiagnosticResultItem> value) {
        this.items = value;
    }

}
