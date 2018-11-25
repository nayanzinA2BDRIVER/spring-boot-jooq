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
public class PgForeignDataWrapper implements Serializable {

    private static final long serialVersionUID = 53039670;

    private String   fdwname;
    private Long     fdwowner;
    private Long     fdwhandler;
    private Long     fdwvalidator;
    private String[] fdwacl;
    private String[] fdwoptions;

    public PgForeignDataWrapper() {}

    public PgForeignDataWrapper(PgForeignDataWrapper value) {
        this.fdwname = value.fdwname;
        this.fdwowner = value.fdwowner;
        this.fdwhandler = value.fdwhandler;
        this.fdwvalidator = value.fdwvalidator;
        this.fdwacl = value.fdwacl;
        this.fdwoptions = value.fdwoptions;
    }

    public PgForeignDataWrapper(
        String   fdwname,
        Long     fdwowner,
        Long     fdwhandler,
        Long     fdwvalidator,
        String[] fdwacl,
        String[] fdwoptions
    ) {
        this.fdwname = fdwname;
        this.fdwowner = fdwowner;
        this.fdwhandler = fdwhandler;
        this.fdwvalidator = fdwvalidator;
        this.fdwacl = fdwacl;
        this.fdwoptions = fdwoptions;
    }

    public String getFdwname() {
        return this.fdwname;
    }

    public void setFdwname(String fdwname) {
        this.fdwname = fdwname;
    }

    public Long getFdwowner() {
        return this.fdwowner;
    }

    public void setFdwowner(Long fdwowner) {
        this.fdwowner = fdwowner;
    }

    public Long getFdwhandler() {
        return this.fdwhandler;
    }

    public void setFdwhandler(Long fdwhandler) {
        this.fdwhandler = fdwhandler;
    }

    public Long getFdwvalidator() {
        return this.fdwvalidator;
    }

    public void setFdwvalidator(Long fdwvalidator) {
        this.fdwvalidator = fdwvalidator;
    }

    public String[] getFdwacl() {
        return this.fdwacl;
    }

    public void setFdwacl(String[] fdwacl) {
        this.fdwacl = fdwacl;
    }

    public String[] getFdwoptions() {
        return this.fdwoptions;
    }

    public void setFdwoptions(String[] fdwoptions) {
        this.fdwoptions = fdwoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgForeignDataWrapper (");

        sb.append(fdwname);
        sb.append(", ").append(fdwowner);
        sb.append(", ").append(fdwhandler);
        sb.append(", ").append(fdwvalidator);
        sb.append(", ").append(Arrays.toString(fdwacl));
        sb.append(", ").append(Arrays.toString(fdwoptions));

        sb.append(")");
        return sb.toString();
    }
}
