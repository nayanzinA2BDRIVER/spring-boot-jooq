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
public class ConstraintColumnUsage implements Serializable {

    private static final long serialVersionUID = -721787937;

    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;

    public ConstraintColumnUsage() {}

    public ConstraintColumnUsage(ConstraintColumnUsage value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
    }

    public ConstraintColumnUsage(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        String constraintCatalog,
        String constraintSchema,
        String constraintName
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
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

    public String getColumnName() {
        return this.columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return this.constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConstraintColumnUsage (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);

        sb.append(")");
        return sb.toString();
    }
}
