
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Convert"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="OCR"/>
 *     &lt;enumeration value="Watermark"/>
 *     &lt;enumeration value="Secure"/>
 *     &lt;enumeration value="Split"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum OperationType {

    @XmlEnumValue("Convert")
    CONVERT("Convert"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    OCR("OCR"),
    @XmlEnumValue("Watermark")
    WATERMARK("Watermark"),
    @XmlEnumValue("Secure")
    SECURE("Secure"),
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    OperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationType fromValue(String v) {
        for (OperationType c: OperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
