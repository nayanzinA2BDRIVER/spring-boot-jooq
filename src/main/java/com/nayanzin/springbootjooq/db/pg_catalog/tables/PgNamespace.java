/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgNamespaceRecord;

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
public class PgNamespace extends TableImpl<PgNamespaceRecord> {

    private static final long serialVersionUID = -863065916;

    /**
     * The reference instance of <code>pg_catalog.pg_namespace</code>
     */
    public static final PgNamespace PG_NAMESPACE = new PgNamespace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgNamespaceRecord> getRecordType() {
        return PgNamespaceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public final TableField<PgNamespaceRecord, String> NSPNAME = createField("nspname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public final TableField<PgNamespaceRecord, Long> NSPOWNER = createField("nspowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public final TableField<PgNamespaceRecord, String[]> NSPACL = createField("nspacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace() {
        this("pg_namespace", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace(String alias) {
        this(alias, PG_NAMESPACE);
    }

    private PgNamespace(String alias, Table<PgNamespaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgNamespace(String alias, Table<PgNamespaceRecord> aliased, Field<?>[] parameters) {
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
    public PgNamespace as(String alias) {
        return new PgNamespace(alias, this);
    }

    /**
     * Rename this table
     */
    public PgNamespace rename(String name) {
        return new PgNamespace(name, null);
    }
}