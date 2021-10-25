
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeTextLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeTextLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Top"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarcodeTextLocation", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum BarcodeTextLocation {

    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Top")
    TOP("Top");
    private final String value;

    BarcodeTextLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeTextLocation fromValue(String v) {
        for (BarcodeTextLocation c: BarcodeTextLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
