/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_temp_1;


import com.nayanzin.springbootjooq.db.DefaultCatalog;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.impl.SchemaImpl;


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
public class PgTemp_1 extends SchemaImpl {

    private static final long serialVersionUID = -482186211;

    /**
     * The reference instance of <code>pg_temp_1</code>
     */
    public static final PgTemp_1 PG_TEMP_1 = new PgTemp_1();

    /**
     * No further instances allowed
     */
    private PgTemp_1() {
        super("pg_temp_1", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }
}
