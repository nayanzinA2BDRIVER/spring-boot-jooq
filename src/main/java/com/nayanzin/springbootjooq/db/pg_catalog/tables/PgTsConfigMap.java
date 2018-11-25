/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgTsConfigMapRecord;

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
public class PgTsConfigMap extends TableImpl<PgTsConfigMapRecord> {

    private static final long serialVersionUID = 1569524115;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_config_map</code>
     */
    public static final PgTsConfigMap PG_TS_CONFIG_MAP = new PgTsConfigMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsConfigMapRecord> getRecordType() {
        return PgTsConfigMapRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapcfg</code>.
     */
    public final TableField<PgTsConfigMapRecord, Long> MAPCFG = createField("mapcfg", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config_map.maptokentype</code>.
     */
    public final TableField<PgTsConfigMapRecord, Integer> MAPTOKENTYPE = createField("maptokentype", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapseqno</code>.
     */
    public final TableField<PgTsConfigMapRecord, Integer> MAPSEQNO = createField("mapseqno", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config_map.mapdict</code>.
     */
    public final TableField<PgTsConfigMapRecord, Long> MAPDICT = createField("mapdict", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_ts_config_map</code> table reference
     */
    public PgTsConfigMap() {
        this("pg_ts_config_map", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config_map</code> table reference
     */
    public PgTsConfigMap(String alias) {
        this(alias, PG_TS_CONFIG_MAP);
    }

    private PgTsConfigMap(String alias, Table<PgTsConfigMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsConfigMap(String alias, Table<PgTsConfigMapRecord> aliased, Field<?>[] parameters) {
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
    public PgTsConfigMap as(String alias) {
        return new PgTsConfigMap(alias, this);
    }

    /**
     * Rename this table
     */
    public PgTsConfigMap rename(String name) {
        return new PgTsConfigMap(name, null);
    }
}
