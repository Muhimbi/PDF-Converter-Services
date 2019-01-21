
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_HTML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_HTML">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="PaperSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScaleMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}HTMLScaleMode" minOccurs="0"/>
 *         &lt;element name="PageMargins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversionDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClearBrowserCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SplitImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HtmlRenderingEngine" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}HTMLRenderingEngine" minOccurs="0"/>
 *         &lt;element name="WebKitViewPortSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}AuthenticationMode" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MediaType" minOccurs="0"/>
 *         &lt;element name="EnableWebKitOfflineMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_HTML", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "paperSize",
    "scaleMode",
    "pageMargins",
    "conversionDelay",
    "clearBrowserCache",
    "splitImages",
    "htmlRenderingEngine",
    "webKitViewPortSize",
    "authenticationMode",
    "mediaType",
    "enableWebKitOfflineMode"
})
public class ConverterSpecificSettingsHTML
    extends ConverterSpecificSettings
{

    @XmlElementRef(name = "PaperSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> paperSize;
    @XmlElement(name = "ScaleMode")
    protected HTMLScaleMode scaleMode;
    @XmlElementRef(name = "PageMargins", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> pageMargins;
    @XmlElement(name = "ConversionDelay")
    protected Integer conversionDelay;
    @XmlElement(name = "ClearBrowserCache")
    protected Boolean clearBrowserCache;
    @XmlElement(name = "SplitImages")
    protected Boolean splitImages;
    @XmlElement(name = "HtmlRenderingEngine")
    protected HTMLRenderingEngine htmlRenderingEngine;
    @XmlElementRef(name = "WebKitViewPortSize", namespace = "http://types.muhimbi.com/2010/11/22", type = JAXBElement.class)
    protected JAXBElement<String> webKitViewPortSize;
    @XmlElement(name = "AuthenticationMode")
    protected AuthenticationMode authenticationMode;
    @XmlElement(name = "MediaType")
    protected MediaType mediaType;
    @XmlElement(name = "EnableWebKitOfflineMode")
    protected Boolean enableWebKitOfflineMode;

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
     * Gets the value of the scaleMode property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLScaleMode }
     *     
     */
    public HTMLScaleMode getScaleMode() {
        return scaleMode;
    }

    /**
     * Sets the value of the scaleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLScaleMode }
     *     
     */
    public void setScaleMode(HTMLScaleMode value) {
        this.scaleMode = value;
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
     * Gets the value of the conversionDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConversionDelay() {
        return conversionDelay;
    }

    /**
     * Sets the value of the conversionDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConversionDelay(Integer value) {
        this.conversionDelay = value;
    }

    /**
     * Gets the value of the clearBrowserCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearBrowserCache() {
        return clearBrowserCache;
    }

    /**
     * Sets the value of the clearBrowserCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearBrowserCache(Boolean value) {
        this.clearBrowserCache = value;
    }

    /**
     * Gets the value of the splitImages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitImages() {
        return splitImages;
    }

    /**
     * Sets the value of the splitImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitImages(Boolean value) {
        this.splitImages = value;
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

    /**
     * Gets the value of the authenticationMode property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMode }
     *     
     */
    public AuthenticationMode getAuthenticationMode() {
        return authenticationMode;
    }

    /**
     * Sets the value of the authenticationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMode }
     *     
     */
    public void setAuthenticationMode(AuthenticationMode value) {
        this.authenticationMode = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMediaType(MediaType value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the enableWebKitOfflineMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWebKitOfflineMode() {
        return enableWebKitOfflineMode;
    }

    /**
     * Sets the value of the enableWebKitOfflineMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWebKitOfflineMode(Boolean value) {
        this.enableWebKitOfflineMode = value;
    }

}
