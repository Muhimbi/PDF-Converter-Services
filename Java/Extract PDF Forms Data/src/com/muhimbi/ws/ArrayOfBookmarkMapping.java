
package com.muhimbi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBookmarkMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookmarkMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookmarkMapping" type="{http://types.muhimbi.com/2010/11/22}BookmarkMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBookmarkMapping", namespace = "http://types.muhimbi.com/2010/11/22", propOrder = {
    "bookmarkMapping"
})
public class ArrayOfBookmarkMapping {

    @XmlElement(name = "BookmarkMapping", nillable = true)
    protected List<BookmarkMapping> bookmarkMapping;

    /**
     * Gets the value of the bookmarkMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookmarkMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookmarkMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookmarkMapping }
     * 
     * 
     */
    public List<BookmarkMapping> getBookmarkMapping() {
        if (bookmarkMapping == null) {
            bookmarkMapping = new ArrayList<BookmarkMapping>();
        }
        return this.bookmarkMapping;
    }

}
