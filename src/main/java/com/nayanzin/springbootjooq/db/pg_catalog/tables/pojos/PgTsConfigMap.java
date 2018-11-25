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
public class PgTsConfigMap implements Serializable {

    private static final long serialVersionUID = -652377733;

    private Long    mapcfg;
    private Integer maptokentype;
    private Integer mapseqno;
    private Long    mapdict;

    public PgTsConfigMap() {}

    public PgTsConfigMap(PgTsConfigMap value) {
        this.mapcfg = value.mapcfg;
        this.maptokentype = value.maptokentype;
        this.mapseqno = value.mapseqno;
        this.mapdict = value.mapdict;
    }

    public PgTsConfigMap(
        Long    mapcfg,
        Integer maptokentype,
        Integer mapseqno,
        Long    mapdict
    ) {
        this.mapcfg = mapcfg;
        this.maptokentype = maptokentype;
        this.mapseqno = mapseqno;
        this.mapdict = mapdict;
    }

    public Long getMapcfg() {
        return this.mapcfg;
    }

    public void setMapcfg(Long mapcfg) {
        this.mapcfg = mapcfg;
    }

    public Integer getMaptokentype() {
        return this.maptokentype;
    }

    public void setMaptokentype(Integer maptokentype) {
        this.maptokentype = maptokentype;
    }

    public Integer getMapseqno() {
        return this.mapseqno;
    }

    public void setMapseqno(Integer mapseqno) {
        this.mapseqno = mapseqno;
    }

    public Long getMapdict() {
        return this.mapdict;
    }

    public void setMapdict(Long mapdict) {
        this.mapdict = mapdict;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsConfigMap (");

        sb.append(mapcfg);
        sb.append(", ").append(maptokentype);
        sb.append(", ").append(mapseqno);
        sb.append(", ").append(mapdict);

        sb.append(")");
        return sb.toString();
    }
}