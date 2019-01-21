
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCadConversionElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCadConversionElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CadConversionElement" type="{http://types.muhimbi.com/2010/11/22}CadConversionElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCadConversionElement", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "cadConversionElement"
})
public class ArrayOfCadConversionElement {

    @XmlElement(name = "CadConversionElement", nillable = true)
    protected List<CadConversionElement> cadConversionElement;

    /**
     * Gets the value of the cadConversionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cadConversionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCadConversionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CadConversionElement }
     * 
     * 
     */
    public List<CadConversionElement> getCadConversionElement() {
        if (cadConversionElement == null) {
            cadConversionElement = new ArrayList<CadConversionElement>();
        }
        return this.cadConversionElement;
    }

}
