
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_CommandLineConverter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_CommandLineConverter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="Parameter1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameter10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_CommandLineConverter", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "parameter1",
    "parameter2",
    "parameter3",
    "parameter4",
    "parameter5",
    "parameter6",
    "parameter7",
    "parameter8",
    "parameter9",
    "parameter10"
})
public class ConverterSpecificSettingsCommandLineConverter
    extends ConverterSpecificSettings
{

    @XmlElementRef(name = "Parameter1", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter1;
    @XmlElementRef(name = "Parameter2", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter2;
    @XmlElementRef(name = "Parameter3", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter3;
    @XmlElementRef(name = "Parameter4", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter4;
    @XmlElementRef(name = "Parameter5", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter5;
    @XmlElementRef(name = "Parameter6", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter6;
    @XmlElementRef(name = "Parameter7", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter7;
    @XmlElementRef(name = "Parameter8", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter8;
    @XmlElementRef(name = "Parameter9", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter9;
    @XmlElementRef(name = "Parameter10", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> parameter10;

    /**
     * Gets the value of the parameter1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter1() {
        return parameter1;
    }

    /**
     * Sets the value of the parameter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter1(JAXBElement<String> value) {
        this.parameter1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter2() {
        return parameter2;
    }

    /**
     * Sets the value of the parameter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter2(JAXBElement<String> value) {
        this.parameter2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter3() {
        return parameter3;
    }

    /**
     * Sets the value of the parameter3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter3(JAXBElement<String> value) {
        this.parameter3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter4() {
        return parameter4;
    }

    /**
     * Sets the value of the parameter4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter4(JAXBElement<String> value) {
        this.parameter4 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter5() {
        return parameter5;
    }

    /**
     * Sets the value of the parameter5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter5(JAXBElement<String> value) {
        this.parameter5 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter6() {
        return parameter6;
    }

    /**
     * Sets the value of the parameter6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter6(JAXBElement<String> value) {
        this.parameter6 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter7() {
        return parameter7;
    }

    /**
     * Sets the value of the parameter7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter7(JAXBElement<String> value) {
        this.parameter7 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter8() {
        return parameter8;
    }

    /**
     * Sets the value of the parameter8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter8(JAXBElement<String> value) {
        this.parameter8 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter9() {
        return parameter9;
    }

    /**
     * Sets the value of the parameter9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter9(JAXBElement<String> value) {
        this.parameter9 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parameter10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter10() {
        return parameter10;
    }

    /**
     * Sets the value of the parameter10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter10(JAXBElement<String> value) {
        this.parameter10 = ((JAXBElement<String> ) value);
    }

}
