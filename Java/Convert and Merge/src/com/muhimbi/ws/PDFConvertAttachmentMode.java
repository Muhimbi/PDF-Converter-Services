
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFConvertAttachmentMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFConvertAttachmentMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RemoveAll"/>
 *     &lt;enumeration value="RemoveSupported"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFConvertAttachmentMode", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PDFConvertAttachmentMode {

    @XmlEnumValue("RemoveAll")
    REMOVE_ALL("RemoveAll"),
    @XmlEnumValue("RemoveSupported")
    REMOVE_SUPPORTED("RemoveSupported");
    private final String value;

    PDFConvertAttachmentMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFConvertAttachmentMode fromValue(String v) {
        for (PDFConvertAttachmentMode c: PDFConvertAttachmentMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
