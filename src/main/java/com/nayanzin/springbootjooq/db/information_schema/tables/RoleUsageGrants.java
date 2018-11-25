/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables;


import com.nayanzin.springbootjooq.db.information_schema.InformationSchema;
import com.nayanzin.springbootjooq.db.information_schema.tables.records.RoleUsageGrantsRecord;

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
public class RoleUsageGrants extends TableImpl<RoleUsageGrantsRecord> {

    private static final long serialVersionUID = -180330958;

    /**
     * The reference instance of <code>information_schema.role_usage_grants</code>
     */
    public static final RoleUsageGrants ROLE_USAGE_GRANTS = new RoleUsageGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleUsageGrantsRecord> getRecordType() {
        return RoleUsageGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_usage_grants.grantor</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.grantee</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_catalog</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_CATALOG = createField("object_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_schema</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_name</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.object_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.privilege_type</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.role_usage_grants.is_grantable</code>.
     */
    public final TableField<RoleUsageGrantsRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * Create a <code>information_schema.role_usage_grants</code> table reference
     */
    public RoleUsageGrants() {
        this("role_usage_grants", null);
    }

    /**
     * Create an aliased <code>information_schema.role_usage_grants</code> table reference
     */
    public RoleUsageGrants(String alias) {
        this(alias, ROLE_USAGE_GRANTS);
    }

    private RoleUsageGrants(String alias, Table<RoleUsageGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUsageGrants(String alias, Table<RoleUsageGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleUsageGrants as(String alias) {
        return new RoleUsageGrants(alias, this);
    }

    /**
     * Rename this table
     */
    public RoleUsageGrants rename(String name) {
        return new RoleUsageGrants(name, null);
    }
}