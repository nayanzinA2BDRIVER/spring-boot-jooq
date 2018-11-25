/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.UserRolesRecord;

import java.sql.Timestamp;
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
public class UserRoles extends TableImpl<UserRolesRecord> {

    private static final long serialVersionUID = -631635808;

    /**
     * The reference instance of <code>public.user_roles</code>
     */
    public static final UserRoles USER_ROLES = new UserRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRolesRecord> getRecordType() {
        return UserRolesRecord.class;
    }

    /**
     * The column <code>public.user_roles.id</code>.
     */
    public final TableField<UserRolesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_roles_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.user_roles.user_id</code>.
     */
    public final TableField<UserRolesRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.user_roles.role_id</code>.
     */
    public final TableField<UserRolesRecord, Long> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.user_roles.created_date</code>.
     */
    public final TableField<UserRolesRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.user_roles.modified_date</code>.
     */
    public final TableField<UserRolesRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.user_roles.created_user</code>.
     */
    public final TableField<UserRolesRecord, String> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.field("\"current_user\"()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.user_roles.modified_user</code>.
     */
    public final TableField<UserRolesRecord, String> MODIFIED_USER = createField("modified_user", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * Create a <code>public.user_roles</code> table reference
     */
    public UserRoles() {
        this("user_roles", null);
    }

    /**
     * Create an aliased <code>public.user_roles</code> table reference
     */
    public UserRoles(String alias) {
        this(alias, USER_ROLES);
    }

    private UserRoles(String alias, Table<UserRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoles(String alias, Table<UserRolesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserRolesRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER_ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRolesRecord> getPrimaryKey() {
        return Keys.USER_ROLES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRolesRecord>>asList(Keys.USER_ROLES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserRolesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRolesRecord, ?>>asList(Keys.USER_ROLES__FK_USER_ROLES_USERS, Keys.USER_ROLES__FK_USER_ROLES_ROLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoles as(String alias) {
        return new UserRoles(alias, this);
    }

    /**
     * Rename this table
     */
    public UserRoles rename(String name) {
        return new UserRoles(name, null);
    }
}