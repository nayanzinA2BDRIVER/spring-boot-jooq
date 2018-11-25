/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.pojos;


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
public class UserMappings implements Serializable {

    private static final long serialVersionUID = 756405281;

    private String authorizationIdentifier;
    private String foreignServerCatalog;
    private String foreignServerName;

    public UserMappings() {}

    public UserMappings(UserMappings value) {
        this.authorizationIdentifier = value.authorizationIdentifier;
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
    }

    public UserMappings(
        String authorizationIdentifier,
        String foreignServerCatalog,
        String foreignServerName
    ) {
        this.authorizationIdentifier = authorizationIdentifier;
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
    }

    public String getAuthorizationIdentifier() {
        return this.authorizationIdentifier;
    }

    public void setAuthorizationIdentifier(String authorizationIdentifier) {
        this.authorizationIdentifier = authorizationIdentifier;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserMappings (");

        sb.append(authorizationIdentifier);
        sb.append(", ").append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);

        sb.append(")");
        return sb.toString();
    }
}
