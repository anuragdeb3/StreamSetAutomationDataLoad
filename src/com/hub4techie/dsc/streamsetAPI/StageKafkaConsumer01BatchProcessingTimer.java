
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StageKafkaConsumer01BatchProcessingTimer {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("max")
    @Expose
    private Double max;
    @SerializedName("mean")
    @Expose
    private Double mean;
    @SerializedName("min")
    @Expose
    private Double min;
    @SerializedName("p50")
    @Expose
    private Double p50;
    @SerializedName("p75")
    @Expose
    private Double p75;
    @SerializedName("p95")
    @Expose
    private Double p95;
    @SerializedName("p98")
    @Expose
    private Double p98;
    @SerializedName("p99")
    @Expose
    private Double p99;
    @SerializedName("p999")
    @Expose
    private Double p999;
    @SerializedName("stddev")
    @Expose
    private Double stddev;
    @SerializedName("m15_rate")
    @Expose
    private Double m15Rate;
    @SerializedName("m1_rate")
    @Expose
    private Double m1Rate;
    @SerializedName("m5_rate")
    @Expose
    private Double m5Rate;
    @SerializedName("mean_rate")
    @Expose
    private Double meanRate;
    @SerializedName("duration_units")
    @Expose
    private String durationUnits;
    @SerializedName("rate_units")
    @Expose
    private String rateUnits;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getP50() {
        return p50;
    }

    public void setP50(Double p50) {
        this.p50 = p50;
    }

    public Double getP75() {
        return p75;
    }

    public void setP75(Double p75) {
        this.p75 = p75;
    }

    public Double getP95() {
        return p95;
    }

    public void setP95(Double p95) {
        this.p95 = p95;
    }

    public Double getP98() {
        return p98;
    }

    public void setP98(Double p98) {
        this.p98 = p98;
    }

    public Double getP99() {
        return p99;
    }

    public void setP99(Double p99) {
        this.p99 = p99;
    }

    public Double getP999() {
        return p999;
    }

    public void setP999(Double p999) {
        this.p999 = p999;
    }

    public Double getStddev() {
        return stddev;
    }

    public void setStddev(Double stddev) {
        this.stddev = stddev;
    }

    public Double getM15Rate() {
        return m15Rate;
    }

    public void setM15Rate(Double m15Rate) {
        this.m15Rate = m15Rate;
    }

    public Double getM1Rate() {
        return m1Rate;
    }

    public void setM1Rate(Double m1Rate) {
        this.m1Rate = m1Rate;
    }

    public Double getM5Rate() {
        return m5Rate;
    }

    public void setM5Rate(Double m5Rate) {
        this.m5Rate = m5Rate;
    }

    public Double getMeanRate() {
        return meanRate;
    }

    public void setMeanRate(Double meanRate) {
        this.meanRate = meanRate;
    }

    public String getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    public String getRateUnits() {
        return rateUnits;
    }

    public void setRateUnits(String rateUnits) {
        this.rateUnits = rateUnits;
    }

}
