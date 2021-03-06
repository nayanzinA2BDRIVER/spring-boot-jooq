/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublication;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class PgPublicationRecord extends TableRecordImpl<PgPublicationRecord> implements Record7<String, Long, Boolean, Boolean, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = 2104455267;

    /**
     * Setter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    public void setPubname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubname</code>.
     */
    public String getPubname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public void setPubowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubowner</code>.
     */
    public Long getPubowner() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public void setPuballtables(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.puballtables</code>.
     */
    public Boolean getPuballtables() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public void setPubinsert(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubinsert</code>.
     */
    public Boolean getPubinsert() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public void setPubupdate(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubupdate</code>.
     */
    public Boolean getPubupdate() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public void setPubdelete(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubdelete</code>.
     */
    public Boolean getPubdelete() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    public void setPubtruncate(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication.pubtruncate</code>.
     */
    public Boolean getPubtruncate() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Boolean, Boolean, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Boolean, Boolean, Boolean, Boolean, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgPublication.PG_PUBLICATION.PUBNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgPublication.PG_PUBLICATION.PUBOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgPublication.PG_PUBLICATION.PUBALLTABLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgPublication.PG_PUBLICATION.PUBINSERT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgPublication.PG_PUBLICATION.PUBUPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgPublication.PG_PUBLICATION.PUBDELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgPublication.PG_PUBLICATION.PUBTRUNCATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPubname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPubowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getPuballtables();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getPubinsert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getPubupdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getPubdelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getPubtruncate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value1(String value) {
        setPubname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value2(Long value) {
        setPubowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value3(Boolean value) {
        setPuballtables(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value4(Boolean value) {
        setPubinsert(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value5(Boolean value) {
        setPubupdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value6(Boolean value) {
        setPubdelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord value7(Boolean value) {
        setPubtruncate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRecord values(String value1, Long value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPublicationRecord
     */
    public PgPublicationRecord() {
        super(PgPublication.PG_PUBLICATION);
    }

    /**
     * Create a detached, initialised PgPublicationRecord
     */
    public PgPublicationRecord(String pubname, Long pubowner, Boolean puballtables, Boolean pubinsert, Boolean pubupdate, Boolean pubdelete, Boolean pubtruncate) {
        super(PgPublication.PG_PUBLICATION);

        set(0, pubname);
        set(1, pubowner);
        set(2, puballtables);
        set(3, pubinsert);
        set(4, pubupdate);
        set(5, pubdelete);
        set(6, pubtruncate);
    }
}
