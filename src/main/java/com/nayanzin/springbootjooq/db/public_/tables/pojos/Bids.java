/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import com.nayanzin.springbootjooq.db.public_.enums.BidStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Bids implements Serializable {

    private static final long serialVersionUID = -1258539776;

    private Long       id;
    private BigDecimal bid;
    private Long       tenderId;
    private Integer    paymentType;
    private Integer    paymentOn;
    private Integer    paymentDays;
    private String     description;
    private Timestamp  createdDate;
    private Timestamp  modifiedDate;
    private Long       createdUser;
    private String     modifiedUser;
    private Short      partnership;
    private String     currencyCode;
    private BidStatus  status;
    private Long       carrierId;
    private Boolean    paymentGuarantee;

    public Bids() {}

    public Bids(Bids value) {
        this.id = value.id;
        this.bid = value.bid;
        this.tenderId = value.tenderId;
        this.paymentType = value.paymentType;
        this.paymentOn = value.paymentOn;
        this.paymentDays = value.paymentDays;
        this.description = value.description;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdUser = value.createdUser;
        this.modifiedUser = value.modifiedUser;
        this.partnership = value.partnership;
        this.currencyCode = value.currencyCode;
        this.status = value.status;
        this.carrierId = value.carrierId;
        this.paymentGuarantee = value.paymentGuarantee;
    }

    public Bids(
        Long       id,
        BigDecimal bid,
        Long       tenderId,
        Integer    paymentType,
        Integer    paymentOn,
        Integer    paymentDays,
        String     description,
        Timestamp  createdDate,
        Timestamp  modifiedDate,
        Long       createdUser,
        String     modifiedUser,
        Short      partnership,
        String     currencyCode,
        BidStatus  status,
        Long       carrierId,
        Boolean    paymentGuarantee
    ) {
        this.id = id;
        this.bid = bid;
        this.tenderId = tenderId;
        this.paymentType = paymentType;
        this.paymentOn = paymentOn;
        this.paymentDays = paymentDays;
        this.description = description;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdUser = createdUser;
        this.modifiedUser = modifiedUser;
        this.partnership = partnership;
        this.currencyCode = currencyCode;
        this.status = status;
        this.carrierId = carrierId;
        this.paymentGuarantee = paymentGuarantee;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBid() {
        return this.bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public Long getTenderId() {
        return this.tenderId;
    }

    public void setTenderId(Long tenderId) {
        this.tenderId = tenderId;
    }

    public Integer getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getPaymentOn() {
        return this.paymentOn;
    }

    public void setPaymentOn(Integer paymentOn) {
        this.paymentOn = paymentOn;
    }

    public Integer getPaymentDays() {
        return this.paymentDays;
    }

    public void setPaymentDays(Integer paymentDays) {
        this.paymentDays = paymentDays;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(Long createdUser) {
        this.createdUser = createdUser;
    }

    public String getModifiedUser() {
        return this.modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Short getPartnership() {
        return this.partnership;
    }

    public void setPartnership(Short partnership) {
        this.partnership = partnership;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BidStatus getStatus() {
        return this.status;
    }

    public void setStatus(BidStatus status) {
        this.status = status;
    }

    public Long getCarrierId() {
        return this.carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public Boolean getPaymentGuarantee() {
        return this.paymentGuarantee;
    }

    public void setPaymentGuarantee(Boolean paymentGuarantee) {
        this.paymentGuarantee = paymentGuarantee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bids (");

        sb.append(id);
        sb.append(", ").append(bid);
        sb.append(", ").append(tenderId);
        sb.append(", ").append(paymentType);
        sb.append(", ").append(paymentOn);
        sb.append(", ").append(paymentDays);
        sb.append(", ").append(description);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdUser);
        sb.append(", ").append(modifiedUser);
        sb.append(", ").append(partnership);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(status);
        sb.append(", ").append(carrierId);
        sb.append(", ").append(paymentGuarantee);

        sb.append(")");
        return sb.toString();
    }
}