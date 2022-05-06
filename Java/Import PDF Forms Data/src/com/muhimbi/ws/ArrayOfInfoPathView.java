
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInfoPathView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoPathView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoPathView" type="{http://types.muhimbi.com/2010/11/22}InfoPathView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoPathView", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "infoPathView"
})
public class ArrayOfInfoPathView {

    @XmlElement(name = "InfoPathView", nillable = true)
    protected List<InfoPathView> infoPathView;

    /**
     * Gets the value of the infoPathView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoPathView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoPathView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoPathView }
     * 
     * 
     */
    public List<InfoPathView> getInfoPathView() {
        if (infoPathView == null) {
            infoPathView = new ArrayList<InfoPathView>();
        }
        return this.infoPathView;
    }

}
