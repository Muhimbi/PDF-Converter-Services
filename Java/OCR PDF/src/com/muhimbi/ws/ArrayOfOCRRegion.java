
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOCRRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOCRRegion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OCRRegion" type="{http://types.muhimbi.com/2013/08/01}OCRRegion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOCRRegion", namespace = "http://types.muhimbi.com/2013/08/01", propOrder = {
    "ocrRegion"
})
public class ArrayOfOCRRegion {

    @XmlElement(name = "OCRRegion", nillable = true)
    protected List<OCRRegion> ocrRegion;

    /**
     * Gets the value of the ocrRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocrRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOCRRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCRRegion }
     * 
     * 
     */
    public List<OCRRegion> getOCRRegion() {
        if (ocrRegion == null) {
            ocrRegion = new ArrayList<OCRRegion>();
        }
        return this.ocrRegion;
    }

}
