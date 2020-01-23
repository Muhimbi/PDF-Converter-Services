
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_WordProcessing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_WordProcessing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="RevisionsAndCommentsMarkupMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}RevisionsAndCommentsMarkupMode" minOccurs="0"/>
 *         &lt;element name="RevisionsAndCommentsDisplayMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}RevisionsAndCommentsDisplayMode" minOccurs="0"/>
 *         &lt;element name="ProcessDocumentTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BookmarkOptions" type="{http://types.muhimbi.com/2009/10/06}BookmarkOptions_WordProcessing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_WordProcessing", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "revisionsAndCommentsMarkupMode",
    "revisionsAndCommentsDisplayMode",
    "processDocumentTemplate",
    "bookmarkOptions"
})
public class ConverterSpecificSettingsWordProcessing
    extends ConverterSpecificSettings
{

    @XmlElement(name = "RevisionsAndCommentsMarkupMode")
    protected RevisionsAndCommentsMarkupMode revisionsAndCommentsMarkupMode;
    @XmlElement(name = "RevisionsAndCommentsDisplayMode")
    protected RevisionsAndCommentsDisplayMode revisionsAndCommentsDisplayMode;
    @XmlElement(name = "ProcessDocumentTemplate")
    protected Boolean processDocumentTemplate;
    @XmlElementRef(name = "BookmarkOptions", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<BookmarkOptionsWordProcessing> bookmarkOptions;

    /**
     * Gets the value of the revisionsAndCommentsMarkupMode property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionsAndCommentsMarkupMode }
     *     
     */
    public RevisionsAndCommentsMarkupMode getRevisionsAndCommentsMarkupMode() {
        return revisionsAndCommentsMarkupMode;
    }

    /**
     * Sets the value of the revisionsAndCommentsMarkupMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionsAndCommentsMarkupMode }
     *     
     */
    public void setRevisionsAndCommentsMarkupMode(RevisionsAndCommentsMarkupMode value) {
        this.revisionsAndCommentsMarkupMode = value;
    }

    /**
     * Gets the value of the revisionsAndCommentsDisplayMode property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionsAndCommentsDisplayMode }
     *     
     */
    public RevisionsAndCommentsDisplayMode getRevisionsAndCommentsDisplayMode() {
        return revisionsAndCommentsDisplayMode;
    }

    /**
     * Sets the value of the revisionsAndCommentsDisplayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionsAndCommentsDisplayMode }
     *     
     */
    public void setRevisionsAndCommentsDisplayMode(RevisionsAndCommentsDisplayMode value) {
        this.revisionsAndCommentsDisplayMode = value;
    }

    /**
     * Gets the value of the processDocumentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessDocumentTemplate() {
        return processDocumentTemplate;
    }

    /**
     * Sets the value of the processDocumentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessDocumentTemplate(Boolean value) {
        this.processDocumentTemplate = value;
    }

    /**
     * Gets the value of the bookmarkOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BookmarkOptionsWordProcessing }{@code >}
     *     
     */
    public JAXBElement<BookmarkOptionsWordProcessing> getBookmarkOptions() {
        return bookmarkOptions;
    }

    /**
     * Sets the value of the bookmarkOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BookmarkOptionsWordProcessing }{@code >}
     *     
     */
    public void setBookmarkOptions(JAXBElement<BookmarkOptionsWordProcessing> value) {
        this.bookmarkOptions = ((JAXBElement<BookmarkOptionsWordProcessing> ) value);
    }

}
