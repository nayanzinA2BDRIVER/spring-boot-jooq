/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

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
public class PgUserMapping implements Serializable {

    private static final long serialVersionUID = 1689085765;

    private Long     umuser;
    private Long     umserver;
    private String[] umoptions;

    public PgUserMapping() {}

    public PgUserMapping(PgUserMapping value) {
        this.umuser = value.umuser;
        this.umserver = value.umserver;
        this.umoptions = value.umoptions;
    }

    public PgUserMapping(
        Long     umuser,
        Long     umserver,
        String[] umoptions
    ) {
        this.umuser = umuser;
        this.umserver = umserver;
        this.umoptions = umoptions;
    }

    public Long getUmuser() {
        return this.umuser;
    }

    public void setUmuser(Long umuser) {
        this.umuser = umuser;
    }

    public Long getUmserver() {
        return this.umserver;
    }

    public void setUmserver(Long umserver) {
        this.umserver = umserver;
    }

    public String[] getUmoptions() {
        return this.umoptions;
    }

    public void setUmoptions(String[] umoptions) {
        this.umoptions = umoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgUserMapping (");

        sb.append(umuser);
        sb.append(", ").append(umserver);
        sb.append(", ").append(Arrays.toString(umoptions));

        sb.append(")");
        return sb.toString();
    }
}
