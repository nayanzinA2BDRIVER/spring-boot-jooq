/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgStatAllTablesRecord;

import java.sql.Timestamp;

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
public class PgStatAllTables extends TableImpl<PgStatAllTablesRecord> {

    private static final long serialVersionUID = 1223535313;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_all_tables</code>
     */
    public static final PgStatAllTables PG_STAT_ALL_TABLES = new PgStatAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatAllTablesRecord> getRecordType() {
        return PgStatAllTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.relid</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.schemaname</code>.
     */
    public final TableField<PgStatAllTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.relname</code>.
     */
    public final TableField<PgStatAllTablesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.seq_scan</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> SEQ_SCAN = createField("seq_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> SEQ_TUP_READ = createField("seq_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.idx_scan</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_TUP_INS = createField("n_tup_ins", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_TUP_UPD = createField("n_tup_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_TUP_DEL = createField("n_tup_del", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_TUP_HOT_UPD = createField("n_tup_hot_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_LIVE_TUP = createField("n_live_tup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_DEAD_TUP = createField("n_dead_tup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_mod_since_analyze</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> N_MOD_SINCE_ANALYZE = createField("n_mod_since_analyze", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>.
     */
    public final TableField<PgStatAllTablesRecord, Timestamp> LAST_VACUUM = createField("last_vacuum", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>.
     */
    public final TableField<PgStatAllTablesRecord, Timestamp> LAST_AUTOVACUUM = createField("last_autovacuum", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_analyze</code>.
     */
    public final TableField<PgStatAllTablesRecord, Timestamp> LAST_ANALYZE = createField("last_analyze", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>.
     */
    public final TableField<PgStatAllTablesRecord, Timestamp> LAST_AUTOANALYZE = createField("last_autoanalyze", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.vacuum_count</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> VACUUM_COUNT = createField("vacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.autovacuum_count</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> AUTOVACUUM_COUNT = createField("autovacuum_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.analyze_count</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> ANALYZE_COUNT = createField("analyze_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.autoanalyze_count</code>.
     */
    public final TableField<PgStatAllTablesRecord, Long> AUTOANALYZE_COUNT = createField("autoanalyze_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_all_tables</code> table reference
     */
    public PgStatAllTables() {
        this("pg_stat_all_tables", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_all_tables</code> table reference
     */
    public PgStatAllTables(String alias) {
        this(alias, PG_STAT_ALL_TABLES);
    }

    private PgStatAllTables(String alias, Table<PgStatAllTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatAllTables(String alias, Table<PgStatAllTablesRecord> aliased, Field<?>[] parameters) {
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
    public PgStatAllTables as(String alias) {
        return new PgStatAllTables(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatAllTables rename(String name) {
        return new PgStatAllTables(name, null);
    }
}
