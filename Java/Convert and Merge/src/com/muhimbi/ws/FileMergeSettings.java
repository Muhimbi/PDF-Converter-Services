
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileMergeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileMergeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopLevelBookmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileMergeSettings", propOrder = {
    "topLevelBookmark"
})
public class FileMergeSettings {

    @XmlElementRef(name = "TopLevelBookmark", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class)
    protected JAXBElement<String> topLevelBookmark;

    /**
     * Gets the value of the topLevelBookmark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTopLevelBookmark() {
        return topLevelBookmark;
    }

    /**
     * Sets the value of the topLevelBookmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTopLevelBookmark(JAXBElement<String> value) {
        this.topLevelBookmark = ((JAXBElement<String> ) value);
    }

}
