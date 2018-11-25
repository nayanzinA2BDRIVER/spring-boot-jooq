/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.TrkSystemsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class TrkSystems extends TableImpl<TrkSystemsRecord> {

    private static final long serialVersionUID = -641701840;

    /**
     * The reference instance of <code>public.trk_systems</code>
     */
    public static final TrkSystems TRK_SYSTEMS = new TrkSystems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrkSystemsRecord> getRecordType() {
        return TrkSystemsRecord.class;
    }

    /**
     * The column <code>public.trk_systems.id</code>.
     */
    public final TableField<TrkSystemsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('trk_system_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.trk_systems.name</code>.
     */
    public final TableField<TrkSystemsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>public.trk_systems.operator_for_infopolus</code>.
     */
    public final TableField<TrkSystemsRecord, Long> OPERATOR_FOR_INFOPOLUS = createField("operator_for_infopolus", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.trk_systems.system_identifier</code>.
     */
    public final TableField<TrkSystemsRecord, Long> SYSTEM_IDENTIFIER = createField("system_identifier", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.trk_systems</code> table reference
     */
    public TrkSystems() {
        this("trk_systems", null);
    }

    /**
     * Create an aliased <code>public.trk_systems</code> table reference
     */
    public TrkSystems(String alias) {
        this(alias, TRK_SYSTEMS);
    }

    private TrkSystems(String alias, Table<TrkSystemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrkSystems(String alias, Table<TrkSystemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TrkSystemsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRK_SYSTEMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrkSystemsRecord> getPrimaryKey() {
        return Keys.SYSTEMS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrkSystemsRecord>> getKeys() {
        return Arrays.<UniqueKey<TrkSystemsRecord>>asList(Keys.SYSTEMS_PKEY, Keys.SYSTEMS_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrkSystems as(String alias) {
        return new TrkSystems(alias, this);
    }

    /**
     * Rename this table
     */
    public TrkSystems rename(String name) {
        return new TrkSystems(name, null);
    }
}