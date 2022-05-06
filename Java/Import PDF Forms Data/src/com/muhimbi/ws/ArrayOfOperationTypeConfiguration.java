
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOperationTypeConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOperationTypeConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationTypeConfiguration" type="{http://types.muhimbi.com/2018/01/11}OperationTypeConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOperationTypeConfiguration", namespace = "http://types.muhimbi.com/2018/01/11", propOrder = {
    "operationTypeConfiguration"
})
public class ArrayOfOperationTypeConfiguration {

    @XmlElement(name = "OperationTypeConfiguration", nillable = true)
    protected List<OperationTypeConfiguration> operationTypeConfiguration;

    /**
     * Gets the value of the operationTypeConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationTypeConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationTypeConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationTypeConfiguration }
     * 
     * 
     */
    public List<OperationTypeConfiguration> getOperationTypeConfiguration() {
        if (operationTypeConfiguration == null) {
            operationTypeConfiguration = new ArrayList<OperationTypeConfiguration>();
        }
        return this.operationTypeConfiguration;
    }

}
