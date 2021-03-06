/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.information_schema.tables.pojos;


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
public class Routines implements Serializable {

    private static final long serialVersionUID = 2099964713;

    private String    specificCatalog;
    private String    specificSchema;
    private String    specificName;
    private String    routineCatalog;
    private String    routineSchema;
    private String    routineName;
    private String    routineType;
    private String    moduleCatalog;
    private String    moduleSchema;
    private String    moduleName;
    private String    udtCatalog;
    private String    udtSchema;
    private String    udtName;
    private String    dataType;
    private Integer   characterMaximumLength;
    private Integer   characterOctetLength;
    private String    characterSetCatalog;
    private String    characterSetSchema;
    private String    characterSetName;
    private String    collationCatalog;
    private String    collationSchema;
    private String    collationName;
    private Integer   numericPrecision;
    private Integer   numericPrecisionRadix;
    private Integer   numericScale;
    private Integer   datetimePrecision;
    private String    intervalType;
    private Integer   intervalPrecision;
    private String    typeUdtCatalog;
    private String    typeUdtSchema;
    private String    typeUdtName;
    private String    scopeCatalog;
    private String    scopeSchema;
    private String    scopeName;
    private Integer   maximumCardinality;
    private String    dtdIdentifier;
    private String    routineBody;
    private String    routineDefinition;
    private String    externalName;
    private String    externalLanguage;
    private String    parameterStyle;
    private String    isDeterministic;
    private String    sqlDataAccess;
    private String    isNullCall;
    private String    sqlPath;
    private String    schemaLevelRoutine;
    private Integer   maxDynamicResultSets;
    private String    isUserDefinedCast;
    private String    isImplicitlyInvocable;
    private String    securityType;
    private String    toSqlSpecificCatalog;
    private String    toSqlSpecificSchema;
    private String    toSqlSpecificName;
    private String    asLocator;
    private Timestamp created;
    private Timestamp lastAltered;
    private String    newSavepointLevel;
    private String    isUdtDependent;
    private String    resultCastFromDataType;
    private String    resultCastAsLocator;
    private Integer   resultCastCharMaxLength;
    private Integer   resultCastCharOctetLength;
    private String    resultCastCharSetCatalog;
    private String    resultCastCharSetSchema;
    private String    resultCastCharSetName;
    private String    resultCastCollationCatalog;
    private String    resultCastCollationSchema;
    private String    resultCastCollationName;
    private Integer   resultCastNumericPrecision;
    private Integer   resultCastNumericPrecisionRadix;
    private Integer   resultCastNumericScale;
    private Integer   resultCastDatetimePrecision;
    private String    resultCastIntervalType;
    private Integer   resultCastIntervalPrecision;
    private String    resultCastTypeUdtCatalog;
    private String    resultCastTypeUdtSchema;
    private String    resultCastTypeUdtName;
    private String    resultCastScopeCatalog;
    private String    resultCastScopeSchema;
    private String    resultCastScopeName;
    private Integer   resultCastMaximumCardinality;
    private String    resultCastDtdIdentifier;

    public Routines() {}

    public Routines(Routines value) {
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
        this.routineCatalog = value.routineCatalog;
        this.routineSchema = value.routineSchema;
        this.routineName = value.routineName;
        this.routineType = value.routineType;
        this.moduleCatalog = value.moduleCatalog;
        this.moduleSchema = value.moduleSchema;
        this.moduleName = value.moduleName;
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
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
        this.typeUdtCatalog = value.typeUdtCatalog;
        this.typeUdtSchema = value.typeUdtSchema;
        this.typeUdtName = value.typeUdtName;
        this.scopeCatalog = value.scopeCatalog;
        this.scopeSchema = value.scopeSchema;
        this.scopeName = value.scopeName;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.routineBody = value.routineBody;
        this.routineDefinition = value.routineDefinition;
        this.externalName = value.externalName;
        this.externalLanguage = value.externalLanguage;
        this.parameterStyle = value.parameterStyle;
        this.isDeterministic = value.isDeterministic;
        this.sqlDataAccess = value.sqlDataAccess;
        this.isNullCall = value.isNullCall;
        this.sqlPath = value.sqlPath;
        this.schemaLevelRoutine = value.schemaLevelRoutine;
        this.maxDynamicResultSets = value.maxDynamicResultSets;
        this.isUserDefinedCast = value.isUserDefinedCast;
        this.isImplicitlyInvocable = value.isImplicitlyInvocable;
        this.securityType = value.securityType;
        this.toSqlSpecificCatalog = value.toSqlSpecificCatalog;
        this.toSqlSpecificSchema = value.toSqlSpecificSchema;
        this.toSqlSpecificName = value.toSqlSpecificName;
        this.asLocator = value.asLocator;
        this.created = value.created;
        this.lastAltered = value.lastAltered;
        this.newSavepointLevel = value.newSavepointLevel;
        this.isUdtDependent = value.isUdtDependent;
        this.resultCastFromDataType = value.resultCastFromDataType;
        this.resultCastAsLocator = value.resultCastAsLocator;
        this.resultCastCharMaxLength = value.resultCastCharMaxLength;
        this.resultCastCharOctetLength = value.resultCastCharOctetLength;
        this.resultCastCharSetCatalog = value.resultCastCharSetCatalog;
        this.resultCastCharSetSchema = value.resultCastCharSetSchema;
        this.resultCastCharSetName = value.resultCastCharSetName;
        this.resultCastCollationCatalog = value.resultCastCollationCatalog;
        this.resultCastCollationSchema = value.resultCastCollationSchema;
        this.resultCastCollationName = value.resultCastCollationName;
        this.resultCastNumericPrecision = value.resultCastNumericPrecision;
        this.resultCastNumericPrecisionRadix = value.resultCastNumericPrecisionRadix;
        this.resultCastNumericScale = value.resultCastNumericScale;
        this.resultCastDatetimePrecision = value.resultCastDatetimePrecision;
        this.resultCastIntervalType = value.resultCastIntervalType;
        this.resultCastIntervalPrecision = value.resultCastIntervalPrecision;
        this.resultCastTypeUdtCatalog = value.resultCastTypeUdtCatalog;
        this.resultCastTypeUdtSchema = value.resultCastTypeUdtSchema;
        this.resultCastTypeUdtName = value.resultCastTypeUdtName;
        this.resultCastScopeCatalog = value.resultCastScopeCatalog;
        this.resultCastScopeSchema = value.resultCastScopeSchema;
        this.resultCastScopeName = value.resultCastScopeName;
        this.resultCastMaximumCardinality = value.resultCastMaximumCardinality;
        this.resultCastDtdIdentifier = value.resultCastDtdIdentifier;
    }

    public Routines(
        String    specificCatalog,
        String    specificSchema,
        String    specificName,
        String    routineCatalog,
        String    routineSchema,
        String    routineName,
        String    routineType,
        String    moduleCatalog,
        String    moduleSchema,
        String    moduleName,
        String    udtCatalog,
        String    udtSchema,
        String    udtName,
        String    dataType,
        Integer   characterMaximumLength,
        Integer   characterOctetLength,
        String    characterSetCatalog,
        String    characterSetSchema,
        String    characterSetName,
        String    collationCatalog,
        String    collationSchema,
        String    collationName,
        Integer   numericPrecision,
        Integer   numericPrecisionRadix,
        Integer   numericScale,
        Integer   datetimePrecision,
        String    intervalType,
        Integer   intervalPrecision,
        String    typeUdtCatalog,
        String    typeUdtSchema,
        String    typeUdtName,
        String    scopeCatalog,
        String    scopeSchema,
        String    scopeName,
        Integer   maximumCardinality,
        String    dtdIdentifier,
        String    routineBody,
        String    routineDefinition,
        String    externalName,
        String    externalLanguage,
        String    parameterStyle,
        String    isDeterministic,
        String    sqlDataAccess,
        String    isNullCall,
        String    sqlPath,
        String    schemaLevelRoutine,
        Integer   maxDynamicResultSets,
        String    isUserDefinedCast,
        String    isImplicitlyInvocable,
        String    securityType,
        String    toSqlSpecificCatalog,
        String    toSqlSpecificSchema,
        String    toSqlSpecificName,
        String    asLocator,
        Timestamp created,
        Timestamp lastAltered,
        String    newSavepointLevel,
        String    isUdtDependent,
        String    resultCastFromDataType,
        String    resultCastAsLocator,
        Integer   resultCastCharMaxLength,
        Integer   resultCastCharOctetLength,
        String    resultCastCharSetCatalog,
        String    resultCastCharSetSchema,
        String    resultCastCharSetName,
        String    resultCastCollationCatalog,
        String    resultCastCollationSchema,
        String    resultCastCollationName,
        Integer   resultCastNumericPrecision,
        Integer   resultCastNumericPrecisionRadix,
        Integer   resultCastNumericScale,
        Integer   resultCastDatetimePrecision,
        String    resultCastIntervalType,
        Integer   resultCastIntervalPrecision,
        String    resultCastTypeUdtCatalog,
        String    resultCastTypeUdtSchema,
        String    resultCastTypeUdtName,
        String    resultCastScopeCatalog,
        String    resultCastScopeSchema,
        String    resultCastScopeName,
        Integer   resultCastMaximumCardinality,
        String    resultCastDtdIdentifier
    ) {
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
        this.routineCatalog = routineCatalog;
        this.routineSchema = routineSchema;
        this.routineName = routineName;
        this.routineType = routineType;
        this.moduleCatalog = moduleCatalog;
        this.moduleSchema = moduleSchema;
        this.moduleName = moduleName;
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
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
        this.typeUdtCatalog = typeUdtCatalog;
        this.typeUdtSchema = typeUdtSchema;
        this.typeUdtName = typeUdtName;
        this.scopeCatalog = scopeCatalog;
        this.scopeSchema = scopeSchema;
        this.scopeName = scopeName;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.routineBody = routineBody;
        this.routineDefinition = routineDefinition;
        this.externalName = externalName;
        this.externalLanguage = externalLanguage;
        this.parameterStyle = parameterStyle;
        this.isDeterministic = isDeterministic;
        this.sqlDataAccess = sqlDataAccess;
        this.isNullCall = isNullCall;
        this.sqlPath = sqlPath;
        this.schemaLevelRoutine = schemaLevelRoutine;
        this.maxDynamicResultSets = maxDynamicResultSets;
        this.isUserDefinedCast = isUserDefinedCast;
        this.isImplicitlyInvocable = isImplicitlyInvocable;
        this.securityType = securityType;
        this.toSqlSpecificCatalog = toSqlSpecificCatalog;
        this.toSqlSpecificSchema = toSqlSpecificSchema;
        this.toSqlSpecificName = toSqlSpecificName;
        this.asLocator = asLocator;
        this.created = created;
        this.lastAltered = lastAltered;
        this.newSavepointLevel = newSavepointLevel;
        this.isUdtDependent = isUdtDependent;
        this.resultCastFromDataType = resultCastFromDataType;
        this.resultCastAsLocator = resultCastAsLocator;
        this.resultCastCharMaxLength = resultCastCharMaxLength;
        this.resultCastCharOctetLength = resultCastCharOctetLength;
        this.resultCastCharSetCatalog = resultCastCharSetCatalog;
        this.resultCastCharSetSchema = resultCastCharSetSchema;
        this.resultCastCharSetName = resultCastCharSetName;
        this.resultCastCollationCatalog = resultCastCollationCatalog;
        this.resultCastCollationSchema = resultCastCollationSchema;
        this.resultCastCollationName = resultCastCollationName;
        this.resultCastNumericPrecision = resultCastNumericPrecision;
        this.resultCastNumericPrecisionRadix = resultCastNumericPrecisionRadix;
        this.resultCastNumericScale = resultCastNumericScale;
        this.resultCastDatetimePrecision = resultCastDatetimePrecision;
        this.resultCastIntervalType = resultCastIntervalType;
        this.resultCastIntervalPrecision = resultCastIntervalPrecision;
        this.resultCastTypeUdtCatalog = resultCastTypeUdtCatalog;
        this.resultCastTypeUdtSchema = resultCastTypeUdtSchema;
        this.resultCastTypeUdtName = resultCastTypeUdtName;
        this.resultCastScopeCatalog = resultCastScopeCatalog;
        this.resultCastScopeSchema = resultCastScopeSchema;
        this.resultCastScopeName = resultCastScopeName;
        this.resultCastMaximumCardinality = resultCastMaximumCardinality;
        this.resultCastDtdIdentifier = resultCastDtdIdentifier;
    }

    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public String getSpecificSchema() {
        return this.specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    public String getSpecificName() {
        return this.specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    public String getRoutineCatalog() {
        return this.routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public String getRoutineSchema() {
        return this.routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    public String getRoutineName() {
        return this.routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getRoutineType() {
        return this.routineType;
    }

    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    public String getModuleCatalog() {
        return this.moduleCatalog;
    }

    public void setModuleCatalog(String moduleCatalog) {
        this.moduleCatalog = moduleCatalog;
    }

    public String getModuleSchema() {
        return this.moduleSchema;
    }

    public void setModuleSchema(String moduleSchema) {
        this.moduleSchema = moduleSchema;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
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

    public String getTypeUdtCatalog() {
        return this.typeUdtCatalog;
    }

    public void setTypeUdtCatalog(String typeUdtCatalog) {
        this.typeUdtCatalog = typeUdtCatalog;
    }

    public String getTypeUdtSchema() {
        return this.typeUdtSchema;
    }

    public void setTypeUdtSchema(String typeUdtSchema) {
        this.typeUdtSchema = typeUdtSchema;
    }

    public String getTypeUdtName() {
        return this.typeUdtName;
    }

    public void setTypeUdtName(String typeUdtName) {
        this.typeUdtName = typeUdtName;
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

    public String getRoutineBody() {
        return this.routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    public String getRoutineDefinition() {
        return this.routineDefinition;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    public String getExternalName() {
        return this.externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getExternalLanguage() {
        return this.externalLanguage;
    }

    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage;
    }

    public String getParameterStyle() {
        return this.parameterStyle;
    }

    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle;
    }

    public String getIsDeterministic() {
        return this.isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    public String getSqlDataAccess() {
        return this.sqlDataAccess;
    }

    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    public String getIsNullCall() {
        return this.isNullCall;
    }

    public void setIsNullCall(String isNullCall) {
        this.isNullCall = isNullCall;
    }

    public String getSqlPath() {
        return this.sqlPath;
    }

    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }

    public String getSchemaLevelRoutine() {
        return this.schemaLevelRoutine;
    }

    public void setSchemaLevelRoutine(String schemaLevelRoutine) {
        this.schemaLevelRoutine = schemaLevelRoutine;
    }

    public Integer getMaxDynamicResultSets() {
        return this.maxDynamicResultSets;
    }

    public void setMaxDynamicResultSets(Integer maxDynamicResultSets) {
        this.maxDynamicResultSets = maxDynamicResultSets;
    }

    public String getIsUserDefinedCast() {
        return this.isUserDefinedCast;
    }

    public void setIsUserDefinedCast(String isUserDefinedCast) {
        this.isUserDefinedCast = isUserDefinedCast;
    }

    public String getIsImplicitlyInvocable() {
        return this.isImplicitlyInvocable;
    }

    public void setIsImplicitlyInvocable(String isImplicitlyInvocable) {
        this.isImplicitlyInvocable = isImplicitlyInvocable;
    }

    public String getSecurityType() {
        return this.securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getToSqlSpecificCatalog() {
        return this.toSqlSpecificCatalog;
    }

    public void setToSqlSpecificCatalog(String toSqlSpecificCatalog) {
        this.toSqlSpecificCatalog = toSqlSpecificCatalog;
    }

    public String getToSqlSpecificSchema() {
        return this.toSqlSpecificSchema;
    }

    public void setToSqlSpecificSchema(String toSqlSpecificSchema) {
        this.toSqlSpecificSchema = toSqlSpecificSchema;
    }

    public String getToSqlSpecificName() {
        return this.toSqlSpecificName;
    }

    public void setToSqlSpecificName(String toSqlSpecificName) {
        this.toSqlSpecificName = toSqlSpecificName;
    }

    public String getAsLocator() {
        return this.asLocator;
    }

    public void setAsLocator(String asLocator) {
        this.asLocator = asLocator;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getLastAltered() {
        return this.lastAltered;
    }

    public void setLastAltered(Timestamp lastAltered) {
        this.lastAltered = lastAltered;
    }

    public String getNewSavepointLevel() {
        return this.newSavepointLevel;
    }

    public void setNewSavepointLevel(String newSavepointLevel) {
        this.newSavepointLevel = newSavepointLevel;
    }

    public String getIsUdtDependent() {
        return this.isUdtDependent;
    }

    public void setIsUdtDependent(String isUdtDependent) {
        this.isUdtDependent = isUdtDependent;
    }

    public String getResultCastFromDataType() {
        return this.resultCastFromDataType;
    }

    public void setResultCastFromDataType(String resultCastFromDataType) {
        this.resultCastFromDataType = resultCastFromDataType;
    }

    public String getResultCastAsLocator() {
        return this.resultCastAsLocator;
    }

    public void setResultCastAsLocator(String resultCastAsLocator) {
        this.resultCastAsLocator = resultCastAsLocator;
    }

    public Integer getResultCastCharMaxLength() {
        return this.resultCastCharMaxLength;
    }

    public void setResultCastCharMaxLength(Integer resultCastCharMaxLength) {
        this.resultCastCharMaxLength = resultCastCharMaxLength;
    }

    public Integer getResultCastCharOctetLength() {
        return this.resultCastCharOctetLength;
    }

    public void setResultCastCharOctetLength(Integer resultCastCharOctetLength) {
        this.resultCastCharOctetLength = resultCastCharOctetLength;
    }

    public String getResultCastCharSetCatalog() {
        return this.resultCastCharSetCatalog;
    }

    public void setResultCastCharSetCatalog(String resultCastCharSetCatalog) {
        this.resultCastCharSetCatalog = resultCastCharSetCatalog;
    }

    public String getResultCastCharSetSchema() {
        return this.resultCastCharSetSchema;
    }

    public void setResultCastCharSetSchema(String resultCastCharSetSchema) {
        this.resultCastCharSetSchema = resultCastCharSetSchema;
    }

    public String getResultCastCharSetName() {
        return this.resultCastCharSetName;
    }

    public void setResultCastCharSetName(String resultCastCharSetName) {
        this.resultCastCharSetName = resultCastCharSetName;
    }

    public String getResultCastCollationCatalog() {
        return this.resultCastCollationCatalog;
    }

    public void setResultCastCollationCatalog(String resultCastCollationCatalog) {
        this.resultCastCollationCatalog = resultCastCollationCatalog;
    }

    public String getResultCastCollationSchema() {
        return this.resultCastCollationSchema;
    }

    public void setResultCastCollationSchema(String resultCastCollationSchema) {
        this.resultCastCollationSchema = resultCastCollationSchema;
    }

    public String getResultCastCollationName() {
        return this.resultCastCollationName;
    }

    public void setResultCastCollationName(String resultCastCollationName) {
        this.resultCastCollationName = resultCastCollationName;
    }

    public Integer getResultCastNumericPrecision() {
        return this.resultCastNumericPrecision;
    }

    public void setResultCastNumericPrecision(Integer resultCastNumericPrecision) {
        this.resultCastNumericPrecision = resultCastNumericPrecision;
    }

    public Integer getResultCastNumericPrecisionRadix() {
        return this.resultCastNumericPrecisionRadix;
    }

    public void setResultCastNumericPrecisionRadix(Integer resultCastNumericPrecisionRadix) {
        this.resultCastNumericPrecisionRadix = resultCastNumericPrecisionRadix;
    }

    public Integer getResultCastNumericScale() {
        return this.resultCastNumericScale;
    }

    public void setResultCastNumericScale(Integer resultCastNumericScale) {
        this.resultCastNumericScale = resultCastNumericScale;
    }

    public Integer getResultCastDatetimePrecision() {
        return this.resultCastDatetimePrecision;
    }

    public void setResultCastDatetimePrecision(Integer resultCastDatetimePrecision) {
        this.resultCastDatetimePrecision = resultCastDatetimePrecision;
    }

    public String getResultCastIntervalType() {
        return this.resultCastIntervalType;
    }

    public void setResultCastIntervalType(String resultCastIntervalType) {
        this.resultCastIntervalType = resultCastIntervalType;
    }

    public Integer getResultCastIntervalPrecision() {
        return this.resultCastIntervalPrecision;
    }

    public void setResultCastIntervalPrecision(Integer resultCastIntervalPrecision) {
        this.resultCastIntervalPrecision = resultCastIntervalPrecision;
    }

    public String getResultCastTypeUdtCatalog() {
        return this.resultCastTypeUdtCatalog;
    }

    public void setResultCastTypeUdtCatalog(String resultCastTypeUdtCatalog) {
        this.resultCastTypeUdtCatalog = resultCastTypeUdtCatalog;
    }

    public String getResultCastTypeUdtSchema() {
        return this.resultCastTypeUdtSchema;
    }

    public void setResultCastTypeUdtSchema(String resultCastTypeUdtSchema) {
        this.resultCastTypeUdtSchema = resultCastTypeUdtSchema;
    }

    public String getResultCastTypeUdtName() {
        return this.resultCastTypeUdtName;
    }

    public void setResultCastTypeUdtName(String resultCastTypeUdtName) {
        this.resultCastTypeUdtName = resultCastTypeUdtName;
    }

    public String getResultCastScopeCatalog() {
        return this.resultCastScopeCatalog;
    }

    public void setResultCastScopeCatalog(String resultCastScopeCatalog) {
        this.resultCastScopeCatalog = resultCastScopeCatalog;
    }

    public String getResultCastScopeSchema() {
        return this.resultCastScopeSchema;
    }

    public void setResultCastScopeSchema(String resultCastScopeSchema) {
        this.resultCastScopeSchema = resultCastScopeSchema;
    }

    public String getResultCastScopeName() {
        return this.resultCastScopeName;
    }

    public void setResultCastScopeName(String resultCastScopeName) {
        this.resultCastScopeName = resultCastScopeName;
    }

    public Integer getResultCastMaximumCardinality() {
        return this.resultCastMaximumCardinality;
    }

    public void setResultCastMaximumCardinality(Integer resultCastMaximumCardinality) {
        this.resultCastMaximumCardinality = resultCastMaximumCardinality;
    }

    public String getResultCastDtdIdentifier() {
        return this.resultCastDtdIdentifier;
    }

    public void setResultCastDtdIdentifier(String resultCastDtdIdentifier) {
        this.resultCastDtdIdentifier = resultCastDtdIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Routines (");

        sb.append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);
        sb.append(", ").append(routineCatalog);
        sb.append(", ").append(routineSchema);
        sb.append(", ").append(routineName);
        sb.append(", ").append(routineType);
        sb.append(", ").append(moduleCatalog);
        sb.append(", ").append(moduleSchema);
        sb.append(", ").append(moduleName);
        sb.append(", ").append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
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
        sb.append(", ").append(typeUdtCatalog);
        sb.append(", ").append(typeUdtSchema);
        sb.append(", ").append(typeUdtName);
        sb.append(", ").append(scopeCatalog);
        sb.append(", ").append(scopeSchema);
        sb.append(", ").append(scopeName);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(routineBody);
        sb.append(", ").append(routineDefinition);
        sb.append(", ").append(externalName);
        sb.append(", ").append(externalLanguage);
        sb.append(", ").append(parameterStyle);
        sb.append(", ").append(isDeterministic);
        sb.append(", ").append(sqlDataAccess);
        sb.append(", ").append(isNullCall);
        sb.append(", ").append(sqlPath);
        sb.append(", ").append(schemaLevelRoutine);
        sb.append(", ").append(maxDynamicResultSets);
        sb.append(", ").append(isUserDefinedCast);
        sb.append(", ").append(isImplicitlyInvocable);
        sb.append(", ").append(securityType);
        sb.append(", ").append(toSqlSpecificCatalog);
        sb.append(", ").append(toSqlSpecificSchema);
        sb.append(", ").append(toSqlSpecificName);
        sb.append(", ").append(asLocator);
        sb.append(", ").append(created);
        sb.append(", ").append(lastAltered);
        sb.append(", ").append(newSavepointLevel);
        sb.append(", ").append(isUdtDependent);
        sb.append(", ").append(resultCastFromDataType);
        sb.append(", ").append(resultCastAsLocator);
        sb.append(", ").append(resultCastCharMaxLength);
        sb.append(", ").append(resultCastCharOctetLength);
        sb.append(", ").append(resultCastCharSetCatalog);
        sb.append(", ").append(resultCastCharSetSchema);
        sb.append(", ").append(resultCastCharSetName);
        sb.append(", ").append(resultCastCollationCatalog);
        sb.append(", ").append(resultCastCollationSchema);
        sb.append(", ").append(resultCastCollationName);
        sb.append(", ").append(resultCastNumericPrecision);
        sb.append(", ").append(resultCastNumericPrecisionRadix);
        sb.append(", ").append(resultCastNumericScale);
        sb.append(", ").append(resultCastDatetimePrecision);
        sb.append(", ").append(resultCastIntervalType);
        sb.append(", ").append(resultCastIntervalPrecision);
        sb.append(", ").append(resultCastTypeUdtCatalog);
        sb.append(", ").append(resultCastTypeUdtSchema);
        sb.append(", ").append(resultCastTypeUdtName);
        sb.append(", ").append(resultCastScopeCatalog);
        sb.append(", ").append(resultCastScopeSchema);
        sb.append(", ").append(resultCastScopeName);
        sb.append(", ").append(resultCastMaximumCardinality);
        sb.append(", ").append(resultCastDtdIdentifier);

        sb.append(")");
        return sb.toString();
    }
}
