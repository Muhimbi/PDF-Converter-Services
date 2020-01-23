
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsupportedFileBehaviour.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnsupportedFileBehaviour">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="AttachOriginal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnsupportedFileBehaviour", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum UnsupportedFileBehaviour {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("AttachOriginal")
    ATTACH_ORIGINAL("AttachOriginal");
    private final String value;

    UnsupportedFileBehaviour(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnsupportedFileBehaviour fromValue(String v) {
        for (UnsupportedFileBehaviour c: UnsupportedFileBehaviour.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
