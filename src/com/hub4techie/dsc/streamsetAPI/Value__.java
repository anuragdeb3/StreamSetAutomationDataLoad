
package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value__ {

    @SerializedName("threadName")
    @Expose
    private String threadName;
    @SerializedName("scheduledDelay")
    @Expose
    private Integer scheduledDelay;
    @SerializedName("timestamp")
    @Expose
    private BigInteger timestamp;

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Integer getScheduledDelay() {
        return scheduledDelay;
    }

    public void setScheduledDelay(Integer scheduledDelay) {
        this.scheduledDelay = scheduledDelay;
    }

    public BigInteger getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

}
