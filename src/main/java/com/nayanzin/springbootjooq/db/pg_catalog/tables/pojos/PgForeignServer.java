/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

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
public class PgForeignServer implements Serializable {

    private static final long serialVersionUID = -673120864;

    private String   srvname;
    private Long     srvowner;
    private Long     srvfdw;
    private String   srvtype;
    private String   srvversion;
    private String[] srvacl;
    private String[] srvoptions;

    public PgForeignServer() {}

    public PgForeignServer(PgForeignServer value) {
        this.srvname = value.srvname;
        this.srvowner = value.srvowner;
        this.srvfdw = value.srvfdw;
        this.srvtype = value.srvtype;
        this.srvversion = value.srvversion;
        this.srvacl = value.srvacl;
        this.srvoptions = value.srvoptions;
    }

    public PgForeignServer(
        String   srvname,
        Long     srvowner,
        Long     srvfdw,
        String   srvtype,
        String   srvversion,
        String[] srvacl,
        String[] srvoptions
    ) {
        this.srvname = srvname;
        this.srvowner = srvowner;
        this.srvfdw = srvfdw;
        this.srvtype = srvtype;
        this.srvversion = srvversion;
        this.srvacl = srvacl;
        this.srvoptions = srvoptions;
    }

    public String getSrvname() {
        return this.srvname;
    }

    public void setSrvname(String srvname) {
        this.srvname = srvname;
    }

    public Long getSrvowner() {
        return this.srvowner;
    }

    public void setSrvowner(Long srvowner) {
        this.srvowner = srvowner;
    }

    public Long getSrvfdw() {
        return this.srvfdw;
    }

    public void setSrvfdw(Long srvfdw) {
        this.srvfdw = srvfdw;
    }

    public String getSrvtype() {
        return this.srvtype;
    }

    public void setSrvtype(String srvtype) {
        this.srvtype = srvtype;
    }

    public String getSrvversion() {
        return this.srvversion;
    }

    public void setSrvversion(String srvversion) {
        this.srvversion = srvversion;
    }

    public String[] getSrvacl() {
        return this.srvacl;
    }

    public void setSrvacl(String[] srvacl) {
        this.srvacl = srvacl;
    }

    public String[] getSrvoptions() {
        return this.srvoptions;
    }

    public void setSrvoptions(String[] srvoptions) {
        this.srvoptions = srvoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgForeignServer (");

        sb.append(srvname);
        sb.append(", ").append(srvowner);
        sb.append(", ").append(srvfdw);
        sb.append(", ").append(srvtype);
        sb.append(", ").append(srvversion);
        sb.append(", ").append(Arrays.toString(srvacl));
        sb.append(", ").append(Arrays.toString(srvoptions));

        sb.append(")");
        return sb.toString();
    }
}
