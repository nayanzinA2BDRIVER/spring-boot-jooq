/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


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
public class PgTimezoneNames implements Serializable {

    private static final long serialVersionUID = 1968757885;

    private String  name;
    private String  abbrev;
    private Object  utcOffset;
    private Boolean isDst;

    public PgTimezoneNames() {}

    public PgTimezoneNames(PgTimezoneNames value) {
        this.name = value.name;
        this.abbrev = value.abbrev;
        this.utcOffset = value.utcOffset;
        this.isDst = value.isDst;
    }

    public PgTimezoneNames(
        String  name,
        String  abbrev,
        Object  utcOffset,
        Boolean isDst
    ) {
        this.name = name;
        this.abbrev = abbrev;
        this.utcOffset = utcOffset;
        this.isDst = isDst;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrev() {
        return this.abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public Object getUtcOffset() {
        return this.utcOffset;
    }

    public void setUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Boolean getIsDst() {
        return this.isDst;
    }

    public void setIsDst(Boolean isDst) {
        this.isDst = isDst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTimezoneNames (");

        sb.append(name);
        sb.append(", ").append(abbrev);
        sb.append(", ").append(utcOffset);
        sb.append(", ").append(isDst);

        sb.append(")");
        return sb.toString();
    }
}