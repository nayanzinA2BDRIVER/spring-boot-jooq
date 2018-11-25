/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.ApplicationWaypointsRecord;

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
public class ApplicationWaypoints extends TableImpl<ApplicationWaypointsRecord> {

    private static final long serialVersionUID = 2067435927;

    /**
     * The reference instance of <code>public.application_waypoints</code>
     */
    public static final ApplicationWaypoints APPLICATION_WAYPOINTS = new ApplicationWaypoints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationWaypointsRecord> getRecordType() {
        return ApplicationWaypointsRecord.class;
    }

    /**
     * The column <code>public.application_waypoints.id</code>.
     */
    public final TableField<ApplicationWaypointsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('application_waypoints_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.application_waypoints.application_id</code>.
     */
    public final TableField<ApplicationWaypointsRecord, Long> APPLICATION_ID = createField("application_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.application_waypoints.route_waypoint_id</code>.
     */
    public final TableField<ApplicationWaypointsRecord, Long> ROUTE_WAYPOINT_ID = createField("route_waypoint_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.application_waypoints</code> table reference
     */
    public ApplicationWaypoints() {
        this("application_waypoints", null);
    }

    /**
     * Create an aliased <code>public.application_waypoints</code> table reference
     */
    public ApplicationWaypoints(String alias) {
        this(alias, APPLICATION_WAYPOINTS);
    }

    private ApplicationWaypoints(String alias, Table<ApplicationWaypointsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ApplicationWaypoints(String alias, Table<ApplicationWaypointsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ApplicationWaypointsRecord, Long> getIdentity() {
        return Keys.IDENTITY_APPLICATION_WAYPOINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationWaypointsRecord> getPrimaryKey() {
        return Keys.APPLICATION_WAYPOINTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationWaypointsRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationWaypointsRecord>>asList(Keys.APPLICATION_WAYPOINTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApplicationWaypointsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApplicationWaypointsRecord, ?>>asList(Keys.APPLICATION_WAYPOINTS__FK_APPLICATION_WAYPOINTS_APPLICATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationWaypoints as(String alias) {
        return new ApplicationWaypoints(alias, this);
    }

    /**
     * Rename this table
     */
    public ApplicationWaypoints rename(String name) {
        return new ApplicationWaypoints(name, null);
    }
}