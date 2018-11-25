/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgStatXactAllTablesRecord;

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
public class PgStatXactAllTables extends TableImpl<PgStatXactAllTablesRecord> {

    private static final long serialVersionUID = 2109151070;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_all_tables</code>
     */
    public static final PgStatXactAllTables PG_STAT_XACT_ALL_TABLES = new PgStatXactAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactAllTablesRecord> getRecordType() {
        return PgStatXactAllTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> RELID = createField("relid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> SEQ_SCAN = createField("seq_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> SEQ_TUP_READ = createField("seq_tup_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> IDX_SCAN = createField("idx_scan", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> IDX_TUP_FETCH = createField("idx_tup_fetch", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_INS = createField("n_tup_ins", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_UPD = createField("n_tup_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_DEL = createField("n_tup_del", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_HOT_UPD = createField("n_tup_hot_upd", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_xact_all_tables</code> table reference
     */
    public PgStatXactAllTables() {
        this("pg_stat_xact_all_tables", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table reference
     */
    public PgStatXactAllTables(String alias) {
        this(alias, PG_STAT_XACT_ALL_TABLES);
    }

    private PgStatXactAllTables(String alias, Table<PgStatXactAllTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactAllTables(String alias, Table<PgStatXactAllTablesRecord> aliased, Field<?>[] parameters) {
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
    public PgStatXactAllTables as(String alias) {
        return new PgStatXactAllTables(alias, this);
    }

    /**
     * Rename this table
     */
    public PgStatXactAllTables rename(String name) {
        return new PgStatXactAllTables(name, null);
    }
}
