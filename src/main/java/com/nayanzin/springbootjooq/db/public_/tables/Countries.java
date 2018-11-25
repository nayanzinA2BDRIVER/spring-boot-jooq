/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.CountriesRecord;

import java.sql.Timestamp;
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
public class Countries extends TableImpl<CountriesRecord> {

    private static final long serialVersionUID = 353094560;

    /**
     * The reference instance of <code>public.countries</code>
     */
    public static final Countries COUNTRIES = new Countries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountriesRecord> getRecordType() {
        return CountriesRecord.class;
    }

    /**
     * The column <code>public.countries.code</code>.
     */
    public final TableField<CountriesRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>public.countries.translation_id</code>.
     */
    public final TableField<CountriesRecord, Long> TRANSLATION_ID = createField("translation_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.countries.created_date</code>.
     */
    public final TableField<CountriesRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.countries.modified_date</code>.
     */
    public final TableField<CountriesRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.countries.created_user</code>.
     */
    public final TableField<CountriesRecord, String> CREATED_USER = createField("created_user", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.field("\"current_user\"()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.countries.modified_user</code>.
     */
    public final TableField<CountriesRecord, String> MODIFIED_USER = createField("modified_user", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>public.countries.region_id</code>.
     */
    public final TableField<CountriesRecord, Integer> REGION_ID = createField("region_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.countries.code_iso</code>.
     */
    public final TableField<CountriesRecord, Short> CODE_ISO = createField("code_iso", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.countries.currency_code</code>.
     */
    public final TableField<CountriesRecord, String> CURRENCY_CODE = createField("currency_code", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

    /**
     * The column <code>public.countries.in_use</code>.
     */
    public final TableField<CountriesRecord, Boolean> IN_USE = createField("in_use", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.countries</code> table reference
     */
    public Countries() {
        this("countries", null);
    }

    /**
     * Create an aliased <code>public.countries</code> table reference
     */
    public Countries(String alias) {
        this(alias, COUNTRIES);
    }

    private Countries(String alias, Table<CountriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Countries(String alias, Table<CountriesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CountriesRecord> getPrimaryKey() {
        return Keys.COUNTRIES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountriesRecord>> getKeys() {
        return Arrays.<UniqueKey<CountriesRecord>>asList(Keys.COUNTRIES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CountriesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CountriesRecord, ?>>asList(Keys.COUNTRIES__FK_COUNTRIES_TRANSLATIONS, Keys.COUNTRIES__FK_REGION_ID, Keys.COUNTRIES__FK_CURRENCY_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Countries as(String alias) {
        return new Countries(alias, this);
    }

    /**
     * Rename this table
     */
    public Countries rename(String name) {
        return new Countries(name, null);
    }
}