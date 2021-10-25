
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacroSecurityOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MacroSecurityOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SignedOnly"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MacroSecurityOption", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MacroSecurityOption {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SignedOnly")
    SIGNED_ONLY("SignedOnly"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    MacroSecurityOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MacroSecurityOption fromValue(String v) {
        for (MacroSecurityOption c: MacroSecurityOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
