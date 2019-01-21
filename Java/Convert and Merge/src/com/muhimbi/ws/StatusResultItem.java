
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusResultItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OperationStatus" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}OperationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusResultItem", namespace = "http://types.muhimbi.com/2018/01/11", propOrder = {
    "requestID",
    "maximumInstances",
    "currentInstances",
    "operationStatus"
})
public class StatusResultItem {

    @XmlElementRef(name = "RequestID", namespace = "http://types.muhimbi.com/2018/01/11", type = JAXBElement.class)
    protected JAXBElement<String> requestID;
    @XmlElement(name = "MaximumInstances")
    protected Integer maximumInstances;
    @XmlElement(name = "CurrentInstances")
    protected Integer currentInstances;
    @XmlElement(name = "OperationStatus")
    protected OperationStatus operationStatus;

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestID(JAXBElement<String> value) {
        this.requestID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maximumInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumInstances() {
        return maximumInstances;
    }

    /**
     * Sets the value of the maximumInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumInstances(Integer value) {
        this.maximumInstances = value;
    }

    /**
     * Gets the value of the currentInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentInstances() {
        return currentInstances;
    }

    /**
     * Sets the value of the currentInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentInstances(Integer value) {
        this.currentInstances = value;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationStatus }
     *     
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationStatus }
     *     
     */
    public void setOperationStatus(OperationStatus value) {
        this.operationStatus = value;
    }

}
