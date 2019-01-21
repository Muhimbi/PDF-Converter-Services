
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Container complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Container">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Element">
 *       &lt;sequence>
 *         &lt;element name="Elements" type="{http://types.muhimbi.com/2010/05/17}ArrayOfElement" minOccurs="0"/>
 *         &lt;element name="Defaults" type="{http://types.muhimbi.com/2010/05/17}Defaults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Container", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "elements",
    "defaults"
})
@XmlSeeAlso({
    Watermark.class
})
public class Container
    extends Element
{

    @XmlElementRef(name = "Elements", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<ArrayOfElement> elements;
    @XmlElementRef(name = "Defaults", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class)
    protected JAXBElement<Defaults> defaults;

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfElement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfElement> getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfElement }{@code >}
     *     
     */
    public void setElements(JAXBElement<ArrayOfElement> value) {
        this.elements = ((JAXBElement<ArrayOfElement> ) value);
    }

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Defaults }{@code >}
     *     
     */
    public JAXBElement<Defaults> getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Defaults }{@code >}
     *     
     */
    public void setDefaults(JAXBElement<Defaults> value) {
        this.defaults = ((JAXBElement<Defaults> ) value);
    }

}
