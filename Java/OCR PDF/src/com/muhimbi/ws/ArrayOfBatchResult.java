
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBatchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchResult" type="{http://types.muhimbi.com/2009/10/06}BatchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchResult", propOrder = {
    "batchResult"
})
public class ArrayOfBatchResult {

    @XmlElement(name = "BatchResult", nillable = true)
    protected List<BatchResult> batchResult;

    /**
     * Gets the value of the batchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchResult }
     * 
     * 
     */
    public List<BatchResult> getBatchResult() {
        if (batchResult == null) {
            batchResult = new ArrayList<BatchResult>();
        }
        return this.batchResult;
    }

}
