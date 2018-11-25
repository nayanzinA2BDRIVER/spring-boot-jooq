/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPartitionedTable;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgPartitionedTableRecord extends TableRecordImpl<PgPartitionedTableRecord> implements Record8<Long, String, Short, Long, Object[], Long[], Long[], Object> {

    private static final long serialVersionUID = -963586497;

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public void setPartrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partrelid</code>.
     */
    public Long getPartrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public void setPartstrat(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partstrat</code>.
     */
    public String getPartstrat() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public void setPartnatts(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partnatts</code>.
     */
    public Short getPartnatts() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partdefid</code>.
     */
    public void setPartdefid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partdefid</code>.
     */
    public Long getPartdefid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public void setPartattrs(Object[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partattrs</code>.
     */
    public Object[] getPartattrs() {
        return (Object[]) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public void setPartclass(Long[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partclass</code>.
     */
    public Long[] getPartclass() {
        return (Long[]) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public void setPartcollation(Long[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partcollation</code>.
     */
    public Long[] getPartcollation() {
        return (Long[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_partitioned_table.partexprs</code>.
     */
    public void setPartexprs(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partitioned_table.partexprs</code>.
     */
    public Object getPartexprs() {
        return (Object) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Short, Long, Object[], Long[], Long[], Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Short, Long, Object[], Long[], Long[], Object> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTSTRAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTNATTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTDEFID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object[]> field5() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTATTRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field6() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTCLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field7() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTCOLLATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field8() {
        return PgPartitionedTable.PG_PARTITIONED_TABLE.PARTEXPRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPartrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPartstrat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getPartnatts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getPartdefid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] value5() {
        return getPartattrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value6() {
        return getPartclass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value7() {
        return getPartcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value8() {
        return getPartexprs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value1(Long value) {
        setPartrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value2(String value) {
        setPartstrat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value3(Short value) {
        setPartnatts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value4(Long value) {
        setPartdefid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value5(Object[] value) {
        setPartattrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value6(Long[] value) {
        setPartclass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value7(Long[] value) {
        setPartcollation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord value8(Object value) {
        setPartexprs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPartitionedTableRecord values(Long value1, String value2, Short value3, Long value4, Object[] value5, Long[] value6, Long[] value7, Object value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPartitionedTableRecord
     */
    public PgPartitionedTableRecord() {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);
    }

    /**
     * Create a detached, initialised PgPartitionedTableRecord
     */
    public PgPartitionedTableRecord(Long partrelid, String partstrat, Short partnatts, Long partdefid, Object[] partattrs, Long[] partclass, Long[] partcollation, Object partexprs) {
        super(PgPartitionedTable.PG_PARTITIONED_TABLE);

        set(0, partrelid);
        set(1, partstrat);
        set(2, partnatts);
        set(3, partdefid);
        set(4, partattrs);
        set(5, partclass);
        set(6, partcollation);
        set(7, partexprs);
    }
}