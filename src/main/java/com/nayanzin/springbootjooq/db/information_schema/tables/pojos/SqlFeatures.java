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
public class SqlFeatures implements Serializable {

    private static final long serialVersionUID = -243750074;

    private String featureId;
    private String featureName;
    private String subFeatureId;
    private String subFeatureName;
    private String isSupported;
    private String isVerifiedBy;
    private String comments;

    public SqlFeatures() {}

    public SqlFeatures(SqlFeatures value) {
        this.featureId = value.featureId;
        this.featureName = value.featureName;
        this.subFeatureId = value.subFeatureId;
        this.subFeatureName = value.subFeatureName;
        this.isSupported = value.isSupported;
        this.isVerifiedBy = value.isVerifiedBy;
        this.comments = value.comments;
    }

    public SqlFeatures(
        String featureId,
        String featureName,
        String subFeatureId,
        String subFeatureName,
        String isSupported,
        String isVerifiedBy,
        String comments
    ) {
        this.featureId = featureId;
        this.featureName = featureName;
        this.subFeatureId = subFeatureId;
        this.subFeatureName = subFeatureName;
        this.isSupported = isSupported;
        this.isVerifiedBy = isVerifiedBy;
        this.comments = comments;
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getSubFeatureId() {
        return this.subFeatureId;
    }

    public void setSubFeatureId(String subFeatureId) {
        this.subFeatureId = subFeatureId;
    }

    public String getSubFeatureName() {
        return this.subFeatureName;
    }

    public void setSubFeatureName(String subFeatureName) {
        this.subFeatureName = subFeatureName;
    }

    public String getIsSupported() {
        return this.isSupported;
    }

    public void setIsSupported(String isSupported) {
        this.isSupported = isSupported;
    }

    public String getIsVerifiedBy() {
        return this.isVerifiedBy;
    }

    public void setIsVerifiedBy(String isVerifiedBy) {
        this.isVerifiedBy = isVerifiedBy;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlFeatures (");

        sb.append(featureId);
        sb.append(", ").append(featureName);
        sb.append(", ").append(subFeatureId);
        sb.append(", ").append(subFeatureName);
        sb.append(", ").append(isSupported);
        sb.append(", ").append(isVerifiedBy);
        sb.append(", ").append(comments);

        sb.append(")");
        return sb.toString();
    }
}
