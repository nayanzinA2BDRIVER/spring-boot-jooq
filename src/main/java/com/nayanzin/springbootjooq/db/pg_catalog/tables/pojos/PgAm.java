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
public class PgAm implements Serializable {

    private static final long serialVersionUID = 555106039;

    private String amname;
    private String amhandler;
    private String amtype;

    public PgAm() {}

    public PgAm(PgAm value) {
        this.amname = value.amname;
        this.amhandler = value.amhandler;
        this.amtype = value.amtype;
    }

    public PgAm(
        String amname,
        String amhandler,
        String amtype
    ) {
        this.amname = amname;
        this.amhandler = amhandler;
        this.amtype = amtype;
    }

    public String getAmname() {
        return this.amname;
    }

    public void setAmname(String amname) {
        this.amname = amname;
    }

    public String getAmhandler() {
        return this.amhandler;
    }

    public void setAmhandler(String amhandler) {
        this.amhandler = amhandler;
    }

    public String getAmtype() {
        return this.amtype;
    }

    public void setAmtype(String amtype) {
        this.amtype = amtype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAm (");

        sb.append(amname);
        sb.append(", ").append(amhandler);
        sb.append(", ").append(amtype);

        sb.append(")");
        return sb.toString();
    }
}
