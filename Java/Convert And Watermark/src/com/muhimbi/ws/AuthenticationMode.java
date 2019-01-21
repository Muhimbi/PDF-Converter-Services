
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="WebAuthentication"/>
 *     &lt;enumeration value="MSOAuthentication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum AuthenticationMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("WebAuthentication")
    WEB_AUTHENTICATION("WebAuthentication"),
    @XmlEnumValue("MSOAuthentication")
    MSO_AUTHENTICATION("MSOAuthentication");
    private final String value;

    AuthenticationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationMode fromValue(String v) {
        for (AuthenticationMode c: AuthenticationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
