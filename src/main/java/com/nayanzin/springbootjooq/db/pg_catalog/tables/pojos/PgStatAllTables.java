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
public class PgStatAllTables implements Serializable {

    private static final long serialVersionUID = 1722549402;

    private Long      relid;
    private String    schemaname;
    private String    relname;
    private Long      seqScan;
    private Long      seqTupRead;
    private Long      idxScan;
    private Long      idxTupFetch;
    private Long      nTupIns;
    private Long      nTupUpd;
    private Long      nTupDel;
    private Long      nTupHotUpd;
    private Long      nLiveTup;
    private Long      nDeadTup;
    private Long      nModSinceAnalyze;
    private Timestamp lastVacuum;
    private Timestamp lastAutovacuum;
    private Timestamp lastAnalyze;
    private Timestamp lastAutoanalyze;
    private Long      vacuumCount;
    private Long      autovacuumCount;
    private Long      analyzeCount;
    private Long      autoanalyzeCount;

    public PgStatAllTables() {}

    public PgStatAllTables(PgStatAllTables value) {
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
        this.nLiveTup = value.nLiveTup;
        this.nDeadTup = value.nDeadTup;
        this.nModSinceAnalyze = value.nModSinceAnalyze;
        this.lastVacuum = value.lastVacuum;
        this.lastAutovacuum = value.lastAutovacuum;
        this.lastAnalyze = value.lastAnalyze;
        this.lastAutoanalyze = value.lastAutoanalyze;
        this.vacuumCount = value.vacuumCount;
        this.autovacuumCount = value.autovacuumCount;
        this.analyzeCount = value.analyzeCount;
        this.autoanalyzeCount = value.autoanalyzeCount;
    }

    public PgStatAllTables(
        Long      relid,
        String    schemaname,
        String    relname,
        Long      seqScan,
        Long      seqTupRead,
        Long      idxScan,
        Long      idxTupFetch,
        Long      nTupIns,
        Long      nTupUpd,
        Long      nTupDel,
        Long      nTupHotUpd,
        Long      nLiveTup,
        Long      nDeadTup,
        Long      nModSinceAnalyze,
        Timestamp lastVacuum,
        Timestamp lastAutovacuum,
        Timestamp lastAnalyze,
        Timestamp lastAutoanalyze,
        Long      vacuumCount,
        Long      autovacuumCount,
        Long      analyzeCount,
        Long      autoanalyzeCount
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
        this.nLiveTup = nLiveTup;
        this.nDeadTup = nDeadTup;
        this.nModSinceAnalyze = nModSinceAnalyze;
        this.lastVacuum = lastVacuum;
        this.lastAutovacuum = lastAutovacuum;
        this.lastAnalyze = lastAnalyze;
        this.lastAutoanalyze = lastAutoanalyze;
        this.vacuumCount = vacuumCount;
        this.autovacuumCount = autovacuumCount;
        this.analyzeCount = analyzeCount;
        this.autoanalyzeCount = autoanalyzeCount;
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

    public Long getNLiveTup() {
        return this.nLiveTup;
    }

    public void setNLiveTup(Long nLiveTup) {
        this.nLiveTup = nLiveTup;
    }

    public Long getNDeadTup() {
        return this.nDeadTup;
    }

    public void setNDeadTup(Long nDeadTup) {
        this.nDeadTup = nDeadTup;
    }

    public Long getNModSinceAnalyze() {
        return this.nModSinceAnalyze;
    }

    public void setNModSinceAnalyze(Long nModSinceAnalyze) {
        this.nModSinceAnalyze = nModSinceAnalyze;
    }

    public Timestamp getLastVacuum() {
        return this.lastVacuum;
    }

    public void setLastVacuum(Timestamp lastVacuum) {
        this.lastVacuum = lastVacuum;
    }

    public Timestamp getLastAutovacuum() {
        return this.lastAutovacuum;
    }

    public void setLastAutovacuum(Timestamp lastAutovacuum) {
        this.lastAutovacuum = lastAutovacuum;
    }

    public Timestamp getLastAnalyze() {
        return this.lastAnalyze;
    }

    public void setLastAnalyze(Timestamp lastAnalyze) {
        this.lastAnalyze = lastAnalyze;
    }

    public Timestamp getLastAutoanalyze() {
        return this.lastAutoanalyze;
    }

    public void setLastAutoanalyze(Timestamp lastAutoanalyze) {
        this.lastAutoanalyze = lastAutoanalyze;
    }

    public Long getVacuumCount() {
        return this.vacuumCount;
    }

    public void setVacuumCount(Long vacuumCount) {
        this.vacuumCount = vacuumCount;
    }

    public Long getAutovacuumCount() {
        return this.autovacuumCount;
    }

    public void setAutovacuumCount(Long autovacuumCount) {
        this.autovacuumCount = autovacuumCount;
    }

    public Long getAnalyzeCount() {
        return this.analyzeCount;
    }

    public void setAnalyzeCount(Long analyzeCount) {
        this.analyzeCount = analyzeCount;
    }

    public Long getAutoanalyzeCount() {
        return this.autoanalyzeCount;
    }

    public void setAutoanalyzeCount(Long autoanalyzeCount) {
        this.autoanalyzeCount = autoanalyzeCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatAllTables (");

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
        sb.append(", ").append(nLiveTup);
        sb.append(", ").append(nDeadTup);
        sb.append(", ").append(nModSinceAnalyze);
        sb.append(", ").append(lastVacuum);
        sb.append(", ").append(lastAutovacuum);
        sb.append(", ").append(lastAnalyze);
        sb.append(", ").append(lastAutoanalyze);
        sb.append(", ").append(vacuumCount);
        sb.append(", ").append(autovacuumCount);
        sb.append(", ").append(analyzeCount);
        sb.append(", ").append(autoanalyzeCount);

        sb.append(")");
        return sb.toString();
    }
}
