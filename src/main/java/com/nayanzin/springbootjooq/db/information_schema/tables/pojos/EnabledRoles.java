/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.pojos;


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
public class EnabledRoles implements Serializable {

    private static final long serialVersionUID = 1286574454;

    private String roleName;

    public EnabledRoles() {}

    public EnabledRoles(EnabledRoles value) {
        this.roleName = value.roleName;
    }

    public EnabledRoles(
        String roleName
    ) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnabledRoles (");

        sb.append(roleName);

        sb.append(")");
        return sb.toString();
    }
}
