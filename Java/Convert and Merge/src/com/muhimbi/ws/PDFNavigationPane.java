
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFNavigationPane.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFNavigationPane">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Bookmarks"/>
 *     &lt;enumeration value="Thumbnails"/>
 *     &lt;enumeration value="OptionalContent"/>
 *     &lt;enumeration value="Attachments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFNavigationPane", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PDFNavigationPane {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Bookmarks")
    BOOKMARKS("Bookmarks"),
    @XmlEnumValue("Thumbnails")
    THUMBNAILS("Thumbnails"),
    @XmlEnumValue("OptionalContent")
    OPTIONAL_CONTENT("OptionalContent"),
    @XmlEnumValue("Attachments")
    ATTACHMENTS("Attachments");
    private final String value;

    PDFNavigationPane(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFNavigationPane fromValue(String v) {
        for (PDFNavigationPane c: PDFNavigationPane.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
