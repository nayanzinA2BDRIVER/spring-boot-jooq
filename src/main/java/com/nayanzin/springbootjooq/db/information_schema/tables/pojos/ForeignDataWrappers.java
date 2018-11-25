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
public class ForeignDataWrappers implements Serializable {

    private static final long serialVersionUID = 1219697784;

    private String foreignDataWrapperCatalog;
    private String foreignDataWrapperName;
    private String authorizationIdentifier;
    private String libraryName;
    private String foreignDataWrapperLanguage;

    public ForeignDataWrappers() {}

    public ForeignDataWrappers(ForeignDataWrappers value) {
        this.foreignDataWrapperCatalog = value.foreignDataWrapperCatalog;
        this.foreignDataWrapperName = value.foreignDataWrapperName;
        this.authorizationIdentifier = value.authorizationIdentifier;
        this.libraryName = value.libraryName;
        this.foreignDataWrapperLanguage = value.foreignDataWrapperLanguage;
    }

    public ForeignDataWrappers(
        String foreignDataWrapperCatalog,
        String foreignDataWrapperName,
        String authorizationIdentifier,
        String libraryName,
        String foreignDataWrapperLanguage
    ) {
        this.foreignDataWrapperCatalog = foreignDataWrapperCatalog;
        this.foreignDataWrapperName = foreignDataWrapperName;
        this.authorizationIdentifier = authorizationIdentifier;
        this.libraryName = libraryName;
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
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

    public String getLibraryName() {
        return this.libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getForeignDataWrapperLanguage() {
        return this.foreignDataWrapperLanguage;
    }

    public void setForeignDataWrapperLanguage(String foreignDataWrapperLanguage) {
        this.foreignDataWrapperLanguage = foreignDataWrapperLanguage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignDataWrappers (");

        sb.append(foreignDataWrapperCatalog);
        sb.append(", ").append(foreignDataWrapperName);
        sb.append(", ").append(authorizationIdentifier);
        sb.append(", ").append(libraryName);
        sb.append(", ").append(foreignDataWrapperLanguage);

        sb.append(")");
        return sb.toString();
    }
}
