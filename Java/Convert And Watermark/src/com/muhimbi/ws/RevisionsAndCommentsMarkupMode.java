
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevisionsAndCommentsMarkupMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevisionsAndCommentsMarkupMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InLine"/>
 *     &lt;enumeration value="Balloon"/>
 *     &lt;enumeration value="Mixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RevisionsAndCommentsMarkupMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum RevisionsAndCommentsMarkupMode {

    @XmlEnumValue("InLine")
    IN_LINE("InLine"),
    @XmlEnumValue("Balloon")
    BALLOON("Balloon"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed");
    private final String value;

    RevisionsAndCommentsMarkupMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevisionsAndCommentsMarkupMode fromValue(String v) {
        for (RevisionsAndCommentsMarkupMode c: RevisionsAndCommentsMarkupMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
