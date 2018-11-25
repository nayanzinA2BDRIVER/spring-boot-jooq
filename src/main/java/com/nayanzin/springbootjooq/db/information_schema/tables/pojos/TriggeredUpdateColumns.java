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
public class TriggeredUpdateColumns implements Serializable {

    private static final long serialVersionUID = 1249691388;

    private String triggerCatalog;
    private String triggerSchema;
    private String triggerName;
    private String eventObjectCatalog;
    private String eventObjectSchema;
    private String eventObjectTable;
    private String eventObjectColumn;

    public TriggeredUpdateColumns() {}

    public TriggeredUpdateColumns(TriggeredUpdateColumns value) {
        this.triggerCatalog = value.triggerCatalog;
        this.triggerSchema = value.triggerSchema;
        this.triggerName = value.triggerName;
        this.eventObjectCatalog = value.eventObjectCatalog;
        this.eventObjectSchema = value.eventObjectSchema;
        this.eventObjectTable = value.eventObjectTable;
        this.eventObjectColumn = value.eventObjectColumn;
    }

    public TriggeredUpdateColumns(
        String triggerCatalog,
        String triggerSchema,
        String triggerName,
        String eventObjectCatalog,
        String eventObjectSchema,
        String eventObjectTable,
        String eventObjectColumn
    ) {
        this.triggerCatalog = triggerCatalog;
        this.triggerSchema = triggerSchema;
        this.triggerName = triggerName;
        this.eventObjectCatalog = eventObjectCatalog;
        this.eventObjectSchema = eventObjectSchema;
        this.eventObjectTable = eventObjectTable;
        this.eventObjectColumn = eventObjectColumn;
    }

    public String getTriggerCatalog() {
        return this.triggerCatalog;
    }

    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    public String getTriggerSchema() {
        return this.triggerSchema;
    }

    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    public String getTriggerName() {
        return this.triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getEventObjectCatalog() {
        return this.eventObjectCatalog;
    }

    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    public String getEventObjectSchema() {
        return this.eventObjectSchema;
    }

    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    public String getEventObjectTable() {
        return this.eventObjectTable;
    }

    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    public String getEventObjectColumn() {
        return this.eventObjectColumn;
    }

    public void setEventObjectColumn(String eventObjectColumn) {
        this.eventObjectColumn = eventObjectColumn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TriggeredUpdateColumns (");

        sb.append(triggerCatalog);
        sb.append(", ").append(triggerSchema);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(eventObjectCatalog);
        sb.append(", ").append(eventObjectSchema);
        sb.append(", ").append(eventObjectTable);
        sb.append(", ").append(eventObjectColumn);

        sb.append(")");
        return sb.toString();
    }
}
