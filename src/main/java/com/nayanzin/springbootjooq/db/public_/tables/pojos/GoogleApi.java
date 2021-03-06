/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import java.io.Serializable;

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
public class GoogleApi implements Serializable {

    private static final long serialVersionUID = -2121323003;

    private Integer id;
    private String  browserKey;

    public GoogleApi() {}

    public GoogleApi(GoogleApi value) {
        this.id = value.id;
        this.browserKey = value.browserKey;
    }

    public GoogleApi(
        Integer id,
        String  browserKey
    ) {
        this.id = id;
        this.browserKey = browserKey;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrowserKey() {
        return this.browserKey;
    }

    public void setBrowserKey(String browserKey) {
        this.browserKey = browserKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GoogleApi (");

        sb.append(id);
        sb.append(", ").append(browserKey);

        sb.append(")");
        return sb.toString();
    }
}
