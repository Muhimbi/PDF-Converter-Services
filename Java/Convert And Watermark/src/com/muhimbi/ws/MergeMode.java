
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MergeMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="AttachAsPDF"/>
 *     &lt;enumeration value="AttachOriginal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MergeMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MergeMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Merge")
    MERGE("Merge"),
    @XmlEnumValue("AttachAsPDF")
    ATTACH_AS_PDF("AttachAsPDF"),
    @XmlEnumValue("AttachOriginal")
    ATTACH_ORIGINAL("AttachOriginal");
    private final String value;

    MergeMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MergeMode fromValue(String v) {
        for (MergeMode c: MergeMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
