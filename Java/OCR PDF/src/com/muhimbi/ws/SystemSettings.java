
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskMonitorSettings" type="{http://types.muhimbi.com/2014/02/06}TaskMonitorSettings" minOccurs="0"/>
 *         &lt;element name="CultureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSettings", namespace = "http://types.muhimbi.com/2014/02/06", propOrder = {
    "taskMonitorSettings",
    "cultureName"
})
public class SystemSettings {

    @XmlElementRef(name = "TaskMonitorSettings", namespace = "http://types.muhimbi.com/2014/02/06", type = JAXBElement.class)
    protected JAXBElement<TaskMonitorSettings> taskMonitorSettings;
    @XmlElementRef(name = "CultureName", namespace = "http://types.muhimbi.com/2014/02/06", type = JAXBElement.class)
    protected JAXBElement<String> cultureName;

    /**
     * Gets the value of the taskMonitorSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskMonitorSettings }{@code >}
     *     
     */
    public JAXBElement<TaskMonitorSettings> getTaskMonitorSettings() {
        return taskMonitorSettings;
    }

    /**
     * Sets the value of the taskMonitorSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskMonitorSettings }{@code >}
     *     
     */
    public void setTaskMonitorSettings(JAXBElement<TaskMonitorSettings> value) {
        this.taskMonitorSettings = ((JAXBElement<TaskMonitorSettings> ) value);
    }

    /**
     * Gets the value of the cultureName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCultureName() {
        return cultureName;
    }

    /**
     * Sets the value of the cultureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCultureName(JAXBElement<String> value) {
        this.cultureName = ((JAXBElement<String> ) value);
    }

}
