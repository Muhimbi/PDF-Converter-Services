
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyCategories.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyCategories">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BuiltIn"/>
 *     &lt;enumeration value="OfficeBuiltInProperties"/>
 *     &lt;enumeration value="OfficeCustomProperties"/>
 *     &lt;enumeration value="PdfBuiltInProperties"/>
 *     &lt;enumeration value="PdfCustomProperties"/>
 *     &lt;enumeration value="PdfXmp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyCategories", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PropertyCategories {

    @XmlEnumValue("BuiltIn")
    BUILT_IN("BuiltIn"),
    @XmlEnumValue("OfficeBuiltInProperties")
    OFFICE_BUILT_IN_PROPERTIES("OfficeBuiltInProperties"),
    @XmlEnumValue("OfficeCustomProperties")
    OFFICE_CUSTOM_PROPERTIES("OfficeCustomProperties"),
    @XmlEnumValue("PdfBuiltInProperties")
    PDF_BUILT_IN_PROPERTIES("PdfBuiltInProperties"),
    @XmlEnumValue("PdfCustomProperties")
    PDF_CUSTOM_PROPERTIES("PdfCustomProperties"),
    @XmlEnumValue("PdfXmp")
    PDF_XMP("PdfXmp");
    private final String value;

    PropertyCategories(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyCategories fromValue(String v) {
        for (PropertyCategories c: PropertyCategories.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
