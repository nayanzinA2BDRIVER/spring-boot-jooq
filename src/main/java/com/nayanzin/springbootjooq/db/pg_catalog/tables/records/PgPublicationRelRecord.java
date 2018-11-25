/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgPublicationRel;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class PgPublicationRelRecord extends TableRecordImpl<PgPublicationRelRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1940999362;

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public void setPrpubid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public Long getPrpubid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public void setPrrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public Long getPrrelid() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgPublicationRel.PG_PUBLICATION_REL.PRPUBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgPublicationRel.PG_PUBLICATION_REL.PRRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPrpubid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPrrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRelRecord value1(Long value) {
        setPrpubid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRelRecord value2(Long value) {
        setPrrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRelRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPublicationRelRecord
     */
    public PgPublicationRelRecord() {
        super(PgPublicationRel.PG_PUBLICATION_REL);
    }

    /**
     * Create a detached, initialised PgPublicationRelRecord
     */
    public PgPublicationRelRecord(Long prpubid, Long prrelid) {
        super(PgPublicationRel.PG_PUBLICATION_REL);

        set(0, prpubid);
        set(1, prrelid);
    }
}
