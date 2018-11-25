/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables;


import com.nayanzin.springbootjooq.db.information_schema.InformationSchema;
import com.nayanzin.springbootjooq.db.information_schema.tables.records.ViewsRecord;

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
public class Views extends TableImpl<ViewsRecord> {

    private static final long serialVersionUID = 1103356364;

    /**
     * The reference instance of <code>information_schema.views</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewsRecord> getRecordType() {
        return ViewsRecord.class;
    }

    /**
     * The column <code>information_schema.views.table_catalog</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.table_schema</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.table_name</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.view_definition</code>.
     */
    public final TableField<ViewsRecord, String> VIEW_DEFINITION = createField("view_definition", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.check_option</code>.
     */
    public final TableField<ViewsRecord, String> CHECK_OPTION = createField("check_option", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.views.is_updatable</code>.
     */
    public final TableField<ViewsRecord, String> IS_UPDATABLE = createField("is_updatable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>information_schema.views.is_insertable_into</code>.
     */
    public final TableField<ViewsRecord, String> IS_INSERTABLE_INTO = createField("is_insertable_into", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_updatable</code>.
     */
    public final TableField<ViewsRecord, String> IS_TRIGGER_UPDATABLE = createField("is_trigger_updatable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_deletable</code>.
     */
    public final TableField<ViewsRecord, String> IS_TRIGGER_DELETABLE = createField("is_trigger_deletable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>information_schema.views.is_trigger_insertable_into</code>.
     */
    public final TableField<ViewsRecord, String> IS_TRIGGER_INSERTABLE_INTO = createField("is_trigger_insertable_into", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * Create a <code>information_schema.views</code> table reference
     */
    public Views() {
        this("views", null);
    }

    /**
     * Create an aliased <code>information_schema.views</code> table reference
     */
    public Views(String alias) {
        this(alias, VIEWS);
    }

    private Views(String alias, Table<ViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Views(String alias, Table<ViewsRecord> aliased, Field<?>[] parameters) {
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
    public Views as(String alias) {
        return new Views(alias, this);
    }

    /**
     * Rename this table
     */
    public Views rename(String name) {
        return new Views(name, null);
    }
}
