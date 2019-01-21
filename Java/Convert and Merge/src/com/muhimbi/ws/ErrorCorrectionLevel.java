
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCorrectionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCorrectionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Quartile"/>
 *     &lt;enumeration value="High"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCorrectionLevel", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum ErrorCorrectionLevel {

    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("Quartile")
    QUARTILE("Quartile"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    ErrorCorrectionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCorrectionLevel fromValue(String v) {
        for (ErrorCorrectionLevel c: ErrorCorrectionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
