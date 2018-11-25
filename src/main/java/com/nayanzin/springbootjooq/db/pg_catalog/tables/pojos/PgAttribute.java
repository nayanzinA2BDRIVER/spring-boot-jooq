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
public class PgAttribute implements Serializable {

    private static final long serialVersionUID = -1225853456;

    private Long     attrelid;
    private String   attname;
    private Long     atttypid;
    private Integer  attstattarget;
    private Short    attlen;
    private Short    attnum;
    private Integer  attndims;
    private Integer  attcacheoff;
    private Integer  atttypmod;
    private Boolean  attbyval;
    private String   attstorage;
    private String   attalign;
    private Boolean  attnotnull;
    private Boolean  atthasdef;
    private Boolean  atthasmissing;
    private String   attidentity;
    private Boolean  attisdropped;
    private Boolean  attislocal;
    private Integer  attinhcount;
    private Long     attcollation;
    private String[] attacl;
    private String[] attoptions;
    private String[] attfdwoptions;
    private Object   attmissingval;

    public PgAttribute() {}

    public PgAttribute(PgAttribute value) {
        this.attrelid = value.attrelid;
        this.attname = value.attname;
        this.atttypid = value.atttypid;
        this.attstattarget = value.attstattarget;
        this.attlen = value.attlen;
        this.attnum = value.attnum;
        this.attndims = value.attndims;
        this.attcacheoff = value.attcacheoff;
        this.atttypmod = value.atttypmod;
        this.attbyval = value.attbyval;
        this.attstorage = value.attstorage;
        this.attalign = value.attalign;
        this.attnotnull = value.attnotnull;
        this.atthasdef = value.atthasdef;
        this.atthasmissing = value.atthasmissing;
        this.attidentity = value.attidentity;
        this.attisdropped = value.attisdropped;
        this.attislocal = value.attislocal;
        this.attinhcount = value.attinhcount;
        this.attcollation = value.attcollation;
        this.attacl = value.attacl;
        this.attoptions = value.attoptions;
        this.attfdwoptions = value.attfdwoptions;
        this.attmissingval = value.attmissingval;
    }

    public PgAttribute(
        Long     attrelid,
        String   attname,
        Long     atttypid,
        Integer  attstattarget,
        Short    attlen,
        Short    attnum,
        Integer  attndims,
        Integer  attcacheoff,
        Integer  atttypmod,
        Boolean  attbyval,
        String   attstorage,
        String   attalign,
        Boolean  attnotnull,
        Boolean  atthasdef,
        Boolean  atthasmissing,
        String   attidentity,
        Boolean  attisdropped,
        Boolean  attislocal,
        Integer  attinhcount,
        Long     attcollation,
        String[] attacl,
        String[] attoptions,
        String[] attfdwoptions,
        Object   attmissingval
    ) {
        this.attrelid = attrelid;
        this.attname = attname;
        this.atttypid = atttypid;
        this.attstattarget = attstattarget;
        this.attlen = attlen;
        this.attnum = attnum;
        this.attndims = attndims;
        this.attcacheoff = attcacheoff;
        this.atttypmod = atttypmod;
        this.attbyval = attbyval;
        this.attstorage = attstorage;
        this.attalign = attalign;
        this.attnotnull = attnotnull;
        this.atthasdef = atthasdef;
        this.atthasmissing = atthasmissing;
        this.attidentity = attidentity;
        this.attisdropped = attisdropped;
        this.attislocal = attislocal;
        this.attinhcount = attinhcount;
        this.attcollation = attcollation;
        this.attacl = attacl;
        this.attoptions = attoptions;
        this.attfdwoptions = attfdwoptions;
        this.attmissingval = attmissingval;
    }

    public Long getAttrelid() {
        return this.attrelid;
    }

    public void setAttrelid(Long attrelid) {
        this.attrelid = attrelid;
    }

    public String getAttname() {
        return this.attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public Long getAtttypid() {
        return this.atttypid;
    }

    public void setAtttypid(Long atttypid) {
        this.atttypid = atttypid;
    }

    public Integer getAttstattarget() {
        return this.attstattarget;
    }

    public void setAttstattarget(Integer attstattarget) {
        this.attstattarget = attstattarget;
    }

    public Short getAttlen() {
        return this.attlen;
    }

    public void setAttlen(Short attlen) {
        this.attlen = attlen;
    }

    public Short getAttnum() {
        return this.attnum;
    }

    public void setAttnum(Short attnum) {
        this.attnum = attnum;
    }

    public Integer getAttndims() {
        return this.attndims;
    }

    public void setAttndims(Integer attndims) {
        this.attndims = attndims;
    }

    public Integer getAttcacheoff() {
        return this.attcacheoff;
    }

    public void setAttcacheoff(Integer attcacheoff) {
        this.attcacheoff = attcacheoff;
    }

    public Integer getAtttypmod() {
        return this.atttypmod;
    }

    public void setAtttypmod(Integer atttypmod) {
        this.atttypmod = atttypmod;
    }

    public Boolean getAttbyval() {
        return this.attbyval;
    }

    public void setAttbyval(Boolean attbyval) {
        this.attbyval = attbyval;
    }

    public String getAttstorage() {
        return this.attstorage;
    }

    public void setAttstorage(String attstorage) {
        this.attstorage = attstorage;
    }

    public String getAttalign() {
        return this.attalign;
    }

    public void setAttalign(String attalign) {
        this.attalign = attalign;
    }

    public Boolean getAttnotnull() {
        return this.attnotnull;
    }

    public void setAttnotnull(Boolean attnotnull) {
        this.attnotnull = attnotnull;
    }

    public Boolean getAtthasdef() {
        return this.atthasdef;
    }

    public void setAtthasdef(Boolean atthasdef) {
        this.atthasdef = atthasdef;
    }

    public Boolean getAtthasmissing() {
        return this.atthasmissing;
    }

    public void setAtthasmissing(Boolean atthasmissing) {
        this.atthasmissing = atthasmissing;
    }

    public String getAttidentity() {
        return this.attidentity;
    }

    public void setAttidentity(String attidentity) {
        this.attidentity = attidentity;
    }

    public Boolean getAttisdropped() {
        return this.attisdropped;
    }

    public void setAttisdropped(Boolean attisdropped) {
        this.attisdropped = attisdropped;
    }

    public Boolean getAttislocal() {
        return this.attislocal;
    }

    public void setAttislocal(Boolean attislocal) {
        this.attislocal = attislocal;
    }

    public Integer getAttinhcount() {
        return this.attinhcount;
    }

    public void setAttinhcount(Integer attinhcount) {
        this.attinhcount = attinhcount;
    }

    public Long getAttcollation() {
        return this.attcollation;
    }

    public void setAttcollation(Long attcollation) {
        this.attcollation = attcollation;
    }

    public String[] getAttacl() {
        return this.attacl;
    }

    public void setAttacl(String[] attacl) {
        this.attacl = attacl;
    }

    public String[] getAttoptions() {
        return this.attoptions;
    }

    public void setAttoptions(String[] attoptions) {
        this.attoptions = attoptions;
    }

    public String[] getAttfdwoptions() {
        return this.attfdwoptions;
    }

    public void setAttfdwoptions(String[] attfdwoptions) {
        this.attfdwoptions = attfdwoptions;
    }

    public Object getAttmissingval() {
        return this.attmissingval;
    }

    public void setAttmissingval(Object attmissingval) {
        this.attmissingval = attmissingval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAttribute (");

        sb.append(attrelid);
        sb.append(", ").append(attname);
        sb.append(", ").append(atttypid);
        sb.append(", ").append(attstattarget);
        sb.append(", ").append(attlen);
        sb.append(", ").append(attnum);
        sb.append(", ").append(attndims);
        sb.append(", ").append(attcacheoff);
        sb.append(", ").append(atttypmod);
        sb.append(", ").append(attbyval);
        sb.append(", ").append(attstorage);
        sb.append(", ").append(attalign);
        sb.append(", ").append(attnotnull);
        sb.append(", ").append(atthasdef);
        sb.append(", ").append(atthasmissing);
        sb.append(", ").append(attidentity);
        sb.append(", ").append(attisdropped);
        sb.append(", ").append(attislocal);
        sb.append(", ").append(attinhcount);
        sb.append(", ").append(attcollation);
        sb.append(", ").append(Arrays.toString(attacl));
        sb.append(", ").append(Arrays.toString(attoptions));
        sb.append(", ").append(Arrays.toString(attfdwoptions));
        sb.append(", ").append(attmissingval);

        sb.append(")");
        return sb.toString();
    }
}
