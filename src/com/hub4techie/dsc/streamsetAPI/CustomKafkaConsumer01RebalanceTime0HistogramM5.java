
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomKafkaConsumer01RebalanceTime0HistogramM5 {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("max")
    @Expose
    private Integer max;
    @SerializedName("mean")
    @Expose
    private Double mean;
    @SerializedName("min")
    @Expose
    private Integer min;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
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

}
