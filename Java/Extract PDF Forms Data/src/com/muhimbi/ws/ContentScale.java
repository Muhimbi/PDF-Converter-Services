
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentScale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentScale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="NoScale"/>
 *     &lt;enumeration value="FitWidth"/>
 *     &lt;enumeration value="FitHeight"/>
 *     &lt;enumeration value="FitPage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentScale", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum ContentScale {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("NoScale")
    NO_SCALE("NoScale"),
    @XmlEnumValue("FitWidth")
    FIT_WIDTH("FitWidth"),
    @XmlEnumValue("FitHeight")
    FIT_HEIGHT("FitHeight"),
    @XmlEnumValue("FitPage")
    FIT_PAGE("FitPage");
    private final String value;

    ContentScale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentScale fromValue(String v) {
        for (ContentScale c: ContentScale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
