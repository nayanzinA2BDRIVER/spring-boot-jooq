/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.records;


import com.nayanzin.springbootjooq.db.public_.tables.CountryRegion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CountryRegionRecord extends UpdatableRecordImpl<CountryRegionRecord> implements Record6<Integer, Long, Timestamp, Timestamp, String, String> {

    private static final long serialVersionUID = 920489765;

    /**
     * Setter for <code>public.country_region.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.country_region.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.country_region.translation_id</code>.
     */
    public void setTranslationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.country_region.translation_id</code>.
     */
    public Long getTranslationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.country_region.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.country_region.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.country_region.modified_date</code>.
     */
    public void setModifiedDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.country_region.modified_date</code>.
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.country_region.created_user</code>.
     */
    public void setCreatedUser(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.country_region.created_user</code>.
     */
    public String getCreatedUser() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.country_region.modified_user</code>.
     */
    public void setModifiedUser(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.country_region.modified_user</code>.
     */
    public String getModifiedUser() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Long, Timestamp, Timestamp, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Long, Timestamp, Timestamp, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CountryRegion.COUNTRY_REGION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return CountryRegion.COUNTRY_REGION.TRANSLATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CountryRegion.COUNTRY_REGION.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CountryRegion.COUNTRY_REGION.MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CountryRegion.COUNTRY_REGION.CREATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CountryRegion.COUNTRY_REGION.MODIFIED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTranslationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getModifiedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord value2(Long value) {
        setTranslationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord value3(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord value4(Timestamp value) {
        setModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord value5(String value) {
        setCreatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord value6(String value) {
        setModifiedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRegionRecord values(Integer value1, Long value2, Timestamp value3, Timestamp value4, String value5, String value6) {
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
     * Create a detached CountryRegionRecord
     */
    public CountryRegionRecord() {
        super(CountryRegion.COUNTRY_REGION);
    }

    /**
     * Create a detached, initialised CountryRegionRecord
     */
    public CountryRegionRecord(Integer id, Long translationId, Timestamp createdDate, Timestamp modifiedDate, String createdUser, String modifiedUser) {
        super(CountryRegion.COUNTRY_REGION);

        set(0, id);
        set(1, translationId);
        set(2, createdDate);
        set(3, modifiedDate);
        set(4, createdUser);
        set(5, modifiedUser);
    }
}
