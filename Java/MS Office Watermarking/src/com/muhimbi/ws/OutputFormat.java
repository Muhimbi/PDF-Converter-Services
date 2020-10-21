
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="XPS"/>
 *     &lt;enumeration value="DOCX"/>
 *     &lt;enumeration value="DOC"/>
 *     &lt;enumeration value="ODT"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="MHT"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="XLS"/>
 *     &lt;enumeration value="XLSX"/>
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="ODS"/>
 *     &lt;enumeration value="PPT"/>
 *     &lt;enumeration value="PPTX"/>
 *     &lt;enumeration value="ODP"/>
 *     &lt;enumeration value="PPS"/>
 *     &lt;enumeration value="PPSX"/>
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="BMP"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PCL"/>
 *     &lt;enumeration value="EPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputFormat", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum OutputFormat {

    PDF,
    XPS,
    DOCX,
    DOC,
    ODT,
    RTF,
    TXT,
    MHT,
    HTML,
    XML,
    XLS,
    XLSX,
    CSV,
    ODS,
    PPT,
    PPTX,
    ODP,
    PPS,
    PPSX,
    TIFF,
    PNG,
    GIF,
    JPG,
    BMP,
    PS,
    PCL,
    EPS;

    public String value() {
        return name();
    }

    public static OutputFormat fromValue(String v) {
        return valueOf(v);
    }

}
