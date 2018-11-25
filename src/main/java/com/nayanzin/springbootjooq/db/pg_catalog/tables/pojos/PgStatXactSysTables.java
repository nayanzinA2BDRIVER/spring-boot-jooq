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
public class PgStatXactSysTables implements Serializable {

    private static final long serialVersionUID = 2061572056;

    private Long   relid;
    private String schemaname;
    private String relname;
    private Long   seqScan;
    private Long   seqTupRead;
    private Long   idxScan;
    private Long   idxTupFetch;
    private Long   nTupIns;
    private Long   nTupUpd;
    private Long   nTupDel;
    private Long   nTupHotUpd;

    public PgStatXactSysTables() {}

    public PgStatXactSysTables(PgStatXactSysTables value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.seqScan = value.seqScan;
        this.seqTupRead = value.seqTupRead;
        this.idxScan = value.idxScan;
        this.idxTupFetch = value.idxTupFetch;
        this.nTupIns = value.nTupIns;
        this.nTupUpd = value.nTupUpd;
        this.nTupDel = value.nTupDel;
        this.nTupHotUpd = value.nTupHotUpd;
    }

    public PgStatXactSysTables(
        Long   relid,
        String schemaname,
        String relname,
        Long   seqScan,
        Long   seqTupRead,
        Long   idxScan,
        Long   idxTupFetch,
        Long   nTupIns,
        Long   nTupUpd,
        Long   nTupDel,
        Long   nTupHotUpd
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.seqScan = seqScan;
        this.seqTupRead = seqTupRead;
        this.idxScan = idxScan;
        this.idxTupFetch = idxTupFetch;
        this.nTupIns = nTupIns;
        this.nTupUpd = nTupUpd;
        this.nTupDel = nTupDel;
        this.nTupHotUpd = nTupHotUpd;
    }

    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getRelname() {
        return this.relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public Long getSeqScan() {
        return this.seqScan;
    }

    public void setSeqScan(Long seqScan) {
        this.seqScan = seqScan;
    }

    public Long getSeqTupRead() {
        return this.seqTupRead;
    }

    public void setSeqTupRead(Long seqTupRead) {
        this.seqTupRead = seqTupRead;
    }

    public Long getIdxScan() {
        return this.idxScan;
    }

    public void setIdxScan(Long idxScan) {
        this.idxScan = idxScan;
    }

    public Long getIdxTupFetch() {
        return this.idxTupFetch;
    }

    public void setIdxTupFetch(Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    public Long getNTupIns() {
        return this.nTupIns;
    }

    public void setNTupIns(Long nTupIns) {
        this.nTupIns = nTupIns;
    }

    public Long getNTupUpd() {
        return this.nTupUpd;
    }

    public void setNTupUpd(Long nTupUpd) {
        this.nTupUpd = nTupUpd;
    }

    public Long getNTupDel() {
        return this.nTupDel;
    }

    public void setNTupDel(Long nTupDel) {
        this.nTupDel = nTupDel;
    }

    public Long getNTupHotUpd() {
        return this.nTupHotUpd;
    }

    public void setNTupHotUpd(Long nTupHotUpd) {
        this.nTupHotUpd = nTupHotUpd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatXactSysTables (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(seqScan);
        sb.append(", ").append(seqTupRead);
        sb.append(", ").append(idxScan);
        sb.append(", ").append(idxTupFetch);
        sb.append(", ").append(nTupIns);
        sb.append(", ").append(nTupUpd);
        sb.append(", ").append(nTupDel);
        sb.append(", ").append(nTupHotUpd);

        sb.append(")");
        return sb.toString();
    }
}
