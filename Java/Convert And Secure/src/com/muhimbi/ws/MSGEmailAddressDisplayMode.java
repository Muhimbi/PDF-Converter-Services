
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSGEmailAddressDisplayMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MSGEmailAddressDisplayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="NameAndAddress"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="NameAndSMTPAddress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MSGEmailAddressDisplayMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum MSGEmailAddressDisplayMode {

    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("NameAndAddress")
    NAME_AND_ADDRESS("NameAndAddress"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("NameAndSMTPAddress")
    NAME_AND_SMTP_ADDRESS("NameAndSMTPAddress");
    private final String value;

    MSGEmailAddressDisplayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSGEmailAddressDisplayMode fromValue(String v) {
        for (MSGEmailAddressDisplayMode c: MSGEmailAddressDisplayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
