
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CadLayoutSortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CadLayoutSortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Ascending"/>
 *     &lt;enumeration value="Descending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CadLayoutSortOrder", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum CadLayoutSortOrder {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    CadLayoutSortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CadLayoutSortOrder fromValue(String v) {
        for (CadLayoutSortOrder c: CadLayoutSortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
