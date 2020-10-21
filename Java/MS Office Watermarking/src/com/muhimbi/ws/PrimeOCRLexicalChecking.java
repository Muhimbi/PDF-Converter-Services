
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimeOCR_LexicalChecking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrimeOCR_LexicalChecking">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="NoLexical"/>
 *     &lt;enumeration value="Lexical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrimeOCR_LexicalChecking", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data.Enums.PrimeOCR")
@XmlEnum
public enum PrimeOCRLexicalChecking {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("NoLexical")
    NO_LEXICAL("NoLexical"),
    @XmlEnumValue("Lexical")
    LEXICAL("Lexical");
    private final String value;

    PrimeOCRLexicalChecking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimeOCRLexicalChecking fromValue(String v) {
        for (PrimeOCRLexicalChecking c: PrimeOCRLexicalChecking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
