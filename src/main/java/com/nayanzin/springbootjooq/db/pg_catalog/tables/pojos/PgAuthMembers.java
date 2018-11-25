/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


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
public class PgAuthMembers implements Serializable {

    private static final long serialVersionUID = 739923638;

    private Long    roleid;
    private Long    member;
    private Long    grantor;
    private Boolean adminOption;

    public PgAuthMembers() {}

    public PgAuthMembers(PgAuthMembers value) {
        this.roleid = value.roleid;
        this.member = value.member;
        this.grantor = value.grantor;
        this.adminOption = value.adminOption;
    }

    public PgAuthMembers(
        Long    roleid,
        Long    member,
        Long    grantor,
        Boolean adminOption
    ) {
        this.roleid = roleid;
        this.member = member;
        this.grantor = grantor;
        this.adminOption = adminOption;
    }

    public Long getRoleid() {
        return this.roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getMember() {
        return this.member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getGrantor() {
        return this.grantor;
    }

    public void setGrantor(Long grantor) {
        this.grantor = grantor;
    }

    public Boolean getAdminOption() {
        return this.adminOption;
    }

    public void setAdminOption(Boolean adminOption) {
        this.adminOption = adminOption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgAuthMembers (");

        sb.append(roleid);
        sb.append(", ").append(member);
        sb.append(", ").append(grantor);
        sb.append(", ").append(adminOption);

        sb.append(")");
        return sb.toString();
    }
}