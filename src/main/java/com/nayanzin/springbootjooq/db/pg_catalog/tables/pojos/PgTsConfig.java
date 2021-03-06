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
public class PgTsConfig implements Serializable {

    private static final long serialVersionUID = -991940514;

    private String cfgname;
    private Long   cfgnamespace;
    private Long   cfgowner;
    private Long   cfgparser;

    public PgTsConfig() {}

    public PgTsConfig(PgTsConfig value) {
        this.cfgname = value.cfgname;
        this.cfgnamespace = value.cfgnamespace;
        this.cfgowner = value.cfgowner;
        this.cfgparser = value.cfgparser;
    }

    public PgTsConfig(
        String cfgname,
        Long   cfgnamespace,
        Long   cfgowner,
        Long   cfgparser
    ) {
        this.cfgname = cfgname;
        this.cfgnamespace = cfgnamespace;
        this.cfgowner = cfgowner;
        this.cfgparser = cfgparser;
    }

    public String getCfgname() {
        return this.cfgname;
    }

    public void setCfgname(String cfgname) {
        this.cfgname = cfgname;
    }

    public Long getCfgnamespace() {
        return this.cfgnamespace;
    }

    public void setCfgnamespace(Long cfgnamespace) {
        this.cfgnamespace = cfgnamespace;
    }

    public Long getCfgowner() {
        return this.cfgowner;
    }

    public void setCfgowner(Long cfgowner) {
        this.cfgowner = cfgowner;
    }

    public Long getCfgparser() {
        return this.cfgparser;
    }

    public void setCfgparser(Long cfgparser) {
        this.cfgparser = cfgparser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsConfig (");

        sb.append(cfgname);
        sb.append(", ").append(cfgnamespace);
        sb.append(", ").append(cfgowner);
        sb.append(", ").append(cfgparser);

        sb.append(")");
        return sb.toString();
    }
}
