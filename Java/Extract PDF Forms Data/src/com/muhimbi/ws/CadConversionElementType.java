
package com.muhimbi.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CadConversionElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CadConversionElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllLayouts"/>
 *     &lt;enumeration value="NamedLayout"/>
 *     &lt;enumeration value="TopView"/>
 *     &lt;enumeration value="BottomView"/>
 *     &lt;enumeration value="LeftView"/>
 *     &lt;enumeration value="RightView"/>
 *     &lt;enumeration value="FrontView"/>
 *     &lt;enumeration value="BackView"/>
 *     &lt;enumeration value="SW_IsometricView"/>
 *     &lt;enumeration value="SE_IsometricView"/>
 *     &lt;enumeration value="NE_IsometricView"/>
 *     &lt;enumeration value="NW_IsometricView"/>
 *     &lt;enumeration value="NamedView"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CadConversionElementType", namespace = "http://schemas.datacontract.org/2004/07/Muhimbi.DocumentConverter.WebService.Data")
@XmlEnum
public enum CadConversionElementType {

    @XmlEnumValue("AllLayouts")
    ALL_LAYOUTS("AllLayouts"),
    @XmlEnumValue("NamedLayout")
    NAMED_LAYOUT("NamedLayout"),
    @XmlEnumValue("TopView")
    TOP_VIEW("TopView"),
    @XmlEnumValue("BottomView")
    BOTTOM_VIEW("BottomView"),
    @XmlEnumValue("LeftView")
    LEFT_VIEW("LeftView"),
    @XmlEnumValue("RightView")
    RIGHT_VIEW("RightView"),
    @XmlEnumValue("FrontView")
    FRONT_VIEW("FrontView"),
    @XmlEnumValue("BackView")
    BACK_VIEW("BackView"),
    @XmlEnumValue("SW_IsometricView")
    SW_ISOMETRIC_VIEW("SW_IsometricView"),
    @XmlEnumValue("SE_IsometricView")
    SE_ISOMETRIC_VIEW("SE_IsometricView"),
    @XmlEnumValue("NE_IsometricView")
    NE_ISOMETRIC_VIEW("NE_IsometricView"),
    @XmlEnumValue("NW_IsometricView")
    NW_ISOMETRIC_VIEW("NW_IsometricView"),
    @XmlEnumValue("NamedView")
    NAMED_VIEW("NamedView");
    private final String value;

    CadConversionElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CadConversionElementType fromValue(String v) {
        for (CadConversionElementType c: CadConversionElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
