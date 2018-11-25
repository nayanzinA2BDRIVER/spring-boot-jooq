/**
 * This class is generated by jOOQ
 */
package com.nayanzin.springbootjooq.db.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

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
public class PgStatistic implements Serializable {

    private static final long serialVersionUID = 1811845163;

    private Long    starelid;
    private Short   staattnum;
    private Boolean stainherit;
    private Float   stanullfrac;
    private Integer stawidth;
    private Float   stadistinct;
    private Short   stakind1;
    private Short   stakind2;
    private Short   stakind3;
    private Short   stakind4;
    private Short   stakind5;
    private Long    staop1;
    private Long    staop2;
    private Long    staop3;
    private Long    staop4;
    private Long    staop5;
    private Float[] stanumbers1;
    private Float[] stanumbers2;
    private Float[] stanumbers3;
    private Float[] stanumbers4;
    private Float[] stanumbers5;
    private Object  stavalues1;
    private Object  stavalues2;
    private Object  stavalues3;
    private Object  stavalues4;
    private Object  stavalues5;

    public PgStatistic() {}

    public PgStatistic(PgStatistic value) {
        this.starelid = value.starelid;
        this.staattnum = value.staattnum;
        this.stainherit = value.stainherit;
        this.stanullfrac = value.stanullfrac;
        this.stawidth = value.stawidth;
        this.stadistinct = value.stadistinct;
        this.stakind1 = value.stakind1;
        this.stakind2 = value.stakind2;
        this.stakind3 = value.stakind3;
        this.stakind4 = value.stakind4;
        this.stakind5 = value.stakind5;
        this.staop1 = value.staop1;
        this.staop2 = value.staop2;
        this.staop3 = value.staop3;
        this.staop4 = value.staop4;
        this.staop5 = value.staop5;
        this.stanumbers1 = value.stanumbers1;
        this.stanumbers2 = value.stanumbers2;
        this.stanumbers3 = value.stanumbers3;
        this.stanumbers4 = value.stanumbers4;
        this.stanumbers5 = value.stanumbers5;
        this.stavalues1 = value.stavalues1;
        this.stavalues2 = value.stavalues2;
        this.stavalues3 = value.stavalues3;
        this.stavalues4 = value.stavalues4;
        this.stavalues5 = value.stavalues5;
    }

    public PgStatistic(
        Long    starelid,
        Short   staattnum,
        Boolean stainherit,
        Float   stanullfrac,
        Integer stawidth,
        Float   stadistinct,
        Short   stakind1,
        Short   stakind2,
        Short   stakind3,
        Short   stakind4,
        Short   stakind5,
        Long    staop1,
        Long    staop2,
        Long    staop3,
        Long    staop4,
        Long    staop5,
        Float[] stanumbers1,
        Float[] stanumbers2,
        Float[] stanumbers3,
        Float[] stanumbers4,
        Float[] stanumbers5,
        Object  stavalues1,
        Object  stavalues2,
        Object  stavalues3,
        Object  stavalues4,
        Object  stavalues5
    ) {
        this.starelid = starelid;
        this.staattnum = staattnum;
        this.stainherit = stainherit;
        this.stanullfrac = stanullfrac;
        this.stawidth = stawidth;
        this.stadistinct = stadistinct;
        this.stakind1 = stakind1;
        this.stakind2 = stakind2;
        this.stakind3 = stakind3;
        this.stakind4 = stakind4;
        this.stakind5 = stakind5;
        this.staop1 = staop1;
        this.staop2 = staop2;
        this.staop3 = staop3;
        this.staop4 = staop4;
        this.staop5 = staop5;
        this.stanumbers1 = stanumbers1;
        this.stanumbers2 = stanumbers2;
        this.stanumbers3 = stanumbers3;
        this.stanumbers4 = stanumbers4;
        this.stanumbers5 = stanumbers5;
        this.stavalues1 = stavalues1;
        this.stavalues2 = stavalues2;
        this.stavalues3 = stavalues3;
        this.stavalues4 = stavalues4;
        this.stavalues5 = stavalues5;
    }

    public Long getStarelid() {
        return this.starelid;
    }

    public void setStarelid(Long starelid) {
        this.starelid = starelid;
    }

    public Short getStaattnum() {
        return this.staattnum;
    }

    public void setStaattnum(Short staattnum) {
        this.staattnum = staattnum;
    }

    public Boolean getStainherit() {
        return this.stainherit;
    }

    public void setStainherit(Boolean stainherit) {
        this.stainherit = stainherit;
    }

    public Float getStanullfrac() {
        return this.stanullfrac;
    }

    public void setStanullfrac(Float stanullfrac) {
        this.stanullfrac = stanullfrac;
    }

    public Integer getStawidth() {
        return this.stawidth;
    }

    public void setStawidth(Integer stawidth) {
        this.stawidth = stawidth;
    }

    public Float getStadistinct() {
        return this.stadistinct;
    }

    public void setStadistinct(Float stadistinct) {
        this.stadistinct = stadistinct;
    }

    public Short getStakind1() {
        return this.stakind1;
    }

    public void setStakind1(Short stakind1) {
        this.stakind1 = stakind1;
    }

    public Short getStakind2() {
        return this.stakind2;
    }

    public void setStakind2(Short stakind2) {
        this.stakind2 = stakind2;
    }

    public Short getStakind3() {
        return this.stakind3;
    }

    public void setStakind3(Short stakind3) {
        this.stakind3 = stakind3;
    }

    public Short getStakind4() {
        return this.stakind4;
    }

    public void setStakind4(Short stakind4) {
        this.stakind4 = stakind4;
    }

    public Short getStakind5() {
        return this.stakind5;
    }

    public void setStakind5(Short stakind5) {
        this.stakind5 = stakind5;
    }

    public Long getStaop1() {
        return this.staop1;
    }

    public void setStaop1(Long staop1) {
        this.staop1 = staop1;
    }

    public Long getStaop2() {
        return this.staop2;
    }

    public void setStaop2(Long staop2) {
        this.staop2 = staop2;
    }

    public Long getStaop3() {
        return this.staop3;
    }

    public void setStaop3(Long staop3) {
        this.staop3 = staop3;
    }

    public Long getStaop4() {
        return this.staop4;
    }

    public void setStaop4(Long staop4) {
        this.staop4 = staop4;
    }

    public Long getStaop5() {
        return this.staop5;
    }

    public void setStaop5(Long staop5) {
        this.staop5 = staop5;
    }

    public Float[] getStanumbers1() {
        return this.stanumbers1;
    }

    public void setStanumbers1(Float[] stanumbers1) {
        this.stanumbers1 = stanumbers1;
    }

    public Float[] getStanumbers2() {
        return this.stanumbers2;
    }

    public void setStanumbers2(Float[] stanumbers2) {
        this.stanumbers2 = stanumbers2;
    }

    public Float[] getStanumbers3() {
        return this.stanumbers3;
    }

    public void setStanumbers3(Float[] stanumbers3) {
        this.stanumbers3 = stanumbers3;
    }

    public Float[] getStanumbers4() {
        return this.stanumbers4;
    }

    public void setStanumbers4(Float[] stanumbers4) {
        this.stanumbers4 = stanumbers4;
    }

    public Float[] getStanumbers5() {
        return this.stanumbers5;
    }

    public void setStanumbers5(Float[] stanumbers5) {
        this.stanumbers5 = stanumbers5;
    }

    public Object getStavalues1() {
        return this.stavalues1;
    }

    public void setStavalues1(Object stavalues1) {
        this.stavalues1 = stavalues1;
    }

    public Object getStavalues2() {
        return this.stavalues2;
    }

    public void setStavalues2(Object stavalues2) {
        this.stavalues2 = stavalues2;
    }

    public Object getStavalues3() {
        return this.stavalues3;
    }

    public void setStavalues3(Object stavalues3) {
        this.stavalues3 = stavalues3;
    }

    public Object getStavalues4() {
        return this.stavalues4;
    }

    public void setStavalues4(Object stavalues4) {
        this.stavalues4 = stavalues4;
    }

    public Object getStavalues5() {
        return this.stavalues5;
    }

    public void setStavalues5(Object stavalues5) {
        this.stavalues5 = stavalues5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatistic (");

        sb.append(starelid);
        sb.append(", ").append(staattnum);
        sb.append(", ").append(stainherit);
        sb.append(", ").append(stanullfrac);
        sb.append(", ").append(stawidth);
        sb.append(", ").append(stadistinct);
        sb.append(", ").append(stakind1);
        sb.append(", ").append(stakind2);
        sb.append(", ").append(stakind3);
        sb.append(", ").append(stakind4);
        sb.append(", ").append(stakind5);
        sb.append(", ").append(staop1);
        sb.append(", ").append(staop2);
        sb.append(", ").append(staop3);
        sb.append(", ").append(staop4);
        sb.append(", ").append(staop5);
        sb.append(", ").append(Arrays.toString(stanumbers1));
        sb.append(", ").append(Arrays.toString(stanumbers2));
        sb.append(", ").append(Arrays.toString(stanumbers3));
        sb.append(", ").append(Arrays.toString(stanumbers4));
        sb.append(", ").append(Arrays.toString(stanumbers5));
        sb.append(", ").append(stavalues1);
        sb.append(", ").append(stavalues2);
        sb.append(", ").append(stavalues3);
        sb.append(", ").append(stavalues4);
        sb.append(", ").append(stavalues5);

        sb.append(")");
        return sb.toString();
    }
}