/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import com.nayanzin.springbootjooq.db.public_.enums.RolesNames;

import java.io.Serializable;
import java.sql.Timestamp;

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
public class Roles implements Serializable {

    private static final long serialVersionUID = -1947576818;

    private Long       id;
    private Timestamp  createdDate;
    private Timestamp  modifiedDate;
    private String     createdUser;
    private String     modifiedUser;
    private RolesNames role;
    private Long       translationId;

    public Roles() {}

    public Roles(Roles value) {
        this.id = value.id;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdUser = value.createdUser;
        this.modifiedUser = value.modifiedUser;
        this.role = value.role;
        this.translationId = value.translationId;
    }

    public Roles(
        Long       id,
        Timestamp  createdDate,
        Timestamp  modifiedDate,
        String     createdUser,
        String     modifiedUser,
        RolesNames role,
        Long       translationId
    ) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdUser = createdUser;
        this.modifiedUser = modifiedUser;
        this.role = role;
        this.translationId = translationId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getModifiedUser() {
        return this.modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public RolesNames getRole() {
        return this.role;
    }

    public void setRole(RolesNames role) {
        this.role = role;
    }

    public Long getTranslationId() {
        return this.translationId;
    }

    public void setTranslationId(Long translationId) {
        this.translationId = translationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Roles (");

        sb.append(id);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdUser);
        sb.append(", ").append(modifiedUser);
        sb.append(", ").append(role);
        sb.append(", ").append(translationId);

        sb.append(")");
        return sb.toString();
    }
}
