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
public class PgStats implements Serializable {

    private static final long serialVersionUID = -1629984671;

    private String  schemaname;
    private String  tablename;
    private String  attname;
    private Boolean inherited;
    private Float   nullFrac;
    private Integer avgWidth;
    private Float   nDistinct;
    private Object  mostCommonVals;
    private Float[] mostCommonFreqs;
    private Object  histogramBounds;
    private Float   correlation;
    private Object  mostCommonElems;
    private Float[] mostCommonElemFreqs;
    private Float[] elemCountHistogram;

    public PgStats() {}

    public PgStats(PgStats value) {
        this.schemaname = value.schemaname;
        this.tablename = value.tablename;
        this.attname = value.attname;
        this.inherited = value.inherited;
        this.nullFrac = value.nullFrac;
        this.avgWidth = value.avgWidth;
        this.nDistinct = value.nDistinct;
        this.mostCommonVals = value.mostCommonVals;
        this.mostCommonFreqs = value.mostCommonFreqs;
        this.histogramBounds = value.histogramBounds;
        this.correlation = value.correlation;
        this.mostCommonElems = value.mostCommonElems;
        this.mostCommonElemFreqs = value.mostCommonElemFreqs;
        this.elemCountHistogram = value.elemCountHistogram;
    }

    public PgStats(
        String  schemaname,
        String  tablename,
        String  attname,
        Boolean inherited,
        Float   nullFrac,
        Integer avgWidth,
        Float   nDistinct,
        Object  mostCommonVals,
        Float[] mostCommonFreqs,
        Object  histogramBounds,
        Float   correlation,
        Object  mostCommonElems,
        Float[] mostCommonElemFreqs,
        Float[] elemCountHistogram
    ) {
        this.schemaname = schemaname;
        this.tablename = tablename;
        this.attname = attname;
        this.inherited = inherited;
        this.nullFrac = nullFrac;
        this.avgWidth = avgWidth;
        this.nDistinct = nDistinct;
        this.mostCommonVals = mostCommonVals;
        this.mostCommonFreqs = mostCommonFreqs;
        this.histogramBounds = histogramBounds;
        this.correlation = correlation;
        this.mostCommonElems = mostCommonElems;
        this.mostCommonElemFreqs = mostCommonElemFreqs;
        this.elemCountHistogram = elemCountHistogram;
    }

    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getTablename() {
        return this.tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getAttname() {
        return this.attname;
    }

    public void setAttname(String attname) {
        this.attname = attname;
    }

    public Boolean getInherited() {
        return this.inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public Float getNullFrac() {
        return this.nullFrac;
    }

    public void setNullFrac(Float nullFrac) {
        this.nullFrac = nullFrac;
    }

    public Integer getAvgWidth() {
        return this.avgWidth;
    }

    public void setAvgWidth(Integer avgWidth) {
        this.avgWidth = avgWidth;
    }

    public Float getNDistinct() {
        return this.nDistinct;
    }

    public void setNDistinct(Float nDistinct) {
        this.nDistinct = nDistinct;
    }

    public Object getMostCommonVals() {
        return this.mostCommonVals;
    }

    public void setMostCommonVals(Object mostCommonVals) {
        this.mostCommonVals = mostCommonVals;
    }

    public Float[] getMostCommonFreqs() {
        return this.mostCommonFreqs;
    }

    public void setMostCommonFreqs(Float[] mostCommonFreqs) {
        this.mostCommonFreqs = mostCommonFreqs;
    }

    public Object getHistogramBounds() {
        return this.histogramBounds;
    }

    public void setHistogramBounds(Object histogramBounds) {
        this.histogramBounds = histogramBounds;
    }

    public Float getCorrelation() {
        return this.correlation;
    }

    public void setCorrelation(Float correlation) {
        this.correlation = correlation;
    }

    public Object getMostCommonElems() {
        return this.mostCommonElems;
    }

    public void setMostCommonElems(Object mostCommonElems) {
        this.mostCommonElems = mostCommonElems;
    }

    public Float[] getMostCommonElemFreqs() {
        return this.mostCommonElemFreqs;
    }

    public void setMostCommonElemFreqs(Float[] mostCommonElemFreqs) {
        this.mostCommonElemFreqs = mostCommonElemFreqs;
    }

    public Float[] getElemCountHistogram() {
        return this.elemCountHistogram;
    }

    public void setElemCountHistogram(Float[] elemCountHistogram) {
        this.elemCountHistogram = elemCountHistogram;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStats (");

        sb.append(schemaname);
        sb.append(", ").append(tablename);
        sb.append(", ").append(attname);
        sb.append(", ").append(inherited);
        sb.append(", ").append(nullFrac);
        sb.append(", ").append(avgWidth);
        sb.append(", ").append(nDistinct);
        sb.append(", ").append(mostCommonVals);
        sb.append(", ").append(Arrays.toString(mostCommonFreqs));
        sb.append(", ").append(histogramBounds);
        sb.append(", ").append(correlation);
        sb.append(", ").append(mostCommonElems);
        sb.append(", ").append(Arrays.toString(mostCommonElemFreqs));
        sb.append(", ").append(Arrays.toString(elemCountHistogram));

        sb.append(")");
        return sb.toString();
    }
}
