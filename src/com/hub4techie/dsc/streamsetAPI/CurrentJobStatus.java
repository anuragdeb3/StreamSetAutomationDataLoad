package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentJobStatus {

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
	private BigInteger startTime;
	@SerializedName("finishTime")
	@Expose
	private BigInteger finishTime;
	@SerializedName("errorMessage")
	@Expose
	private Object errorMessage;
	@SerializedName("sdcIds")
	@Expose
	private List<String> sdcIds = null;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("errorInfos")
	@Expose
	private List<Object> errorInfos = null;
	@SerializedName("warnings")
	@Expose
	private List<Object> warnings = null;
	@SerializedName("ackTrackers")
	@Expose
	private List<AckTracker> ackTrackers = null;
	@SerializedName("pipelineOffsets")
	@Expose
	private Object pipelineOffsets;
	@SerializedName("pipelineStatus")
	@Expose
	private List<Pipelinestatus> pipelineStatus = null;
	@SerializedName("upgradeStatus")
	@Expose
	private Object upgradeStatus;
	@SerializedName("pipelineCommitLabel")
	@Expose
	private Object pipelineCommitLabel;
	@SerializedName("edge")
	@Expose
	private Boolean edge;

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

	public BigInteger getStartTime() {
		return startTime;
	}

	public void setStartTime(BigInteger startTime) {
		this.startTime = startTime;
	}

	public BigInteger getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(BigInteger finishTime) {
		this.finishTime = finishTime;
	}

	public Object getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(Object errorMessage) {
		this.errorMessage = errorMessage;
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

	public List<Pipelinestatus> getPipelineStatus() {
		return pipelineStatus;
	}

	public void setPipelineStatus(List<Pipelinestatus> pipelineStatus) {
		this.pipelineStatus = pipelineStatus;
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

}