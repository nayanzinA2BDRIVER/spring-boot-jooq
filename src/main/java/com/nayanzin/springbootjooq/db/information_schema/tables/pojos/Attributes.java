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
public class Attributes implements Serializable {

    private static final long serialVersionUID = 1715631619;

    private String  udtCatalog;
    private String  udtSchema;
    private String  udtName;
    private String  attributeName;
    private Integer ordinalPosition;
    private String  attributeDefault;
    private String  isNullable;
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
    private String  attributeUdtCatalog;
    private String  attributeUdtSchema;
    private String  attributeUdtName;
    private String  scopeCatalog;
    private String  scopeSchema;
    private String  scopeName;
    private Integer maximumCardinality;
    private String  dtdIdentifier;
    private String  isDerivedReferenceAttribute;

    public Attributes() {}

    public Attributes(Attributes value) {
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.attributeName = value.attributeName;
        this.ordinalPosition = value.ordinalPosition;
        this.attributeDefault = value.attributeDefault;
        this.isNullable = value.isNullable;
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
        this.attributeUdtCatalog = value.attributeUdtCatalog;
        this.attributeUdtSchema = value.attributeUdtSchema;
        this.attributeUdtName = value.attributeUdtName;
        this.scopeCatalog = value.scopeCatalog;
        this.scopeSchema = value.scopeSchema;
        this.scopeName = value.scopeName;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.isDerivedReferenceAttribute = value.isDerivedReferenceAttribute;
    }

    public Attributes(
        String  udtCatalog,
        String  udtSchema,
        String  udtName,
        String  attributeName,
        Integer ordinalPosition,
        String  attributeDefault,
        String  isNullable,
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
        String  attributeUdtCatalog,
        String  attributeUdtSchema,
        String  attributeUdtName,
        String  scopeCatalog,
        String  scopeSchema,
        String  scopeName,
        Integer maximumCardinality,
        String  dtdIdentifier,
        String  isDerivedReferenceAttribute
    ) {
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
        this.attributeName = attributeName;
        this.ordinalPosition = ordinalPosition;
        this.attributeDefault = attributeDefault;
        this.isNullable = isNullable;
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
        this.attributeUdtCatalog = attributeUdtCatalog;
        this.attributeUdtSchema = attributeUdtSchema;
        this.attributeUdtName = attributeUdtName;
        this.scopeCatalog = scopeCatalog;
        this.scopeSchema = scopeSchema;
        this.scopeName = scopeName;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.isDerivedReferenceAttribute = isDerivedReferenceAttribute;
    }

    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    public String getUdtSchema() {
        return this.udtSchema;
    }

    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema;
    }

    public String getUdtName() {
        return this.udtName;
    }

    public void setUdtName(String udtName) {
        this.udtName = udtName;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getAttributeDefault() {
        return this.attributeDefault;
    }

    public void setAttributeDefault(String attributeDefault) {
        this.attributeDefault = attributeDefault;
    }

    public String getIsNullable() {
        return this.isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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

    public String getAttributeUdtCatalog() {
        return this.attributeUdtCatalog;
    }

    public void setAttributeUdtCatalog(String attributeUdtCatalog) {
        this.attributeUdtCatalog = attributeUdtCatalog;
    }

    public String getAttributeUdtSchema() {
        return this.attributeUdtSchema;
    }

    public void setAttributeUdtSchema(String attributeUdtSchema) {
        this.attributeUdtSchema = attributeUdtSchema;
    }

    public String getAttributeUdtName() {
        return this.attributeUdtName;
    }

    public void setAttributeUdtName(String attributeUdtName) {
        this.attributeUdtName = attributeUdtName;
    }

    public String getScopeCatalog() {
        return this.scopeCatalog;
    }

    public void setScopeCatalog(String scopeCatalog) {
        this.scopeCatalog = scopeCatalog;
    }

    public String getScopeSchema() {
        return this.scopeSchema;
    }

    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    public String getScopeName() {
        return this.scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    public void setMaximumCardinality(Integer maximumCardinality) {
        this.maximumCardinality = maximumCardinality;
    }

    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    public String getIsDerivedReferenceAttribute() {
        return this.isDerivedReferenceAttribute;
    }

    public void setIsDerivedReferenceAttribute(String isDerivedReferenceAttribute) {
        this.isDerivedReferenceAttribute = isDerivedReferenceAttribute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Attributes (");

        sb.append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(attributeName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(attributeDefault);
        sb.append(", ").append(isNullable);
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
        sb.append(", ").append(attributeUdtCatalog);
        sb.append(", ").append(attributeUdtSchema);
        sb.append(", ").append(attributeUdtName);
        sb.append(", ").append(scopeCatalog);
        sb.append(", ").append(scopeSchema);
        sb.append(", ").append(scopeName);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(isDerivedReferenceAttribute);

        sb.append(")");
        return sb.toString();
    }
}
