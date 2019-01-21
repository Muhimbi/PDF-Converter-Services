
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeInputMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeInputMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Binary"/>
 *     &lt;enumeration value="AlphaNumeric"/>
 *     &lt;enumeration value="Numeric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarcodeInputMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum BarcodeInputMode {

    @XmlEnumValue("Binary")
    BINARY("Binary"),
    @XmlEnumValue("AlphaNumeric")
    ALPHA_NUMERIC("AlphaNumeric"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric");
    private final String value;

    BarcodeInputMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeInputMode fromValue(String v) {
        for (BarcodeInputMode c: BarcodeInputMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
