//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.09 at 02:12:15 PM COT 
//


package com.mycompany.hr.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://mycompany.com/hr/schemas}Holiday"/>
 *         &lt;element ref="{http://mycompany.com/hr/schemas}Employee"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "holiday",
    "employee"
})
@XmlRootElement(name = "HolidayRequest")
public class HolidayRequest {

    @XmlElement(name = "Holiday", required = true)
    protected Holiday holiday;
    @XmlElement(name = "Employee", required = true)
    protected Employee employee;

    /**
     * Gets the value of the holiday property.
     * 
     * @return
     *     possible object is
     *     {@link Holiday }
     *     
     */
    public Holiday getHoliday() {
        return holiday;
    }

    /**
     * Sets the value of the holiday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holiday }
     *     
     */
    public void setHoliday(Holiday value) {
        this.holiday = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

}