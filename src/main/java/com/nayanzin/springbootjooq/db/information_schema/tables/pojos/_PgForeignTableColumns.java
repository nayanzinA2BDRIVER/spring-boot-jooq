/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

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
public class _PgForeignTableColumns implements Serializable {

    private static final long serialVersionUID = -1817212822;

    private String   nspname;
    private String   relname;
    private String   attname;
    private String[] attfdwoptions;

    public _PgForeignTableColumns() {}

    public _PgForeignTableColumns(_PgForeignTableColumns value) {
        this.nspname = value.nspname;
        this.relname = value.relname;
        this.attname = value.attname;
        this.attfdwoptions = value.attfdwoptions;
    }

    public _PgForeignTableColumns(
        String   nspname,
        String   relname,
        String   attname,
        String[] attfdwoptions
    ) {
        this.nspname = nspname;
        this.relname = relname;
        this.attname = attname;
        this.attfdwoptions = attfdwoptions;
    }

    public String getNspname() {
        return this.nspname;
    }

    public void setNspname(String nspname) {
        this.nspname = nspname;
    }

    public String getRelname() {
        return this.relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public String getAttname() {
        return this.attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public String[] getAttfdwoptions() {
        return this.attfdwoptions;
    }

    public void setAttfdwoptions(String[] attfdwoptions) {
        this.attfdwoptions = attfdwoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_PgForeignTableColumns (");

        sb.append(nspname);
        sb.append(", ").append(relname);
        sb.append(", ").append(attname);
        sb.append(", ").append(Arrays.toString(attfdwoptions));

        sb.append(")");
        return sb.toString();
    }
}