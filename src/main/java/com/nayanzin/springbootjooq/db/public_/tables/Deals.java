/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.enums.DealStatus;
import com.nayanzin.springbootjooq.db.public_.tables.records.DealsRecord;

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
public class Deals extends TableImpl<DealsRecord> {

    private static final long serialVersionUID = 1341489088;

    /**
     * The reference instance of <code>public.deals</code>
     */
    public static final Deals DEALS = new Deals();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DealsRecord> getRecordType() {
        return DealsRecord.class;
    }

    /**
     * The column <code>public.deals.id</code>.
     */
    public final TableField<DealsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('deals_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.deals.application_id</code>.
     */
    public final TableField<DealsRecord, Long> APPLICATION_ID = createField("application_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.deals.status</code>.
     */
    public final TableField<DealsRecord, DealStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.nayanzin.springbootjooq.db.public_.enums.DealStatus.class), this, "");

    /**
     * The column <code>public.deals.owner</code>.
     */
    public final TableField<DealsRecord, Long> OWNER = createField("owner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.deals.created_date</code>.
     */
    public final TableField<DealsRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.deals.modified_date</code>.
     */
    public final TableField<DealsRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.deals.created_user</code>.
     */
    public final TableField<DealsRecord, Long> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.deals.modified_user</code>.
     */
    public final TableField<DealsRecord, Long> MODIFIED_USER = createField("modified_user", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.deals.finish_date</code>.
     */
    public final TableField<DealsRecord, Timestamp> FINISH_DATE = createField("finish_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.deals.version</code>.
     */
    public final TableField<DealsRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.deals</code> table reference
     */
    public Deals() {
        this("deals", null);
    }

    /**
     * Create an aliased <code>public.deals</code> table reference
     */
    public Deals(String alias) {
        this(alias, DEALS);
    }

    private Deals(String alias, Table<DealsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Deals(String alias, Table<DealsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DealsRecord, Long> getIdentity() {
        return Keys.IDENTITY_DEALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DealsRecord> getPrimaryKey() {
        return Keys.DEALS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DealsRecord>> getKeys() {
        return Arrays.<UniqueKey<DealsRecord>>asList(Keys.DEALS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DealsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DealsRecord, ?>>asList(Keys.DEALS__FK_DEALS_APP_ID, Keys.DEALS__FK_OWNER_ORG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Deals as(String alias) {
        return new Deals(alias, this);
    }

    /**
     * Rename this table
     */
    public Deals rename(String name) {
        return new Deals(name, null);
    }
}