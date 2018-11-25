/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgUserMappingRecord;

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
public class PgUserMapping extends TableImpl<PgUserMappingRecord> {

    private static final long serialVersionUID = -2056984154;

    /**
     * The reference instance of <code>pg_catalog.pg_user_mapping</code>
     */
    public static final PgUserMapping PG_USER_MAPPING = new PgUserMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgUserMappingRecord> getRecordType() {
        return PgUserMappingRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_user_mapping.umuser</code>.
     */
    public final TableField<PgUserMappingRecord, Long> UMUSER = createField("umuser", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_user_mapping.umserver</code>.
     */
    public final TableField<PgUserMappingRecord, Long> UMSERVER = createField("umserver", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_user_mapping.umoptions</code>.
     */
    public final TableField<PgUserMappingRecord, String[]> UMOPTIONS = createField("umoptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_user_mapping</code> table reference
     */
    public PgUserMapping() {
        this("pg_user_mapping", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_user_mapping</code> table reference
     */
    public PgUserMapping(String alias) {
        this(alias, PG_USER_MAPPING);
    }

    private PgUserMapping(String alias, Table<PgUserMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgUserMapping(String alias, Table<PgUserMappingRecord> aliased, Field<?>[] parameters) {
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
    public PgUserMapping as(String alias) {
        return new PgUserMapping(alias, this);
    }

    /**
     * Rename this table
     */
    public PgUserMapping rename(String name) {
        return new PgUserMapping(name, null);
    }
}