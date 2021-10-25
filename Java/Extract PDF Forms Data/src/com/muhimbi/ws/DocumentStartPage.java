
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStartPage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStartPage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Next"/>
 *     &lt;enumeration value="Odd"/>
 *     &lt;enumeration value="Even"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStartPage", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum DocumentStartPage {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Next")
    NEXT("Next"),
    @XmlEnumValue("Odd")
    ODD("Odd"),
    @XmlEnumValue("Even")
    EVEN("Even");
    private final String value;

    DocumentStartPage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentStartPage fromValue(String v) {
        for (DocumentStartPage c: DocumentStartPage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
