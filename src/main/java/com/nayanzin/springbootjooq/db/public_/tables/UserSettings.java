/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.UserSettingsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class UserSettings extends TableImpl<UserSettingsRecord> {

    private static final long serialVersionUID = -2114091935;

    /**
     * The reference instance of <code>public.user_settings</code>
     */
    public static final UserSettings USER_SETTINGS = new UserSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSettingsRecord> getRecordType() {
        return UserSettingsRecord.class;
    }

    /**
     * The column <code>public.user_settings.id</code>.
     */
    public final TableField<UserSettingsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.user_settings.data</code>.
     */
    public final TableField<UserSettingsRecord, Object> DATA = createField("data", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "");

    /**
     * The column <code>public.user_settings.created_date</code>.
     */
    public final TableField<UserSettingsRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.user_settings.modified_date</code>.
     */
    public final TableField<UserSettingsRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.user_settings.created_user</code>.
     */
    public final TableField<UserSettingsRecord, Long> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.user_settings.modified_user</code>.
     */
    public final TableField<UserSettingsRecord, Long> MODIFIED_USER = createField("modified_user", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.user_settings</code> table reference
     */
    public UserSettings() {
        this("user_settings", null);
    }

    /**
     * Create an aliased <code>public.user_settings</code> table reference
     */
    public UserSettings(String alias) {
        this(alias, USER_SETTINGS);
    }

    private UserSettings(String alias, Table<UserSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSettings(String alias, Table<UserSettingsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<UserSettingsRecord> getPrimaryKey() {
        return Keys.USER_SETTINGS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserSettingsRecord>> getKeys() {
        return Arrays.<UniqueKey<UserSettingsRecord>>asList(Keys.USER_SETTINGS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserSettingsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserSettingsRecord, ?>>asList(Keys.USER_SETTINGS__FK_USER_SETTINGS_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSettings as(String alias) {
        return new UserSettings(alias, this);
    }

    /**
     * Rename this table
     */
    public UserSettings rename(String name) {
        return new UserSettings(name, null);
    }
}
