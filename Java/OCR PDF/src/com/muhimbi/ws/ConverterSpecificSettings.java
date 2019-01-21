
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConverterSpecificSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConverterSpecificSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConverterSpecificSettings", namespace = "http://types.muhimbi.com/2010/11/22")
@XmlSeeAlso({
    ConverterSpecificSettingsSpreadsheets.class,
    ConverterSpecificSettingsInfoPath.class,
    ConverterSpecificSettingsPresentations.class,
    ConverterSpecificSettingsWordProcessing.class,
    ConverterSpecificSettingsHTML.class,
    ConverterSpecificSettingsImage.class,
    ConverterSpecificSettingsCad.class,
    ConverterSpecificSettingsMSG.class,
    ConverterSpecificSettingsTIFF.class,
    ConverterSpecificSettingsCommandLineConverter.class,
    EnumsProxy.class,
    ConverterSpecificSettingsPDF.class
})
public class ConverterSpecificSettings {


}
