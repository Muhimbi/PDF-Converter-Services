
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarcodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BarcodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Codabar"/>
 *     &lt;enumeration value="Code11"/>
 *     &lt;enumeration value="Code32"/>
 *     &lt;enumeration value="Code39"/>
 *     &lt;enumeration value="Code39Extended"/>
 *     &lt;enumeration value="Code93"/>
 *     &lt;enumeration value="Code93Extended"/>
 *     &lt;enumeration value="Code128"/>
 *     &lt;enumeration value="Code128A"/>
 *     &lt;enumeration value="Code128B"/>
 *     &lt;enumeration value="Code128C"/>
 *     &lt;enumeration value="GS1Code128"/>
 *     &lt;enumeration value="UPC_A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BarcodeType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum BarcodeType {

    @XmlEnumValue("Codabar")
    CODABAR("Codabar"),
    @XmlEnumValue("Code11")
    CODE_11("Code11"),
    @XmlEnumValue("Code32")
    CODE_32("Code32"),
    @XmlEnumValue("Code39")
    CODE_39("Code39"),
    @XmlEnumValue("Code39Extended")
    CODE_39_EXTENDED("Code39Extended"),
    @XmlEnumValue("Code93")
    CODE_93("Code93"),
    @XmlEnumValue("Code93Extended")
    CODE_93_EXTENDED("Code93Extended"),
    @XmlEnumValue("Code128")
    CODE_128("Code128"),
    @XmlEnumValue("Code128A")
    CODE_128_A("Code128A"),
    @XmlEnumValue("Code128B")
    CODE_128_B("Code128B"),
    @XmlEnumValue("Code128C")
    CODE_128_C("Code128C"),
    @XmlEnumValue("GS1Code128")
    GS_1_CODE_128("GS1Code128"),
    UPC_A("UPC_A");
    private final String value;

    BarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BarcodeType fromValue(String v) {
        for (BarcodeType c: BarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
