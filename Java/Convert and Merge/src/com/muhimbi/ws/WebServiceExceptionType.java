
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebServiceExceptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebServiceExceptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="FileFormatNotSupported"/>
 *     &lt;enumeration value="CorruptDocument"/>
 *     &lt;enumeration value="ErrorOpeningFile"/>
 *     &lt;enumeration value="ConversionTimeOut"/>
 *     &lt;enumeration value="ConverterNotResponding"/>
 *     &lt;enumeration value="ConverterNotInstalled"/>
 *     &lt;enumeration value="InternalError"/>
 *     &lt;enumeration value="OutputFormatNotSupported"/>
 *     &lt;enumeration value="ConfigurationError"/>
 *     &lt;enumeration value="TrialExpired"/>
 *     &lt;enumeration value="ExternalDependencyError"/>
 *     &lt;enumeration value="AttachmentNotSupported"/>
 *     &lt;enumeration value="DocumentLocked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebServiceExceptionType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum WebServiceExceptionType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FileFormatNotSupported")
    FILE_FORMAT_NOT_SUPPORTED("FileFormatNotSupported"),
    @XmlEnumValue("CorruptDocument")
    CORRUPT_DOCUMENT("CorruptDocument"),
    @XmlEnumValue("ErrorOpeningFile")
    ERROR_OPENING_FILE("ErrorOpeningFile"),
    @XmlEnumValue("ConversionTimeOut")
    CONVERSION_TIME_OUT("ConversionTimeOut"),
    @XmlEnumValue("ConverterNotResponding")
    CONVERTER_NOT_RESPONDING("ConverterNotResponding"),
    @XmlEnumValue("ConverterNotInstalled")
    CONVERTER_NOT_INSTALLED("ConverterNotInstalled"),
    @XmlEnumValue("InternalError")
    INTERNAL_ERROR("InternalError"),
    @XmlEnumValue("OutputFormatNotSupported")
    OUTPUT_FORMAT_NOT_SUPPORTED("OutputFormatNotSupported"),
    @XmlEnumValue("ConfigurationError")
    CONFIGURATION_ERROR("ConfigurationError"),
    @XmlEnumValue("TrialExpired")
    TRIAL_EXPIRED("TrialExpired"),
    @XmlEnumValue("ExternalDependencyError")
    EXTERNAL_DEPENDENCY_ERROR("ExternalDependencyError"),
    @XmlEnumValue("AttachmentNotSupported")
    ATTACHMENT_NOT_SUPPORTED("AttachmentNotSupported"),
    @XmlEnumValue("DocumentLocked")
    DOCUMENT_LOCKED("DocumentLocked");
    private final String value;

    WebServiceExceptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebServiceExceptionType fromValue(String v) {
        for (WebServiceExceptionType c: WebServiceExceptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
