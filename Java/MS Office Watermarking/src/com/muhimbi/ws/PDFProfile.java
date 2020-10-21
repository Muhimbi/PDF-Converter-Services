
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFProfile.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFProfile">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="PDF_1_5"/>
 *     &lt;enumeration value="PDF_A1B"/>
 *     &lt;enumeration value="PDF_A2B"/>
 *     &lt;enumeration value="PDF_A2U"/>
 *     &lt;enumeration value="PDF_A3B"/>
 *     &lt;enumeration value="PDF_A3U"/>
 *     &lt;enumeration value="PDF_1_1"/>
 *     &lt;enumeration value="PDF_1_2"/>
 *     &lt;enumeration value="PDF_1_3"/>
 *     &lt;enumeration value="PDF_1_4"/>
 *     &lt;enumeration value="PDF_1_6"/>
 *     &lt;enumeration value="PDF_1_7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFProfile", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PDFProfile {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    PDF_1_5("PDF_1_5"),
    @XmlEnumValue("PDF_A1B")
    PDF_A_1_B("PDF_A1B"),
    @XmlEnumValue("PDF_A2B")
    PDF_A_2_B("PDF_A2B"),
    @XmlEnumValue("PDF_A2U")
    PDF_A_2_U("PDF_A2U"),
    @XmlEnumValue("PDF_A3B")
    PDF_A_3_B("PDF_A3B"),
    @XmlEnumValue("PDF_A3U")
    PDF_A_3_U("PDF_A3U"),
    PDF_1_1("PDF_1_1"),
    PDF_1_2("PDF_1_2"),
    PDF_1_3("PDF_1_3"),
    PDF_1_4("PDF_1_4"),
    PDF_1_6("PDF_1_6"),
    PDF_1_7("PDF_1_7");
    private final String value;

    PDFProfile(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFProfile fromValue(String v) {
        for (PDFProfile c: PDFProfile.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
