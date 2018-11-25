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
public class _PgForeignDataWrappers implements Serializable {

    private static final long serialVersionUID = 900620092;

    private Long     oid;
    private Long     fdwowner;
    private String[] fdwoptions;
    private String   foreignDataWrapperCatalog;
    private String   foreignDataWrapperName;
    private String   authorizationIdentifier;
    private String   foreignDataWrapperLanguage;

    public _PgForeignDataWrappers() {}

    public _PgForeignDataWrappers(_PgForeignDataWrappers value) {
        this.oid = value.oid;
        this.fdwowner = value.fdwowner;
        this.fdwoptions = value.fdwoptions;
        this.foreignDataWrapperCatalog = value.foreignDataWrapperCatalog;
        this.foreignDataWrapperName = value.foreignDataWrapperName;
        this.authorizationIdentifier = value.authorizationIdentifier;
        this.foreignDataWrapperLanguage = value.foreignDataWrapperLanguage;
    }

    public _PgForeignDataWrappers(
        Long     oid,
        Long     fdwowner,
        String[] fdwoptions,
        String   foreignDataWrapperCatalog,
        String   foreignDataWrapperName,
        String   authorizationIdentifier,
        String   foreignDataWrapperLanguage
    ) {
        this.oid = oid;
        this.fdwowner = fdwowner;
        this.fdwoptions = fdwoptions;
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
        this.foreignDataWrapperName = foreignDataWrapperName;
        this.authorizationIdentifier = authorizationIdentifier;
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getFdwowner() {
        return this.fdwowner;
    }

    public void setFdwowner(Long fdwowner) {
        this.fdwowner = fdwowner;
    }

    public String[] getFdwoptions() {
        return this.fdwoptions;
    }

    public void setFdwoptions(String[] fdwoptions) {
        this.fdwoptions = fdwoptions;
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

    public String getAuthorizationIdentifier() {
        return this.authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(String authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
    }

    public String getForeignDataWrapperLanguage() {
        return this.foreignDataWrapperLanguage;
    }

    public void setForeignDataWrapperLanguage(String foreignDataWrapperLanguage) {
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_PgForeignDataWrappers (");

        sb.append(oid);
        sb.append(", ").append(fdwowner);
        sb.append(", ").append(Arrays.toString(fdwoptions));
        sb.append(", ").append(foreignDataWrapperCatalog);
        sb.append(", ").append(foreignDataWrapperName);
        sb.append(", ").append(authorizationIdentifier);
        sb.append(", ").append(foreignDataWrapperLanguage);

        sb.append(")");
        return sb.toString();
    }
}
