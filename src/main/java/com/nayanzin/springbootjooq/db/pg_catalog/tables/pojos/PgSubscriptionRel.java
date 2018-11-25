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
public class PgSubscriptionRel implements Serializable {

    private static final long serialVersionUID = -318492583;

    private Long   srsubid;
    private Long   srrelid;
    private String srsubstate;
    private Object srsublsn;

    public PgSubscriptionRel() {}

    public PgSubscriptionRel(PgSubscriptionRel value) {
        this.srsubid = value.srsubid;
        this.srrelid = value.srrelid;
        this.srsubstate = value.srsubstate;
        this.srsublsn = value.srsublsn;
    }

    public PgSubscriptionRel(
        Long   srsubid,
        Long   srrelid,
        String srsubstate,
        Object srsublsn
    ) {
        this.srsubid = srsubid;
        this.srrelid = srrelid;
        this.srsubstate = srsubstate;
        this.srsublsn = srsublsn;
    }

    public Long getSrsubid() {
        return this.srsubid;
    }

    public void setSrsubid(Long srsubid) {
        this.srsubid = srsubid;
    }

    public Long getSrrelid() {
        return this.srrelid;
    }

    public void setSrrelid(Long srrelid) {
        this.srrelid = srrelid;
    }

    public String getSrsubstate() {
        return this.srsubstate;
    }

    public void setSrsubstate(String srsubstate) {
        this.srsubstate = srsubstate;
    }

    public Object getSrsublsn() {
        return this.srsublsn;
    }

    public void setSrsublsn(Object srsublsn) {
        this.srsublsn = srsublsn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSubscriptionRel (");

        sb.append(srsubid);
        sb.append(", ").append(srrelid);
        sb.append(", ").append(srsubstate);
        sb.append(", ").append(srsublsn);

        sb.append(")");
        return sb.toString();
    }
}