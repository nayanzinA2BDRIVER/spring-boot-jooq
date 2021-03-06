/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.pojos;


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
public class _PgForeignServers implements Serializable {

    private static final long serialVersionUID = -1761577607;

    private Long     oid;
    private String[] srvoptions;
    private String   foreignServerCatalog;
    private String   foreignServerName;
    private String   foreignDataWrapperCatalog;
    private String   foreignDataWrapperName;
    private String   foreignServerType;
    private String   foreignServerVersion;
    private String   authorizationIdentifier;

    public _PgForeignServers() {}

    public _PgForeignServers(_PgForeignServers value) {
        this.oid = value.oid;
        this.srvoptions = value.srvoptions;
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
        this.foreignDataWrapperCatalog = value.foreignDataWrapperCatalog;
        this.foreignDataWrapperName = value.foreignDataWrapperName;
        this.foreignServerType = value.foreignServerType;
        this.foreignServerVersion = value.foreignServerVersion;
        this.authorizationIdentifier = value.authorizationIdentifier;
    }

    public _PgForeignServers(
        Long     oid,
        String[] srvoptions,
        String   foreignServerCatalog,
        String   foreignServerName,
        String   foreignDataWrapperCatalog,
        String   foreignDataWrapperName,
        String   foreignServerType,
        String   foreignServerVersion,
        String   authorizationIdentifier
    ) {
        this.oid = oid;
        this.srvoptions = srvoptions;
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
        this.foreignDataWrapperName = foreignDataWrapperName;
        this.foreignServerType = foreignServerType;
        this.foreignServerVersion = foreignServerVersion;
        this.authorizationIdentifier = authorizationIdentifier;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String[] getSrvoptions() {
        return this.srvoptions;
    }

    public void setSrvoptions(String[] srvoptions) {
        this.srvoptions = srvoptions;
    }

    public String getForeignServerCatalog() {
        return this.foreignServerCatalog;
    }

    public void setForeignServerCatalog(String foreignServerCatalog) {
        this.foreignServerCatalog = foreignServerCatalog;
    }

    public String getForeignServerName() {
        return this.foreignServerName;
    }

    public void setForeignServerName(String foreignServerName) {
        this.foreignServerName = foreignServerName;
    }

    public String getForeignDataWrapperCatalog() {
        return this.foreignDataWrapperCatalog;
    }

    public void setForeignDataWrapperCatalog(String foreignDataWrapperCatalog) {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
    }

    public String getForeignDataWrapperName() {
        return this.foreignDataWrapperName;
    }

    public void setForeignDataWrapperName(String foreignDataWrapperName) {
        this.foreignDataWrapperName = foreignDataWrapperName;
    }

    public String getForeignServerType() {
        return this.foreignServerType;
    }

    public void setForeignServerType(String foreignServerType) {
        this.foreignServerType = foreignServerType;
    }

    public String getForeignServerVersion() {
        return this.foreignServerVersion;
    }

    public void setForeignServerVersion(String foreignServerVersion) {
        this.foreignServerVersion = foreignServerVersion;
    }

    public String getAuthorizationIdentifier() {
        return this.authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(String authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_PgForeignServers (");

        sb.append(oid);
        sb.append(", ").append(Arrays.toString(srvoptions));
        sb.append(", ").append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);
        sb.append(", ").append(foreignDataWrapperCatalog);
        sb.append(", ").append(foreignDataWrapperName);
        sb.append(", ").append(foreignServerType);
        sb.append(", ").append(foreignServerVersion);
        sb.append(", ").append(authorizationIdentifier);

        sb.append(")");
        return sb.toString();
    }
}
