
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Allowed"/>
 *     &lt;enumeration value="Denied_ExceededMaxConcurrentCalls"/>
 *     &lt;enumeration value="Denied_ExceededConverterMaxConcurrentCalls"/>
 *     &lt;enumeration value="Denied_ExceededOperationMaxConcurrentCalls"/>
 *     &lt;enumeration value="Denied_UnsupportedOperationType"/>
 *     &lt;enumeration value="Denied_UnsupportedFileType"/>
 *     &lt;enumeration value="Denied_UnsupportedConverter"/>
 *     &lt;enumeration value="Denied_OperationDisabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationStatus", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum OperationStatus {

    @XmlEnumValue("Allowed")
    ALLOWED("Allowed"),
    @XmlEnumValue("Denied_ExceededMaxConcurrentCalls")
    DENIED_EXCEEDED_MAX_CONCURRENT_CALLS("Denied_ExceededMaxConcurrentCalls"),
    @XmlEnumValue("Denied_ExceededConverterMaxConcurrentCalls")
    DENIED_EXCEEDED_CONVERTER_MAX_CONCURRENT_CALLS("Denied_ExceededConverterMaxConcurrentCalls"),
    @XmlEnumValue("Denied_ExceededOperationMaxConcurrentCalls")
    DENIED_EXCEEDED_OPERATION_MAX_CONCURRENT_CALLS("Denied_ExceededOperationMaxConcurrentCalls"),
    @XmlEnumValue("Denied_UnsupportedOperationType")
    DENIED_UNSUPPORTED_OPERATION_TYPE("Denied_UnsupportedOperationType"),
    @XmlEnumValue("Denied_UnsupportedFileType")
    DENIED_UNSUPPORTED_FILE_TYPE("Denied_UnsupportedFileType"),
    @XmlEnumValue("Denied_UnsupportedConverter")
    DENIED_UNSUPPORTED_CONVERTER("Denied_UnsupportedConverter"),
    @XmlEnumValue("Denied_OperationDisabled")
    DENIED_OPERATION_DISABLED("Denied_OperationDisabled");
    private final String value;

    OperationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationStatus fromValue(String v) {
        for (OperationStatus c: OperationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
