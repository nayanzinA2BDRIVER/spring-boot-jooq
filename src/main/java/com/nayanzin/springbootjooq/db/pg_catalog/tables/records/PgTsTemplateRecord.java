/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgTsTemplate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class PgTsTemplateRecord extends TableRecordImpl<PgTsTemplateRecord> implements Record4<String, Long, String, String> {

    private static final long serialVersionUID = -1019785509;

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public void setTmplname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public String getTmplname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public void setTmplnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public Long getTmplnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public void setTmplinit(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public String getTmplinit() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public void setTmpllexize(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public String getTmpllexize() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLINIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLLEXIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTmplname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTmplnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTmplinit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTmpllexize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplateRecord value1(String value) {
        setTmplname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplateRecord value2(Long value) {
        setTmplnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplateRecord value3(String value) {
        setTmplinit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplateRecord value4(String value) {
        setTmpllexize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplateRecord values(String value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTsTemplateRecord
     */
    public PgTsTemplateRecord() {
        super(PgTsTemplate.PG_TS_TEMPLATE);
    }

    /**
     * Create a detached, initialised PgTsTemplateRecord
     */
    public PgTsTemplateRecord(String tmplname, Long tmplnamespace, String tmplinit, String tmpllexize) {
        super(PgTsTemplate.PG_TS_TEMPLATE);

        set(0, tmplname);
        set(1, tmplnamespace);
        set(2, tmplinit);
        set(3, tmpllexize);
    }
}
