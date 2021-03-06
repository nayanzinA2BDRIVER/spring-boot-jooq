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
public class ForeignTableOptions implements Serializable {

    private static final long serialVersionUID = -1026216288;

    private String foreignTableCatalog;
    private String foreignTableSchema;
    private String foreignTableName;
    private String optionName;
    private String optionValue;

    public ForeignTableOptions() {}

    public ForeignTableOptions(ForeignTableOptions value) {
        this.foreignTableCatalog = value.foreignTableCatalog;
        this.foreignTableSchema = value.foreignTableSchema;
        this.foreignTableName = value.foreignTableName;
        this.optionName = value.optionName;
        this.optionValue = value.optionValue;
    }

    public ForeignTableOptions(
        String foreignTableCatalog,
        String foreignTableSchema,
        String foreignTableName,
        String optionName,
        String optionValue
    ) {
        this.foreignTableCatalog = foreignTableCatalog;
        this.foreignTableSchema = foreignTableSchema;
        this.foreignTableName = foreignTableName;
        this.optionName = optionName;
        this.optionValue = optionValue;
    }

    public String getForeignTableCatalog() {
        return this.foreignTableCatalog;
    }

    public void setForeignTableCatalog(String foreignTableCatalog) {
        this.foreignTableCatalog = foreignTableCatalog;
    }

    public String getForeignTableSchema() {
        return this.foreignTableSchema;
    }

    public void setForeignTableSchema(String foreignTableSchema) {
        this.foreignTableSchema = foreignTableSchema;
    }

    public String getForeignTableName() {
        return this.foreignTableName;
    }

    public void setForeignTableName(String foreignTableName) {
        this.foreignTableName = foreignTableName;
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
        StringBuilder sb = new StringBuilder("ForeignTableOptions (");

        sb.append(foreignTableCatalog);
        sb.append(", ").append(foreignTableSchema);
        sb.append(", ").append(foreignTableName);
        sb.append(", ").append(optionName);
        sb.append(", ").append(optionValue);

        sb.append(")");
        return sb.toString();
    }
}
