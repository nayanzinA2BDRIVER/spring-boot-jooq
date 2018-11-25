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
public class UserMappingOptions implements Serializable {

    private static final long serialVersionUID = -1554530161;

    private String authorizationIdentifier;
    private String foreignServerCatalog;
    private String foreignServerName;
    private String optionName;
    private String optionValue;

    public UserMappingOptions() {}

    public UserMappingOptions(UserMappingOptions value) {
        this.authorizationIdentifier = value.authorizationIdentifier;
        this.foreignServerCatalog = value.foreignServerCatalog;
        this.foreignServerName = value.foreignServerName;
        this.optionName = value.optionName;
        this.optionValue = value.optionValue;
    }

    public UserMappingOptions(
        String authorizationIdentifier,
        String foreignServerCatalog,
        String foreignServerName,
        String optionName,
        String optionValue
    ) {
        this.authorizationIdentifier = authorizationIdentifier;
        this.foreignServerCatalog = foreignServerCatalog;
        this.foreignServerName = foreignServerName;
        this.optionName = optionName;
        this.optionValue = optionValue;
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

    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return this.optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserMappingOptions (");

        sb.append(authorizationIdentifier);
        sb.append(", ").append(foreignServerCatalog);
        sb.append(", ").append(foreignServerName);
        sb.append(", ").append(optionName);
        sb.append(", ").append(optionValue);

        sb.append(")");
        return sb.toString();
    }
}
