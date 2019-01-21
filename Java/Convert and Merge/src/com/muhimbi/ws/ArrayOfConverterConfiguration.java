
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConverterConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConverterConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConverterConfiguration" type="{http://types.muhimbi.com/2009/10/06}ConverterConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConverterConfiguration", propOrder = {
    "converterConfiguration"
})
public class ArrayOfConverterConfiguration {

    @XmlElement(name = "ConverterConfiguration", nillable = true)
    protected List<ConverterConfiguration> converterConfiguration;

    /**
     * Gets the value of the converterConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the converterConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConverterConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConverterConfiguration }
     * 
     * 
     */
    public List<ConverterConfiguration> getConverterConfiguration() {
        if (converterConfiguration == null) {
            converterConfiguration = new ArrayList<ConverterConfiguration>();
        }
        return this.converterConfiguration;
    }

}
