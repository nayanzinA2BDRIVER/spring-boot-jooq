/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPreparedXacts;

import java.sql.Timestamp;

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
public class PgPreparedXactsRecord extends TableRecordImpl<PgPreparedXactsRecord> implements Record5<Long, String, Timestamp, String, String> {

    private static final long serialVersionUID = -1904510334;

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    public void setTransaction(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.transaction</code>.
     */
    public Long getTransaction() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    public void setGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.gid</code>.
     */
    public String getGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    public void setPrepared(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.prepared</code>.
     */
    public Timestamp getPrepared() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    public void setOwner(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.owner</code>.
     */
    public String getOwner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    public void setDatabase(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xacts.database</code>.
     */
    public String getDatabase() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Timestamp, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Timestamp, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgPreparedXacts.PG_PREPARED_XACTS.TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgPreparedXacts.PG_PREPARED_XACTS.GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return PgPreparedXacts.PG_PREPARED_XACTS.PREPARED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgPreparedXacts.PG_PREPARED_XACTS.OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgPreparedXacts.PG_PREPARED_XACTS.DATABASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getPrepared();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatabase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactsRecord value1(Long value) {
        setTransaction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactsRecord value2(String value) {
        setGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactsRecord value3(Timestamp value) {
        setPrepared(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactsRecord value4(String value) {
        setOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactsRecord value5(String value) {
        setDatabase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactsRecord values(Long value1, String value2, Timestamp value3, String value4, String value5) {
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
     * Create a detached PgPreparedXactsRecord
     */
    public PgPreparedXactsRecord() {
        super(PgPreparedXacts.PG_PREPARED_XACTS);
    }

    /**
     * Create a detached, initialised PgPreparedXactsRecord
     */
    public PgPreparedXactsRecord(Long transaction, String gid, Timestamp prepared, String owner, String database) {
        super(PgPreparedXacts.PG_PREPARED_XACTS);

        set(0, transaction);
        set(1, gid);
        set(2, prepared);
        set(3, owner);
        set(4, database);
    }
}
