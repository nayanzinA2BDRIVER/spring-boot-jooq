/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgStatAllIndexesRecord;

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
public class PgStatAllIndexes extends TableImpl<PgStatAllIndexesRecord> {

    private static final long serialVersionUID = 2025934546;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_all_indexes</code>
     */
    public static final PgStatAllIndexes PG_STAT_ALL_INDEXES = new PgStatAllIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatAllIndexesRecord> getRecordType() {
        return PgStatAllIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.relid</code>.
     */
    public final TableField<PgStatAllIndexesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.indexrelid</code>.
     */
    public final TableField<PgStatAllIndexesRecord, Long> INDEXRELID = createField("indexrelid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.schemaname</code>.
     */
    public final TableField<PgStatAllIndexesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.relname</code>.
     */
    public final TableField<PgStatAllIndexesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.indexrelname</code>.
     */
    public final TableField<PgStatAllIndexesRecord, String> INDEXRELNAME = createField("indexrelname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.idx_scan</code>.
     */
    public final TableField<PgStatAllIndexesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.idx_tup_read</code>.
     */
    public final TableField<PgStatAllIndexesRecord, Long> IDX_TUP_READ = createField("idx_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_indexes.idx_tup_fetch</code>.
     */
    public final TableField<PgStatAllIndexesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_all_indexes</code> table reference
     */
    public PgStatAllIndexes() {
        this("pg_stat_all_indexes", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_all_indexes</code> table reference
     */
    public PgStatAllIndexes(String alias) {
        this(alias, PG_STAT_ALL_INDEXES);
    }

    private PgStatAllIndexes(String alias, Table<PgStatAllIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatAllIndexes(String alias, Table<PgStatAllIndexesRecord> aliased, Field<?>[] parameters) {
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
    public PgStatAllIndexes as(String alias) {
        return new PgStatAllIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatAllIndexes rename(String name) {
        return new PgStatAllIndexes(name, null);
    }
}
