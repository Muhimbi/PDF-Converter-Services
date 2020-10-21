
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSGBestBodyMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSGBestBodyMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Strict"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSGBestBodyMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MSGBestBodyMode {

    @XmlEnumValue("Strict")
    STRICT("Strict"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    MSGBestBodyMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSGBestBodyMode fromValue(String v) {
        for (MSGBestBodyMode c: MSGBestBodyMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
