/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.ModelsRecord;

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
public class Models extends TableImpl<ModelsRecord> {

    private static final long serialVersionUID = 954193218;

    /**
     * The reference instance of <code>public.models</code>
     */
    public static final Models MODELS = new Models();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ModelsRecord> getRecordType() {
        return ModelsRecord.class;
    }

    /**
     * The column <code>public.models.id</code>.
     */
    public final TableField<ModelsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('models_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.models.name</code>.
     */
    public final TableField<ModelsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>public.models.brand_id</code>.
     */
    public final TableField<ModelsRecord, Integer> BRAND_ID = createField("brand_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.models.created_date</code>.
     */
    public final TableField<ModelsRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.models.modified_date</code>.
     */
    public final TableField<ModelsRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.models.created_user</code>.
     */
    public final TableField<ModelsRecord, String> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.field("\"current_user\"()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.models.modified_user</code>.
     */
    public final TableField<ModelsRecord, String> MODIFIED_USER = createField("modified_user", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>public.models.vehicle_type</code>.
     */
    public final TableField<ModelsRecord, Short> VEHICLE_TYPE = createField("vehicle_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.models.status</code>.
     */
    public final TableField<ModelsRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.models</code> table reference
     */
    public Models() {
        this("models", null);
    }

    /**
     * Create an aliased <code>public.models</code> table reference
     */
    public Models(String alias) {
        this(alias, MODELS);
    }

    private Models(String alias, Table<ModelsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Models(String alias, Table<ModelsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ModelsRecord, Long> getIdentity() {
        return Keys.IDENTITY_MODELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ModelsRecord> getPrimaryKey() {
        return Keys.MODELS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ModelsRecord>> getKeys() {
        return Arrays.<UniqueKey<ModelsRecord>>asList(Keys.MODELS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ModelsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ModelsRecord, ?>>asList(Keys.MODELS__FK_MODELS_BRANDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Models as(String alias) {
        return new Models(alias, this);
    }

    /**
     * Rename this table
     */
    public Models rename(String name) {
        return new Models(name, null);
    }
}
