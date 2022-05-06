
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFPageScalingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFPageScalingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFPageScalingMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PDFPageScalingMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    PDFPageScalingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFPageScalingMode fromValue(String v) {
        for (PDFPageScalingMode c: PDFPageScalingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
