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
public class Views implements Serializable {

    private static final long serialVersionUID = 844864237;

    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String viewDefinition;
    private String checkOption;
    private String isUpdatable;
    private String isInsertableInto;
    private String isTriggerUpdatable;
    private String isTriggerDeletable;
    private String isTriggerInsertableInto;

    public Views() {}

    public Views(Views value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.viewDefinition = value.viewDefinition;
        this.checkOption = value.checkOption;
        this.isUpdatable = value.isUpdatable;
        this.isInsertableInto = value.isInsertableInto;
        this.isTriggerUpdatable = value.isTriggerUpdatable;
        this.isTriggerDeletable = value.isTriggerDeletable;
        this.isTriggerInsertableInto = value.isTriggerInsertableInto;
    }

    public Views(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String viewDefinition,
        String checkOption,
        String isUpdatable,
        String isInsertableInto,
        String isTriggerUpdatable,
        String isTriggerDeletable,
        String isTriggerInsertableInto
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.viewDefinition = viewDefinition;
        this.checkOption = checkOption;
        this.isUpdatable = isUpdatable;
        this.isInsertableInto = isInsertableInto;
        this.isTriggerUpdatable = isTriggerUpdatable;
        this.isTriggerDeletable = isTriggerDeletable;
        this.isTriggerInsertableInto = isTriggerInsertableInto;
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

    public String getViewDefinition() {
        return this.viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    public String getCheckOption() {
        return this.checkOption;
    }

    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    public String getIsUpdatable() {
        return this.isUpdatable;
    }

    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    public String getIsInsertableInto() {
        return this.isInsertableInto;
    }

    public void setIsInsertableInto(String isInsertableInto) {
        this.isInsertableInto = isInsertableInto;
    }

    public String getIsTriggerUpdatable() {
        return this.isTriggerUpdatable;
    }

    public void setIsTriggerUpdatable(String isTriggerUpdatable) {
        this.isTriggerUpdatable = isTriggerUpdatable;
    }

    public String getIsTriggerDeletable() {
        return this.isTriggerDeletable;
    }

    public void setIsTriggerDeletable(String isTriggerDeletable) {
        this.isTriggerDeletable = isTriggerDeletable;
    }

    public String getIsTriggerInsertableInto() {
        return this.isTriggerInsertableInto;
    }

    public void setIsTriggerInsertableInto(String isTriggerInsertableInto) {
        this.isTriggerInsertableInto = isTriggerInsertableInto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Views (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(viewDefinition);
        sb.append(", ").append(checkOption);
        sb.append(", ").append(isUpdatable);
        sb.append(", ").append(isInsertableInto);
        sb.append(", ").append(isTriggerUpdatable);
        sb.append(", ").append(isTriggerDeletable);
        sb.append(", ").append(isTriggerInsertableInto);

        sb.append(")");
        return sb.toString();
    }
}
