
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationsPrintOutputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationsPrintOutputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Slides"/>
 *     &lt;enumeration value="OneSlideHandouts"/>
 *     &lt;enumeration value="TwoSlideHandouts"/>
 *     &lt;enumeration value="ThreeSlideHandouts"/>
 *     &lt;enumeration value="FourSlideHandouts"/>
 *     &lt;enumeration value="SixSlideHandouts"/>
 *     &lt;enumeration value="NineSlideHandouts"/>
 *     &lt;enumeration value="NotesPages"/>
 *     &lt;enumeration value="Outline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PresentationsPrintOutputType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum PresentationsPrintOutputType {

    @XmlEnumValue("Slides")
    SLIDES("Slides"),
    @XmlEnumValue("OneSlideHandouts")
    ONE_SLIDE_HANDOUTS("OneSlideHandouts"),
    @XmlEnumValue("TwoSlideHandouts")
    TWO_SLIDE_HANDOUTS("TwoSlideHandouts"),
    @XmlEnumValue("ThreeSlideHandouts")
    THREE_SLIDE_HANDOUTS("ThreeSlideHandouts"),
    @XmlEnumValue("FourSlideHandouts")
    FOUR_SLIDE_HANDOUTS("FourSlideHandouts"),
    @XmlEnumValue("SixSlideHandouts")
    SIX_SLIDE_HANDOUTS("SixSlideHandouts"),
    @XmlEnumValue("NineSlideHandouts")
    NINE_SLIDE_HANDOUTS("NineSlideHandouts"),
    @XmlEnumValue("NotesPages")
    NOTES_PAGES("NotesPages"),
    @XmlEnumValue("Outline")
    OUTLINE("Outline");
    private final String value;

    PresentationsPrintOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationsPrintOutputType fromValue(String v) {
        for (PresentationsPrintOutputType c: PresentationsPrintOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
