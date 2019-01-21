
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_AccuracyLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_AccuracyLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Level1"/>
 *     &lt;enumeration value="Level2"/>
 *     &lt;enumeration value="Level3"/>
 *     &lt;enumeration value="Level4"/>
 *     &lt;enumeration value="Level5"/>
 *     &lt;enumeration value="Level6"/>
 *     &lt;enumeration value="Level7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_AccuracyLevel", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRAccuracyLevel {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Level1")
    LEVEL_1("Level1"),
    @XmlEnumValue("Level2")
    LEVEL_2("Level2"),
    @XmlEnumValue("Level3")
    LEVEL_3("Level3"),
    @XmlEnumValue("Level4")
    LEVEL_4("Level4"),
    @XmlEnumValue("Level5")
    LEVEL_5("Level5"),
    @XmlEnumValue("Level6")
    LEVEL_6("Level6"),
    @XmlEnumValue("Level7")
    LEVEL_7("Level7");
    private final String value;

    PrimeOCRAccuracyLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRAccuracyLevel fromValue(String v) {
        for (PrimeOCRAccuracyLevel c: PrimeOCRAccuracyLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
