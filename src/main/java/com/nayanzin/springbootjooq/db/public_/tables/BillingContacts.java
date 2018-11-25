/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.BillingContactsRecord;

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
public class BillingContacts extends TableImpl<BillingContactsRecord> {

    private static final long serialVersionUID = -1012782682;

    /**
     * The reference instance of <code>public.billing_contacts</code>
     */
    public static final BillingContacts BILLING_CONTACTS = new BillingContacts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BillingContactsRecord> getRecordType() {
        return BillingContactsRecord.class;
    }

    /**
     * The column <code>public.billing_contacts.id</code>.
     */
    public final TableField<BillingContactsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('billing_contacts_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.billing_contacts.org_id</code>.
     */
    public final TableField<BillingContactsRecord, Long> ORG_ID = createField("org_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.billing_contacts.open_org_id</code>.
     */
    public final TableField<BillingContactsRecord, Long> OPEN_ORG_ID = createField("open_org_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.billing_contacts.vehicle_id</code>.
     */
    public final TableField<BillingContactsRecord, Long> VEHICLE_ID = createField("vehicle_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.billing_contacts.vehicle_open_date</code>.
     */
    public final TableField<BillingContactsRecord, Timestamp> VEHICLE_OPEN_DATE = createField("vehicle_open_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.billing_contacts.deal_id</code>.
     */
    public final TableField<BillingContactsRecord, Long> DEAL_ID = createField("deal_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.billing_contacts.deal_open_date</code>.
     */
    public final TableField<BillingContactsRecord, Timestamp> DEAL_OPEN_DATE = createField("deal_open_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.billing_contacts</code> table reference
     */
    public BillingContacts() {
        this("billing_contacts", null);
    }

    /**
     * Create an aliased <code>public.billing_contacts</code> table reference
     */
    public BillingContacts(String alias) {
        this(alias, BILLING_CONTACTS);
    }

    private BillingContacts(String alias, Table<BillingContactsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BillingContacts(String alias, Table<BillingContactsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BillingContactsRecord, Long> getIdentity() {
        return Keys.IDENTITY_BILLING_CONTACTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BillingContactsRecord> getPrimaryKey() {
        return Keys.BILLING_CONTACTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BillingContactsRecord>> getKeys() {
        return Arrays.<UniqueKey<BillingContactsRecord>>asList(Keys.BILLING_CONTACTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BillingContactsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BillingContactsRecord, ?>>asList(Keys.BILLING_CONTACTS__BILLING_CONTACTS_ORG_ID_FKEY, Keys.BILLING_CONTACTS__BILLING_CONTACTS_OPEN_ORG_ID_FKEY, Keys.BILLING_CONTACTS__BILLING_CONTACTS_VEHICLE_ID_FKEY, Keys.BILLING_CONTACTS__BILLING_CONTACTS_DEAL_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContacts as(String alias) {
        return new BillingContacts(alias, this);
    }

    /**
     * Rename this table
     */
    public BillingContacts rename(String name) {
        return new BillingContacts(name, null);
    }
}