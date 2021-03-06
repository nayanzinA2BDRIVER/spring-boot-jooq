/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.enums;


import com.nayanzin.springbootjooq.db.public_.Public;

import javax.annotation.Generated;

import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum ApplicationStatus implements EnumType {

    DRAFT("DRAFT"),

    SUBMITTED("SUBMITTED"),

    CANCELED("CANCELED"),

    SELECTED("SELECTED"),

    CONFIRMED("CONFIRMED");

    private final String literal;

    private ApplicationStatus(String literal) {
        this.literal = literal;
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
    public String getName() {
        return "application_status";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
