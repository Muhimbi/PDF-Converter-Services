
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRegionText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRegionText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionText" type="{http://types.muhimbi.com/2013/08/01}RegionText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRegionText", namespace = "http://types.muhimbi.com/2013/08/01", propOrder = {
    "regionText"
})
public class ArrayOfRegionText {

    @XmlElement(name = "RegionText", nillable = true)
    protected List<RegionText> regionText;

    /**
     * Gets the value of the regionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionText }
     * 
     * 
     */
    public List<RegionText> getRegionText() {
        if (regionText == null) {
            regionText = new ArrayList<RegionText>();
        }
        return this.regionText;
    }

}
