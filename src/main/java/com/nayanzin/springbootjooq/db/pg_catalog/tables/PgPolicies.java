/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgPoliciesRecord;

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
public class PgPolicies extends TableImpl<PgPoliciesRecord> {

    private static final long serialVersionUID = -1721298107;

    /**
     * The reference instance of <code>pg_catalog.pg_policies</code>
     */
    public static final PgPolicies PG_POLICIES = new PgPolicies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPoliciesRecord> getRecordType() {
        return PgPoliciesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public final TableField<PgPoliciesRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.tablename</code>.
     */
    public final TableField<PgPoliciesRecord, String> TABLENAME = createField("tablename", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.policyname</code>.
     */
    public final TableField<PgPoliciesRecord, String> POLICYNAME = createField("policyname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.permissive</code>.
     */
    public final TableField<PgPoliciesRecord, String> PERMISSIVE = createField("permissive", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.roles</code>.
     */
    public final TableField<PgPoliciesRecord, String[]> ROLES = createField("roles", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_policies.cmd</code>.
     */
    public final TableField<PgPoliciesRecord, String> CMD = createField("cmd", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.qual</code>.
     */
    public final TableField<PgPoliciesRecord, String> QUAL = createField("qual", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_policies.with_check</code>.
     */
    public final TableField<PgPoliciesRecord, String> WITH_CHECK = createField("with_check", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies() {
        this("pg_policies", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policies</code> table reference
     */
    public PgPolicies(String alias) {
        this(alias, PG_POLICIES);
    }

    private PgPolicies(String alias, Table<PgPoliciesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicies(String alias, Table<PgPoliciesRecord> aliased, Field<?>[] parameters) {
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
    public PgPolicies as(String alias) {
        return new PgPolicies(alias, this);
    }

    /**
     * Rename this table
     */
    public PgPolicies rename(String name) {
        return new PgPolicies(name, null);
    }
}
