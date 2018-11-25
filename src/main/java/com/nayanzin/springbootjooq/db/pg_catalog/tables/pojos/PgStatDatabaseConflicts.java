/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


import java.io.Serializable;

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
public class PgStatDatabaseConflicts implements Serializable {

    private static final long serialVersionUID = 1509000135;

    private Long   datid;
    private String datname;
    private Long   conflTablespace;
    private Long   conflLock;
    private Long   conflSnapshot;
    private Long   conflBufferpin;
    private Long   conflDeadlock;

    public PgStatDatabaseConflicts() {}

    public PgStatDatabaseConflicts(PgStatDatabaseConflicts value) {
        this.datid = value.datid;
        this.datname = value.datname;
        this.conflTablespace = value.conflTablespace;
        this.conflLock = value.conflLock;
        this.conflSnapshot = value.conflSnapshot;
        this.conflBufferpin = value.conflBufferpin;
        this.conflDeadlock = value.conflDeadlock;
    }

    public PgStatDatabaseConflicts(
        Long   datid,
        String datname,
        Long   conflTablespace,
        Long   conflLock,
        Long   conflSnapshot,
        Long   conflBufferpin,
        Long   conflDeadlock
    ) {
        this.datid = datid;
        this.datname = datname;
        this.conflTablespace = conflTablespace;
        this.conflLock = conflLock;
        this.conflSnapshot = conflSnapshot;
        this.conflBufferpin = conflBufferpin;
        this.conflDeadlock = conflDeadlock;
    }

    public Long getDatid() {
        return this.datid;
    }

    public void setDatid(Long datid) {
        this.datid = datid;
    }

    public String getDatname() {
        return this.datname;
    }

    public void setDatname(String datname) {
        this.datname = datname;
    }

    public Long getConflTablespace() {
        return this.conflTablespace;
    }

    public void setConflTablespace(Long conflTablespace) {
        this.conflTablespace = conflTablespace;
    }

    public Long getConflLock() {
        return this.conflLock;
    }

    public void setConflLock(Long conflLock) {
        this.conflLock = conflLock;
    }

    public Long getConflSnapshot() {
        return this.conflSnapshot;
    }

    public void setConflSnapshot(Long conflSnapshot) {
        this.conflSnapshot = conflSnapshot;
    }

    public Long getConflBufferpin() {
        return this.conflBufferpin;
    }

    public void setConflBufferpin(Long conflBufferpin) {
        this.conflBufferpin = conflBufferpin;
    }

    public Long getConflDeadlock() {
        return this.conflDeadlock;
    }

    public void setConflDeadlock(Long conflDeadlock) {
        this.conflDeadlock = conflDeadlock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatDatabaseConflicts (");

        sb.append(datid);
        sb.append(", ").append(datname);
        sb.append(", ").append(conflTablespace);
        sb.append(", ").append(conflLock);
        sb.append(", ").append(conflSnapshot);
        sb.append(", ").append(conflBufferpin);
        sb.append(", ").append(conflDeadlock);

        sb.append(")");
        return sb.toString();
    }
}