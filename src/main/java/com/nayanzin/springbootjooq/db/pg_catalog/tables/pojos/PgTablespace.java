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
public class PgTablespace implements Serializable {

    private static final long serialVersionUID = -543666498;

    private String   spcname;
    private Long     spcowner;
    private String[] spcacl;
    private String[] spcoptions;

    public PgTablespace() {}

    public PgTablespace(PgTablespace value) {
        this.spcname = value.spcname;
        this.spcowner = value.spcowner;
        this.spcacl = value.spcacl;
        this.spcoptions = value.spcoptions;
    }

    public PgTablespace(
        String   spcname,
        Long     spcowner,
        String[] spcacl,
        String[] spcoptions
    ) {
        this.spcname = spcname;
        this.spcowner = spcowner;
        this.spcacl = spcacl;
        this.spcoptions = spcoptions;
    }

    public String getSpcname() {
        return this.spcname;
    }

    public void setSpcname(String spcname) {
        this.spcname = spcname;
    }

    public Long getSpcowner() {
        return this.spcowner;
    }

    public void setSpcowner(Long spcowner) {
        this.spcowner = spcowner;
    }

    public String[] getSpcacl() {
        return this.spcacl;
    }

    public void setSpcacl(String[] spcacl) {
        this.spcacl = spcacl;
    }

    public String[] getSpcoptions() {
        return this.spcoptions;
    }

    public void setSpcoptions(String[] spcoptions) {
        this.spcoptions = spcoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTablespace (");

        sb.append(spcname);
        sb.append(", ").append(spcowner);
        sb.append(", ").append(Arrays.toString(spcacl));
        sb.append(", ").append(Arrays.toString(spcoptions));

        sb.append(")");
        return sb.toString();
    }
}