/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgOpfamily;

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
public class PgOpfamilyRecord extends TableRecordImpl<PgOpfamilyRecord> implements Record4<Long, String, Long, Long> {

    private static final long serialVersionUID = 41029680;

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public void setOpfmethod(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfmethod</code>.
     */
    public Long getOpfmethod() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public void setOpfname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfname</code>.
     */
    public String getOpfname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public void setOpfnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfnamespace</code>.
     */
    public Long getOpfnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public void setOpfowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opfamily.opfowner</code>.
     */
    public Long getOpfowner() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgOpfamily.PG_OPFAMILY.OPFMETHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgOpfamily.PG_OPFAMILY.OPFNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgOpfamily.PG_OPFAMILY.OPFNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgOpfamily.PG_OPFAMILY.OPFOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getOpfmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOpfname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getOpfnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getOpfowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamilyRecord value1(Long value) {
        setOpfmethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamilyRecord value2(String value) {
        setOpfname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamilyRecord value3(Long value) {
        setOpfnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamilyRecord value4(Long value) {
        setOpfowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpfamilyRecord values(Long value1, String value2, Long value3, Long value4) {
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
     * Create a detached PgOpfamilyRecord
     */
    public PgOpfamilyRecord() {
        super(PgOpfamily.PG_OPFAMILY);
    }

    /**
     * Create a detached, initialised PgOpfamilyRecord
     */
    public PgOpfamilyRecord(Long opfmethod, String opfname, Long opfnamespace, Long opfowner) {
        super(PgOpfamily.PG_OPFAMILY);

        set(0, opfmethod);
        set(1, opfname);
        set(2, opfnamespace);
        set(3, opfowner);
    }
}
