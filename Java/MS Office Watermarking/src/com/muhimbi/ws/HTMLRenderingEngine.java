
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HTMLRenderingEngine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HTMLRenderingEngine">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="WebKit"/>
 *     &lt;enumeration value="Chromium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HTMLRenderingEngine", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum HTMLRenderingEngine {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    IE("IE"),
    @XmlEnumValue("WebKit")
    WEB_KIT("WebKit"),
    @XmlEnumValue("Chromium")
    CHROMIUM("Chromium");
    private final String value;

    HTMLRenderingEngine(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HTMLRenderingEngine fromValue(String v) {
        for (HTMLRenderingEngine c: HTMLRenderingEngine.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
