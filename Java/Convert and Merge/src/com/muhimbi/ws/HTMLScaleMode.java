
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HTMLScaleMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HTMLScaleMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="FitWidth"/>
 *     &lt;enumeration value="NoScale"/>
 *     &lt;enumeration value="FitWidthScaleImagesOnly"/>
 *     &lt;enumeration value="FitWidthScaleWideImagesOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HTMLScaleMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum HTMLScaleMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("FitWidth")
    FIT_WIDTH("FitWidth"),
    @XmlEnumValue("NoScale")
    NO_SCALE("NoScale"),
    @XmlEnumValue("FitWidthScaleImagesOnly")
    FIT_WIDTH_SCALE_IMAGES_ONLY("FitWidthScaleImagesOnly"),
    @XmlEnumValue("FitWidthScaleWideImagesOnly")
    FIT_WIDTH_SCALE_WIDE_IMAGES_ONLY("FitWidthScaleWideImagesOnly");
    private final String value;

    HTMLScaleMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HTMLScaleMode fromValue(String v) {
        for (HTMLScaleMode c: HTMLScaleMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
