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
public class PgAuthid implements Serializable {

    private static final long serialVersionUID = -1490676512;

    private String    rolname;
    private Boolean   rolsuper;
    private Boolean   rolinherit;
    private Boolean   rolcreaterole;
    private Boolean   rolcreatedb;
    private Boolean   rolcanlogin;
    private Boolean   rolreplication;
    private Boolean   rolbypassrls;
    private Integer   rolconnlimit;
    private String    rolpassword;
    private Timestamp rolvaliduntil;

    public PgAuthid() {}

    public PgAuthid(PgAuthid value) {
        this.rolname = value.rolname;
        this.rolsuper = value.rolsuper;
        this.rolinherit = value.rolinherit;
        this.rolcreaterole = value.rolcreaterole;
        this.rolcreatedb = value.rolcreatedb;
        this.rolcanlogin = value.rolcanlogin;
        this.rolreplication = value.rolreplication;
        this.rolbypassrls = value.rolbypassrls;
        this.rolconnlimit = value.rolconnlimit;
        this.rolpassword = value.rolpassword;
        this.rolvaliduntil = value.rolvaliduntil;
    }

    public PgAuthid(
        String    rolname,
        Boolean   rolsuper,
        Boolean   rolinherit,
        Boolean   rolcreaterole,
        Boolean   rolcreatedb,
        Boolean   rolcanlogin,
        Boolean   rolreplication,
        Boolean   rolbypassrls,
        Integer   rolconnlimit,
        String    rolpassword,
        Timestamp rolvaliduntil
    ) {
        this.rolname = rolname;
        this.rolsuper = rolsuper;
        this.rolinherit = rolinherit;
        this.rolcreaterole = rolcreaterole;
        this.rolcreatedb = rolcreatedb;
        this.rolcanlogin = rolcanlogin;
        this.rolreplication = rolreplication;
        this.rolbypassrls = rolbypassrls;
        this.rolconnlimit = rolconnlimit;
        this.rolpassword = rolpassword;
        this.rolvaliduntil = rolvaliduntil;
    }

    public String getRolname() {
        return this.rolname;
    }

    public void setRolname(String rolname) {
        this.rolname = rolname;
    }

    public Boolean getRolsuper() {
        return this.rolsuper;
    }

    public void setRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
    }

    public Boolean getRolinherit() {
        return this.rolinherit;
    }

    public void setRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
    }

    public Boolean getRolcreaterole() {
        return this.rolcreaterole;
    }

    public void setRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
    }

    public Boolean getRolcreatedb() {
        return this.rolcreatedb;
    }

    public void setRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
    }

    public Boolean getRolcanlogin() {
        return this.rolcanlogin;
    }

    public void setRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
    }

    public Boolean getRolreplication() {
        return this.rolreplication;
    }

    public void setRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
    }

    public Boolean getRolbypassrls() {
        return this.rolbypassrls;
    }

    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
    }

    public Integer getRolconnlimit() {
        return this.rolconnlimit;
    }

    public void setRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
    }

    public String getRolpassword() {
        return this.rolpassword;
    }

    public void setRolpassword(String rolpassword) {
        this.rolpassword = rolpassword;
    }

    public Timestamp getRolvaliduntil() {
        return this.rolvaliduntil;
    }

    public void setRolvaliduntil(Timestamp rolvaliduntil) {
        this.rolvaliduntil = rolvaliduntil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAuthid (");

        sb.append(rolname);
        sb.append(", ").append(rolsuper);
        sb.append(", ").append(rolinherit);
        sb.append(", ").append(rolcreaterole);
        sb.append(", ").append(rolcreatedb);
        sb.append(", ").append(rolcanlogin);
        sb.append(", ").append(rolreplication);
        sb.append(", ").append(rolbypassrls);
        sb.append(", ").append(rolconnlimit);
        sb.append(", ").append(rolpassword);
        sb.append(", ").append(rolvaliduntil);

        sb.append(")");
        return sb.toString();
    }
}
