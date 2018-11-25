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
public class PgStatioUserSequences implements Serializable {

    private static final long serialVersionUID = -1859448751;

    private Long   relid;
    private String schemaname;
    private String relname;
    private Long   blksRead;
    private Long   blksHit;

    public PgStatioUserSequences() {}

    public PgStatioUserSequences(PgStatioUserSequences value) {
        this.relid = value.relid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.blksRead = value.blksRead;
        this.blksHit = value.blksHit;
    }

    public PgStatioUserSequences(
        Long   relid,
        String schemaname,
        String relname,
        Long   blksRead,
        Long   blksHit
    ) {
        this.relid = relid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.blksRead = blksRead;
        this.blksHit = blksHit;
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

    public Long getBlksRead() {
        return this.blksRead;
    }

    public void setBlksRead(Long blksRead) {
        this.blksRead = blksRead;
    }

    public Long getBlksHit() {
        return this.blksHit;
    }

    public void setBlksHit(Long blksHit) {
        this.blksHit = blksHit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatioUserSequences (");

        sb.append(relid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(blksRead);
        sb.append(", ").append(blksHit);

        sb.append(")");
        return sb.toString();
    }
}
