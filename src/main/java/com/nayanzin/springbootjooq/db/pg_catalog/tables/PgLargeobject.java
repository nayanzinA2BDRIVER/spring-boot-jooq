/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgLargeobjectRecord;

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
public class PgLargeobject extends TableImpl<PgLargeobjectRecord> {

    private static final long serialVersionUID = -1923929804;

    /**
     * The reference instance of <code>pg_catalog.pg_largeobject</code>
     */
    public static final PgLargeobject PG_LARGEOBJECT = new PgLargeobject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLargeobjectRecord> getRecordType() {
        return PgLargeobjectRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_largeobject.loid</code>.
     */
    public final TableField<PgLargeobjectRecord, Long> LOID = createField("loid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject.pageno</code>.
     */
    public final TableField<PgLargeobjectRecord, Integer> PAGENO = createField("pageno", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject.data</code>.
     */
    public final TableField<PgLargeobjectRecord, byte[]> DATA = createField("data", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject() {
        this("pg_largeobject", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject</code> table reference
     */
    public PgLargeobject(String alias) {
        this(alias, PG_LARGEOBJECT);
    }

    private PgLargeobject(String alias, Table<PgLargeobjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLargeobject(String alias, Table<PgLargeobjectRecord> aliased, Field<?>[] parameters) {
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
    public PgLargeobject as(String alias) {
        return new PgLargeobject(alias, this);
    }

    /**
     * Rename this table
     */
    public PgLargeobject rename(String name) {
        return new PgLargeobject(name, null);
    }
}
