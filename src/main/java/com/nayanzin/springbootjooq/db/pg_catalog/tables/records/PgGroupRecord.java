/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgGroup;

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
public class PgGroupRecord extends TableRecordImpl<PgGroupRecord> implements Record3<String, Long, Long[]> {

    private static final long serialVersionUID = 1800101759;

    /**
     * Setter for <code>pg_catalog.pg_group.groname</code>.
     */
    public void setGroname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_group.groname</code>.
     */
    public String getGroname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_group.grosysid</code>.
     */
    public void setGrosysid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_group.grosysid</code>.
     */
    public Long getGrosysid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_group.grolist</code>.
     */
    public void setGrolist(Long[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_group.grolist</code>.
     */
    public Long[] getGrolist() {
        return (Long[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgGroup.PG_GROUP.GRONAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgGroup.PG_GROUP.GROSYSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field3() {
        return PgGroup.PG_GROUP.GROLIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGroname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getGrosysid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value3() {
        return getGrolist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGroupRecord value1(String value) {
        setGroname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGroupRecord value2(Long value) {
        setGrosysid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGroupRecord value3(Long[] value) {
        setGrolist(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGroupRecord values(String value1, Long value2, Long[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGroupRecord
     */
    public PgGroupRecord() {
        super(PgGroup.PG_GROUP);
    }

    /**
     * Create a detached, initialised PgGroupRecord
     */
    public PgGroupRecord(String groname, Long grosysid, Long[] grolist) {
        super(PgGroup.PG_GROUP);

        set(0, groname);
        set(1, grosysid);
        set(2, grolist);
    }
}
