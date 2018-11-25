/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.records;


import com.nayanzin.springbootjooq.db.pg_catalog.tables.PgType;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


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
public class PgTypeRecord extends TableRecordImpl<PgTypeRecord> {

    private static final long serialVersionUID = 1749475148;

    /**
     * Setter for <code>pg_catalog.pg_type.typname</code>.
     */
    public void setTypname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typname</code>.
     */
    public String getTypname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typnamespace</code>.
     */
    public void setTypnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typnamespace</code>.
     */
    public Long getTypnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typowner</code>.
     */
    public void setTypowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typowner</code>.
     */
    public Long getTypowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typlen</code>.
     */
    public void setTyplen(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typlen</code>.
     */
    public Short getTyplen() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typbyval</code>.
     */
    public void setTypbyval(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typbyval</code>.
     */
    public Boolean getTypbyval() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typtype</code>.
     */
    public void setTyptype(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typtype</code>.
     */
    public String getTyptype() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typcategory</code>.
     */
    public void setTypcategory(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typcategory</code>.
     */
    public String getTypcategory() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typispreferred</code>.
     */
    public void setTypispreferred(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typispreferred</code>.
     */
    public Boolean getTypispreferred() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typisdefined</code>.
     */
    public void setTypisdefined(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typisdefined</code>.
     */
    public Boolean getTypisdefined() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typdelim</code>.
     */
    public void setTypdelim(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typdelim</code>.
     */
    public String getTypdelim() {
        return (String) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typrelid</code>.
     */
    public void setTyprelid(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typrelid</code>.
     */
    public Long getTyprelid() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typelem</code>.
     */
    public void setTypelem(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typelem</code>.
     */
    public Long getTypelem() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typarray</code>.
     */
    public void setTyparray(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typarray</code>.
     */
    public Long getTyparray() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typinput</code>.
     */
    public void setTypinput(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typinput</code>.
     */
    public String getTypinput() {
        return (String) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typoutput</code>.
     */
    public void setTypoutput(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typoutput</code>.
     */
    public String getTypoutput() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typreceive</code>.
     */
    public void setTypreceive(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typreceive</code>.
     */
    public String getTypreceive() {
        return (String) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typsend</code>.
     */
    public void setTypsend(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typsend</code>.
     */
    public String getTypsend() {
        return (String) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typmodin</code>.
     */
    public void setTypmodin(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typmodin</code>.
     */
    public String getTypmodin() {
        return (String) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typmodout</code>.
     */
    public void setTypmodout(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typmodout</code>.
     */
    public String getTypmodout() {
        return (String) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typanalyze</code>.
     */
    public void setTypanalyze(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typanalyze</code>.
     */
    public String getTypanalyze() {
        return (String) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typalign</code>.
     */
    public void setTypalign(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typalign</code>.
     */
    public String getTypalign() {
        return (String) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typstorage</code>.
     */
    public void setTypstorage(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typstorage</code>.
     */
    public String getTypstorage() {
        return (String) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typnotnull</code>.
     */
    public void setTypnotnull(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typnotnull</code>.
     */
    public Boolean getTypnotnull() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typbasetype</code>.
     */
    public void setTypbasetype(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typbasetype</code>.
     */
    public Long getTypbasetype() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typtypmod</code>.
     */
    public void setTyptypmod(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typtypmod</code>.
     */
    public Integer getTyptypmod() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typndims</code>.
     */
    public void setTypndims(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typndims</code>.
     */
    public Integer getTypndims() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typcollation</code>.
     */
    public void setTypcollation(Long value) {
        set(26, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typcollation</code>.
     */
    public Long getTypcollation() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typdefaultbin</code>.
     */
    public void setTypdefaultbin(Object value) {
        set(27, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typdefaultbin</code>.
     */
    public Object getTypdefaultbin() {
        return (Object) get(27);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typdefault</code>.
     */
    public void setTypdefault(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typdefault</code>.
     */
    public String getTypdefault() {
        return (String) get(28);
    }

    /**
     * Setter for <code>pg_catalog.pg_type.typacl</code>.
     */
    public void setTypacl(String[] value) {
        set(29, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_type.typacl</code>.
     */
    public String[] getTypacl() {
        return (String[]) get(29);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTypeRecord
     */
    public PgTypeRecord() {
        super(PgType.PG_TYPE);
    }

    /**
     * Create a detached, initialised PgTypeRecord
     */
    public PgTypeRecord(String typname, Long typnamespace, Long typowner, Short typlen, Boolean typbyval, String typtype, String typcategory, Boolean typispreferred, Boolean typisdefined, String typdelim, Long typrelid, Long typelem, Long typarray, String typinput, String typoutput, String typreceive, String typsend, String typmodin, String typmodout, String typanalyze, String typalign, String typstorage, Boolean typnotnull, Long typbasetype, Integer typtypmod, Integer typndims, Long typcollation, Object typdefaultbin, String typdefault, String[] typacl) {
        super(PgType.PG_TYPE);

        set(0, typname);
        set(1, typnamespace);
        set(2, typowner);
        set(3, typlen);
        set(4, typbyval);
        set(5, typtype);
        set(6, typcategory);
        set(7, typispreferred);
        set(8, typisdefined);
        set(9, typdelim);
        set(10, typrelid);
        set(11, typelem);
        set(12, typarray);
        set(13, typinput);
        set(14, typoutput);
        set(15, typreceive);
        set(16, typsend);
        set(17, typmodin);
        set(18, typmodout);
        set(19, typanalyze);
        set(20, typalign);
        set(21, typstorage);
        set(22, typnotnull);
        set(23, typbasetype);
        set(24, typtypmod);
        set(25, typndims);
        set(26, typcollation);
        set(27, typdefaultbin);
        set(28, typdefault);
        set(29, typacl);
    }
}
