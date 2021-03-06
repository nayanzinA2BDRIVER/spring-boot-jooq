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
public class PgFileSettings implements Serializable {

    private static final long serialVersionUID = -1325144204;

    private String  sourcefile;
    private Integer sourceline;
    private Integer seqno;
    private String  name;
    private String  setting;
    private Boolean applied;
    private String  error;

    public PgFileSettings() {}

    public PgFileSettings(PgFileSettings value) {
        this.sourcefile = value.sourcefile;
        this.sourceline = value.sourceline;
        this.seqno = value.seqno;
        this.name = value.name;
        this.setting = value.setting;
        this.applied = value.applied;
        this.error = value.error;
    }

    public PgFileSettings(
        String  sourcefile,
        Integer sourceline,
        Integer seqno,
        String  name,
        String  setting,
        Boolean applied,
        String  error
    ) {
        this.sourcefile = sourcefile;
        this.sourceline = sourceline;
        this.seqno = seqno;
        this.name = name;
        this.setting = setting;
        this.applied = applied;
        this.error = error;
    }

    public String getSourcefile() {
        return this.sourcefile;
    }

    public void setSourcefile(String sourcefile) {
        this.sourcefile = sourcefile;
    }

    public Integer getSourceline() {
        return this.sourceline;
    }

    public void setSourceline(Integer sourceline) {
        this.sourceline = sourceline;
    }

    public Integer getSeqno() {
        return this.seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetting() {
        return this.setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public Boolean getApplied() {
        return this.applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgFileSettings (");

        sb.append(sourcefile);
        sb.append(", ").append(sourceline);
        sb.append(", ").append(seqno);
        sb.append(", ").append(name);
        sb.append(", ").append(setting);
        sb.append(", ").append(applied);
        sb.append(", ").append(error);

        sb.append(")");
        return sb.toString();
    }
}
