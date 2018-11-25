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
public class PgNamespace implements Serializable {

    private static final long serialVersionUID = -2108769464;

    private String   nspname;
    private Long     nspowner;
    private String[] nspacl;

    public PgNamespace() {}

    public PgNamespace(PgNamespace value) {
        this.nspname = value.nspname;
        this.nspowner = value.nspowner;
        this.nspacl = value.nspacl;
    }

    public PgNamespace(
        String   nspname,
        Long     nspowner,
        String[] nspacl
    ) {
        this.nspname = nspname;
        this.nspowner = nspowner;
        this.nspacl = nspacl;
    }

    public String getNspname() {
        return this.nspname;
    }

    public void setNspname(String nspname) {
        this.nspname = nspname;
    }

    public Long getNspowner() {
        return this.nspowner;
    }

    public void setNspowner(Long nspowner) {
        this.nspowner = nspowner;
    }

    public String[] getNspacl() {
        return this.nspacl;
    }

    public void setNspacl(String[] nspacl) {
        this.nspacl = nspacl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgNamespace (");

        sb.append(nspname);
        sb.append(", ").append(nspowner);
        sb.append(", ").append(Arrays.toString(nspacl));

        sb.append(")");
        return sb.toString();
    }
}
