/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.BillingCountersRecord;

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
public class BillingCounters extends TableImpl<BillingCountersRecord> {

    private static final long serialVersionUID = -687865855;

    /**
     * The reference instance of <code>public.billing_counters</code>
     */
    public static final BillingCounters BILLING_COUNTERS = new BillingCounters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BillingCountersRecord> getRecordType() {
        return BillingCountersRecord.class;
    }

    /**
     * The column <code>public.billing_counters.id</code>.
     */
    public final TableField<BillingCountersRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('billing_counters_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.billing_counters.org_id</code>.
     */
    public final TableField<BillingCountersRecord, Long> ORG_ID = createField("org_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.billing_counters.counter</code>.
     */
    public final TableField<BillingCountersRecord, Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.billing_counters.type</code>.
     */
    public final TableField<BillingCountersRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>public.billing_counters.timestamp</code>.
     */
    public final TableField<BillingCountersRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.billing_counters</code> table reference
     */
    public BillingCounters() {
        this("billing_counters", null);
    }

    /**
     * Create an aliased <code>public.billing_counters</code> table reference
     */
    public BillingCounters(String alias) {
        this(alias, BILLING_COUNTERS);
    }

    private BillingCounters(String alias, Table<BillingCountersRecord> aliased) {
        this(alias, aliased, null);
    }

    private BillingCounters(String alias, Table<BillingCountersRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BillingCountersRecord, Long> getIdentity() {
        return Keys.IDENTITY_BILLING_COUNTERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BillingCountersRecord> getPrimaryKey() {
        return Keys.BILLING_COUNTERS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BillingCountersRecord>> getKeys() {
        return Arrays.<UniqueKey<BillingCountersRecord>>asList(Keys.BILLING_COUNTERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BillingCountersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BillingCountersRecord, ?>>asList(Keys.BILLING_COUNTERS__BILLING_COUNTERS_ORG_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingCounters as(String alias) {
        return new BillingCounters(alias, this);
    }

    /**
     * Rename this table
     */
    public BillingCounters rename(String name) {
        return new BillingCounters(name, null);
    }
}
