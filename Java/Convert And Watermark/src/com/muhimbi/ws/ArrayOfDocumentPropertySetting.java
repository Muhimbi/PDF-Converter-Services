
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocumentPropertySetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentPropertySetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentPropertySetting" type="{http://types.muhimbi.com/2009/10/06}DocumentPropertySetting" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentPropertySetting", propOrder = {
    "documentPropertySetting"
})
public class ArrayOfDocumentPropertySetting {

    @XmlElement(name = "DocumentPropertySetting", nillable = true)
    protected List<DocumentPropertySetting> documentPropertySetting;

    /**
     * Gets the value of the documentPropertySetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentPropertySetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentPropertySetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentPropertySetting }
     * 
     * 
     */
    public List<DocumentPropertySetting> getDocumentPropertySetting() {
        if (documentPropertySetting == null) {
            documentPropertySetting = new ArrayList<DocumentPropertySetting>();
        }
        return this.documentPropertySetting;
    }

}
