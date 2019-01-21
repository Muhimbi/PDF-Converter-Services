
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionQuality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionQuality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OptimizeForPrint"/>
 *     &lt;enumeration value="OptimizeForOnScreen"/>
 *     &lt;enumeration value="Original"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionQuality", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum ConversionQuality {

    @XmlEnumValue("OptimizeForPrint")
    OPTIMIZE_FOR_PRINT("OptimizeForPrint"),
    @XmlEnumValue("OptimizeForOnScreen")
    OPTIMIZE_FOR_ON_SCREEN("OptimizeForOnScreen"),
    @XmlEnumValue("Original")
    ORIGINAL("Original");
    private final String value;

    ConversionQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionQuality fromValue(String v) {
        for (ConversionQuality c: ConversionQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
