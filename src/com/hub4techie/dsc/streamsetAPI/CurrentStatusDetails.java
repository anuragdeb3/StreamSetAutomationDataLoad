package com.hub4techie.dsc.streamsetAPI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CurrentStatusDetails implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("jobId")
    @Expose
    private String jobId;
    @SerializedName("pipelineCommitId")
    @Expose
    private String pipelineCommitId;
    @SerializedName("runCount")
    @Expose
    private Integer runCount;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("startTime")
    @Expose
    private Integer startTime;
    @SerializedName("finishTime")
    @Expose
    private Integer finishTime;
    @SerializedName("errorMessage")
    @Expose
    private Object errorMessage;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("sdcIds")
    @Expose
    private List<String> sdcIds = new ArrayList<String>();
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("errorInfos")
    @Expose
    private List<Object> errorInfos = new ArrayList<Object>();
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings = new ArrayList<Object>();
    @SerializedName("ackTrackers")
    @Expose
    private List<AckTracker> ackTrackers = new ArrayList<AckTracker>();
    @SerializedName("pipelineOffsets")
    @Expose
    private Object pipelineOffsets;
    @SerializedName("CurrentStatuss")
    @Expose
    private List<CurrentStatus> CurrentStatuss = new ArrayList<CurrentStatus>();
    @SerializedName("upgradeStatus")
    @Expose
    private Object upgradeStatus;
    @SerializedName("pipelineCommitLabel")
    @Expose
    private Object pipelineCommitLabel;
    @SerializedName("edge")
    @Expose
    private Boolean edge;
    @SerializedName("inputRecordCount")
    @Expose
    private Integer inputRecordCount;
    @SerializedName("outputRecordCount")
    @Expose
    private Integer outputRecordCount;
    @SerializedName("errorRecordCount")
    @Expose
    private Integer errorRecordCount;
    @SerializedName("lastReportedMetricTime")
    @Expose
    private Integer lastReportedMetricTime;
    private final static long serialVersionUID = 4362917041793070815L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getPipelineCommitId() {
        return pipelineCommitId;
    }

    public void setPipelineCommitId(String pipelineCommitId) {
        this.pipelineCommitId = pipelineCommitId;
    }

    public Integer getRunCount() {
        return runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getSdcIds() {
        return sdcIds;
    }

    public void setSdcIds(List<String> sdcIds) {
        this.sdcIds = sdcIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getErrorInfos() {
        return errorInfos;
    }

    public void setErrorInfos(List<Object> errorInfos) {
        this.errorInfos = errorInfos;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public List<AckTracker> getAckTrackers() {
        return ackTrackers;
    }

    public void setAckTrackers(List<AckTracker> ackTrackers) {
        this.ackTrackers = ackTrackers;
    }

    public Object getPipelineOffsets() {
        return pipelineOffsets;
    }

    public void setPipelineOffsets(Object pipelineOffsets) {
        this.pipelineOffsets = pipelineOffsets;
    }

    public List<CurrentStatus> getCurrentStatuss() {
        return CurrentStatuss;
    }

    public void setCurrentStatuss(List<CurrentStatus> CurrentStatuss) {
        this.CurrentStatuss = CurrentStatuss;
    }

    public Object getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(Object upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    public Object getPipelineCommitLabel() {
        return pipelineCommitLabel;
    }

    public void setPipelineCommitLabel(Object pipelineCommitLabel) {
        this.pipelineCommitLabel = pipelineCommitLabel;
    }

    public Boolean getEdge() {
        return edge;
    }

    public void setEdge(Boolean edge) {
        this.edge = edge;
    }

    public Integer getInputRecordCount() {
        return inputRecordCount;
    }

    public void setInputRecordCount(Integer inputRecordCount) {
        this.inputRecordCount = inputRecordCount;
    }

    public Integer getOutputRecordCount() {
        return outputRecordCount;
    }

    public void setOutputRecordCount(Integer outputRecordCount) {
        this.outputRecordCount = outputRecordCount;
    }

    public Integer getErrorRecordCount() {
        return errorRecordCount;
    }

    public void setErrorRecordCount(Integer errorRecordCount) {
        this.errorRecordCount = errorRecordCount;
    }

    public Integer getLastReportedMetricTime() {
        return lastReportedMetricTime;
    }

    public void setLastReportedMetricTime(Integer lastReportedMetricTime) {
        this.lastReportedMetricTime = lastReportedMetricTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(jobId).append(pipelineCommitId).append(runCount).append(user).append(startTime).append(finishTime).append(errorMessage).append(color).append(sdcIds).append(status).append(errorInfos).append(warnings).append(ackTrackers).append(pipelineOffsets).append(CurrentStatuss).append(upgradeStatus).append(pipelineCommitLabel).append(edge).append(inputRecordCount).append(outputRecordCount).append(errorRecordCount).append(lastReportedMetricTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentStatusDetails) == false) {
            return false;
        }
        CurrentStatusDetails rhs = ((CurrentStatusDetails) other);
        return new EqualsBuilder().append(id, rhs.id).append(jobId, rhs.jobId).append(pipelineCommitId, rhs.pipelineCommitId).append(runCount, rhs.runCount).append(user, rhs.user).append(startTime, rhs.startTime).append(finishTime, rhs.finishTime).append(errorMessage, rhs.errorMessage).append(color, rhs.color).append(sdcIds, rhs.sdcIds).append(status, rhs.status).append(errorInfos, rhs.errorInfos).append(warnings, rhs.warnings).append(ackTrackers, rhs.ackTrackers).append(pipelineOffsets, rhs.pipelineOffsets).append(CurrentStatuss, rhs.CurrentStatuss).append(upgradeStatus, rhs.upgradeStatus).append(pipelineCommitLabel, rhs.pipelineCommitLabel).append(edge, rhs.edge).append(inputRecordCount, rhs.inputRecordCount).append(outputRecordCount, rhs.outputRecordCount).append(errorRecordCount, rhs.errorRecordCount).append(lastReportedMetricTime, rhs.lastReportedMetricTime).isEquals();
    }

}
