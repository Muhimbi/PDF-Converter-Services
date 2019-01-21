
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOCLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TOCLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Front"/>
 *     &lt;enumeration value="Back"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TOCLocation", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum TOCLocation {

    @XmlEnumValue("Front")
    FRONT("Front"),
    @XmlEnumValue("Back")
    BACK("Back");
    private final String value;

    TOCLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TOCLocation fromValue(String v) {
        for (TOCLocation c: TOCLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
