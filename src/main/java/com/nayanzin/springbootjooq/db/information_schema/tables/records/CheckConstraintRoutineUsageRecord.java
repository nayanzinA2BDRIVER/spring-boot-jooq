/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.records;


import com.nayanzin.springbootjooq.db.information_schema.tables.CheckConstraintRoutineUsage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CheckConstraintRoutineUsageRecord extends TableRecordImpl<CheckConstraintRoutineUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = -1757476751;

    /**
     * Setter for <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.check_constraint_routine_usage.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.check_constraint_routine_usage.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.check_constraint_routine_usage.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.check_constraint_routine_usage.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.check_constraint_routine_usage.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.check_constraint_routine_usage.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.SPECIFIC_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.SPECIFIC_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE.SPECIFIC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSpecificCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSpecificSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSpecificName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord value4(String value) {
        setSpecificCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord value5(String value) {
        setSpecificSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord value6(String value) {
        setSpecificName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckConstraintRoutineUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckConstraintRoutineUsageRecord
     */
    public CheckConstraintRoutineUsageRecord() {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);
    }

    /**
     * Create a detached, initialised CheckConstraintRoutineUsageRecord
     */
    public CheckConstraintRoutineUsageRecord(String constraintCatalog, String constraintSchema, String constraintName, String specificCatalog, String specificSchema, String specificName) {
        super(CheckConstraintRoutineUsage.CHECK_CONSTRAINT_ROUTINE_USAGE);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, specificCatalog);
        set(4, specificSchema);
        set(5, specificName);
    }
}
