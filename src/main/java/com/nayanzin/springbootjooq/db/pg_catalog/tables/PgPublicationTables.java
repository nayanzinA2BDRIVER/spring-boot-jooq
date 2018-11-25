/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgPublicationTablesRecord;

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
public class PgPublicationTables extends TableImpl<PgPublicationTablesRecord> {

    private static final long serialVersionUID = 2087095172;

    /**
     * The reference instance of <code>pg_catalog.pg_publication_tables</code>
     */
    public static final PgPublicationTables PG_PUBLICATION_TABLES = new PgPublicationTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPublicationTablesRecord> getRecordType() {
        return PgPublicationTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_tables.pubname</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> PUBNAME = createField("pubname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.schemaname</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_publication_tables.tablename</code>.
     */
    public final TableField<PgPublicationTablesRecord, String> TABLENAME = createField("tablename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>pg_catalog.pg_publication_tables</code> table reference
     */
    public PgPublicationTables() {
        this("pg_publication_tables", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_tables</code> table reference
     */
    public PgPublicationTables(String alias) {
        this(alias, PG_PUBLICATION_TABLES);
    }

    private PgPublicationTables(String alias, Table<PgPublicationTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationTables(String alias, Table<PgPublicationTablesRecord> aliased, Field<?>[] parameters) {
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
    public PgPublicationTables as(String alias) {
        return new PgPublicationTables(alias, this);
    }

    /**
     * Rename this table
     */
    public PgPublicationTables rename(String name) {
        return new PgPublicationTables(name, null);
    }
}
