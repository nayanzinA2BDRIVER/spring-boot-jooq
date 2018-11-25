/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.records;


import com.nayanzin.springbootjooq.db.information_schema.tables.TableConstraints;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TableConstraintsRecord extends TableRecordImpl<TableConstraintsRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1880073777;

    /**
     * Setter for <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.table_constraints.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.table_constraints.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.table_constraints.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.table_constraints.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.table_constraints.constraint_type</code>.
     */
    public void setConstraintType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.constraint_type</code>.
     */
    public String getConstraintType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public void setIsDeferrable(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.is_deferrable</code>.
     */
    public String getIsDeferrable() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public void setInitiallyDeferred(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.initially_deferred</code>.
     */
    public String getInitiallyDeferred() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.table_constraints.enforced</code>.
     */
    public void setEnforced(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.table_constraints.enforced</code>.
     */
    public String getEnforced() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TableConstraints.TABLE_CONSTRAINTS.IS_DEFERRABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TableConstraints.TABLE_CONSTRAINTS.INITIALLY_DEFERRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TableConstraints.TABLE_CONSTRAINTS.ENFORCED;
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
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getConstraintType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getIsDeferrable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getInitiallyDeferred();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getEnforced();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value6(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value7(String value) {
        setConstraintType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value8(String value) {
        setIsDeferrable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value9(String value) {
        setInitiallyDeferred(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord value10(String value) {
        setEnforced(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableConstraintsRecord
     */
    public TableConstraintsRecord() {
        super(TableConstraints.TABLE_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised TableConstraintsRecord
     */
    public TableConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableCatalog, String tableSchema, String tableName, String constraintType, String isDeferrable, String initiallyDeferred, String enforced) {
        super(TableConstraints.TABLE_CONSTRAINTS);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, tableCatalog);
        set(4, tableSchema);
        set(5, tableName);
        set(6, constraintType);
        set(7, isDeferrable);
        set(8, initiallyDeferred);
        set(9, enforced);
    }
}