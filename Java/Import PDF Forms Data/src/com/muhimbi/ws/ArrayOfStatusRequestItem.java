
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusRequestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusRequestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusRequestItem" type="{http://types.muhimbi.com/2018/01/11}StatusRequestItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusRequestItem", namespace = "http://types.muhimbi.com/2018/01/11", propOrder = {
    "statusRequestItem"
})
public class ArrayOfStatusRequestItem {

    @XmlElement(name = "StatusRequestItem", nillable = true)
    protected List<StatusRequestItem> statusRequestItem;

    /**
     * Gets the value of the statusRequestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusRequestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusRequestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusRequestItem }
     * 
     * 
     */
    public List<StatusRequestItem> getStatusRequestItem() {
        if (statusRequestItem == null) {
            statusRequestItem = new ArrayList<StatusRequestItem>();
        }
        return this.statusRequestItem;
    }

}
