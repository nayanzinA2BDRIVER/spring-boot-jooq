/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.records;


import com.nayanzin.springbootjooq.db.information_schema.tables.CollationCharacterSetApplicability;

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
public class CollationCharacterSetApplicabilityRecord extends TableRecordImpl<CollationCharacterSetApplicabilityRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 239849163;

    /**
     * Setter for <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public String getCharacterSetName() {
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
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCollationCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCollationSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCharacterSetCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCharacterSetSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord value1(String value) {
        setCollationCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord value2(String value) {
        setCollationSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord value3(String value) {
        setCollationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord value4(String value) {
        setCharacterSetCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord value5(String value) {
        setCharacterSetSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord value6(String value) {
        setCharacterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollationCharacterSetApplicabilityRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord() {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord(String collationCatalog, String collationSchema, String collationName, String characterSetCatalog, String characterSetSchema, String characterSetName) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        set(0, collationCatalog);
        set(1, collationSchema);
        set(2, collationName);
        set(3, characterSetCatalog);
        set(4, characterSetSchema);
        set(5, characterSetName);
    }
}
