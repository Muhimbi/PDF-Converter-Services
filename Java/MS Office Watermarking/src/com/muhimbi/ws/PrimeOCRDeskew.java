
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_Deskew.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_Deskew">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="OnNoZoneAdjust"/>
 *     &lt;enumeration value="OnNoOutputAdjust"/>
 *     &lt;enumeration value="OnNoZoneNoOutputAdjust"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_Deskew", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRDeskew {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("OnNoZoneAdjust")
    ON_NO_ZONE_ADJUST("OnNoZoneAdjust"),
    @XmlEnumValue("OnNoOutputAdjust")
    ON_NO_OUTPUT_ADJUST("OnNoOutputAdjust"),
    @XmlEnumValue("OnNoZoneNoOutputAdjust")
    ON_NO_ZONE_NO_OUTPUT_ADJUST("OnNoZoneNoOutputAdjust");
    private final String value;

    PrimeOCRDeskew(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRDeskew fromValue(String v) {
        for (PrimeOCRDeskew c: PrimeOCRDeskew.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
