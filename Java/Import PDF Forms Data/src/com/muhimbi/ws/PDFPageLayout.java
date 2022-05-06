
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFPageLayout.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFPageLayout">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SinglePage"/>
 *     &lt;enumeration value="OneColumn"/>
 *     &lt;enumeration value="TwoColumnLeft"/>
 *     &lt;enumeration value="TwoColumnRight"/>
 *     &lt;enumeration value="TwoPageLeft"/>
 *     &lt;enumeration value="TwoPageRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFPageLayout", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PDFPageLayout {

    @XmlEnumValue("SinglePage")
    SINGLE_PAGE("SinglePage"),
    @XmlEnumValue("OneColumn")
    ONE_COLUMN("OneColumn"),
    @XmlEnumValue("TwoColumnLeft")
    TWO_COLUMN_LEFT("TwoColumnLeft"),
    @XmlEnumValue("TwoColumnRight")
    TWO_COLUMN_RIGHT("TwoColumnRight"),
    @XmlEnumValue("TwoPageLeft")
    TWO_PAGE_LEFT("TwoPageLeft"),
    @XmlEnumValue("TwoPageRight")
    TWO_PAGE_RIGHT("TwoPageRight");
    private final String value;

    PDFPageLayout(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFPageLayout fromValue(String v) {
        for (PDFPageLayout c: PDFPageLayout.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
