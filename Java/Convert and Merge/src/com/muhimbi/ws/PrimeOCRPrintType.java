
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_PrintType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_PrintType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Machine"/>
 *     &lt;enumeration value="DotMatrix"/>
 *     &lt;enumeration value="MachineFixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_PrintType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRPrintType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Machine")
    MACHINE("Machine"),
    @XmlEnumValue("DotMatrix")
    DOT_MATRIX("DotMatrix"),
    @XmlEnumValue("MachineFixed")
    MACHINE_FIXED("MachineFixed");
    private final String value;

    PrimeOCRPrintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRPrintType fromValue(String v) {
        for (PrimeOCRPrintType c: PrimeOCRPrintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
