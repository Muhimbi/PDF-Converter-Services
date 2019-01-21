
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSourceFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSourceFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceFile" type="{http://types.muhimbi.com/2009/10/06}SourceFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSourceFile", propOrder = {
    "sourceFile"
})
public class ArrayOfSourceFile {

    @XmlElement(name = "SourceFile", nillable = true)
    protected List<SourceFile> sourceFile;

    /**
     * Gets the value of the sourceFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceFile }
     * 
     * 
     */
    public List<SourceFile> getSourceFile() {
        if (sourceFile == null) {
            sourceFile = new ArrayList<SourceFile>();
        }
        return this.sourceFile;
    }

}
