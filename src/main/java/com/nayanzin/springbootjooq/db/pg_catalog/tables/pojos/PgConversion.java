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
public class PgConversion implements Serializable {

    private static final long serialVersionUID = 1670978138;

    private String  conname;
    private Long    connamespace;
    private Long    conowner;
    private Integer conforencoding;
    private Integer contoencoding;
    private String  conproc;
    private Boolean condefault;

    public PgConversion() {}

    public PgConversion(PgConversion value) {
        this.conname = value.conname;
        this.connamespace = value.connamespace;
        this.conowner = value.conowner;
        this.conforencoding = value.conforencoding;
        this.contoencoding = value.contoencoding;
        this.conproc = value.conproc;
        this.condefault = value.condefault;
    }

    public PgConversion(
        String  conname,
        Long    connamespace,
        Long    conowner,
        Integer conforencoding,
        Integer contoencoding,
        String  conproc,
        Boolean condefault
    ) {
        this.conname = conname;
        this.connamespace = connamespace;
        this.conowner = conowner;
        this.conforencoding = conforencoding;
        this.contoencoding = contoencoding;
        this.conproc = conproc;
        this.condefault = condefault;
    }

    public String getConname() {
        return this.conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public Long getConnamespace() {
        return this.connamespace;
    }

    public void setConnamespace(Long connamespace) {
        this.connamespace = connamespace;
    }

    public Long getConowner() {
        return this.conowner;
    }

    public void setConowner(Long conowner) {
        this.conowner = conowner;
    }

    public Integer getConforencoding() {
        return this.conforencoding;
    }

    public void setConforencoding(Integer conforencoding) {
        this.conforencoding = conforencoding;
    }

    public Integer getContoencoding() {
        return this.contoencoding;
    }

    public void setContoencoding(Integer contoencoding) {
        this.contoencoding = contoencoding;
    }

    public String getConproc() {
        return this.conproc;
    }

    public void setConproc(String conproc) {
        this.conproc = conproc;
    }

    public Boolean getCondefault() {
        return this.condefault;
    }

    public void setCondefault(Boolean condefault) {
        this.condefault = condefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgConversion (");

        sb.append(conname);
        sb.append(", ").append(connamespace);
        sb.append(", ").append(conowner);
        sb.append(", ").append(conforencoding);
        sb.append(", ").append(contoencoding);
        sb.append(", ").append(conproc);
        sb.append(", ").append(condefault);

        sb.append(")");
        return sb.toString();
    }
}
