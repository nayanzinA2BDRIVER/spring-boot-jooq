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
public class PgPolicy implements Serializable {

    private static final long serialVersionUID = -809592762;

    private String  polname;
    private Long    polrelid;
    private String  polcmd;
    private Boolean polpermissive;
    private Long[]  polroles;
    private Object  polqual;
    private Object  polwithcheck;

    public PgPolicy() {}

    public PgPolicy(PgPolicy value) {
        this.polname = value.polname;
        this.polrelid = value.polrelid;
        this.polcmd = value.polcmd;
        this.polpermissive = value.polpermissive;
        this.polroles = value.polroles;
        this.polqual = value.polqual;
        this.polwithcheck = value.polwithcheck;
    }

    public PgPolicy(
        String  polname,
        Long    polrelid,
        String  polcmd,
        Boolean polpermissive,
        Long[]  polroles,
        Object  polqual,
        Object  polwithcheck
    ) {
        this.polname = polname;
        this.polrelid = polrelid;
        this.polcmd = polcmd;
        this.polpermissive = polpermissive;
        this.polroles = polroles;
        this.polqual = polqual;
        this.polwithcheck = polwithcheck;
    }

    public String getPolname() {
        return this.polname;
    }

    public void setPolname(String polname) {
        this.polname = polname;
    }

    public Long getPolrelid() {
        return this.polrelid;
    }

    public void setPolrelid(Long polrelid) {
        this.polrelid = polrelid;
    }

    public String getPolcmd() {
        return this.polcmd;
    }

    public void setPolcmd(String polcmd) {
        this.polcmd = polcmd;
    }

    public Boolean getPolpermissive() {
        return this.polpermissive;
    }

    public void setPolpermissive(Boolean polpermissive) {
        this.polpermissive = polpermissive;
    }

    public Long[] getPolroles() {
        return this.polroles;
    }

    public void setPolroles(Long[] polroles) {
        this.polroles = polroles;
    }

    public Object getPolqual() {
        return this.polqual;
    }

    public void setPolqual(Object polqual) {
        this.polqual = polqual;
    }

    public Object getPolwithcheck() {
        return this.polwithcheck;
    }

    public void setPolwithcheck(Object polwithcheck) {
        this.polwithcheck = polwithcheck;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPolicy (");

        sb.append(polname);
        sb.append(", ").append(polrelid);
        sb.append(", ").append(polcmd);
        sb.append(", ").append(polpermissive);
        sb.append(", ").append(Arrays.toString(polroles));
        sb.append(", ").append(polqual);
        sb.append(", ").append(polwithcheck);

        sb.append(")");
        return sb.toString();
    }
}