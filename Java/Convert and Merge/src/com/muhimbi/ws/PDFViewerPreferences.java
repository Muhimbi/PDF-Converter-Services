
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFViewerPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFViewerPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CenterWindow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FitWindow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideMenubar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideToolbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideWindowUI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PageLayout" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFPageLayout" minOccurs="0"/>
 *         &lt;element name="NavigationPane" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFNavigationPane" minOccurs="0"/>
 *         &lt;element name="HideEmptyNavigationPane" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PageScalingMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}PDFPageScalingMode" minOccurs="0"/>
 *         &lt;element name="FullScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFViewerPreferences", namespace = "http://types.muhimbi.com/2013/01/14", propOrder = {
    "centerWindow",
    "displayTitle",
    "fitWindow",
    "hideMenubar",
    "hideToolbar",
    "hideWindowUI",
    "pageLayout",
    "navigationPane",
    "hideEmptyNavigationPane",
    "pageScalingMode",
    "fullScreen"
})
public class PDFViewerPreferences {

    @XmlElement(name = "CenterWindow")
    protected Boolean centerWindow;
    @XmlElement(name = "DisplayTitle")
    protected Boolean displayTitle;
    @XmlElement(name = "FitWindow")
    protected Boolean fitWindow;
    @XmlElement(name = "HideMenubar")
    protected Boolean hideMenubar;
    @XmlElement(name = "HideToolbar")
    protected Boolean hideToolbar;
    @XmlElement(name = "HideWindowUI")
    protected Boolean hideWindowUI;
    @XmlElement(name = "PageLayout")
    protected PDFPageLayout pageLayout;
    @XmlElement(name = "NavigationPane")
    protected PDFNavigationPane navigationPane;
    @XmlElement(name = "HideEmptyNavigationPane")
    protected Boolean hideEmptyNavigationPane;
    @XmlElement(name = "PageScalingMode")
    protected PDFPageScalingMode pageScalingMode;
    @XmlElement(name = "FullScreen")
    protected Boolean fullScreen;

    /**
     * Gets the value of the centerWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCenterWindow() {
        return centerWindow;
    }

    /**
     * Sets the value of the centerWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCenterWindow(Boolean value) {
        this.centerWindow = value;
    }

    /**
     * Gets the value of the displayTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayTitle() {
        return displayTitle;
    }

    /**
     * Sets the value of the displayTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayTitle(Boolean value) {
        this.displayTitle = value;
    }

    /**
     * Gets the value of the fitWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFitWindow() {
        return fitWindow;
    }

    /**
     * Sets the value of the fitWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFitWindow(Boolean value) {
        this.fitWindow = value;
    }

    /**
     * Gets the value of the hideMenubar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideMenubar() {
        return hideMenubar;
    }

    /**
     * Sets the value of the hideMenubar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideMenubar(Boolean value) {
        this.hideMenubar = value;
    }

    /**
     * Gets the value of the hideToolbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideToolbar() {
        return hideToolbar;
    }

    /**
     * Sets the value of the hideToolbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideToolbar(Boolean value) {
        this.hideToolbar = value;
    }

    /**
     * Gets the value of the hideWindowUI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideWindowUI() {
        return hideWindowUI;
    }

    /**
     * Sets the value of the hideWindowUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideWindowUI(Boolean value) {
        this.hideWindowUI = value;
    }

    /**
     * Gets the value of the pageLayout property.
     * 
     * @return
     *     possible object is
     *     {@link PDFPageLayout }
     *     
     */
    public PDFPageLayout getPageLayout() {
        return pageLayout;
    }

    /**
     * Sets the value of the pageLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFPageLayout }
     *     
     */
    public void setPageLayout(PDFPageLayout value) {
        this.pageLayout = value;
    }

    /**
     * Gets the value of the navigationPane property.
     * 
     * @return
     *     possible object is
     *     {@link PDFNavigationPane }
     *     
     */
    public PDFNavigationPane getNavigationPane() {
        return navigationPane;
    }

    /**
     * Sets the value of the navigationPane property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFNavigationPane }
     *     
     */
    public void setNavigationPane(PDFNavigationPane value) {
        this.navigationPane = value;
    }

    /**
     * Gets the value of the hideEmptyNavigationPane property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideEmptyNavigationPane() {
        return hideEmptyNavigationPane;
    }

    /**
     * Sets the value of the hideEmptyNavigationPane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideEmptyNavigationPane(Boolean value) {
        this.hideEmptyNavigationPane = value;
    }

    /**
     * Gets the value of the pageScalingMode property.
     * 
     * @return
     *     possible object is
     *     {@link PDFPageScalingMode }
     *     
     */
    public PDFPageScalingMode getPageScalingMode() {
        return pageScalingMode;
    }

    /**
     * Sets the value of the pageScalingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFPageScalingMode }
     *     
     */
    public void setPageScalingMode(PDFPageScalingMode value) {
        this.pageScalingMode = value;
    }

    /**
     * Gets the value of the fullScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullScreen() {
        return fullScreen;
    }

    /**
     * Sets the value of the fullScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullScreen(Boolean value) {
        this.fullScreen = value;
    }

}
