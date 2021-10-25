
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CadEmptyLayoutDetectionMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CadEmptyLayoutDetectionMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="SkipNone"/>
 *     &lt;enumeration value="SkipEmptyLayouts"/>
 *     &lt;enumeration value="SkipLayoutsWithoutViewports"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CadEmptyLayoutDetectionMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum CadEmptyLayoutDetectionMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("SkipNone")
    SKIP_NONE("SkipNone"),
    @XmlEnumValue("SkipEmptyLayouts")
    SKIP_EMPTY_LAYOUTS("SkipEmptyLayouts"),
    @XmlEnumValue("SkipLayoutsWithoutViewports")
    SKIP_LAYOUTS_WITHOUT_VIEWPORTS("SkipLayoutsWithoutViewports");
    private final String value;

    CadEmptyLayoutDetectionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CadEmptyLayoutDetectionMode fromValue(String v) {
        for (CadEmptyLayoutDetectionMode c: CadEmptyLayoutDetectionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
