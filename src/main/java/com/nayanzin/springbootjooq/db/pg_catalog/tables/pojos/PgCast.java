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
public class PgCast implements Serializable {

    private static final long serialVersionUID = -1020885219;

    private Long   castsource;
    private Long   casttarget;
    private Long   castfunc;
    private String castcontext;
    private String castmethod;

    public PgCast() {}

    public PgCast(PgCast value) {
        this.castsource = value.castsource;
        this.casttarget = value.casttarget;
        this.castfunc = value.castfunc;
        this.castcontext = value.castcontext;
        this.castmethod = value.castmethod;
    }

    public PgCast(
        Long   castsource,
        Long   casttarget,
        Long   castfunc,
        String castcontext,
        String castmethod
    ) {
        this.castsource = castsource;
        this.casttarget = casttarget;
        this.castfunc = castfunc;
        this.castcontext = castcontext;
        this.castmethod = castmethod;
    }

    public Long getCastsource() {
        return this.castsource;
    }

    public void setCastsource(Long castsource) {
        this.castsource = castsource;
    }

    public Long getCasttarget() {
        return this.casttarget;
    }

    public void setCasttarget(Long casttarget) {
        this.casttarget = casttarget;
    }

    public Long getCastfunc() {
        return this.castfunc;
    }

    public void setCastfunc(Long castfunc) {
        this.castfunc = castfunc;
    }

    public String getCastcontext() {
        return this.castcontext;
    }

    public void setCastcontext(String castcontext) {
        this.castcontext = castcontext;
    }

    public String getCastmethod() {
        return this.castmethod;
    }

    public void setCastmethod(String castmethod) {
        this.castmethod = castmethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgCast (");

        sb.append(castsource);
        sb.append(", ").append(casttarget);
        sb.append(", ").append(castfunc);
        sb.append(", ").append(castcontext);
        sb.append(", ").append(castmethod);

        sb.append(")");
        return sb.toString();
    }
}
