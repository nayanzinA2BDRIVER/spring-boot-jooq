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
public class UserDefinedTypes implements Serializable {

    private static final long serialVersionUID = -219955881;

    private String  userDefinedTypeCatalog;
    private String  userDefinedTypeSchema;
    private String  userDefinedTypeName;
    private String  userDefinedTypeCategory;
    private String  isInstantiable;
    private String  isFinal;
    private String  orderingForm;
    private String  orderingCategory;
    private String  orderingRoutineCatalog;
    private String  orderingRoutineSchema;
    private String  orderingRoutineName;
    private String  referenceType;
    private String  dataType;
    private Integer characterMaximumLength;
    private Integer characterOctetLength;
    private String  characterSetCatalog;
    private String  characterSetSchema;
    private String  characterSetName;
    private String  collationCatalog;
    private String  collationSchema;
    private String  collationName;
    private Integer numericPrecision;
    private Integer numericPrecisionRadix;
    private Integer numericScale;
    private Integer datetimePrecision;
    private String  intervalType;
    private Integer intervalPrecision;
    private String  sourceDtdIdentifier;
    private String  refDtdIdentifier;

    public UserDefinedTypes() {}

    public UserDefinedTypes(UserDefinedTypes value) {
        this.userDefinedTypeCatalog = value.userDefinedTypeCatalog;
        this.userDefinedTypeSchema = value.userDefinedTypeSchema;
        this.userDefinedTypeName = value.userDefinedTypeName;
        this.userDefinedTypeCategory = value.userDefinedTypeCategory;
        this.isInstantiable = value.isInstantiable;
        this.isFinal = value.isFinal;
        this.orderingForm = value.orderingForm;
        this.orderingCategory = value.orderingCategory;
        this.orderingRoutineCatalog = value.orderingRoutineCatalog;
        this.orderingRoutineSchema = value.orderingRoutineSchema;
        this.orderingRoutineName = value.orderingRoutineName;
        this.referenceType = value.referenceType;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.sourceDtdIdentifier = value.sourceDtdIdentifier;
        this.refDtdIdentifier = value.refDtdIdentifier;
    }

    public UserDefinedTypes(
        String  userDefinedTypeCatalog,
        String  userDefinedTypeSchema,
        String  userDefinedTypeName,
        String  userDefinedTypeCategory,
        String  isInstantiable,
        String  isFinal,
        String  orderingForm,
        String  orderingCategory,
        String  orderingRoutineCatalog,
        String  orderingRoutineSchema,
        String  orderingRoutineName,
        String  referenceType,
        String  dataType,
        Integer characterMaximumLength,
        Integer characterOctetLength,
        String  characterSetCatalog,
        String  characterSetSchema,
        String  characterSetName,
        String  collationCatalog,
        String  collationSchema,
        String  collationName,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        Integer datetimePrecision,
        String  intervalType,
        Integer intervalPrecision,
        String  sourceDtdIdentifier,
        String  refDtdIdentifier
    ) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
        this.userDefinedTypeSchema = userDefinedTypeSchema;
        this.userDefinedTypeName = userDefinedTypeName;
        this.userDefinedTypeCategory = userDefinedTypeCategory;
        this.isInstantiable = isInstantiable;
        this.isFinal = isFinal;
        this.orderingForm = orderingForm;
        this.orderingCategory = orderingCategory;
        this.orderingRoutineCatalog = orderingRoutineCatalog;
        this.orderingRoutineSchema = orderingRoutineSchema;
        this.orderingRoutineName = orderingRoutineName;
        this.referenceType = referenceType;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.sourceDtdIdentifier = sourceDtdIdentifier;
        this.refDtdIdentifier = refDtdIdentifier;
    }

    public String getUserDefinedTypeCatalog() {
        return this.userDefinedTypeCatalog;
    }

    public void setUserDefinedTypeCatalog(String userDefinedTypeCatalog) {
        this.userDefinedTypeCatalog = userDefinedTypeCatalog;
    }

    public String getUserDefinedTypeSchema() {
        return this.userDefinedTypeSchema;
    }

    public void setUserDefinedTypeSchema(String userDefinedTypeSchema) {
        this.userDefinedTypeSchema = userDefinedTypeSchema;
    }

    public String getUserDefinedTypeName() {
        return this.userDefinedTypeName;
    }

    public void setUserDefinedTypeName(String userDefinedTypeName) {
        this.userDefinedTypeName = userDefinedTypeName;
    }

    public String getUserDefinedTypeCategory() {
        return this.userDefinedTypeCategory;
    }

    public void setUserDefinedTypeCategory(String userDefinedTypeCategory) {
        this.userDefinedTypeCategory = userDefinedTypeCategory;
    }

    public String getIsInstantiable() {
        return this.isInstantiable;
    }

    public void setIsInstantiable(String isInstantiable) {
        this.isInstantiable = isInstantiable;
    }

    public String getIsFinal() {
        return this.isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
    }

    public String getOrderingForm() {
        return this.orderingForm;
    }

    public void setOrderingForm(String orderingForm) {
        this.orderingForm = orderingForm;
    }

    public String getOrderingCategory() {
        return this.orderingCategory;
    }

    public void setOrderingCategory(String orderingCategory) {
        this.orderingCategory = orderingCategory;
    }

    public String getOrderingRoutineCatalog() {
        return this.orderingRoutineCatalog;
    }

    public void setOrderingRoutineCatalog(String orderingRoutineCatalog) {
        this.orderingRoutineCatalog = orderingRoutineCatalog;
    }

    public String getOrderingRoutineSchema() {
        return this.orderingRoutineSchema;
    }

    public void setOrderingRoutineSchema(String orderingRoutineSchema) {
        this.orderingRoutineSchema = orderingRoutineSchema;
    }

    public String getOrderingRoutineName() {
        return this.orderingRoutineName;
    }

    public void setOrderingRoutineName(String orderingRoutineName) {
        this.orderingRoutineName = orderingRoutineName;
    }

    public String getReferenceType() {
        return this.referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    public void setCharacterMaximumLength(Integer characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Integer getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    public void setCharacterOctetLength(Integer characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    public void setCharacterSetCatalog(String characterSetCatalog) {
        this.characterSetCatalog = characterSetCatalog;
    }

    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    public void setCharacterSetSchema(String characterSetSchema) {
        this.characterSetSchema = characterSetSchema;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    public void setCollationCatalog(String collationCatalog) {
        this.collationCatalog = collationCatalog;
    }

    public String getCollationSchema() {
        return this.collationSchema;
    }

    public void setCollationSchema(String collationSchema) {
        this.collationSchema = collationSchema;
    }

    public String getCollationName() {
        return this.collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    public void setNumericPrecisionRadix(Integer numericPrecisionRadix) {
        this.numericPrecisionRadix = numericPrecisionRadix;
    }

    public Integer getNumericScale() {
        return this.numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getIntervalType() {
        return this.intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    public void setIntervalPrecision(Integer intervalPrecision) {
        this.intervalPrecision = intervalPrecision;
    }

    public String getSourceDtdIdentifier() {
        return this.sourceDtdIdentifier;
    }

    public void setSourceDtdIdentifier(String sourceDtdIdentifier) {
        this.sourceDtdIdentifier = sourceDtdIdentifier;
    }

    public String getRefDtdIdentifier() {
        return this.refDtdIdentifier;
    }

    public void setRefDtdIdentifier(String refDtdIdentifier) {
        this.refDtdIdentifier = refDtdIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserDefinedTypes (");

        sb.append(userDefinedTypeCatalog);
        sb.append(", ").append(userDefinedTypeSchema);
        sb.append(", ").append(userDefinedTypeName);
        sb.append(", ").append(userDefinedTypeCategory);
        sb.append(", ").append(isInstantiable);
        sb.append(", ").append(isFinal);
        sb.append(", ").append(orderingForm);
        sb.append(", ").append(orderingCategory);
        sb.append(", ").append(orderingRoutineCatalog);
        sb.append(", ").append(orderingRoutineSchema);
        sb.append(", ").append(orderingRoutineName);
        sb.append(", ").append(referenceType);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(sourceDtdIdentifier);
        sb.append(", ").append(refDtdIdentifier);

        sb.append(")");
        return sb.toString();
    }
}
