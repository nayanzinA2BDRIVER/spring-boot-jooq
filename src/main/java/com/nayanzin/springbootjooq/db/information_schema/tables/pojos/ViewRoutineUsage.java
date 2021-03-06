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
public class ViewRoutineUsage implements Serializable {

    private static final long serialVersionUID = -442241175;

    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String specificCatalog;
    private String specificSchema;
    private String specificName;

    public ViewRoutineUsage() {}

    public ViewRoutineUsage(ViewRoutineUsage value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
    }

    public ViewRoutineUsage(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String specificCatalog,
        String specificSchema,
        String specificName
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public String getSpecificSchema() {
        return this.specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    public String getSpecificName() {
        return this.specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewRoutineUsage (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);

        sb.append(")");
        return sb.toString();
    }
}
