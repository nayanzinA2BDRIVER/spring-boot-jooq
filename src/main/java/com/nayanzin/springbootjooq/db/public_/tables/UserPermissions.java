/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.enums.OrgType;
import com.nayanzin.springbootjooq.db.public_.tables.records.UserPermissionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class UserPermissions extends TableImpl<UserPermissionsRecord> {

    private static final long serialVersionUID = 1559436867;

    /**
     * The reference instance of <code>public.user_permissions</code>
     */
    public static final UserPermissions USER_PERMISSIONS = new UserPermissions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserPermissionsRecord> getRecordType() {
        return UserPermissionsRecord.class;
    }

    /**
     * The column <code>public.user_permissions.id</code>.
     */
    public final TableField<UserPermissionsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_permission_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.user_permissions.role_id</code>.
     */
    public final TableField<UserPermissionsRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_permissions.permission_id</code>.
     */
    public final TableField<UserPermissionsRecord, Integer> PERMISSION_ID = createField("permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_permissions.organization_type_id</code>.
     */
    public final TableField<UserPermissionsRecord, OrgType> ORGANIZATION_TYPE_ID = createField("organization_type_id", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.nayanzin.springbootjooq.db.public_.enums.OrgType.class), this, "");

    /**
     * Create a <code>public.user_permissions</code> table reference
     */
    public UserPermissions() {
        this("user_permissions", null);
    }

    /**
     * Create an aliased <code>public.user_permissions</code> table reference
     */
    public UserPermissions(String alias) {
        this(alias, USER_PERMISSIONS);
    }

    private UserPermissions(String alias, Table<UserPermissionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserPermissions(String alias, Table<UserPermissionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserPermissionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_PERMISSIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserPermissionsRecord> getPrimaryKey() {
        return Keys.USER_PERMISSIONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserPermissionsRecord>> getKeys() {
        return Arrays.<UniqueKey<UserPermissionsRecord>>asList(Keys.USER_PERMISSIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserPermissionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserPermissionsRecord, ?>>asList(Keys.USER_PERMISSIONS__FK_ROLE_ID, Keys.USER_PERMISSIONS__FK_PERMISSION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPermissions as(String alias) {
        return new UserPermissions(alias, this);
    }

    /**
     * Rename this table
     */
    public UserPermissions rename(String name) {
        return new UserPermissions(name, null);
    }
}
