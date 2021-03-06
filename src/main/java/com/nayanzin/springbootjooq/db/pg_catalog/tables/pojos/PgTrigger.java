/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


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
public class PgTrigger implements Serializable {

    private static final long serialVersionUID = -1600008403;

    private Long     tgrelid;
    private String   tgname;
    private Long     tgfoid;
    private Short    tgtype;
    private String   tgenabled;
    private Boolean  tgisinternal;
    private Long     tgconstrrelid;
    private Long     tgconstrindid;
    private Long     tgconstraint;
    private Boolean  tgdeferrable;
    private Boolean  tginitdeferred;
    private Short    tgnargs;
    private Object[] tgattr;
    private byte[]   tgargs;
    private Object   tgqual;
    private String   tgoldtable;
    private String   tgnewtable;

    public PgTrigger() {}

    public PgTrigger(PgTrigger value) {
        this.tgrelid = value.tgrelid;
        this.tgname = value.tgname;
        this.tgfoid = value.tgfoid;
        this.tgtype = value.tgtype;
        this.tgenabled = value.tgenabled;
        this.tgisinternal = value.tgisinternal;
        this.tgconstrrelid = value.tgconstrrelid;
        this.tgconstrindid = value.tgconstrindid;
        this.tgconstraint = value.tgconstraint;
        this.tgdeferrable = value.tgdeferrable;
        this.tginitdeferred = value.tginitdeferred;
        this.tgnargs = value.tgnargs;
        this.tgattr = value.tgattr;
        this.tgargs = value.tgargs;
        this.tgqual = value.tgqual;
        this.tgoldtable = value.tgoldtable;
        this.tgnewtable = value.tgnewtable;
    }

    public PgTrigger(
        Long     tgrelid,
        String   tgname,
        Long     tgfoid,
        Short    tgtype,
        String   tgenabled,
        Boolean  tgisinternal,
        Long     tgconstrrelid,
        Long     tgconstrindid,
        Long     tgconstraint,
        Boolean  tgdeferrable,
        Boolean  tginitdeferred,
        Short    tgnargs,
        Object[] tgattr,
        byte[]   tgargs,
        Object   tgqual,
        String   tgoldtable,
        String   tgnewtable
    ) {
        this.tgrelid = tgrelid;
        this.tgname = tgname;
        this.tgfoid = tgfoid;
        this.tgtype = tgtype;
        this.tgenabled = tgenabled;
        this.tgisinternal = tgisinternal;
        this.tgconstrrelid = tgconstrrelid;
        this.tgconstrindid = tgconstrindid;
        this.tgconstraint = tgconstraint;
        this.tgdeferrable = tgdeferrable;
        this.tginitdeferred = tginitdeferred;
        this.tgnargs = tgnargs;
        this.tgattr = tgattr;
        this.tgargs = tgargs;
        this.tgqual = tgqual;
        this.tgoldtable = tgoldtable;
        this.tgnewtable = tgnewtable;
    }

    public Long getTgrelid() {
        return this.tgrelid;
    }

    public void setTgrelid(Long tgrelid) {
        this.tgrelid = tgrelid;
    }

    public String getTgname() {
        return this.tgname;
    }

    public void setTgname(String tgname) {
        this.tgname = tgname;
    }

    public Long getTgfoid() {
        return this.tgfoid;
    }

    public void setTgfoid(Long tgfoid) {
        this.tgfoid = tgfoid;
    }

    public Short getTgtype() {
        return this.tgtype;
    }

    public void setTgtype(Short tgtype) {
        this.tgtype = tgtype;
    }

    public String getTgenabled() {
        return this.tgenabled;
    }

    public void setTgenabled(String tgenabled) {
        this.tgenabled = tgenabled;
    }

    public Boolean getTgisinternal() {
        return this.tgisinternal;
    }

    public void setTgisinternal(Boolean tgisinternal) {
        this.tgisinternal = tgisinternal;
    }

    public Long getTgconstrrelid() {
        return this.tgconstrrelid;
    }

    public void setTgconstrrelid(Long tgconstrrelid) {
        this.tgconstrrelid = tgconstrrelid;
    }

    public Long getTgconstrindid() {
        return this.tgconstrindid;
    }

    public void setTgconstrindid(Long tgconstrindid) {
        this.tgconstrindid = tgconstrindid;
    }

    public Long getTgconstraint() {
        return this.tgconstraint;
    }

    public void setTgconstraint(Long tgconstraint) {
        this.tgconstraint = tgconstraint;
    }

    public Boolean getTgdeferrable() {
        return this.tgdeferrable;
    }

    public void setTgdeferrable(Boolean tgdeferrable) {
        this.tgdeferrable = tgdeferrable;
    }

    public Boolean getTginitdeferred() {
        return this.tginitdeferred;
    }

    public void setTginitdeferred(Boolean tginitdeferred) {
        this.tginitdeferred = tginitdeferred;
    }

    public Short getTgnargs() {
        return this.tgnargs;
    }

    public void setTgnargs(Short tgnargs) {
        this.tgnargs = tgnargs;
    }

    public Object[] getTgattr() {
        return this.tgattr;
    }

    public void setTgattr(Object[] tgattr) {
        this.tgattr = tgattr;
    }

    public byte[] getTgargs() {
        return this.tgargs;
    }

    public void setTgargs(byte[] tgargs) {
        this.tgargs = tgargs;
    }

    public Object getTgqual() {
        return this.tgqual;
    }

    public void setTgqual(Object tgqual) {
        this.tgqual = tgqual;
    }

    public String getTgoldtable() {
        return this.tgoldtable;
    }

    public void setTgoldtable(String tgoldtable) {
        this.tgoldtable = tgoldtable;
    }

    public String getTgnewtable() {
        return this.tgnewtable;
    }

    public void setTgnewtable(String tgnewtable) {
        this.tgnewtable = tgnewtable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTrigger (");

        sb.append(tgrelid);
        sb.append(", ").append(tgname);
        sb.append(", ").append(tgfoid);
        sb.append(", ").append(tgtype);
        sb.append(", ").append(tgenabled);
        sb.append(", ").append(tgisinternal);
        sb.append(", ").append(tgconstrrelid);
        sb.append(", ").append(tgconstrindid);
        sb.append(", ").append(tgconstraint);
        sb.append(", ").append(tgdeferrable);
        sb.append(", ").append(tginitdeferred);
        sb.append(", ").append(tgnargs);
        sb.append(", ").append(Arrays.toString(tgattr));
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(tgqual);
        sb.append(", ").append(tgoldtable);
        sb.append(", ").append(tgnewtable);

        sb.append(")");
        return sb.toString();
    }
}
