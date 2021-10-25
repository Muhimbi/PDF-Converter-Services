
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedDestinationProcessingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamedDestinationProcessingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ClearAll"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="Replace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamedDestinationProcessingMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum NamedDestinationProcessingMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ClearAll")
    CLEAR_ALL("ClearAll"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    NamedDestinationProcessingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NamedDestinationProcessingMode fromValue(String v) {
        for (NamedDestinationProcessingMode c: NamedDestinationProcessingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
