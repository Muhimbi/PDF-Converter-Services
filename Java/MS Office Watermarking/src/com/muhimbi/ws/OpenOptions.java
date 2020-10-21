
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefreshContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowExternalConnections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowMacros" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}MacroSecurityOption" minOccurs="0"/>
 *         &lt;element name="SystemSettings" type="{http://types.muhimbi.com/2014/02/06}SystemSettings" minOccurs="0"/>
 *         &lt;element name="SubscriptionSettings" type="{http://types.muhimbi.com/2015/04/13}SubscriptionSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOptions", propOrder = {
    "userName",
    "password",
    "fileExtension",
    "originalFileName",
    "refreshContent",
    "allowExternalConnections",
    "allowMacros",
    "systemSettings",
    "subscriptionSettings"
})
public class OpenOptions {

    @XmlElementRef(name = "UserName", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "Password", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "FileExtension", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileExtension;
    @XmlElementRef(name = "OriginalFileName", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalFileName;
    @XmlElement(name = "RefreshContent")
    protected Boolean refreshContent;
    @XmlElement(name = "AllowExternalConnections")
    protected Boolean allowExternalConnections;
    @XmlElement(name = "AllowMacros")
    @XmlSchemaType(name = "string")
    protected MacroSecurityOption allowMacros;
    @XmlElementRef(name = "SystemSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<SystemSettings> systemSettings;
    @XmlElementRef(name = "SubscriptionSettings", namespace = "http://types.muhimbi.com/2009/10/06", type = JAXBElement.class, required = false)
    protected JAXBElement<SubscriptionSettings> subscriptionSettings;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the fileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileExtension(JAXBElement<String> value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the originalFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalFileName() {
        return originalFileName;
    }

    /**
     * Sets the value of the originalFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalFileName(JAXBElement<String> value) {
        this.originalFileName = value;
    }

    /**
     * Gets the value of the refreshContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshContent() {
        return refreshContent;
    }

    /**
     * Sets the value of the refreshContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshContent(Boolean value) {
        this.refreshContent = value;
    }

    /**
     * Gets the value of the allowExternalConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowExternalConnections() {
        return allowExternalConnections;
    }

    /**
     * Sets the value of the allowExternalConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowExternalConnections(Boolean value) {
        this.allowExternalConnections = value;
    }

    /**
     * Gets the value of the allowMacros property.
     * 
     * @return
     *     possible object is
     *     {@link MacroSecurityOption }
     *     
     */
    public MacroSecurityOption getAllowMacros() {
        return allowMacros;
    }

    /**
     * Sets the value of the allowMacros property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacroSecurityOption }
     *     
     */
    public void setAllowMacros(MacroSecurityOption value) {
        this.allowMacros = value;
    }

    /**
     * Gets the value of the systemSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SystemSettings }{@code >}
     *     
     */
    public JAXBElement<SystemSettings> getSystemSettings() {
        return systemSettings;
    }

    /**
     * Sets the value of the systemSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SystemSettings }{@code >}
     *     
     */
    public void setSystemSettings(JAXBElement<SystemSettings> value) {
        this.systemSettings = value;
    }

    /**
     * Gets the value of the subscriptionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}
     *     
     */
    public JAXBElement<SubscriptionSettings> getSubscriptionSettings() {
        return subscriptionSettings;
    }

    /**
     * Sets the value of the subscriptionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubscriptionSettings }{@code >}
     *     
     */
    public void setSubscriptionSettings(JAXBElement<SubscriptionSettings> value) {
        this.subscriptionSettings = value;
    }

}
