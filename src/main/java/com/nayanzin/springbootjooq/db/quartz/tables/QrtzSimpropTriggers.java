/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.quartz.tables;


import com.nayanzin.springbootjooq.db.quartz.Keys;
import com.nayanzin.springbootjooq.db.quartz.Quartz;
import com.nayanzin.springbootjooq.db.quartz.tables.records.QrtzSimpropTriggersRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class QrtzSimpropTriggers extends TableImpl<QrtzSimpropTriggersRecord> {

    private static final long serialVersionUID = 381573007;

    /**
     * The reference instance of <code>quartz.qrtz_simprop_triggers</code>
     */
    public static final QrtzSimpropTriggers QRTZ_SIMPROP_TRIGGERS = new QrtzSimpropTriggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QrtzSimpropTriggersRecord> getRecordType() {
        return QrtzSimpropTriggersRecord.class;
    }

    /**
     * The column <code>quartz.qrtz_simprop_triggers.sched_name</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, String> SCHED_NAME = createField("sched_name", org.jooq.impl.SQLDataType.VARCHAR.length(120).nullable(false), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.trigger_name</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, String> TRIGGER_NAME = createField("trigger_name", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.trigger_group</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, String> TRIGGER_GROUP = createField("trigger_group", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.str_prop_1</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, String> STR_PROP_1 = createField("str_prop_1", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.str_prop_2</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, String> STR_PROP_2 = createField("str_prop_2", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.str_prop_3</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, String> STR_PROP_3 = createField("str_prop_3", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.int_prop_1</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, Integer> INT_PROP_1 = createField("int_prop_1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.int_prop_2</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, Integer> INT_PROP_2 = createField("int_prop_2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.long_prop_1</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, Long> LONG_PROP_1 = createField("long_prop_1", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.long_prop_2</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, Long> LONG_PROP_2 = createField("long_prop_2", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.dec_prop_1</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, BigDecimal> DEC_PROP_1 = createField("dec_prop_1", org.jooq.impl.SQLDataType.NUMERIC.precision(13, 4), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.dec_prop_2</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, BigDecimal> DEC_PROP_2 = createField("dec_prop_2", org.jooq.impl.SQLDataType.NUMERIC.precision(13, 4), this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.bool_prop_1</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, Boolean> BOOL_PROP_1 = createField("bool_prop_1", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>quartz.qrtz_simprop_triggers.bool_prop_2</code>.
     */
    public final TableField<QrtzSimpropTriggersRecord, Boolean> BOOL_PROP_2 = createField("bool_prop_2", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>quartz.qrtz_simprop_triggers</code> table reference
     */
    public QrtzSimpropTriggers() {
        this("qrtz_simprop_triggers", null);
    }

    /**
     * Create an aliased <code>quartz.qrtz_simprop_triggers</code> table reference
     */
    public QrtzSimpropTriggers(String alias) {
        this(alias, QRTZ_SIMPROP_TRIGGERS);
    }

    private QrtzSimpropTriggers(String alias, Table<QrtzSimpropTriggersRecord> aliased) {
        this(alias, aliased, null);
    }

    private QrtzSimpropTriggers(String alias, Table<QrtzSimpropTriggersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Quartz.QUARTZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<QrtzSimpropTriggersRecord> getPrimaryKey() {
        return Keys.QRTZ_SIMPROP_TRIGGERS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<QrtzSimpropTriggersRecord>> getKeys() {
        return Arrays.<UniqueKey<QrtzSimpropTriggersRecord>>asList(Keys.QRTZ_SIMPROP_TRIGGERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<QrtzSimpropTriggersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QrtzSimpropTriggersRecord, ?>>asList(Keys.QRTZ_SIMPROP_TRIGGERS__QRTZ_SIMPROP_TRIGGERS_SCHED_NAME_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QrtzSimpropTriggers as(String alias) {
        return new QrtzSimpropTriggers(alias, this);
    }

    /**
     * Rename this table
     */
    public QrtzSimpropTriggers rename(String name) {
        return new QrtzSimpropTriggers(name, null);
    }
}
