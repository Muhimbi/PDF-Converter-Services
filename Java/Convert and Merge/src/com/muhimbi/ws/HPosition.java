
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Absolute"/>
 *     &lt;enumeration value="Random"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Right"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HPosition", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum HPosition {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Absolute")
    ABSOLUTE("Absolute"),
    @XmlEnumValue("Random")
    RANDOM("Random"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Right")
    RIGHT("Right");
    private final String value;

    HPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HPosition fromValue(String v) {
        for (HPosition c: HPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
