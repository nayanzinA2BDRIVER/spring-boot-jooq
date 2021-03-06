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
public class PgStatioSysIndexes implements Serializable {

    private static final long serialVersionUID = -1903465511;

    private Long   relid;
    private Long   indexrelid;
    private String schemaname;
    private String relname;
    private String indexrelname;
    private Long   idxBlksRead;
    private Long   idxBlksHit;

    public PgStatioSysIndexes() {}

    public PgStatioSysIndexes(PgStatioSysIndexes value) {
        this.relid = value.relid;
        this.indexrelid = value.indexrelid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.indexrelname = value.indexrelname;
        this.idxBlksRead = value.idxBlksRead;
        this.idxBlksHit = value.idxBlksHit;
    }

    public PgStatioSysIndexes(
        Long   relid,
        Long   indexrelid,
        String schemaname,
        String relname,
        String indexrelname,
        Long   idxBlksRead,
        Long   idxBlksHit
    ) {
        this.relid = relid;
        this.indexrelid = indexrelid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.indexrelname = indexrelname;
        this.idxBlksRead = idxBlksRead;
        this.idxBlksHit = idxBlksHit;
    }

    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public Long getIndexrelid() {
        return this.indexrelid;
    }

    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
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

    public String getIndexrelname() {
        return this.indexrelname;
    }

    public void setIndexrelname(String indexrelname) {
        this.indexrelname = indexrelname;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatioSysIndexes (");

        sb.append(relid);
        sb.append(", ").append(indexrelid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(indexrelname);
        sb.append(", ").append(idxBlksRead);
        sb.append(", ").append(idxBlksHit);

        sb.append(")");
        return sb.toString();
    }
}
