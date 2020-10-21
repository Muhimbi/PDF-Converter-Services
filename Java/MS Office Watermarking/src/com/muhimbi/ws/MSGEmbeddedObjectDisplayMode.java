
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSGEmbeddedObjectDisplayMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSGEmbeddedObjectDisplayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InlineNoScale"/>
 *     &lt;enumeration value="InlineFitWidth"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSGEmbeddedObjectDisplayMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MSGEmbeddedObjectDisplayMode {

    @XmlEnumValue("InlineNoScale")
    INLINE_NO_SCALE("InlineNoScale"),
    @XmlEnumValue("InlineFitWidth")
    INLINE_FIT_WIDTH("InlineFitWidth"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    MSGEmbeddedObjectDisplayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSGEmbeddedObjectDisplayMode fromValue(String v) {
        for (MSGEmbeddedObjectDisplayMode c: MSGEmbeddedObjectDisplayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
