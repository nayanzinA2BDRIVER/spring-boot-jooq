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
public class PgStatSsl implements Serializable {

    private static final long serialVersionUID = 2034863061;

    private Integer pid;
    private Boolean ssl;
    private String  version;
    private String  cipher;
    private Integer bits;
    private Boolean compression;
    private String  clientdn;

    public PgStatSsl() {}

    public PgStatSsl(PgStatSsl value) {
        this.pid = value.pid;
        this.ssl = value.ssl;
        this.version = value.version;
        this.cipher = value.cipher;
        this.bits = value.bits;
        this.compression = value.compression;
        this.clientdn = value.clientdn;
    }

    public PgStatSsl(
        Integer pid,
        Boolean ssl,
        String  version,
        String  cipher,
        Integer bits,
        Boolean compression,
        String  clientdn
    ) {
        this.pid = pid;
        this.ssl = ssl;
        this.version = version;
        this.cipher = cipher;
        this.bits = bits;
        this.compression = compression;
        this.clientdn = clientdn;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Boolean getSsl() {
        return this.ssl;
    }

    public void setSsl(Boolean ssl) {
        this.ssl = ssl;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCipher() {
        return this.cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public Integer getBits() {
        return this.bits;
    }

    public void setBits(Integer bits) {
        this.bits = bits;
    }

    public Boolean getCompression() {
        return this.compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    public String getClientdn() {
        return this.clientdn;
    }

    public void setClientdn(String clientdn) {
        this.clientdn = clientdn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSsl (");

        sb.append(pid);
        sb.append(", ").append(ssl);
        sb.append(", ").append(version);
        sb.append(", ").append(cipher);
        sb.append(", ").append(bits);
        sb.append(", ").append(compression);
        sb.append(", ").append(clientdn);

        sb.append(")");
        return sb.toString();
    }
}
