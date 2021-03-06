/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.public_.tables.pojos;


import com.nayanzin.springbootjooq.db.public_.enums.ApplicationStatus;
import com.nayanzin.springbootjooq.db.public_.enums.CarrierPreferences;

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
public class Applications implements Serializable {

    private static final long serialVersionUID = -659088805;

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
    private Long               modifiedUser;
    private Long               vehicleId;
    private Object             geojson;
    private Long               carrierId;
    private Long               customerId;
    private CarrierPreferences carrierPreferences;
    private ApplicationStatus  status;
    private Boolean            tir;
    private Boolean            cent;
    private Boolean            cargoLoadingTop;
    private Boolean            cargoLoadingBack;
    private Boolean            cargoLoadingSide;
    private Boolean            cargoLoadingRacksRemoval;

    public Applications() {}

    public Applications(Applications value) {
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
        this.vehicleId = value.vehicleId;
        this.geojson = value.geojson;
        this.carrierId = value.carrierId;
        this.customerId = value.customerId;
        this.carrierPreferences = value.carrierPreferences;
        this.status = value.status;
        this.tir = value.tir;
        this.cent = value.cent;
        this.cargoLoadingTop = value.cargoLoadingTop;
        this.cargoLoadingBack = value.cargoLoadingBack;
        this.cargoLoadingSide = value.cargoLoadingSide;
        this.cargoLoadingRacksRemoval = value.cargoLoadingRacksRemoval;
    }

    public Applications(
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
        Long               modifiedUser,
        Long               vehicleId,
        Object             geojson,
        Long               carrierId,
        Long               customerId,
        CarrierPreferences carrierPreferences,
        ApplicationStatus  status,
        Boolean            tir,
        Boolean            cent,
        Boolean            cargoLoadingTop,
        Boolean            cargoLoadingBack,
        Boolean            cargoLoadingSide,
        Boolean            cargoLoadingRacksRemoval
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
        this.vehicleId = vehicleId;
        this.geojson = geojson;
        this.carrierId = carrierId;
        this.customerId = customerId;
        this.carrierPreferences = carrierPreferences;
        this.status = status;
        this.tir = tir;
        this.cent = cent;
        this.cargoLoadingTop = cargoLoadingTop;
        this.cargoLoadingBack = cargoLoadingBack;
        this.cargoLoadingSide = cargoLoadingSide;
        this.cargoLoadingRacksRemoval = cargoLoadingRacksRemoval;
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

    public Long getModifiedUser() {
        return this.modifiedUser;
    }

    public void setModifiedUser(Long modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Long getVehicleId() {
        return this.vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Object getGeojson() {
        return this.geojson;
    }

    public void setGeojson(Object geojson) {
        this.geojson = geojson;
    }

    public Long getCarrierId() {
        return this.carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public CarrierPreferences getCarrierPreferences() {
        return this.carrierPreferences;
    }

    public void setCarrierPreferences(CarrierPreferences carrierPreferences) {
        this.carrierPreferences = carrierPreferences;
    }

    public ApplicationStatus getStatus() {
        return this.status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Applications (");

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
        sb.append(", ").append(vehicleId);
        sb.append(", ").append(geojson);
        sb.append(", ").append(carrierId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(carrierPreferences);
        sb.append(", ").append(status);
        sb.append(", ").append(tir);
        sb.append(", ").append(cent);
        sb.append(", ").append(cargoLoadingTop);
        sb.append(", ").append(cargoLoadingBack);
        sb.append(", ").append(cargoLoadingSide);
        sb.append(", ").append(cargoLoadingRacksRemoval);

        sb.append(")");
        return sb.toString();
    }
}
