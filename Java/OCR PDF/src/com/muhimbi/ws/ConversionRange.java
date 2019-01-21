
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VisibleDocuments"/>
 *     &lt;enumeration value="AllDocuments"/>
 *     &lt;enumeration value="ActiveDocuments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConversionRange", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum ConversionRange {

    @XmlEnumValue("VisibleDocuments")
    VISIBLE_DOCUMENTS("VisibleDocuments"),
    @XmlEnumValue("AllDocuments")
    ALL_DOCUMENTS("AllDocuments"),
    @XmlEnumValue("ActiveDocuments")
    ACTIVE_DOCUMENTS("ActiveDocuments");
    private final String value;

    ConversionRange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionRange fromValue(String v) {
        for (ConversionRange c: ConversionRange.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
