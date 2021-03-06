/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.records;


import com.nayanzin.springbootjooq.db.public_.enums.BidStatus;
import com.nayanzin.springbootjooq.db.public_.tables.Bids;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class BidsRecord extends UpdatableRecordImpl<BidsRecord> implements Record16<Long, BigDecimal, Long, Integer, Integer, Integer, String, Timestamp, Timestamp, Long, String, Short, String, BidStatus, Long, Boolean> {

    private static final long serialVersionUID = -531701113;

    /**
     * Setter for <code>public.bids.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bids.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.bids.bid</code>.
     */
    public void setBid(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bids.bid</code>.
     */
    public BigDecimal getBid() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>public.bids.tender_id</code>.
     */
    public void setTenderId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bids.tender_id</code>.
     */
    public Long getTenderId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.bids.payment_type</code>.
     */
    public void setPaymentType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bids.payment_type</code>.
     */
    public Integer getPaymentType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.bids.payment_on</code>.
     */
    public void setPaymentOn(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bids.payment_on</code>.
     */
    public Integer getPaymentOn() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.bids.payment_days</code>.
     */
    public void setPaymentDays(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bids.payment_days</code>.
     */
    public Integer getPaymentDays() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.bids.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bids.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.bids.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.bids.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>public.bids.modified_date</code>.
     */
    public void setModifiedDate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.bids.modified_date</code>.
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>public.bids.created_user</code>.
     */
    public void setCreatedUser(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.bids.created_user</code>.
     */
    public Long getCreatedUser() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.bids.modified_user</code>.
     */
    public void setModifiedUser(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.bids.modified_user</code>.
     */
    public String getModifiedUser() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.bids.partnership</code>.
     */
    public void setPartnership(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.bids.partnership</code>.
     */
    public Short getPartnership() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>public.bids.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.bids.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.bids.status</code>.
     */
    public void setStatus(BidStatus value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.bids.status</code>.
     */
    public BidStatus getStatus() {
        return (BidStatus) get(13);
    }

    /**
     * Setter for <code>public.bids.carrier_id</code>.
     */
    public void setCarrierId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.bids.carrier_id</code>.
     */
    public Long getCarrierId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.bids.payment_guarantee</code>.
     */
    public void setPaymentGuarantee(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.bids.payment_guarantee</code>.
     */
    public Boolean getPaymentGuarantee() {
        return (Boolean) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, BigDecimal, Long, Integer, Integer, Integer, String, Timestamp, Timestamp, Long, String, Short, String, BidStatus, Long, Boolean> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, BigDecimal, Long, Integer, Integer, Integer, String, Timestamp, Timestamp, Long, String, Short, String, BidStatus, Long, Boolean> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Bids.BIDS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return Bids.BIDS.BID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Bids.BIDS.TENDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Bids.BIDS.PAYMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Bids.BIDS.PAYMENT_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Bids.BIDS.PAYMENT_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Bids.BIDS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Bids.BIDS.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Bids.BIDS.MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return Bids.BIDS.CREATED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Bids.BIDS.MODIFIED_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return Bids.BIDS.PARTNERSHIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Bids.BIDS.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BidStatus> field14() {
        return Bids.BIDS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return Bids.BIDS.CARRIER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return Bids.BIDS.PAYMENT_GUARANTEE;
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
    public BigDecimal value2() {
        return getBid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getTenderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPaymentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPaymentOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPaymentDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCreatedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getModifiedUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getPartnership();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidStatus value14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getCarrierId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getPaymentGuarantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value2(BigDecimal value) {
        setBid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value3(Long value) {
        setTenderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value4(Integer value) {
        setPaymentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value5(Integer value) {
        setPaymentOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value6(Integer value) {
        setPaymentDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value8(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value9(Timestamp value) {
        setModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value10(Long value) {
        setCreatedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value11(String value) {
        setModifiedUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value12(Short value) {
        setPartnership(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value13(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value14(BidStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value15(Long value) {
        setCarrierId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord value16(Boolean value) {
        setPaymentGuarantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BidsRecord values(Long value1, BigDecimal value2, Long value3, Integer value4, Integer value5, Integer value6, String value7, Timestamp value8, Timestamp value9, Long value10, String value11, Short value12, String value13, BidStatus value14, Long value15, Boolean value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BidsRecord
     */
    public BidsRecord() {
        super(Bids.BIDS);
    }

    /**
     * Create a detached, initialised BidsRecord
     */
    public BidsRecord(Long id, BigDecimal bid, Long tenderId, Integer paymentType, Integer paymentOn, Integer paymentDays, String description, Timestamp createdDate, Timestamp modifiedDate, Long createdUser, String modifiedUser, Short partnership, String currencyCode, BidStatus status, Long carrierId, Boolean paymentGuarantee) {
        super(Bids.BIDS);

        set(0, id);
        set(1, bid);
        set(2, tenderId);
        set(3, paymentType);
        set(4, paymentOn);
        set(5, paymentDays);
        set(6, description);
        set(7, createdDate);
        set(8, modifiedDate);
        set(9, createdUser);
        set(10, modifiedUser);
        set(11, partnership);
        set(12, currencyCode);
        set(13, status);
        set(14, carrierId);
        set(15, paymentGuarantee);
    }
}
