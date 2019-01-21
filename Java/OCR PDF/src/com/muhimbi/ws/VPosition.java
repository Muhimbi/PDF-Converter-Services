
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Absolute"/>
 *     &lt;enumeration value="Random"/>
 *     &lt;enumeration value="Top"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Bottom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VPosition", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum VPosition {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Absolute")
    ABSOLUTE("Absolute"),
    @XmlEnumValue("Random")
    RANDOM("Random"),
    @XmlEnumValue("Top")
    TOP("Top"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom");
    private final String value;

    VPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VPosition fromValue(String v) {
        for (VPosition c: VPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
