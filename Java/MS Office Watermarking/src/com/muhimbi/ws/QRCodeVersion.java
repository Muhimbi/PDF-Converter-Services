
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodeVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QRCodeVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Version01"/>
 *     &lt;enumeration value="Version02"/>
 *     &lt;enumeration value="Version03"/>
 *     &lt;enumeration value="Version04"/>
 *     &lt;enumeration value="Version05"/>
 *     &lt;enumeration value="Version06"/>
 *     &lt;enumeration value="Version07"/>
 *     &lt;enumeration value="Version08"/>
 *     &lt;enumeration value="Version09"/>
 *     &lt;enumeration value="Version10"/>
 *     &lt;enumeration value="Version11"/>
 *     &lt;enumeration value="Version12"/>
 *     &lt;enumeration value="Version13"/>
 *     &lt;enumeration value="Version14"/>
 *     &lt;enumeration value="Version15"/>
 *     &lt;enumeration value="Version16"/>
 *     &lt;enumeration value="Version17"/>
 *     &lt;enumeration value="Version18"/>
 *     &lt;enumeration value="Version19"/>
 *     &lt;enumeration value="Version20"/>
 *     &lt;enumeration value="Version21"/>
 *     &lt;enumeration value="Version22"/>
 *     &lt;enumeration value="Version23"/>
 *     &lt;enumeration value="Version24"/>
 *     &lt;enumeration value="Version25"/>
 *     &lt;enumeration value="Version26"/>
 *     &lt;enumeration value="Version27"/>
 *     &lt;enumeration value="Version28"/>
 *     &lt;enumeration value="Version29"/>
 *     &lt;enumeration value="Version30"/>
 *     &lt;enumeration value="Version31"/>
 *     &lt;enumeration value="Version32"/>
 *     &lt;enumeration value="Version33"/>
 *     &lt;enumeration value="Version34"/>
 *     &lt;enumeration value="Version35"/>
 *     &lt;enumeration value="Version36"/>
 *     &lt;enumeration value="Version37"/>
 *     &lt;enumeration value="Version38"/>
 *     &lt;enumeration value="Version39"/>
 *     &lt;enumeration value="Version40"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QRCodeVersion", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum QRCodeVersion {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Version01")
    VERSION_01("Version01"),
    @XmlEnumValue("Version02")
    VERSION_02("Version02"),
    @XmlEnumValue("Version03")
    VERSION_03("Version03"),
    @XmlEnumValue("Version04")
    VERSION_04("Version04"),
    @XmlEnumValue("Version05")
    VERSION_05("Version05"),
    @XmlEnumValue("Version06")
    VERSION_06("Version06"),
    @XmlEnumValue("Version07")
    VERSION_07("Version07"),
    @XmlEnumValue("Version08")
    VERSION_08("Version08"),
    @XmlEnumValue("Version09")
    VERSION_09("Version09"),
    @XmlEnumValue("Version10")
    VERSION_10("Version10"),
    @XmlEnumValue("Version11")
    VERSION_11("Version11"),
    @XmlEnumValue("Version12")
    VERSION_12("Version12"),
    @XmlEnumValue("Version13")
    VERSION_13("Version13"),
    @XmlEnumValue("Version14")
    VERSION_14("Version14"),
    @XmlEnumValue("Version15")
    VERSION_15("Version15"),
    @XmlEnumValue("Version16")
    VERSION_16("Version16"),
    @XmlEnumValue("Version17")
    VERSION_17("Version17"),
    @XmlEnumValue("Version18")
    VERSION_18("Version18"),
    @XmlEnumValue("Version19")
    VERSION_19("Version19"),
    @XmlEnumValue("Version20")
    VERSION_20("Version20"),
    @XmlEnumValue("Version21")
    VERSION_21("Version21"),
    @XmlEnumValue("Version22")
    VERSION_22("Version22"),
    @XmlEnumValue("Version23")
    VERSION_23("Version23"),
    @XmlEnumValue("Version24")
    VERSION_24("Version24"),
    @XmlEnumValue("Version25")
    VERSION_25("Version25"),
    @XmlEnumValue("Version26")
    VERSION_26("Version26"),
    @XmlEnumValue("Version27")
    VERSION_27("Version27"),
    @XmlEnumValue("Version28")
    VERSION_28("Version28"),
    @XmlEnumValue("Version29")
    VERSION_29("Version29"),
    @XmlEnumValue("Version30")
    VERSION_30("Version30"),
    @XmlEnumValue("Version31")
    VERSION_31("Version31"),
    @XmlEnumValue("Version32")
    VERSION_32("Version32"),
    @XmlEnumValue("Version33")
    VERSION_33("Version33"),
    @XmlEnumValue("Version34")
    VERSION_34("Version34"),
    @XmlEnumValue("Version35")
    VERSION_35("Version35"),
    @XmlEnumValue("Version36")
    VERSION_36("Version36"),
    @XmlEnumValue("Version37")
    VERSION_37("Version37"),
    @XmlEnumValue("Version38")
    VERSION_38("Version38"),
    @XmlEnumValue("Version39")
    VERSION_39("Version39"),
    @XmlEnumValue("Version40")
    VERSION_40("Version40");
    private final String value;

    QRCodeVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QRCodeVersion fromValue(String v) {
        for (QRCodeVersion c: QRCodeVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
