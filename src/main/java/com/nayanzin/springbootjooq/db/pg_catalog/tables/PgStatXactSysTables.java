/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgStatXactSysTablesRecord;

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
public class PgStatXactSysTables extends TableImpl<PgStatXactSysTablesRecord> {

    private static final long serialVersionUID = -1859335662;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_sys_tables</code>
     */
    public static final PgStatXactSysTables PG_STAT_XACT_SYS_TABLES = new PgStatXactSysTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactSysTablesRecord> getRecordType() {
        return PgStatXactSysTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.relid</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.schemaname</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.relname</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.seq_scan</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> SEQ_SCAN = createField("seq_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> SEQ_TUP_READ = createField("seq_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.idx_scan</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_INS = createField("n_tup_ins", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_UPD = createField("n_tup_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_del</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_DEL = createField("n_tup_del", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_sys_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatXactSysTablesRecord, Long> N_TUP_HOT_UPD = createField("n_tup_hot_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_xact_sys_tables</code> table reference
     */
    public PgStatXactSysTables() {
        this("pg_stat_xact_sys_tables", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_sys_tables</code> table reference
     */
    public PgStatXactSysTables(String alias) {
        this(alias, PG_STAT_XACT_SYS_TABLES);
    }

    private PgStatXactSysTables(String alias, Table<PgStatXactSysTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactSysTables(String alias, Table<PgStatXactSysTablesRecord> aliased, Field<?>[] parameters) {
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
    public PgStatXactSysTables as(String alias) {
        return new PgStatXactSysTables(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatXactSysTables rename(String name) {
        return new PgStatXactSysTables(name, null);
    }
}