/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgTsDictRecord;

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
public class PgTsDict extends TableImpl<PgTsDictRecord> {

    private static final long serialVersionUID = 130719667;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_dict</code>
     */
    public static final PgTsDict PG_TS_DICT = new PgTsDict();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsDictRecord> getRecordType() {
        return PgTsDictRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_dict.dictname</code>.
     */
    public final TableField<PgTsDictRecord, String> DICTNAME = createField("dictname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_dict.dictnamespace</code>.
     */
    public final TableField<PgTsDictRecord, Long> DICTNAMESPACE = createField("dictnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_dict.dictowner</code>.
     */
    public final TableField<PgTsDictRecord, Long> DICTOWNER = createField("dictowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_dict.dicttemplate</code>.
     */
    public final TableField<PgTsDictRecord, Long> DICTTEMPLATE = createField("dicttemplate", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_dict.dictinitoption</code>.
     */
    public final TableField<PgTsDictRecord, String> DICTINITOPTION = createField("dictinitoption", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_ts_dict</code> table reference
     */
    public PgTsDict() {
        this("pg_ts_dict", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_dict</code> table reference
     */
    public PgTsDict(String alias) {
        this(alias, PG_TS_DICT);
    }

    private PgTsDict(String alias, Table<PgTsDictRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsDict(String alias, Table<PgTsDictRecord> aliased, Field<?>[] parameters) {
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
    public PgTsDict as(String alias) {
        return new PgTsDict(alias, this);
    }

    /**
     * Rename this table
     */
    public PgTsDict rename(String name) {
        return new PgTsDict(name, null);
    }
}
