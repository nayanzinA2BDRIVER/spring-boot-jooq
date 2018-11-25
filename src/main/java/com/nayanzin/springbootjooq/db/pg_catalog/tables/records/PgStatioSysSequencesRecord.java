/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgStatioSysSequences;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PgStatioSysSequencesRecord extends TableRecordImpl<PgStatioSysSequencesRecord> implements Record5<Long, String, String, Long, Long> {

    private static final long serialVersionUID = -1525690917;

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_sequences.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_sequences.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_sequences.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_sequences.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_sequences.relname</code>.
     */
    public void setRelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_sequences.relname</code>.
     */
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_sequences.blks_read</code>.
     */
    public void setBlksRead(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_sequences.blks_read</code>.
     */
    public Long getBlksRead() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_sys_sequences.blks_hit</code>.
     */
    public void setBlksHit(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_sys_sequences.blks_hit</code>.
     */
    public Long getBlksHit() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES.RELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES.BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES.BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysSequencesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysSequencesRecord value2(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysSequencesRecord value3(String value) {
        setRelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysSequencesRecord value4(Long value) {
        setBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysSequencesRecord value5(Long value) {
        setBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioSysSequencesRecord values(Long value1, String value2, String value3, Long value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatioSysSequencesRecord
     */
    public PgStatioSysSequencesRecord() {
        super(PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES);
    }

    /**
     * Create a detached, initialised PgStatioSysSequencesRecord
     */
    public PgStatioSysSequencesRecord(Long relid, String schemaname, String relname, Long blksRead, Long blksHit) {
        super(PgStatioSysSequences.PG_STATIO_SYS_SEQUENCES);

        set(0, relid);
        set(1, schemaname);
        set(2, relname);
        set(3, blksRead);
        set(4, blksHit);
    }
}
