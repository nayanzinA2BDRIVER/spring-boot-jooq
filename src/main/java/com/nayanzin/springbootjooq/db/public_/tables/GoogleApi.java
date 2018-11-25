/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.GoogleApiRecord;

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
public class GoogleApi extends TableImpl<GoogleApiRecord> {

    private static final long serialVersionUID = 931979806;

    /**
     * The reference instance of <code>public.google_api</code>
     */
    public static final GoogleApi GOOGLE_API = new GoogleApi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoogleApiRecord> getRecordType() {
        return GoogleApiRecord.class;
    }

    /**
     * The column <code>public.google_api.id</code>.
     */
    public final TableField<GoogleApiRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.google_api.browser_key</code>.
     */
    public final TableField<GoogleApiRecord, String> BROWSER_KEY = createField("browser_key", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * Create a <code>public.google_api</code> table reference
     */
    public GoogleApi() {
        this("google_api", null);
    }

    /**
     * Create an aliased <code>public.google_api</code> table reference
     */
    public GoogleApi(String alias) {
        this(alias, GOOGLE_API);
    }

    private GoogleApi(String alias, Table<GoogleApiRecord> aliased) {
        this(alias, aliased, null);
    }

    private GoogleApi(String alias, Table<GoogleApiRecord> aliased, Field<?>[] parameters) {
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
    public GoogleApi as(String alias) {
        return new GoogleApi(alias, this);
    }

    /**
     * Rename this table
     */
    public GoogleApi rename(String name) {
        return new GoogleApi(name, null);
    }
}
