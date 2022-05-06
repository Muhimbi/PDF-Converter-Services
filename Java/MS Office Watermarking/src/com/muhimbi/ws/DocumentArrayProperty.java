
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentArrayProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentArrayProperty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2009/10/06}DocumentProperty">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentArrayProperty", propOrder = {
    "value"
})
public class DocumentArrayProperty
    extends DocumentProperty
{

    @XmlElementRef(name = "Value", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setValue(JAXBElement<ArrayOfanyType> value) {
        this.value = value;
    }

}
