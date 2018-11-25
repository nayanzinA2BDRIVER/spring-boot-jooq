/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgRangeRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class PgRange extends TableImpl<PgRangeRecord> {

    private static final long serialVersionUID = -1799278154;

    /**
     * The reference instance of <code>pg_catalog.pg_range</code>
     */
    public static final PgRange PG_RANGE = new PgRange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgRangeRecord> getRecordType() {
        return PgRangeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_range.rngtypid</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGTYPID = createField("rngtypid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubtype</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGSUBTYPE = createField("rngsubtype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngcollation</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGCOLLATION = createField("rngcollation", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubopc</code>.
     */
    public final TableField<PgRangeRecord, Long> RNGSUBOPC = createField("rngsubopc", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngcanonical</code>.
     */
    public final TableField<PgRangeRecord, String> RNGCANONICAL = createField("rngcanonical", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_range.rngsubdiff</code>.
     */
    public final TableField<PgRangeRecord, String> RNGSUBDIFF = createField("rngsubdiff", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange() {
        this("pg_range", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_range</code> table reference
     */
    public PgRange(String alias) {
        this(alias, PG_RANGE);
    }

    private PgRange(String alias, Table<PgRangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgRange(String alias, Table<PgRangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRange as(String alias) {
        return new PgRange(alias, this);
    }

    /**
     * Rename this table
     */
    public PgRange rename(String name) {
        return new PgRange(name, null);
    }
}
