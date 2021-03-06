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
public class PgShdepend implements Serializable {

    private static final long serialVersionUID = 609258438;

    private Long    dbid;
    private Long    classid;
    private Long    objid;
    private Integer objsubid;
    private Long    refclassid;
    private Long    refobjid;
    private String  deptype;

    public PgShdepend() {}

    public PgShdepend(PgShdepend value) {
        this.dbid = value.dbid;
        this.classid = value.classid;
        this.objid = value.objid;
        this.objsubid = value.objsubid;
        this.refclassid = value.refclassid;
        this.refobjid = value.refobjid;
        this.deptype = value.deptype;
    }

    public PgShdepend(
        Long    dbid,
        Long    classid,
        Long    objid,
        Integer objsubid,
        Long    refclassid,
        Long    refobjid,
        String  deptype
    ) {
        this.dbid = dbid;
        this.classid = classid;
        this.objid = objid;
        this.objsubid = objsubid;
        this.refclassid = refclassid;
        this.refobjid = refobjid;
        this.deptype = deptype;
    }

    public Long getDbid() {
        return this.dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }

    public Long getClassid() {
        return this.classid;
    }

    public void setClassid(Long classid) {
        this.classid = classid;
    }

    public Long getObjid() {
        return this.objid;
    }

    public void setObjid(Long objid) {
        this.objid = objid;
    }

    public Integer getObjsubid() {
        return this.objsubid;
    }

    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    public Long getRefclassid() {
        return this.refclassid;
    }

    public void setRefclassid(Long refclassid) {
        this.refclassid = refclassid;
    }

    public Long getRefobjid() {
        return this.refobjid;
    }

    public void setRefobjid(Long refobjid) {
        this.refobjid = refobjid;
    }

    public String getDeptype() {
        return this.deptype;
    }

    public void setDeptype(String deptype) {
        this.deptype = deptype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgShdepend (");

        sb.append(dbid);
        sb.append(", ").append(classid);
        sb.append(", ").append(objid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(refclassid);
        sb.append(", ").append(refobjid);
        sb.append(", ").append(deptype);

        sb.append(")");
        return sb.toString();
    }
}
