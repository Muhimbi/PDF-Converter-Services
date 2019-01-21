
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCRLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OCRLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Arabic"/>
 *     &lt;enumeration value="SimplifiedChinese"/>
 *     &lt;enumeration value="TraditionalChinese"/>
 *     &lt;enumeration value="Danish"/>
 *     &lt;enumeration value="German"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="English_UK"/>
 *     &lt;enumeration value="English_US"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="Finnish"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Hebrew"/>
 *     &lt;enumeration value="Hungarian"/>
 *     &lt;enumeration value="Italian"/>
 *     &lt;enumeration value="Japanese"/>
 *     &lt;enumeration value="Korean"/>
 *     &lt;enumeration value="Norwegian"/>
 *     &lt;enumeration value="Portuguese"/>
 *     &lt;enumeration value="Russian"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="Swedish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OCRLanguage", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum OCRLanguage {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Arabic")
    ARABIC("Arabic"),
    @XmlEnumValue("SimplifiedChinese")
    SIMPLIFIED_CHINESE("SimplifiedChinese"),
    @XmlEnumValue("TraditionalChinese")
    TRADITIONAL_CHINESE("TraditionalChinese"),
    @XmlEnumValue("Danish")
    DANISH("Danish"),
    @XmlEnumValue("German")
    GERMAN("German"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("English_UK")
    ENGLISH_UK("English_UK"),
    @XmlEnumValue("English_US")
    ENGLISH_US("English_US"),
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),
    @XmlEnumValue("Finnish")
    FINNISH("Finnish"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Hebrew")
    HEBREW("Hebrew"),
    @XmlEnumValue("Hungarian")
    HUNGARIAN("Hungarian"),
    @XmlEnumValue("Italian")
    ITALIAN("Italian"),
    @XmlEnumValue("Japanese")
    JAPANESE("Japanese"),
    @XmlEnumValue("Korean")
    KOREAN("Korean"),
    @XmlEnumValue("Norwegian")
    NORWEGIAN("Norwegian"),
    @XmlEnumValue("Portuguese")
    PORTUGUESE("Portuguese"),
    @XmlEnumValue("Russian")
    RUSSIAN("Russian"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("Swedish")
    SWEDISH("Swedish");
    private final String value;

    OCRLanguage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OCRLanguage fromValue(String v) {
        for (OCRLanguage c: OCRLanguage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
