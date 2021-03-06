
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileSplitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileSplitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ByNumberOfPages"/>
 *     &lt;enumeration value="ByBookmarkLevel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileSplitType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum FileSplitType {

    @XmlEnumValue("ByNumberOfPages")
    BY_NUMBER_OF_PAGES("ByNumberOfPages"),
    @XmlEnumValue("ByBookmarkLevel")
    BY_BOOKMARK_LEVEL("ByBookmarkLevel");
    private final String value;

    FileSplitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileSplitType fromValue(String v) {
        for (FileSplitType c: FileSplitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
