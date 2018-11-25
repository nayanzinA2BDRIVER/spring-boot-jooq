/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables;


import com.nayanzin.springbootjooq.db.pg_catalog.PgCatalog;
import com.nayanzin.springbootjooq.db.pg_catalog.tables.records.PgPolicyRecord;

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
public class PgPolicy extends TableImpl<PgPolicyRecord> {

    private static final long serialVersionUID = -233902529;

    /**
     * The reference instance of <code>pg_catalog.pg_policy</code>
     */
    public static final PgPolicy PG_POLICY = new PgPolicy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPolicyRecord> getRecordType() {
        return PgPolicyRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_policy.polname</code>.
     */
    public final TableField<PgPolicyRecord, String> POLNAME = createField("polname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polrelid</code>.
     */
    public final TableField<PgPolicyRecord, Long> POLRELID = createField("polrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polcmd</code>.
     */
    public final TableField<PgPolicyRecord, String> POLCMD = createField("polcmd", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polpermissive</code>.
     */
    public final TableField<PgPolicyRecord, Boolean> POLPERMISSIVE = createField("polpermissive", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polroles</code>.
     */
    public final TableField<PgPolicyRecord, Long[]> POLROLES = createField("polroles", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polqual</code>.
     */
    public final TableField<PgPolicyRecord, Object> POLQUAL = createField("polqual", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

    /**
     * The column <code>pg_catalog.pg_policy.polwithcheck</code>.
     */
    public final TableField<PgPolicyRecord, Object> POLWITHCHECK = createField("polwithcheck", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

    /**
     * Create a <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy() {
        this("pg_policy", null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_policy</code> table reference
     */
    public PgPolicy(String alias) {
        this(alias, PG_POLICY);
    }

    private PgPolicy(String alias, Table<PgPolicyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPolicy(String alias, Table<PgPolicyRecord> aliased, Field<?>[] parameters) {
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
    public PgPolicy as(String alias) {
        return new PgPolicy(alias, this);
    }

    /**
     * Rename this table
     */
    public PgPolicy rename(String name) {
        return new PgPolicy(name, null);
    }
}
