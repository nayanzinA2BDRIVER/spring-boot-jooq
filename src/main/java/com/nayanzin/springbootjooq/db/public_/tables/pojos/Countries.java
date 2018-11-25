/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


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
public class Countries implements Serializable {

    private static final long serialVersionUID = 475384057;

    private String    code;
    private Long      translationId;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String    createdUser;
    private String    modifiedUser;
    private Integer   regionId;
    private Short     codeIso;
    private String    currencyCode;
    private Boolean   inUse;

    public Countries() {}

    public Countries(Countries value) {
        this.code = value.code;
        this.translationId = value.translationId;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdUser = value.createdUser;
        this.modifiedUser = value.modifiedUser;
        this.regionId = value.regionId;
        this.codeIso = value.codeIso;
        this.currencyCode = value.currencyCode;
        this.inUse = value.inUse;
    }

    public Countries(
        String    code,
        Long      translationId,
        Timestamp createdDate,
        Timestamp modifiedDate,
        String    createdUser,
        String    modifiedUser,
        Integer   regionId,
        Short     codeIso,
        String    currencyCode,
        Boolean   inUse
    ) {
        this.code = code;
        this.translationId = translationId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdUser = createdUser;
        this.modifiedUser = modifiedUser;
        this.regionId = regionId;
        this.codeIso = codeIso;
        this.currencyCode = currencyCode;
        this.inUse = inUse;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getTranslationId() {
        return this.translationId;
    }

    public void setTranslationId(Long translationId) {
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

    public Integer getRegionId() {
        return this.regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Short getCodeIso() {
        return this.codeIso;
    }

    public void setCodeIso(Short codeIso) {
        this.codeIso = codeIso;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Boolean getInUse() {
        return this.inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Countries (");

        sb.append(code);
        sb.append(", ").append(translationId);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdUser);
        sb.append(", ").append(modifiedUser);
        sb.append(", ").append(regionId);
        sb.append(", ").append(codeIso);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(inUse);

        sb.append(")");
        return sb.toString();
    }
}