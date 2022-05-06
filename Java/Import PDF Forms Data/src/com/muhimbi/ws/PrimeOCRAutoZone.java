
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_AutoZone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_AutoZone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="NoAutoZone"/>
 *     &lt;enumeration value="Segment"/>
 *     &lt;enumeration value="Zone"/>
 *     &lt;enumeration value="CGS"/>
 *     &lt;enumeration value="SegmentImageText"/>
 *     &lt;enumeration value="ZoneImageText"/>
 *     &lt;enumeration value="NClips"/>
 *     &lt;enumeration value="Objects"/>
 *     &lt;enumeration value="ObjectsEngineering"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_AutoZone", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRAutoZone {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("NoAutoZone")
    NO_AUTO_ZONE("NoAutoZone"),
    @XmlEnumValue("Segment")
    SEGMENT("Segment"),
    @XmlEnumValue("Zone")
    ZONE("Zone"),
    CGS("CGS"),
    @XmlEnumValue("SegmentImageText")
    SEGMENT_IMAGE_TEXT("SegmentImageText"),
    @XmlEnumValue("ZoneImageText")
    ZONE_IMAGE_TEXT("ZoneImageText"),
    @XmlEnumValue("NClips")
    N_CLIPS("NClips"),
    @XmlEnumValue("Objects")
    OBJECTS("Objects"),
    @XmlEnumValue("ObjectsEngineering")
    OBJECTS_ENGINEERING("ObjectsEngineering");
    private final String value;

    PrimeOCRAutoZone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRAutoZone fromValue(String v) {
        for (PrimeOCRAutoZone c: PrimeOCRAutoZone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
