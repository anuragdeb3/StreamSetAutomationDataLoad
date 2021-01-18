
package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value_______ {

    @SerializedName("currentStage")
    @Expose
    private String currentStage;
    @SerializedName("stageStartTime")
    @Expose
    private BigInteger stageStartTime;
    @SerializedName("offsetValue")
    @Expose
    private String offsetValue;
    @SerializedName("batchCount")
    @Expose
    private Integer batchCount;
    @SerializedName("offsetKey")
    @Expose
    private String offsetKey;
    @SerializedName("batchStartTime")
    @Expose
    private BigInteger batchStartTime;

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public BigInteger getStageStartTime() {
        return stageStartTime;
    }

    public void setStageStartTime(BigInteger stageStartTime) {
        this.stageStartTime = stageStartTime;
    }

    public String getOffsetValue() {
        return offsetValue;
    }

    public void setOffsetValue(String offsetValue) {
        this.offsetValue = offsetValue;
    }

    public Integer getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
    }

    public String getOffsetKey() {
        return offsetKey;
    }

    public void setOffsetKey(String offsetKey) {
        this.offsetKey = offsetKey;
    }

    public BigInteger getBatchStartTime() {
        return batchStartTime;
    }

    public void setBatchStartTime(BigInteger batchStartTime) {
        this.batchStartTime = batchStartTime;
    }

}
