
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_ZoneContent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_ZoneContent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="NoRestrictions"/>
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Uppercase"/>
 *     &lt;enumeration value="Lowercase"/>
 *     &lt;enumeration value="AlphaUppercase"/>
 *     &lt;enumeration value="AlphaLowercase"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Anchor"/>
 *     &lt;enumeration value="AnchorRegion"/>
 *     &lt;enumeration value="Barcode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_ZoneContent", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRZoneContent {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("NoRestrictions")
    NO_RESTRICTIONS("NoRestrictions"),
    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Uppercase")
    UPPERCASE("Uppercase"),
    @XmlEnumValue("Lowercase")
    LOWERCASE("Lowercase"),
    @XmlEnumValue("AlphaUppercase")
    ALPHA_UPPERCASE("AlphaUppercase"),
    @XmlEnumValue("AlphaLowercase")
    ALPHA_LOWERCASE("AlphaLowercase"),
    OMR("OMR"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Anchor")
    ANCHOR("Anchor"),
    @XmlEnumValue("AnchorRegion")
    ANCHOR_REGION("AnchorRegion"),
    @XmlEnumValue("Barcode")
    BARCODE("Barcode");
    private final String value;

    PrimeOCRZoneContent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRZoneContent fromValue(String v) {
        for (PrimeOCRZoneContent c: PrimeOCRZoneContent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
