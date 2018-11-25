/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgShadowRecord;

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
public class PgShadow extends TableImpl<PgShadowRecord> {

    private static final long serialVersionUID = -456057581;

    /**
     * The reference instance of <code>pg_catalog.pg_shadow</code>
     */
    public static final PgShadow PG_SHADOW = new PgShadow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShadowRecord> getRecordType() {
        return PgShadowRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_shadow.usename</code>.
     */
    public final TableField<PgShadowRecord, String> USENAME = createField("usename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usesysid</code>.
     */
    public final TableField<PgShadowRecord, Long> USESYSID = createField("usesysid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usecreatedb</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USECREATEDB = createField("usecreatedb", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usesuper</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USESUPER = createField("usesuper", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.userepl</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USEREPL = createField("userepl", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.usebypassrls</code>.
     */
    public final TableField<PgShadowRecord, Boolean> USEBYPASSRLS = createField("usebypassrls", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.passwd</code>.
     */
    public final TableField<PgShadowRecord, String> PASSWD = createField("passwd", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.valuntil</code>.
     */
    public final TableField<PgShadowRecord, Object> VALUNTIL = createField("valuntil", org.jooq.impl.DefaultDataType.getDefaultDataType("abstime"), this, "");

    /**
     * The column <code>pg_catalog.pg_shadow.useconfig</code>.
     */
    public final TableField<PgShadowRecord, String[]> USECONFIG = createField("useconfig", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_shadow</code> table reference
     */
    public PgShadow() {
        this("pg_shadow", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shadow</code> table reference
     */
    public PgShadow(String alias) {
        this(alias, PG_SHADOW);
    }

    private PgShadow(String alias, Table<PgShadowRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShadow(String alias, Table<PgShadowRecord> aliased, Field<?>[] parameters) {
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
    public PgShadow as(String alias) {
        return new PgShadow(alias, this);
    }

    /**
     * Rename this table
     */
    public PgShadow rename(String name) {
        return new PgShadow(name, null);
    }
}