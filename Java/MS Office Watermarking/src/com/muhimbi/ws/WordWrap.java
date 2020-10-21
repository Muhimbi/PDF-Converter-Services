
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WordWrap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WordWrap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="WordOnly"/>
 *     &lt;enumeration value="Character"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Word"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WordWrap", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Graphics")
@XmlEnum
public enum WordWrap {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("WordOnly")
    WORD_ONLY("WordOnly"),
    @XmlEnumValue("Character")
    CHARACTER("Character"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Word")
    WORD("Word");
    private final String value;

    WordWrap(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WordWrap fromValue(String v) {
        for (WordWrap c: WordWrap.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
