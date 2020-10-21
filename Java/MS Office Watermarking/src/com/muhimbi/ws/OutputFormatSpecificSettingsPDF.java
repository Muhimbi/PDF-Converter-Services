
package com.muhimbi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormatSpecificSettings_PDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputFormatSpecificSettings_PDF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2013/01/14}OutputFormatSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="FastWebView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmbedAllFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubsetFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ViewerPreferences" type="{http://types.muhimbi.com/2013/01/14}PDFViewerPreferences" minOccurs="0"/>
 *         &lt;element name="PostProcessFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NamedDestinationProcessingMode" type="{http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data}NamedDestinationProcessingMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputFormatSpecificSettings_PDF", namespace = "http://types.muhimbi.com/2013/01/14", propOrder = {
    "fastWebView",
    "embedAllFonts",
    "subsetFonts",
    "viewerPreferences",
    "postProcessFile",
    "namedDestinationProcessingMode"
})
public class OutputFormatSpecificSettingsPDF
    extends OutputFormatSpecificSettings
{

    @XmlElement(name = "FastWebView")
    protected Boolean fastWebView;
    @XmlElement(name = "EmbedAllFonts")
    protected Boolean embedAllFonts;
    @XmlElement(name = "SubsetFonts")
    protected Boolean subsetFonts;
    @XmlElementRef(name = "ViewerPreferences", namespace = "http://types.muhimbi.com/2013/01/14", type = JAXBElement.class, required = false)
    protected JAXBElement<PDFViewerPreferences> viewerPreferences;
    @XmlElement(name = "PostProcessFile")
    protected Boolean postProcessFile;
    @XmlElement(name = "NamedDestinationProcessingMode")
    @XmlSchemaType(name = "string")
    protected NamedDestinationProcessingMode namedDestinationProcessingMode;

    /**
     * Gets the value of the fastWebView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFastWebView() {
        return fastWebView;
    }

    /**
     * Sets the value of the fastWebView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFastWebView(Boolean value) {
        this.fastWebView = value;
    }

    /**
     * Gets the value of the embedAllFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbedAllFonts() {
        return embedAllFonts;
    }

    /**
     * Sets the value of the embedAllFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedAllFonts(Boolean value) {
        this.embedAllFonts = value;
    }

    /**
     * Gets the value of the subsetFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsetFonts() {
        return subsetFonts;
    }

    /**
     * Sets the value of the subsetFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsetFonts(Boolean value) {
        this.subsetFonts = value;
    }

    /**
     * Gets the value of the viewerPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PDFViewerPreferences }{@code >}
     *     
     */
    public JAXBElement<PDFViewerPreferences> getViewerPreferences() {
        return viewerPreferences;
    }

    /**
     * Sets the value of the viewerPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PDFViewerPreferences }{@code >}
     *     
     */
    public void setViewerPreferences(JAXBElement<PDFViewerPreferences> value) {
        this.viewerPreferences = value;
    }

    /**
     * Gets the value of the postProcessFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostProcessFile() {
        return postProcessFile;
    }

    /**
     * Sets the value of the postProcessFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostProcessFile(Boolean value) {
        this.postProcessFile = value;
    }

    /**
     * Gets the value of the namedDestinationProcessingMode property.
     * 
     * @return
     *     possible object is
     *     {@link NamedDestinationProcessingMode }
     *     
     */
    public NamedDestinationProcessingMode getNamedDestinationProcessingMode() {
        return namedDestinationProcessingMode;
    }

    /**
     * Sets the value of the namedDestinationProcessingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedDestinationProcessingMode }
     *     
     */
    public void setNamedDestinationProcessingMode(NamedDestinationProcessingMode value) {
        this.namedDestinationProcessingMode = value;
    }

}
