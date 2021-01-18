
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value_ {

    @SerializedName("Waiting on poll")
    @Expose
    private Boolean waitingOnPoll;
    @SerializedName("Rebalance In Progress")
    @Expose
    private Boolean rebalanceInProgress;

    public Boolean getWaitingOnPoll() {
        return waitingOnPoll;
    }

    public void setWaitingOnPoll(Boolean waitingOnPoll) {
        this.waitingOnPoll = waitingOnPoll;
    }

    public Boolean getRebalanceInProgress() {
        return rebalanceInProgress;
    }

    public void setRebalanceInProgress(Boolean rebalanceInProgress) {
        this.rebalanceInProgress = rebalanceInProgress;
    }

}
