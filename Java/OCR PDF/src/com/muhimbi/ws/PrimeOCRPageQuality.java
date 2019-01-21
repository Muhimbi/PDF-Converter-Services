
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_PageQuality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_PageQuality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="NormalQuality"/>
 *     &lt;enumeration value="LowQuality"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_PageQuality", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRPageQuality {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("NormalQuality")
    NORMAL_QUALITY("NormalQuality"),
    @XmlEnumValue("LowQuality")
    LOW_QUALITY("LowQuality");
    private final String value;

    PrimeOCRPageQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRPageQuality fromValue(String v) {
        for (PrimeOCRPageQuality c: PrimeOCRPageQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
