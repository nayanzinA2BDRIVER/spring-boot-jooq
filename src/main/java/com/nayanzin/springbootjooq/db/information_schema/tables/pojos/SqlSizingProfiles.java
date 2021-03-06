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
public class SqlSizingProfiles implements Serializable {

    private static final long serialVersionUID = -1783515921;

    private Integer sizingId;
    private String  sizingName;
    private String  profileId;
    private Integer requiredValue;
    private String  comments;

    public SqlSizingProfiles() {}

    public SqlSizingProfiles(SqlSizingProfiles value) {
        this.sizingId = value.sizingId;
        this.sizingName = value.sizingName;
        this.profileId = value.profileId;
        this.requiredValue = value.requiredValue;
        this.comments = value.comments;
    }

    public SqlSizingProfiles(
        Integer sizingId,
        String  sizingName,
        String  profileId,
        Integer requiredValue,
        String  comments
    ) {
        this.sizingId = sizingId;
        this.sizingName = sizingName;
        this.profileId = profileId;
        this.requiredValue = requiredValue;
        this.comments = comments;
    }

    public Integer getSizingId() {
        return this.sizingId;
    }

    public void setSizingId(Integer sizingId) {
        this.sizingId = sizingId;
    }

    public String getSizingName() {
        return this.sizingName;
    }

    public void setSizingName(String sizingName) {
        this.sizingName = sizingName;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Integer getRequiredValue() {
        return this.requiredValue;
    }

    public void setRequiredValue(Integer requiredValue) {
        this.requiredValue = requiredValue;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlSizingProfiles (");

        sb.append(sizingId);
        sb.append(", ").append(sizingName);
        sb.append(", ").append(profileId);
        sb.append(", ").append(requiredValue);
        sb.append(", ").append(comments);

        sb.append(")");
        return sb.toString();
    }
}
