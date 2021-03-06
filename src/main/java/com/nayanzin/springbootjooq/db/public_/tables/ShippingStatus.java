/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables;


import com.nayanzin.springbootjooq.db.public_.Keys;
import com.nayanzin.springbootjooq.db.public_.Public;
import com.nayanzin.springbootjooq.db.public_.tables.records.ShippingStatusRecord;

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
public class ShippingStatus extends TableImpl<ShippingStatusRecord> {

    private static final long serialVersionUID = -2057215862;

    /**
     * The reference instance of <code>public.shipping_status</code>
     */
    public static final ShippingStatus SHIPPING_STATUS = new ShippingStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingStatusRecord> getRecordType() {
        return ShippingStatusRecord.class;
    }

    /**
     * The column <code>public.shipping_status.status_code</code>.
     */
    public final TableField<ShippingStatusRecord, String> STATUS_CODE = createField("status_code", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

    /**
     * The column <code>public.shipping_status.translation_id</code>.
     */
    public final TableField<ShippingStatusRecord, Long> TRANSLATION_ID = createField("translation_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.shipping_status.description</code>.
     */
    public final TableField<ShippingStatusRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * Create a <code>public.shipping_status</code> table reference
     */
    public ShippingStatus() {
        this("shipping_status", null);
    }

    /**
     * Create an aliased <code>public.shipping_status</code> table reference
     */
    public ShippingStatus(String alias) {
        this(alias, SHIPPING_STATUS);
    }

    private ShippingStatus(String alias, Table<ShippingStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingStatus(String alias, Table<ShippingStatusRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ShippingStatusRecord> getPrimaryKey() {
        return Keys.SHIPPING_STATUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShippingStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippingStatusRecord>>asList(Keys.SHIPPING_STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShippingStatusRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShippingStatusRecord, ?>>asList(Keys.SHIPPING_STATUS__SHIPPING_STATUS_TRANSLATION_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShippingStatus as(String alias) {
        return new ShippingStatus(alias, this);
    }

    /**
     * Rename this table
     */
    public ShippingStatus rename(String name) {
        return new ShippingStatus(name, null);
    }
}
