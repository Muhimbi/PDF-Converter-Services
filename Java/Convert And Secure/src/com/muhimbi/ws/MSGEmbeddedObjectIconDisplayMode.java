
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSGEmbeddedObjectIconDisplayMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSGEmbeddedObjectIconDisplayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IconOnly"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSGEmbeddedObjectIconDisplayMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MSGEmbeddedObjectIconDisplayMode {

    @XmlEnumValue("IconOnly")
    ICON_ONLY("IconOnly"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    MSGEmbeddedObjectIconDisplayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSGEmbeddedObjectIconDisplayMode fromValue(String v) {
        for (MSGEmbeddedObjectIconDisplayMode c: MSGEmbeddedObjectIconDisplayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
