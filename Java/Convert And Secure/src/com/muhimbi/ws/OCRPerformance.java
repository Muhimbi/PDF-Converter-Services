
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCRPerformance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OCRPerformance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Slow"/>
 *     &lt;enumeration value="Fast"/>
 *     &lt;enumeration value="Rapid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OCRPerformance", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum OCRPerformance {

    @XmlEnumValue("Slow")
    SLOW("Slow"),
    @XmlEnumValue("Fast")
    FAST("Fast"),
    @XmlEnumValue("Rapid")
    RAPID("Rapid");
    private final String value;

    OCRPerformance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OCRPerformance fromValue(String v) {
        for (OCRPerformance c: OCRPerformance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
