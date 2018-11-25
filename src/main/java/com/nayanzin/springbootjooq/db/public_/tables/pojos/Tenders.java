/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import com.nayanzin.springbootjooq.db.public_.enums.CarrierPreferences;
import com.nayanzin.springbootjooq.db.public_.enums.TenderStatus;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Tenders implements Serializable {

    private static final long serialVersionUID = 518038555;

    private Long               id;
    private Integer            total;
    private Integer            frequency;
    private String             cargoName;
    private BigDecimal         cargoWeight;
    private Integer            cargoWeightUnit;
    private BigDecimal         cargoVolume;
    private Integer            cargoVolumeUnit;
    private Integer            cargoBody;
    private BigDecimal         cargoTemperature;
    private Integer            cargoTemperatureUnit;
    private String             cargoDescription;
    private Integer            carrierType;
    private Integer            carrieerEco;
    private Integer            carrierRaiting;
    private String             carrierCountryCode;
    private Boolean            adr;
    private String             comment;
    private Timestamp          createdDate;
    private Timestamp          modifiedDate;
    private Long               createdUser;
    private String             modifiedUser;
    private Timestamp          finishDate;
    private CarrierPreferences carrierPreferences;
    private TenderStatus       status;
    private Long               dealId;
    private Long               customerId;
    private Integer            version;
    private Boolean            tir;
    private Boolean            cent;
    private Boolean            cargoLoadingTop;
    private Boolean            cargoLoadingBack;
    private Boolean            cargoLoadingSide;
    private Boolean            cargoLoadingRacksRemoval;
    private Boolean            individualTender;
    private String             individualGroup;

    public Tenders() {}

    public Tenders(Tenders value) {
        this.id = value.id;
        this.total = value.total;
        this.frequency = value.frequency;
        this.cargoName = value.cargoName;
        this.cargoWeight = value.cargoWeight;
        this.cargoWeightUnit = value.cargoWeightUnit;
        this.cargoVolume = value.cargoVolume;
        this.cargoVolumeUnit = value.cargoVolumeUnit;
        this.cargoBody = value.cargoBody;
        this.cargoTemperature = value.cargoTemperature;
        this.cargoTemperatureUnit = value.cargoTemperatureUnit;
        this.cargoDescription = value.cargoDescription;
        this.carrierType = value.carrierType;
        this.carrieerEco = value.carrieerEco;
        this.carrierRaiting = value.carrierRaiting;
        this.carrierCountryCode = value.carrierCountryCode;
        this.adr = value.adr;
        this.comment = value.comment;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdUser = value.createdUser;
        this.modifiedUser = value.modifiedUser;
        this.finishDate = value.finishDate;
        this.carrierPreferences = value.carrierPreferences;
        this.status = value.status;
        this.dealId = value.dealId;
        this.customerId = value.customerId;
        this.version = value.version;
        this.tir = value.tir;
        this.cent = value.cent;
        this.cargoLoadingTop = value.cargoLoadingTop;
        this.cargoLoadingBack = value.cargoLoadingBack;
        this.cargoLoadingSide = value.cargoLoadingSide;
        this.cargoLoadingRacksRemoval = value.cargoLoadingRacksRemoval;
        this.individualTender = value.individualTender;
        this.individualGroup = value.individualGroup;
    }

    public Tenders(
        Long               id,
        Integer            total,
        Integer            frequency,
        String             cargoName,
        BigDecimal         cargoWeight,
        Integer            cargoWeightUnit,
        BigDecimal         cargoVolume,
        Integer            cargoVolumeUnit,
        Integer            cargoBody,
        BigDecimal         cargoTemperature,
        Integer            cargoTemperatureUnit,
        String             cargoDescription,
        Integer            carrierType,
        Integer            carrieerEco,
        Integer            carrierRaiting,
        String             carrierCountryCode,
        Boolean            adr,
        String             comment,
        Timestamp          createdDate,
        Timestamp          modifiedDate,
        Long               createdUser,
        String             modifiedUser,
        Timestamp          finishDate,
        CarrierPreferences carrierPreferences,
        TenderStatus       status,
        Long               dealId,
        Long               customerId,
        Integer            version,
        Boolean            tir,
        Boolean            cent,
        Boolean            cargoLoadingTop,
        Boolean            cargoLoadingBack,
        Boolean            cargoLoadingSide,
        Boolean            cargoLoadingRacksRemoval,
        Boolean            individualTender,
        String             individualGroup
    ) {
        this.id = id;
        this.total = total;
        this.frequency = frequency;
        this.cargoName = cargoName;
        this.cargoWeight = cargoWeight;
        this.cargoWeightUnit = cargoWeightUnit;
        this.cargoVolume = cargoVolume;
        this.cargoVolumeUnit = cargoVolumeUnit;
        this.cargoBody = cargoBody;
        this.cargoTemperature = cargoTemperature;
        this.cargoTemperatureUnit = cargoTemperatureUnit;
        this.cargoDescription = cargoDescription;
        this.carrierType = carrierType;
        this.carrieerEco = carrieerEco;
        this.carrierRaiting = carrierRaiting;
        this.carrierCountryCode = carrierCountryCode;
        this.adr = adr;
        this.comment = comment;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdUser = createdUser;
        this.modifiedUser = modifiedUser;
        this.finishDate = finishDate;
        this.carrierPreferences = carrierPreferences;
        this.status = status;
        this.dealId = dealId;
        this.customerId = customerId;
        this.version = version;
        this.tir = tir;
        this.cent = cent;
        this.cargoLoadingTop = cargoLoadingTop;
        this.cargoLoadingBack = cargoLoadingBack;
        this.cargoLoadingSide = cargoLoadingSide;
        this.cargoLoadingRacksRemoval = cargoLoadingRacksRemoval;
        this.individualTender = individualTender;
        this.individualGroup = individualGroup;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getFrequency() {
        return this.frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getCargoName() {
        return this.cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public BigDecimal getCargoWeight() {
        return this.cargoWeight;
    }

    public void setCargoWeight(BigDecimal cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Integer getCargoWeightUnit() {
        return this.cargoWeightUnit;
    }

    public void setCargoWeightUnit(Integer cargoWeightUnit) {
        this.cargoWeightUnit = cargoWeightUnit;
    }

    public BigDecimal getCargoVolume() {
        return this.cargoVolume;
    }

    public void setCargoVolume(BigDecimal cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public Integer getCargoVolumeUnit() {
        return this.cargoVolumeUnit;
    }

    public void setCargoVolumeUnit(Integer cargoVolumeUnit) {
        this.cargoVolumeUnit = cargoVolumeUnit;
    }

    public Integer getCargoBody() {
        return this.cargoBody;
    }

    public void setCargoBody(Integer cargoBody) {
        this.cargoBody = cargoBody;
    }

    public BigDecimal getCargoTemperature() {
        return this.cargoTemperature;
    }

    public void setCargoTemperature(BigDecimal cargoTemperature) {
        this.cargoTemperature = cargoTemperature;
    }

    public Integer getCargoTemperatureUnit() {
        return this.cargoTemperatureUnit;
    }

    public void setCargoTemperatureUnit(Integer cargoTemperatureUnit) {
        this.cargoTemperatureUnit = cargoTemperatureUnit;
    }

    public String getCargoDescription() {
        return this.cargoDescription;
    }

    public void setCargoDescription(String cargoDescription) {
        this.cargoDescription = cargoDescription;
    }

    public Integer getCarrierType() {
        return this.carrierType;
    }

    public void setCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
    }

    public Integer getCarrieerEco() {
        return this.carrieerEco;
    }

    public void setCarrieerEco(Integer carrieerEco) {
        this.carrieerEco = carrieerEco;
    }

    public Integer getCarrierRaiting() {
        return this.carrierRaiting;
    }

    public void setCarrierRaiting(Integer carrierRaiting) {
        this.carrierRaiting = carrierRaiting;
    }

    public String getCarrierCountryCode() {
        return this.carrierCountryCode;
    }

    public void setCarrierCountryCode(String carrierCountryCode) {
        this.carrierCountryCode = carrierCountryCode;
    }

    public Boolean getAdr() {
        return this.adr;
    }

    public void setAdr(Boolean adr) {
        this.adr = adr;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Long getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(Long createdUser) {
        this.createdUser = createdUser;
    }

    public String getModifiedUser() {
        return this.modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Timestamp getFinishDate() {
        return this.finishDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
    }

    public CarrierPreferences getCarrierPreferences() {
        return this.carrierPreferences;
    }

    public void setCarrierPreferences(CarrierPreferences carrierPreferences) {
        this.carrierPreferences = carrierPreferences;
    }

    public TenderStatus getStatus() {
        return this.status;
    }

    public void setStatus(TenderStatus status) {
        this.status = status;
    }

    public Long getDealId() {
        return this.dealId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getTir() {
        return this.tir;
    }

    public void setTir(Boolean tir) {
        this.tir = tir;
    }

    public Boolean getCent() {
        return this.cent;
    }

    public void setCent(Boolean cent) {
        this.cent = cent;
    }

    public Boolean getCargoLoadingTop() {
        return this.cargoLoadingTop;
    }

    public void setCargoLoadingTop(Boolean cargoLoadingTop) {
        this.cargoLoadingTop = cargoLoadingTop;
    }

    public Boolean getCargoLoadingBack() {
        return this.cargoLoadingBack;
    }

    public void setCargoLoadingBack(Boolean cargoLoadingBack) {
        this.cargoLoadingBack = cargoLoadingBack;
    }

    public Boolean getCargoLoadingSide() {
        return this.cargoLoadingSide;
    }

    public void setCargoLoadingSide(Boolean cargoLoadingSide) {
        this.cargoLoadingSide = cargoLoadingSide;
    }

    public Boolean getCargoLoadingRacksRemoval() {
        return this.cargoLoadingRacksRemoval;
    }

    public void setCargoLoadingRacksRemoval(Boolean cargoLoadingRacksRemoval) {
        this.cargoLoadingRacksRemoval = cargoLoadingRacksRemoval;
    }

    public Boolean getIndividualTender() {
        return this.individualTender;
    }

    public void setIndividualTender(Boolean individualTender) {
        this.individualTender = individualTender;
    }

    public String getIndividualGroup() {
        return this.individualGroup;
    }

    public void setIndividualGroup(String individualGroup) {
        this.individualGroup = individualGroup;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tenders (");

        sb.append(id);
        sb.append(", ").append(total);
        sb.append(", ").append(frequency);
        sb.append(", ").append(cargoName);
        sb.append(", ").append(cargoWeight);
        sb.append(", ").append(cargoWeightUnit);
        sb.append(", ").append(cargoVolume);
        sb.append(", ").append(cargoVolumeUnit);
        sb.append(", ").append(cargoBody);
        sb.append(", ").append(cargoTemperature);
        sb.append(", ").append(cargoTemperatureUnit);
        sb.append(", ").append(cargoDescription);
        sb.append(", ").append(carrierType);
        sb.append(", ").append(carrieerEco);
        sb.append(", ").append(carrierRaiting);
        sb.append(", ").append(carrierCountryCode);
        sb.append(", ").append(adr);
        sb.append(", ").append(comment);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdUser);
        sb.append(", ").append(modifiedUser);
        sb.append(", ").append(finishDate);
        sb.append(", ").append(carrierPreferences);
        sb.append(", ").append(status);
        sb.append(", ").append(dealId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(version);
        sb.append(", ").append(tir);
        sb.append(", ").append(cent);
        sb.append(", ").append(cargoLoadingTop);
        sb.append(", ").append(cargoLoadingBack);
        sb.append(", ").append(cargoLoadingSide);
        sb.append(", ").append(cargoLoadingRacksRemoval);
        sb.append(", ").append(individualTender);
        sb.append(", ").append(individualGroup);

        sb.append(")");
        return sb.toString();
    }
}
