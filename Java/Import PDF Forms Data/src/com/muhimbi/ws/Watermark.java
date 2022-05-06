
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Watermark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Watermark">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/05/17}Container">
 *       &lt;sequence>
 *         &lt;element name="PageOrientation" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageOrientation" minOccurs="0"/>
 *         &lt;element name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartSection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndSection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SectionRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageType" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics}PageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Watermark", namespace = "http://types.muhimbi.com/2010/05/17", propOrder = {
    "pageOrientation",
    "startPage",
    "endPage",
    "pageInterval",
    "pageRange",
    "printOnly",
    "startSection",
    "endSection",
    "sectionRange",
    "pageType"
})
public class Watermark
    extends Container
{

    @XmlElement(name = "PageOrientation")
    @XmlSchemaType(name = "string")
    protected PageOrientation pageOrientation;
    @XmlElement(name = "StartPage")
    protected Integer startPage;
    @XmlElement(name = "EndPage")
    protected Integer endPage;
    @XmlElement(name = "PageInterval")
    protected Integer pageInterval;
    @XmlElementRef(name = "PageRange", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageRange;
    @XmlElement(name = "PrintOnly")
    protected Boolean printOnly;
    @XmlElement(name = "StartSection")
    protected Integer startSection;
    @XmlElement(name = "EndSection")
    protected Integer endSection;
    @XmlElementRef(name = "SectionRange", namespace = "http://types.muhimbi.com/2010/05/17", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionRange;
    @XmlList
    @XmlElement(name = "PageType")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> pageType;

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
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the endPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndPage() {
        return endPage;
    }

    /**
     * Sets the value of the endPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndPage(Integer value) {
        this.endPage = value;
    }

    /**
     * Gets the value of the pageInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageInterval() {
        return pageInterval;
    }

    /**
     * Sets the value of the pageInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageInterval(Integer value) {
        this.pageInterval = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageRange(JAXBElement<String> value) {
        this.pageRange = value;
    }

    /**
     * Gets the value of the printOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintOnly() {
        return printOnly;
    }

    /**
     * Sets the value of the printOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintOnly(Boolean value) {
        this.printOnly = value;
    }

    /**
     * Gets the value of the startSection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartSection() {
        return startSection;
    }

    /**
     * Sets the value of the startSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartSection(Integer value) {
        this.startSection = value;
    }

    /**
     * Gets the value of the endSection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndSection() {
        return endSection;
    }

    /**
     * Sets the value of the endSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndSection(Integer value) {
        this.endSection = value;
    }

    /**
     * Gets the value of the sectionRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionRange() {
        return sectionRange;
    }

    /**
     * Sets the value of the sectionRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionRange(JAXBElement<String> value) {
        this.sectionRange = value;
    }

    /**
     * Gets the value of the pageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPageType() {
        if (pageType == null) {
            pageType = new ArrayList<String>();
        }
        return this.pageType;
    }

}
