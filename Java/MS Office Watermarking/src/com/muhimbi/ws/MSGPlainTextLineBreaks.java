
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSGPlainTextLineBreaks.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSGPlainTextLineBreaks">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RetainAll"/>
 *     &lt;enumeration value="RemoveExtra"/>
 *     &lt;enumeration value="Legacy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSGPlainTextLineBreaks", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MSGPlainTextLineBreaks {

    @XmlEnumValue("RetainAll")
    RETAIN_ALL("RetainAll"),
    @XmlEnumValue("RemoveExtra")
    REMOVE_EXTRA("RemoveExtra"),
    @XmlEnumValue("Legacy")
    LEGACY("Legacy");
    private final String value;

    MSGPlainTextLineBreaks(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSGPlainTextLineBreaks fromValue(String v) {
        for (MSGPlainTextLineBreaks c: MSGPlainTextLineBreaks.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
