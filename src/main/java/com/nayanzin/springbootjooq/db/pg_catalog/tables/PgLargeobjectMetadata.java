/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgLargeobjectMetadataRecord;

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
public class PgLargeobjectMetadata extends TableImpl<PgLargeobjectMetadataRecord> {

    private static final long serialVersionUID = -1929577429;

    /**
     * The reference instance of <code>pg_catalog.pg_largeobject_metadata</code>
     */
    public static final PgLargeobjectMetadata PG_LARGEOBJECT_METADATA = new PgLargeobjectMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLargeobjectMetadataRecord> getRecordType() {
        return PgLargeobjectMetadataRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.lomowner</code>.
     */
    public final TableField<PgLargeobjectMetadataRecord, Long> LOMOWNER = createField("lomowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_largeobject_metadata.lomacl</code>.
     */
    public final TableField<PgLargeobjectMetadataRecord, String[]> LOMACL = createField("lomacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_largeobject_metadata</code> table reference
     */
    public PgLargeobjectMetadata() {
        this("pg_largeobject_metadata", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_largeobject_metadata</code> table reference
     */
    public PgLargeobjectMetadata(String alias) {
        this(alias, PG_LARGEOBJECT_METADATA);
    }

    private PgLargeobjectMetadata(String alias, Table<PgLargeobjectMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLargeobjectMetadata(String alias, Table<PgLargeobjectMetadataRecord> aliased, Field<?>[] parameters) {
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
    public PgLargeobjectMetadata as(String alias) {
        return new PgLargeobjectMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    public PgLargeobjectMetadata rename(String name) {
        return new PgLargeobjectMetadata(name, null);
    }
}
