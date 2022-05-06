
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WordBuiltInProperties.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WordBuiltInProperties">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="Subject"/>
 *     &lt;enumeration value="Author"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="Comments"/>
 *     &lt;enumeration value="Template"/>
 *     &lt;enumeration value="LastAuthor"/>
 *     &lt;enumeration value="Revision"/>
 *     &lt;enumeration value="AppName"/>
 *     &lt;enumeration value="TimeLastPrinted"/>
 *     &lt;enumeration value="TimeCreated"/>
 *     &lt;enumeration value="TimeLastSaved"/>
 *     &lt;enumeration value="VBATotalEdit"/>
 *     &lt;enumeration value="Pages"/>
 *     &lt;enumeration value="Words"/>
 *     &lt;enumeration value="Characters"/>
 *     &lt;enumeration value="Security"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="Manager"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Bytes"/>
 *     &lt;enumeration value="Lines"/>
 *     &lt;enumeration value="Paras"/>
 *     &lt;enumeration value="Notes"/>
 *     &lt;enumeration value="CharsWSpaces"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WordBuiltInProperties", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum WordBuiltInProperties {

    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Subject")
    SUBJECT("Subject"),
    @XmlEnumValue("Author")
    AUTHOR("Author"),
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),
    @XmlEnumValue("Comments")
    COMMENTS("Comments"),
    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    @XmlEnumValue("LastAuthor")
    LAST_AUTHOR("LastAuthor"),
    @XmlEnumValue("Revision")
    REVISION("Revision"),
    @XmlEnumValue("AppName")
    APP_NAME("AppName"),
    @XmlEnumValue("TimeLastPrinted")
    TIME_LAST_PRINTED("TimeLastPrinted"),
    @XmlEnumValue("TimeCreated")
    TIME_CREATED("TimeCreated"),
    @XmlEnumValue("TimeLastSaved")
    TIME_LAST_SAVED("TimeLastSaved"),
    @XmlEnumValue("VBATotalEdit")
    VBA_TOTAL_EDIT("VBATotalEdit"),
    @XmlEnumValue("Pages")
    PAGES("Pages"),
    @XmlEnumValue("Words")
    WORDS("Words"),
    @XmlEnumValue("Characters")
    CHARACTERS("Characters"),
    @XmlEnumValue("Security")
    SECURITY("Security"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Manager")
    MANAGER("Manager"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Bytes")
    BYTES("Bytes"),
    @XmlEnumValue("Lines")
    LINES("Lines"),
    @XmlEnumValue("Paras")
    PARAS("Paras"),
    @XmlEnumValue("Notes")
    NOTES("Notes"),
    @XmlEnumValue("CharsWSpaces")
    CHARS_W_SPACES("CharsWSpaces");
    private final String value;

    WordBuiltInProperties(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WordBuiltInProperties fromValue(String v) {
        for (WordBuiltInProperties c: WordBuiltInProperties.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
