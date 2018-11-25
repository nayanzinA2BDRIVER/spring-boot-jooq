/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgStatioSysIndexesRecord;

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
public class PgStatioSysIndexes extends TableImpl<PgStatioSysIndexesRecord> {

    private static final long serialVersionUID = 1253766941;

    /**
     * The reference instance of <code>pg_catalog.pg_statio_sys_indexes</code>
     */
    public static final PgStatioSysIndexes PG_STATIO_SYS_INDEXES = new PgStatioSysIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatioSysIndexesRecord> getRecordType() {
        return PgStatioSysIndexesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.relid</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.indexrelid</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, Long> INDEXRELID = createField("indexrelid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.schemaname</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.relname</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.indexrelname</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, String> INDEXRELNAME = createField("indexrelname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.idx_blks_read</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, Long> IDX_BLKS_READ = createField("idx_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_statio_sys_indexes.idx_blks_hit</code>.
     */
    public final TableField<PgStatioSysIndexesRecord, Long> IDX_BLKS_HIT = createField("idx_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_statio_sys_indexes</code> table reference
     */
    public PgStatioSysIndexes() {
        this("pg_statio_sys_indexes", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_statio_sys_indexes</code> table reference
     */
    public PgStatioSysIndexes(String alias) {
        this(alias, PG_STATIO_SYS_INDEXES);
    }

    private PgStatioSysIndexes(String alias, Table<PgStatioSysIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatioSysIndexes(String alias, Table<PgStatioSysIndexesRecord> aliased, Field<?>[] parameters) {
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
    public PgStatioSysIndexes as(String alias) {
        return new PgStatioSysIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatioSysIndexes rename(String name) {
        return new PgStatioSysIndexes(name, null);
    }
}
