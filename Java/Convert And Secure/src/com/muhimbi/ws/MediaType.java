
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Screen"/>
 *     &lt;enumeration value="Print"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MediaType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Screen")
    SCREEN("Screen"),
    @XmlEnumValue("Print")
    PRINT("Print");
    private final String value;

    MediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaType fromValue(String v) {
        for (MediaType c: MediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
