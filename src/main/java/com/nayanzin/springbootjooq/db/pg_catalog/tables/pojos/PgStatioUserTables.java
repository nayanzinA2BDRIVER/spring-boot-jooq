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
public class PgStatioUserTables implements Serializable {

    private static final long serialVersionUID = 1214121436;

    private Long   relid;
    private String schemaname;
    private String relname;
    private Long   heapBlksRead;
    private Long   heapBlksHit;
    private Long   idxBlksRead;
    private Long   idxBlksHit;
    private Long   toastBlksRead;
    private Long   toastBlksHit;
    private Long   tidxBlksRead;
    private Long   tidxBlksHit;

    public PgStatioUserTables() {}

    public PgStatioUserTables(PgStatioUserTables value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.heapBlksRead = value.heapBlksRead;
        this.heapBlksHit = value.heapBlksHit;
        this.idxBlksRead = value.idxBlksRead;
        this.idxBlksHit = value.idxBlksHit;
        this.toastBlksRead = value.toastBlksRead;
        this.toastBlksHit = value.toastBlksHit;
        this.tidxBlksRead = value.tidxBlksRead;
        this.tidxBlksHit = value.tidxBlksHit;
    }

    public PgStatioUserTables(
        Long   relid,
        String schemaname,
        String relname,
        Long   heapBlksRead,
        Long   heapBlksHit,
        Long   idxBlksRead,
        Long   idxBlksHit,
        Long   toastBlksRead,
        Long   toastBlksHit,
        Long   tidxBlksRead,
        Long   tidxBlksHit
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.heapBlksRead = heapBlksRead;
        this.heapBlksHit = heapBlksHit;
        this.idxBlksRead = idxBlksRead;
        this.idxBlksHit = idxBlksHit;
        this.toastBlksRead = toastBlksRead;
        this.toastBlksHit = toastBlksHit;
        this.tidxBlksRead = tidxBlksRead;
        this.tidxBlksHit = tidxBlksHit;
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

    public Long getHeapBlksRead() {
        return this.heapBlksRead;
    }

    public void setHeapBlksRead(Long heapBlksRead) {
        this.heapBlksRead = heapBlksRead;
    }

    public Long getHeapBlksHit() {
        return this.heapBlksHit;
    }

    public void setHeapBlksHit(Long heapBlksHit) {
        this.heapBlksHit = heapBlksHit;
    }

    public Long getIdxBlksRead() {
        return this.idxBlksRead;
    }

    public void setIdxBlksRead(Long idxBlksRead) {
        this.idxBlksRead = idxBlksRead;
    }

    public Long getIdxBlksHit() {
        return this.idxBlksHit;
    }

    public void setIdxBlksHit(Long idxBlksHit) {
        this.idxBlksHit = idxBlksHit;
    }

    public Long getToastBlksRead() {
        return this.toastBlksRead;
    }

    public void setToastBlksRead(Long toastBlksRead) {
        this.toastBlksRead = toastBlksRead;
    }

    public Long getToastBlksHit() {
        return this.toastBlksHit;
    }

    public void setToastBlksHit(Long toastBlksHit) {
        this.toastBlksHit = toastBlksHit;
    }

    public Long getTidxBlksRead() {
        return this.tidxBlksRead;
    }

    public void setTidxBlksRead(Long tidxBlksRead) {
        this.tidxBlksRead = tidxBlksRead;
    }

    public Long getTidxBlksHit() {
        return this.tidxBlksHit;
    }

    public void setTidxBlksHit(Long tidxBlksHit) {
        this.tidxBlksHit = tidxBlksHit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatioUserTables (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(heapBlksRead);
        sb.append(", ").append(heapBlksHit);
        sb.append(", ").append(idxBlksRead);
        sb.append(", ").append(idxBlksHit);
        sb.append(", ").append(toastBlksRead);
        sb.append(", ").append(toastBlksHit);
        sb.append(", ").append(tidxBlksRead);
        sb.append(", ").append(tidxBlksHit);

        sb.append(")");
        return sb.toString();
    }
}
