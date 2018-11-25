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
public class PgAvailableExtensions implements Serializable {

    private static final long serialVersionUID = 871800613;

    private String name;
    private String defaultVersion;
    private String installedVersion;
    private String comment;

    public PgAvailableExtensions() {}

    public PgAvailableExtensions(PgAvailableExtensions value) {
        this.name = value.name;
        this.defaultVersion = value.defaultVersion;
        this.installedVersion = value.installedVersion;
        this.comment = value.comment;
    }

    public PgAvailableExtensions(
        String name,
        String defaultVersion,
        String installedVersion,
        String comment
    ) {
        this.name = name;
        this.defaultVersion = defaultVersion;
        this.installedVersion = installedVersion;
        this.comment = comment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public String getInstalledVersion() {
        return this.installedVersion;
    }

    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAvailableExtensions (");

        sb.append(name);
        sb.append(", ").append(defaultVersion);
        sb.append(", ").append(installedVersion);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}