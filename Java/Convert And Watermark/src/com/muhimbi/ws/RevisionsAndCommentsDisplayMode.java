
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevisionsAndCommentsDisplayMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevisionsAndCommentsDisplayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FinalShowingMarkup"/>
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="OriginalShowingMarkup"/>
 *     &lt;enumeration value="Original"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RevisionsAndCommentsDisplayMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum RevisionsAndCommentsDisplayMode {

    @XmlEnumValue("FinalShowingMarkup")
    FINAL_SHOWING_MARKUP("FinalShowingMarkup"),
    @XmlEnumValue("Final")
    FINAL("Final"),
    @XmlEnumValue("OriginalShowingMarkup")
    ORIGINAL_SHOWING_MARKUP("OriginalShowingMarkup"),
    @XmlEnumValue("Original")
    ORIGINAL("Original");
    private final String value;

    RevisionsAndCommentsDisplayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevisionsAndCommentsDisplayMode fromValue(String v) {
        for (RevisionsAndCommentsDisplayMode c: RevisionsAndCommentsDisplayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
