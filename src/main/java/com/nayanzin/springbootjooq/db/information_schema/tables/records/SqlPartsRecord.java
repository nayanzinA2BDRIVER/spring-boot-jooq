/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.records;


import com.nayanzin.springbootjooq.db.information_schema.tables.SqlParts;

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
public class SqlPartsRecord extends TableRecordImpl<SqlPartsRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = -938001695;

    /**
     * Setter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public void setFeatureId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_id</code>.
     */
    public String getFeatureId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public void setFeatureName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.feature_name</code>.
     */
    public String getFeatureName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public void setIsSupported(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_supported</code>.
     */
    public String getIsSupported() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public void setIsVerifiedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.is_verified_by</code>.
     */
    public String getIsVerifiedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.sql_parts.comments</code>.
     */
    public void setComments(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sql_parts.comments</code>.
     */
    public String getComments() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SqlParts.SQL_PARTS.FEATURE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SqlParts.SQL_PARTS.FEATURE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SqlParts.SQL_PARTS.IS_SUPPORTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SqlParts.SQL_PARTS.IS_VERIFIED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SqlParts.SQL_PARTS.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFeatureId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFeatureName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIsSupported();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIsVerifiedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPartsRecord value1(String value) {
        setFeatureId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPartsRecord value2(String value) {
        setFeatureName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPartsRecord value3(String value) {
        setIsSupported(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPartsRecord value4(String value) {
        setIsVerifiedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPartsRecord value5(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPartsRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached SqlPartsRecord
     */
    public SqlPartsRecord() {
        super(SqlParts.SQL_PARTS);
    }

    /**
     * Create a detached, initialised SqlPartsRecord
     */
    public SqlPartsRecord(String featureId, String featureName, String isSupported, String isVerifiedBy, String comments) {
        super(SqlParts.SQL_PARTS);

        set(0, featureId);
        set(1, featureName);
        set(2, isSupported);
        set(3, isVerifiedBy);
        set(4, comments);
    }
}
