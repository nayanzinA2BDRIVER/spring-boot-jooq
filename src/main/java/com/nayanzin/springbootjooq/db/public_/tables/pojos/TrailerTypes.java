/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import com.nayanzin.springbootjooq.db.public_.enums.TrailerTypeGroup;

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
public class TrailerTypes implements Serializable {

    private static final long serialVersionUID = -1417780109;

    private Integer          id;
    private Integer          translationId;
    private Timestamp        createdDate;
    private Timestamp        modifiedDate;
    private String           createdUser;
    private String           modifiedUser;
    private TrailerTypeGroup typeGroup;
    private Long             typeGroupTranslationId;

    public TrailerTypes() {}

    public TrailerTypes(TrailerTypes value) {
        this.id = value.id;
        this.translationId = value.translationId;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdUser = value.createdUser;
        this.modifiedUser = value.modifiedUser;
        this.typeGroup = value.typeGroup;
        this.typeGroupTranslationId = value.typeGroupTranslationId;
    }

    public TrailerTypes(
        Integer          id,
        Integer          translationId,
        Timestamp        createdDate,
        Timestamp        modifiedDate,
        String           createdUser,
        String           modifiedUser,
        TrailerTypeGroup typeGroup,
        Long             typeGroupTranslationId
    ) {
        this.id = id;
        this.translationId = translationId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdUser = createdUser;
        this.modifiedUser = modifiedUser;
        this.typeGroup = typeGroup;
        this.typeGroupTranslationId = typeGroupTranslationId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTranslationId() {
        return this.translationId;
    }

    public void setTranslationId(Integer translationId) {
        this.translationId = translationId;
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

    public TrailerTypeGroup getTypeGroup() {
        return this.typeGroup;
    }

    public void setTypeGroup(TrailerTypeGroup typeGroup) {
        this.typeGroup = typeGroup;
    }

    public Long getTypeGroupTranslationId() {
        return this.typeGroupTranslationId;
    }

    public void setTypeGroupTranslationId(Long typeGroupTranslationId) {
        this.typeGroupTranslationId = typeGroupTranslationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TrailerTypes (");

        sb.append(id);
        sb.append(", ").append(translationId);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdUser);
        sb.append(", ").append(modifiedUser);
        sb.append(", ").append(typeGroup);
        sb.append(", ").append(typeGroupTranslationId);

        sb.append(")");
        return sb.toString();
    }
}
