
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings_Spreadsheets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings_Spreadsheets">
 *   &lt;complexContent>
 *     &lt;extension base="{http://types.muhimbi.com/2010/11/22}ConverterSpecificSettings">
 *       &lt;sequence>
 *         &lt;element name="FitToPagesWide" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FitToPagesTall" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnhideAllRows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnhideAllColumns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings_Spreadsheets", namespace = "http://types.muhimbi.com/2014/02/06", propOrder = {
    "fitToPagesWide",
    "fitToPagesTall",
    "unhideAllRows",
    "unhideAllColumns"
})
public class ConverterSpecificSettingsSpreadsheets
    extends ConverterSpecificSettings
{

    @XmlElement(name = "FitToPagesWide")
    protected Integer fitToPagesWide;
    @XmlElement(name = "FitToPagesTall")
    protected Integer fitToPagesTall;
    @XmlElement(name = "UnhideAllRows")
    protected Boolean unhideAllRows;
    @XmlElement(name = "UnhideAllColumns")
    protected Boolean unhideAllColumns;

    /**
     * Gets the value of the fitToPagesWide property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFitToPagesWide() {
        return fitToPagesWide;
    }

    /**
     * Sets the value of the fitToPagesWide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFitToPagesWide(Integer value) {
        this.fitToPagesWide = value;
    }

    /**
     * Gets the value of the fitToPagesTall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFitToPagesTall() {
        return fitToPagesTall;
    }

    /**
     * Sets the value of the fitToPagesTall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFitToPagesTall(Integer value) {
        this.fitToPagesTall = value;
    }

    /**
     * Gets the value of the unhideAllRows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnhideAllRows() {
        return unhideAllRows;
    }

    /**
     * Sets the value of the unhideAllRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnhideAllRows(Boolean value) {
        this.unhideAllRows = value;
    }

    /**
     * Gets the value of the unhideAllColumns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnhideAllColumns() {
        return unhideAllColumns;
    }

    /**
     * Sets the value of the unhideAllColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnhideAllColumns(Boolean value) {
        this.unhideAllColumns = value;
    }

}
