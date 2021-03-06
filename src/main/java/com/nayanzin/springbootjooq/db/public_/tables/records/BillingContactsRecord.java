/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.records;


import com.nayanzin.springbootjooq.db.public_.tables.BillingContacts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BillingContactsRecord extends UpdatableRecordImpl<BillingContactsRecord> implements Record7<Long, Long, Long, Long, Timestamp, Long, Timestamp> {

    private static final long serialVersionUID = 1725968910;

    /**
     * Setter for <code>public.billing_contacts.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.billing_contacts.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.billing_contacts.org_id</code>.
     */
    public void setOrgId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.billing_contacts.org_id</code>.
     */
    public Long getOrgId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.billing_contacts.open_org_id</code>.
     */
    public void setOpenOrgId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.billing_contacts.open_org_id</code>.
     */
    public Long getOpenOrgId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.billing_contacts.vehicle_id</code>.
     */
    public void setVehicleId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.billing_contacts.vehicle_id</code>.
     */
    public Long getVehicleId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.billing_contacts.vehicle_open_date</code>.
     */
    public void setVehicleOpenDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.billing_contacts.vehicle_open_date</code>.
     */
    public Timestamp getVehicleOpenDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.billing_contacts.deal_id</code>.
     */
    public void setDealId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.billing_contacts.deal_id</code>.
     */
    public Long getDealId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.billing_contacts.deal_open_date</code>.
     */
    public void setDealOpenDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.billing_contacts.deal_open_date</code>.
     */
    public Timestamp getDealOpenDate() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Long, Timestamp, Long, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Long, Timestamp, Long, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BillingContacts.BILLING_CONTACTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BillingContacts.BILLING_CONTACTS.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return BillingContacts.BILLING_CONTACTS.OPEN_ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return BillingContacts.BILLING_CONTACTS.VEHICLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return BillingContacts.BILLING_CONTACTS.VEHICLE_OPEN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return BillingContacts.BILLING_CONTACTS.DEAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return BillingContacts.BILLING_CONTACTS.DEAL_OPEN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getOpenOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getVehicleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getVehicleOpenDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getDealId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getDealOpenDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value2(Long value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value3(Long value) {
        setOpenOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value4(Long value) {
        setVehicleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value5(Timestamp value) {
        setVehicleOpenDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value6(Long value) {
        setDealId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord value7(Timestamp value) {
        setDealOpenDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingContactsRecord values(Long value1, Long value2, Long value3, Long value4, Timestamp value5, Long value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BillingContactsRecord
     */
    public BillingContactsRecord() {
        super(BillingContacts.BILLING_CONTACTS);
    }

    /**
     * Create a detached, initialised BillingContactsRecord
     */
    public BillingContactsRecord(Long id, Long orgId, Long openOrgId, Long vehicleId, Timestamp vehicleOpenDate, Long dealId, Timestamp dealOpenDate) {
        super(BillingContacts.BILLING_CONTACTS);

        set(0, id);
        set(1, orgId);
        set(2, openOrgId);
        set(3, vehicleId);
        set(4, vehicleOpenDate);
        set(5, dealId);
        set(6, dealOpenDate);
    }
}
