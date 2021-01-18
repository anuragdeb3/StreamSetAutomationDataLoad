
package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("batchCount")
    @Expose
    private Integer batchCount;
    @SerializedName("idleBatchCount")
    @Expose
    private Integer idleBatchCount;
    @SerializedName("timeOfLastReceivedRecord")
    @Expose
    private BigInteger timeOfLastReceivedRecord;
    @SerializedName("lastBatchInputRecordsCount")
    @Expose
    private Integer lastBatchInputRecordsCount;
    @SerializedName("lastBatchOutputRecordsCount")
    @Expose
    private Integer lastBatchOutputRecordsCount;
    @SerializedName("lastBatchErrorRecordsCount")
    @Expose
    private Integer lastBatchErrorRecordsCount;
    @SerializedName("lastBatchErrorMessagesCount")
    @Expose
    private Integer lastBatchErrorMessagesCount;
    @SerializedName("totalRunners")
    @Expose
    private Integer totalRunners;
    @SerializedName("availableRunners")
    @Expose
    private Integer availableRunners;

    public Integer getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
    }

    public Integer getIdleBatchCount() {
        return idleBatchCount;
    }

    public void setIdleBatchCount(Integer idleBatchCount) {
        this.idleBatchCount = idleBatchCount;
    }

    public BigInteger getTimeOfLastReceivedRecord() {
        return timeOfLastReceivedRecord;
    }

    public void setTimeOfLastReceivedRecord(BigInteger timeOfLastReceivedRecord) {
        this.timeOfLastReceivedRecord = timeOfLastReceivedRecord;
    }

    public Integer getLastBatchInputRecordsCount() {
        return lastBatchInputRecordsCount;
    }

    public void setLastBatchInputRecordsCount(Integer lastBatchInputRecordsCount) {
        this.lastBatchInputRecordsCount = lastBatchInputRecordsCount;
    }

    public Integer getLastBatchOutputRecordsCount() {
        return lastBatchOutputRecordsCount;
    }

    public void setLastBatchOutputRecordsCount(Integer lastBatchOutputRecordsCount) {
        this.lastBatchOutputRecordsCount = lastBatchOutputRecordsCount;
    }

    public Integer getLastBatchErrorRecordsCount() {
        return lastBatchErrorRecordsCount;
    }

    public void setLastBatchErrorRecordsCount(Integer lastBatchErrorRecordsCount) {
        this.lastBatchErrorRecordsCount = lastBatchErrorRecordsCount;
    }

    public Integer getLastBatchErrorMessagesCount() {
        return lastBatchErrorMessagesCount;
    }

    public void setLastBatchErrorMessagesCount(Integer lastBatchErrorMessagesCount) {
        this.lastBatchErrorMessagesCount = lastBatchErrorMessagesCount;
    }

    public Integer getTotalRunners() {
        return totalRunners;
    }

    public void setTotalRunners(Integer totalRunners) {
        this.totalRunners = totalRunners;
    }

    public Integer getAvailableRunners() {
        return availableRunners;
    }

    public void setAvailableRunners(Integer availableRunners) {
        this.availableRunners = availableRunners;
    }

}
