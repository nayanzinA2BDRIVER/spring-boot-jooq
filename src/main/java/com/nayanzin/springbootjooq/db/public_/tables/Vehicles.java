/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.enums.VehStatus;
import com.nayanzin.springbootjooq.db.public_.tables.records.VehiclesRecord;

import java.math.BigDecimal;
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
 * Уникальный индекс по регистрационному знаку
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Vehicles extends TableImpl<VehiclesRecord> {

    private static final long serialVersionUID = -1623797907;

    /**
     * The reference instance of <code>public.vehicles</code>
     */
    public static final Vehicles VEHICLES = new Vehicles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VehiclesRecord> getRecordType() {
        return VehiclesRecord.class;
    }

    /**
     * The column <code>public.vehicles.id</code>.
     */
    public final TableField<VehiclesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vehicles_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.vehicles.model_id</code>.
     */
    public final TableField<VehiclesRecord, Long> MODEL_ID = createField("model_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.vehicles.branch_id</code>.
     */
    public final TableField<VehiclesRecord, Long> BRANCH_ID = createField("branch_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.vehicles.reg</code>.
     */
    public final TableField<VehiclesRecord, String> REG = createField("reg", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>public.vehicles.trailer_id</code>.
     */
    public final TableField<VehiclesRecord, Integer> TRAILER_ID = createField("trailer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.vehicles.created_date</code>.
     */
    public final TableField<VehiclesRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.vehicles.modified_date</code>.
     */
    public final TableField<VehiclesRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.vehicles.modified_user</code>.
     */
    public final TableField<VehiclesRecord, String> MODIFIED_USER = createField("modified_user", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>public.vehicles.shipping_status_code</code>.
     */
    public final TableField<VehiclesRecord, String> SHIPPING_STATUS_CODE = createField("shipping_status_code", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false).defaultValue(org.jooq.impl.DSL.field("'FREE'::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.vehicles.capacity</code>.
     */
    public final TableField<VehiclesRecord, BigDecimal> CAPACITY = createField("capacity", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 3), this, "");

    /**
     * The column <code>public.vehicles.capacity_unit</code>.
     */
    public final TableField<VehiclesRecord, Integer> CAPACITY_UNIT = createField("capacity_unit", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vehicles.volume</code>.
     */
    public final TableField<VehiclesRecord, BigDecimal> VOLUME = createField("volume", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 3), this, "");

    /**
     * The column <code>public.vehicles.volume_unit</code>.
     */
    public final TableField<VehiclesRecord, Integer> VOLUME_UNIT = createField("volume_unit", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vehicles.eco</code>.
     */
    public final TableField<VehiclesRecord, Integer> ECO = createField("eco", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vehicles.alias</code>.
     */
    public final TableField<VehiclesRecord, String> ALIAS = createField("alias", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>public.vehicles.created_user</code>.
     */
    public final TableField<VehiclesRecord, Long> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.vehicles.status</code>.
     */
    public final TableField<VehiclesRecord, VehStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.nayanzin.springbootjooq.db.public_.enums.VehStatus.class), this, "");

    /**
     * The column <code>public.vehicles.planned_waypoint_id</code>.
     */
    public final TableField<VehiclesRecord, Long> PLANNED_WAYPOINT_ID = createField("planned_waypoint_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.vehicles</code> table reference
     */
    public Vehicles() {
        this("vehicles", null);
    }

    /**
     * Create an aliased <code>public.vehicles</code> table reference
     */
    public Vehicles(String alias) {
        this(alias, VEHICLES);
    }

    private Vehicles(String alias, Table<VehiclesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vehicles(String alias, Table<VehiclesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Уникальный индекс по регистрационному знаку");
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
    public Identity<VehiclesRecord, Long> getIdentity() {
        return Keys.IDENTITY_VEHICLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VehiclesRecord> getPrimaryKey() {
        return Keys.VEHICLES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VehiclesRecord>> getKeys() {
        return Arrays.<UniqueKey<VehiclesRecord>>asList(Keys.VEHICLES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VehiclesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VehiclesRecord, ?>>asList(Keys.VEHICLES__FK_VEHICLES_MODELS, Keys.VEHICLES__FK_VEHICLES_BRANCHES, Keys.VEHICLES__FK_TRAILER_TYPES_BRANCHES, Keys.VEHICLES__FK_VEHICLES_SHIPPING_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vehicles as(String alias) {
        return new Vehicles(alias, this);
    }

    /**
     * Rename this table
     */
    public Vehicles rename(String name) {
        return new Vehicles(name, null);
    }
}