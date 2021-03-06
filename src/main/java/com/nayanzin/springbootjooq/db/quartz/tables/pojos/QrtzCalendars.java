/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.quartz.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzCalendars implements Serializable {

    private static final long serialVersionUID = 581675474;

    private String schedName;
    private String calendarName;
    private byte[] calendar;

    public QrtzCalendars() {}

    public QrtzCalendars(QrtzCalendars value) {
        this.schedName = value.schedName;
        this.calendarName = value.calendarName;
        this.calendar = value.calendar;
    }

    public QrtzCalendars(
        String schedName,
        String calendarName,
        byte[] calendar
    ) {
        this.schedName = schedName;
        this.calendarName = calendarName;
        this.calendar = calendar;
    }

    public String getSchedName() {
        return this.schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getCalendarName() {
        return this.calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public byte[] getCalendar() {
        return this.calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QrtzCalendars (");

        sb.append(schedName);
        sb.append(", ").append(calendarName);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
