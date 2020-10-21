
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="MergeMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MergeMode" minOccurs="0"/>
 *         &lt;element name="UnsupportedFileBehaviour" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}UnsupportedFileBehaviour" minOccurs="0"/>
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
    "topLevelBookmark",
    "mergeMode",
    "unsupportedFileBehaviour"
})
public class FileMergeSettings {

    @XmlElementRef(name = "TopLevelBookmark", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> topLevelBookmark;
    @XmlElement(name = "MergeMode")
    @XmlSchemaType(name = "string")
    protected MergeMode mergeMode;
    @XmlElement(name = "UnsupportedFileBehaviour")
    @XmlSchemaType(name = "string")
    protected UnsupportedFileBehaviour unsupportedFileBehaviour;

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
        this.topLevelBookmark = value;
    }

    /**
     * Gets the value of the mergeMode property.
     * 
     * @return
     *     possible object is
     *     {@link MergeMode }
     *     
     */
    public MergeMode getMergeMode() {
        return mergeMode;
    }

    /**
     * Sets the value of the mergeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeMode }
     *     
     */
    public void setMergeMode(MergeMode value) {
        this.mergeMode = value;
    }

    /**
     * Gets the value of the unsupportedFileBehaviour property.
     * 
     * @return
     *     possible object is
     *     {@link UnsupportedFileBehaviour }
     *     
     */
    public UnsupportedFileBehaviour getUnsupportedFileBehaviour() {
        return unsupportedFileBehaviour;
    }

    /**
     * Sets the value of the unsupportedFileBehaviour property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsupportedFileBehaviour }
     *     
     */
    public void setUnsupportedFileBehaviour(UnsupportedFileBehaviour value) {
        this.unsupportedFileBehaviour = value;
    }

}
