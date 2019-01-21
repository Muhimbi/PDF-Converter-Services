
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScaleMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScaleMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Absolute"/>
 *     &lt;enumeration value="MaintainAspectRatio"/>
 *     &lt;enumeration value="ExactFit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScaleMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum ScaleMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Absolute")
    ABSOLUTE("Absolute"),
    @XmlEnumValue("MaintainAspectRatio")
    MAINTAIN_ASPECT_RATIO("MaintainAspectRatio"),
    @XmlEnumValue("ExactFit")
    EXACT_FIT("ExactFit");
    private final String value;

    ScaleMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScaleMode fromValue(String v) {
        for (ScaleMode c: ScaleMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
