
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSplitOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileSplitOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileSplitType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}FileSplitType" minOccurs="0"/>
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FileNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSplitOptions", propOrder = {
    "fileSplitType",
    "batchSize",
    "bookmarkLevel",
    "fileNameTemplate"
})
public class FileSplitOptions {

    @XmlElement(name = "FileSplitType")
    @XmlSchemaType(name = "string")
    protected FileSplitType fileSplitType;
    @XmlElement(name = "BatchSize")
    protected Integer batchSize;
    @XmlElement(name = "BookmarkLevel")
    protected Integer bookmarkLevel;
    @XmlElementRef(name = "FileNameTemplate", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileNameTemplate;

    /**
     * Gets the value of the fileSplitType property.
     * 
     * @return
     *     possible object is
     *     {@link FileSplitType }
     *     
     */
    public FileSplitType getFileSplitType() {
        return fileSplitType;
    }

    /**
     * Sets the value of the fileSplitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSplitType }
     *     
     */
    public void setFileSplitType(FileSplitType value) {
        this.fileSplitType = value;
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the bookmarkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookmarkLevel() {
        return bookmarkLevel;
    }

    /**
     * Sets the value of the bookmarkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookmarkLevel(Integer value) {
        this.bookmarkLevel = value;
    }

    /**
     * Gets the value of the fileNameTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileNameTemplate() {
        return fileNameTemplate;
    }

    /**
     * Sets the value of the fileNameTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileNameTemplate(JAXBElement<String> value) {
        this.fileNameTemplate = value;
    }

}
