/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgForeignServerRecord;

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
public class PgForeignServer extends TableImpl<PgForeignServerRecord> {

    private static final long serialVersionUID = -1141807885;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_server</code>
     */
    public static final PgForeignServer PG_FOREIGN_SERVER = new PgForeignServer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgForeignServerRecord> getRecordType() {
        return PgForeignServerRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public final TableField<PgForeignServerRecord, String> SRVNAME = createField("srvname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public final TableField<PgForeignServerRecord, Long> SRVOWNER = createField("srvowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public final TableField<PgForeignServerRecord, Long> SRVFDW = createField("srvfdw", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public final TableField<PgForeignServerRecord, String> SRVTYPE = createField("srvtype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public final TableField<PgForeignServerRecord, String> SRVVERSION = createField("srvversion", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public final TableField<PgForeignServerRecord, String[]> SRVACL = createField("srvacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public final TableField<PgForeignServerRecord, String[]> SRVOPTIONS = createField("srvoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_foreign_server</code> table reference
     */
    public PgForeignServer() {
        this("pg_foreign_server", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_server</code> table reference
     */
    public PgForeignServer(String alias) {
        this(alias, PG_FOREIGN_SERVER);
    }

    private PgForeignServer(String alias, Table<PgForeignServerRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignServer(String alias, Table<PgForeignServerRecord> aliased, Field<?>[] parameters) {
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
    public PgForeignServer as(String alias) {
        return new PgForeignServer(alias, this);
    }

    /**
     * Rename this table
     */
    public PgForeignServer rename(String name) {
        return new PgForeignServer(name, null);
    }
}
