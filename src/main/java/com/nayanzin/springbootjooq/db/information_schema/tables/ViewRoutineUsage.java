/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables;


import com.nayanzin.springbootjooq.db.information_schema.InformationSchema;
import com.nayanzin.springbootjooq.db.information_schema.tables.records.ViewRoutineUsageRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class ViewRoutineUsage extends TableImpl<ViewRoutineUsageRecord> {

    private static final long serialVersionUID = 257659959;

    /**
     * The reference instance of <code>information_schema.view_routine_usage</code>
     */
    public static final ViewRoutineUsage VIEW_ROUTINE_USAGE = new ViewRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewRoutineUsageRecord> getRecordType() {
        return ViewRoutineUsageRecord.class;
    }

    /**
     * The column <code>information_schema.view_routine_usage.table_catalog</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_routine_usage.table_schema</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_routine_usage.table_name</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_routine_usage.specific_catalog</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_routine_usage.specific_schema</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.view_routine_usage.specific_name</code>.
     */
    public final TableField<ViewRoutineUsageRecord, String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.view_routine_usage</code> table reference
     */
    public ViewRoutineUsage() {
        this("view_routine_usage", null);
    }

    /**
     * Create an aliased <code>information_schema.view_routine_usage</code> table reference
     */
    public ViewRoutineUsage(String alias) {
        this(alias, VIEW_ROUTINE_USAGE);
    }

    private ViewRoutineUsage(String alias, Table<ViewRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewRoutineUsage(String alias, Table<ViewRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewRoutineUsage as(String alias) {
        return new ViewRoutineUsage(alias, this);
    }

    /**
     * Rename this table
     */
    public ViewRoutineUsage rename(String name) {
        return new ViewRoutineUsage(name, null);
    }
}
