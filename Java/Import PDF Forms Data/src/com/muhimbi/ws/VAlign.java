
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VAlign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VAlign">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Middle"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="Top"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VAlign", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum VAlign {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("Top")
    TOP("Top");
    private final String value;

    VAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VAlign fromValue(String v) {
        for (VAlign c: VAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
