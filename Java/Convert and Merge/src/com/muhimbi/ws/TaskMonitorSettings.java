
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskMonitorSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskMonitorSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxHungCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxPendingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxRunDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskMonitorSettings", namespace = "http://types.muhimbi.com/2014/02/06", propOrder = {
    "maxHungCount",
    "maxPendingCount",
    "maxRunDuration"
})
public class TaskMonitorSettings {

    @XmlElement(name = "MaxHungCount")
    protected Integer maxHungCount;
    @XmlElement(name = "MaxPendingCount")
    protected Integer maxPendingCount;
    @XmlElement(name = "MaxRunDuration")
    protected Integer maxRunDuration;

    /**
     * Gets the value of the maxHungCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxHungCount() {
        return maxHungCount;
    }

    /**
     * Sets the value of the maxHungCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxHungCount(Integer value) {
        this.maxHungCount = value;
    }

    /**
     * Gets the value of the maxPendingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPendingCount() {
        return maxPendingCount;
    }

    /**
     * Sets the value of the maxPendingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPendingCount(Integer value) {
        this.maxPendingCount = value;
    }

    /**
     * Gets the value of the maxRunDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRunDuration() {
        return maxRunDuration;
    }

    /**
     * Sets the value of the maxRunDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRunDuration(Integer value) {
        this.maxRunDuration = value;
    }

}
