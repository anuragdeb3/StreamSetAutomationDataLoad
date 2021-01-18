
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StageKafkaConsumer01OutputRecordsMeter {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("m1_rate")
    @Expose
    private Double m1Rate;
    @SerializedName("m5_rate")
    @Expose
    private Double m5Rate;
    @SerializedName("m15_rate")
    @Expose
    private Double m15Rate;
    @SerializedName("m30_rate")
    @Expose
    private Double m30Rate;
    @SerializedName("h1_rate")
    @Expose
    private Double h1Rate;
    @SerializedName("h6_rate")
    @Expose
    private Double h6Rate;
    @SerializedName("h12_rate")
    @Expose
    private Double h12Rate;
    @SerializedName("h24_rate")
    @Expose
    private Double h24Rate;
    @SerializedName("mean_rate")
    @Expose
    private Double meanRate;
    @SerializedName("units")
    @Expose
    private String units;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public Double getM15Rate() {
        return m15Rate;
    }

    public void setM15Rate(Double m15Rate) {
        this.m15Rate = m15Rate;
    }

    public Double getM30Rate() {
        return m30Rate;
    }

    public void setM30Rate(Double m30Rate) {
        this.m30Rate = m30Rate;
    }

    public Double getH1Rate() {
        return h1Rate;
    }

    public void setH1Rate(Double h1Rate) {
        this.h1Rate = h1Rate;
    }

    public Double getH6Rate() {
        return h6Rate;
    }

    public void setH6Rate(Double h6Rate) {
        this.h6Rate = h6Rate;
    }

    public Double getH12Rate() {
        return h12Rate;
    }

    public void setH12Rate(Double h12Rate) {
        this.h12Rate = h12Rate;
    }

    public Double getH24Rate() {
        return h24Rate;
    }

    public void setH24Rate(Double h24Rate) {
        this.h24Rate = h24Rate;
    }

    public Double getMeanRate() {
        return meanRate;
    }

    public void setMeanRate(Double meanRate) {
        this.meanRate = meanRate;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}
