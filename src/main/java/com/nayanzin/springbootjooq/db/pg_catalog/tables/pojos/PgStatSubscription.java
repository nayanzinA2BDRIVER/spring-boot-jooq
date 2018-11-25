/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


import java.io.Serializable;
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
public class PgStatSubscription implements Serializable {

    private static final long serialVersionUID = 1819948197;

    private Long      subid;
    private String    subname;
    private Integer   pid;
    private Long      relid;
    private Object    receivedLsn;
    private Timestamp lastMsgSendTime;
    private Timestamp lastMsgReceiptTime;
    private Object    latestEndLsn;
    private Timestamp latestEndTime;

    public PgStatSubscription() {}

    public PgStatSubscription(PgStatSubscription value) {
        this.subid = value.subid;
        this.subname = value.subname;
        this.pid = value.pid;
        this.relid = value.relid;
        this.receivedLsn = value.receivedLsn;
        this.lastMsgSendTime = value.lastMsgSendTime;
        this.lastMsgReceiptTime = value.lastMsgReceiptTime;
        this.latestEndLsn = value.latestEndLsn;
        this.latestEndTime = value.latestEndTime;
    }

    public PgStatSubscription(
        Long      subid,
        String    subname,
        Integer   pid,
        Long      relid,
        Object    receivedLsn,
        Timestamp lastMsgSendTime,
        Timestamp lastMsgReceiptTime,
        Object    latestEndLsn,
        Timestamp latestEndTime
    ) {
        this.subid = subid;
        this.subname = subname;
        this.pid = pid;
        this.relid = relid;
        this.receivedLsn = receivedLsn;
        this.lastMsgSendTime = lastMsgSendTime;
        this.lastMsgReceiptTime = lastMsgReceiptTime;
        this.latestEndLsn = latestEndLsn;
        this.latestEndTime = latestEndTime;
    }

    public Long getSubid() {
        return this.subid;
    }

    public void setSubid(Long subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return this.subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public Object getReceivedLsn() {
        return this.receivedLsn;
    }

    public void setReceivedLsn(Object receivedLsn) {
        this.receivedLsn = receivedLsn;
    }

    public Timestamp getLastMsgSendTime() {
        return this.lastMsgSendTime;
    }

    public void setLastMsgSendTime(Timestamp lastMsgSendTime) {
        this.lastMsgSendTime = lastMsgSendTime;
    }

    public Timestamp getLastMsgReceiptTime() {
        return this.lastMsgReceiptTime;
    }

    public void setLastMsgReceiptTime(Timestamp lastMsgReceiptTime) {
        this.lastMsgReceiptTime = lastMsgReceiptTime;
    }

    public Object getLatestEndLsn() {
        return this.latestEndLsn;
    }

    public void setLatestEndLsn(Object latestEndLsn) {
        this.latestEndLsn = latestEndLsn;
    }

    public Timestamp getLatestEndTime() {
        return this.latestEndTime;
    }

    public void setLatestEndTime(Timestamp latestEndTime) {
        this.latestEndTime = latestEndTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSubscription (");

        sb.append(subid);
        sb.append(", ").append(subname);
        sb.append(", ").append(pid);
        sb.append(", ").append(relid);
        sb.append(", ").append(receivedLsn);
        sb.append(", ").append(lastMsgSendTime);
        sb.append(", ").append(lastMsgReceiptTime);
        sb.append(", ").append(latestEndLsn);
        sb.append(", ").append(latestEndTime);

        sb.append(")");
        return sb.toString();
    }
}