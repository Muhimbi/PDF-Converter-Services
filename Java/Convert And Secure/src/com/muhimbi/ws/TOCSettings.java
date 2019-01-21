
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOCSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOCSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://types.muhimbi.com/2013/01/14}ArrayOfNameValuePair" minOccurs="0"/>
 *         &lt;element name="Bookmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}TOCLocation" minOccurs="0"/>
 *         &lt;element name="PaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageOrientation" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageOrientation" minOccurs="0"/>
 *         &lt;element name="PageMargins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentStartPage" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}DocumentStartPage" minOccurs="0"/>
 *         &lt;element name="HtmlRenderingEngine" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}HTMLRenderingEngine" minOccurs="0"/>
 *         &lt;element name="WebKitViewPortSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOCSettings", namespace = "http://types.muhimbi.com/2013/01/14", propOrder = {
    "template",
    "properties",
    "bookmark",
    "location",
    "paperSize",
    "pageOrientation",
    "pageMargins",
    "minimumEntries",
    "documentStartPage",
    "htmlRenderingEngine",
    "webKitViewPortSize"
})
public class TOCSettings {

    @XmlElementRef(name = "Template", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class)
    protected JAXBElement<String> template;
    @XmlElementRef(name = "Properties", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNameValuePair> properties;
    @XmlElementRef(name = "Bookmark", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class)
    protected JAXBElement<String> bookmark;
    @XmlElement(name = "Location")
    protected TOCLocation location;
    @XmlElementRef(name = "PaperSize", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class)
    protected JAXBElement<String> paperSize;
    @XmlElement(name = "PageOrientation")
    protected PageOrientation pageOrientation;
    @XmlElementRef(name = "PageMargins", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class)
    protected JAXBElement<String> pageMargins;
    @XmlElement(name = "MinimumEntries")
    protected Integer minimumEntries;
    @XmlElement(name = "DocumentStartPage")
    protected DocumentStartPage documentStartPage;
    @XmlElement(name = "HtmlRenderingEngine")
    protected HTMLRenderingEngine htmlRenderingEngine;
    @XmlElementRef(name = "WebKitViewPortSize", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class)
    protected JAXBElement<String> webKitViewPortSize;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplate(JAXBElement<String> value) {
        this.template = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNameValuePair }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNameValuePair> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNameValuePair }{@code >}
     *     
     */
    public void setProperties(JAXBElement<ArrayOfNameValuePair> value) {
        this.properties = ((JAXBElement<ArrayOfNameValuePair> ) value);
    }

    /**
     * Gets the value of the bookmark property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookmark() {
        return bookmark;
    }

    /**
     * Sets the value of the bookmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookmark(JAXBElement<String> value) {
        this.bookmark = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link TOCLocation }
     *     
     */
    public TOCLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOCLocation }
     *     
     */
    public void setLocation(TOCLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the paperSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaperSize() {
        return paperSize;
    }

    /**
     * Sets the value of the paperSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaperSize(JAXBElement<String> value) {
        this.paperSize = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pageOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link PageOrientation }
     *     
     */
    public PageOrientation getPageOrientation() {
        return pageOrientation;
    }

    /**
     * Sets the value of the pageOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOrientation }
     *     
     */
    public void setPageOrientation(PageOrientation value) {
        this.pageOrientation = value;
    }

    /**
     * Gets the value of the pageMargins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageMargins() {
        return pageMargins;
    }

    /**
     * Sets the value of the pageMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageMargins(JAXBElement<String> value) {
        this.pageMargins = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the minimumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumEntries() {
        return minimumEntries;
    }

    /**
     * Sets the value of the minimumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumEntries(Integer value) {
        this.minimumEntries = value;
    }

    /**
     * Gets the value of the documentStartPage property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStartPage }
     *     
     */
    public DocumentStartPage getDocumentStartPage() {
        return documentStartPage;
    }

    /**
     * Sets the value of the documentStartPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStartPage }
     *     
     */
    public void setDocumentStartPage(DocumentStartPage value) {
        this.documentStartPage = value;
    }

    /**
     * Gets the value of the htmlRenderingEngine property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLRenderingEngine }
     *     
     */
    public HTMLRenderingEngine getHtmlRenderingEngine() {
        return htmlRenderingEngine;
    }

    /**
     * Sets the value of the htmlRenderingEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLRenderingEngine }
     *     
     */
    public void setHtmlRenderingEngine(HTMLRenderingEngine value) {
        this.htmlRenderingEngine = value;
    }

    /**
     * Gets the value of the webKitViewPortSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebKitViewPortSize() {
        return webKitViewPortSize;
    }

    /**
     * Sets the value of the webKitViewPortSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebKitViewPortSize(JAXBElement<String> value) {
        this.webKitViewPortSize = ((JAXBElement<String> ) value);
    }

}
