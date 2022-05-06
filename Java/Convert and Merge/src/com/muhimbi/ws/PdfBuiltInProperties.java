
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PdfBuiltInProperties.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PdfBuiltInProperties">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="Author"/>
 *     &lt;enumeration value="Subject"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="CreationDate"/>
 *     &lt;enumeration value="ModificationDate"/>
 *     &lt;enumeration value="Creator"/>
 *     &lt;enumeration value="Producer"/>
 *     &lt;enumeration value="PdfVersion"/>
 *     &lt;enumeration value="PageSize"/>
 *     &lt;enumeration value="TaggedPdf"/>
 *     &lt;enumeration value="Pages"/>
 *     &lt;enumeration value="FastWebView"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PdfBuiltInProperties", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PdfBuiltInProperties {

    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Author")
    AUTHOR("Author"),
    @XmlEnumValue("Subject")
    SUBJECT("Subject"),
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),
    @XmlEnumValue("CreationDate")
    CREATION_DATE("CreationDate"),
    @XmlEnumValue("ModificationDate")
    MODIFICATION_DATE("ModificationDate"),
    @XmlEnumValue("Creator")
    CREATOR("Creator"),
    @XmlEnumValue("Producer")
    PRODUCER("Producer"),
    @XmlEnumValue("PdfVersion")
    PDF_VERSION("PdfVersion"),
    @XmlEnumValue("PageSize")
    PAGE_SIZE("PageSize"),
    @XmlEnumValue("TaggedPdf")
    TAGGED_PDF("TaggedPdf"),
    @XmlEnumValue("Pages")
    PAGES("Pages"),
    @XmlEnumValue("FastWebView")
    FAST_WEB_VIEW("FastWebView");
    private final String value;

    PdfBuiltInProperties(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdfBuiltInProperties fromValue(String v) {
        for (PdfBuiltInProperties c: PdfBuiltInProperties.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
