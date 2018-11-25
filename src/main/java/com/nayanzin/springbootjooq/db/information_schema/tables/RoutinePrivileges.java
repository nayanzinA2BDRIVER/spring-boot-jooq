/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables;


import com.nayanzin.springbootjooq.db.information_schema.InformationSchema;
import com.nayanzin.springbootjooq.db.information_schema.tables.records.RoutinePrivilegesRecord;

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
public class RoutinePrivileges extends TableImpl<RoutinePrivilegesRecord> {

    private static final long serialVersionUID = 1168001331;

    /**
     * The reference instance of <code>information_schema.routine_privileges</code>
     */
    public static final RoutinePrivileges ROUTINE_PRIVILEGES = new RoutinePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutinePrivilegesRecord> getRecordType() {
        return RoutinePrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.routine_privileges.grantor</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.grantee</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.specific_catalog</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.specific_schema</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.specific_name</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.routine_catalog</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> ROUTINE_CATALOG = createField("routine_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.routine_schema</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> ROUTINE_SCHEMA = createField("routine_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.routine_name</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> ROUTINE_NAME = createField("routine_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.privilege_type</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.routine_privileges.is_grantable</code>.
     */
    public final TableField<RoutinePrivilegesRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * Create a <code>information_schema.routine_privileges</code> table reference
     */
    public RoutinePrivileges() {
        this("routine_privileges", null);
    }

    /**
     * Create an aliased <code>information_schema.routine_privileges</code> table reference
     */
    public RoutinePrivileges(String alias) {
        this(alias, ROUTINE_PRIVILEGES);
    }

    private RoutinePrivileges(String alias, Table<RoutinePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutinePrivileges(String alias, Table<RoutinePrivilegesRecord> aliased, Field<?>[] parameters) {
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
    public RoutinePrivileges as(String alias) {
        return new RoutinePrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    public RoutinePrivileges rename(String name) {
        return new RoutinePrivileges(name, null);
    }
}