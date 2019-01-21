
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWatermark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWatermark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Watermark" type="{http://types.muhimbi.com/2010/05/17}Watermark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWatermark", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "watermark"
})
public class ArrayOfWatermark {

    @XmlElement(name = "Watermark", nillable = true)
    protected List<Watermark> watermark;

    /**
     * Gets the value of the watermark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watermark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatermark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Watermark }
     * 
     * 
     */
    public List<Watermark> getWatermark() {
        if (watermark == null) {
            watermark = new ArrayList<Watermark>();
        }
        return this.watermark;
    }

}
