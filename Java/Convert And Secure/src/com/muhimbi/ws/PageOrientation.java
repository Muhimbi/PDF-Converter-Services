
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageOrientation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Portrait"/>
 *     &lt;enumeration value="Landscape"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageOrientation", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum PageOrientation {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Portrait")
    PORTRAIT("Portrait"),
    @XmlEnumValue("Landscape")
    LANDSCAPE("Landscape"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PageOrientation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageOrientation fromValue(String v) {
        for (PageOrientation c: PageOrientation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
