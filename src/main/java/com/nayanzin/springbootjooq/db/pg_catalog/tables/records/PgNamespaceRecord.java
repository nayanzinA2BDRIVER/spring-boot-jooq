/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgNamespace;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PgNamespaceRecord extends TableRecordImpl<PgNamespaceRecord> implements Record3<String, Long, String[]> {

    private static final long serialVersionUID = 1018424836;

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public void setNspname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public String getNspname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public void setNspowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public Long getNspowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public void setNspacl(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public String[] getNspacl() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgNamespace.PG_NAMESPACE.NSPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgNamespace.PG_NAMESPACE.NSPOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field3() {
        return PgNamespace.PG_NAMESPACE.NSPACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getNspname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getNspowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value3() {
        return getNspacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value1(String value) {
        setNspname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value2(Long value) {
        setNspowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord value3(String[] value) {
        setNspacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgNamespaceRecord values(String value1, Long value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgNamespaceRecord
     */
    public PgNamespaceRecord() {
        super(PgNamespace.PG_NAMESPACE);
    }

    /**
     * Create a detached, initialised PgNamespaceRecord
     */
    public PgNamespaceRecord(String nspname, Long nspowner, String[] nspacl) {
        super(PgNamespace.PG_NAMESPACE);

        set(0, nspname);
        set(1, nspowner);
        set(2, nspacl);
    }
}
