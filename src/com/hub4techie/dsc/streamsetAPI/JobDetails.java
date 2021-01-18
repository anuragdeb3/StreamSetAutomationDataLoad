package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobDetails {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("description")
	@Expose
	private Object description;
	@SerializedName("organization")
	@Expose
	private String organization;
	@SerializedName("creator")
	@Expose
	private String creator;
	@SerializedName("createTime")
	@Expose
	private BigInteger createTime;
	@SerializedName("lastModifiedBy")
	@Expose
	private String lastModifiedBy;
	@SerializedName("lastModifiedOn")
	@Expose
	private BigInteger lastModifiedOn;
	@SerializedName("destroyer")
	@Expose
	private Object destroyer;
	@SerializedName("deleteTime")
	@Expose
	private BigInteger deleteTime;
	@SerializedName("jobDeleted")
	@Expose
	private Boolean jobDeleted;
	@SerializedName("pipelineName")
	@Expose
	private String pipelineName;
	@SerializedName("pipelineId")
	@Expose
	private String pipelineId;
	@SerializedName("pipelineCommitId")
	@Expose
	private String pipelineCommitId;
	@SerializedName("rulesId")
	@Expose
	private String rulesId;
	@SerializedName("pipelineCommitLabel")
	@Expose
	private String pipelineCommitLabel;
	@SerializedName("labels")
	@Expose
	private List<String> labels = null;
	@SerializedName("currentJobStatus")
	@Expose
	private CurrentJobStatus currentJobStatus;
	@SerializedName("currentUpgradeStatus")
	@Expose
	private Object currentUpgradeStatus;
	@SerializedName("parentJobId")
	@Expose
	private Object parentJobId;
	@SerializedName("systemJobId")
	@Expose
	private Object systemJobId;
	@SerializedName("numInstances")
	@Expose
	private Integer numInstances;
	@SerializedName("migrateOffsets")
	@Expose
	private Boolean migrateOffsets;
	@SerializedName("statsRefreshInterval")
	@Expose
	private Integer statsRefreshInterval;
	@SerializedName("runtimeParameters")
	@Expose
	private String runtimeParameters;
	@SerializedName("edge")
	@Expose
	private Boolean edge;
	@SerializedName("timeSeries")
	@Expose
	private Boolean timeSeries;
	@SerializedName("forceStopTimeout")
	@Expose
	private Integer forceStopTimeout;
	@SerializedName("maxRetriesForFailedJob")
	@Expose
	private Integer maxRetriesForFailedJob;
	@SerializedName("provenanceMetaData")
	@Expose
	private ProvenanceMetaData provenanceMetaData;
	@SerializedName("jobTemplate")
	@Expose
	private Boolean jobTemplate;
	@SerializedName("templateJobId")
	@Expose
	private Object templateJobId;
	@SerializedName("cdConfig")
	@Expose
	private Object cdConfig;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public BigInteger getCreateTime() {
		return createTime;
	}

	public void setCreateTime(BigInteger createTime) {
		this.createTime = createTime;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public BigInteger getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(BigInteger lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public Object getDestroyer() {
		return destroyer;
	}

	public void setDestroyer(Object destroyer) {
		this.destroyer = destroyer;
	}

	public BigInteger getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(BigInteger deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Boolean getJobDeleted() {
		return jobDeleted;
	}

	public void setJobDeleted(Boolean jobDeleted) {
		this.jobDeleted = jobDeleted;
	}

	public String getPipelineName() {
		return pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
	}

	public String getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getPipelineCommitId() {
		return pipelineCommitId;
	}

	public void setPipelineCommitId(String pipelineCommitId) {
		this.pipelineCommitId = pipelineCommitId;
	}

	public String getRulesId() {
		return rulesId;
	}

	public void setRulesId(String rulesId) {
		this.rulesId = rulesId;
	}

	public String getPipelineCommitLabel() {
		return pipelineCommitLabel;
	}

	public void setPipelineCommitLabel(String pipelineCommitLabel) {
		this.pipelineCommitLabel = pipelineCommitLabel;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public CurrentJobStatus getCurrentJobStatus() {
		return currentJobStatus;
	}

	public void setCurrentJobStatus(CurrentJobStatus currentJobStatus) {
		this.currentJobStatus = currentJobStatus;
	}

	public Object getCurrentUpgradeStatus() {
		return currentUpgradeStatus;
	}

	public void setCurrentUpgradeStatus(Object currentUpgradeStatus) {
		this.currentUpgradeStatus = currentUpgradeStatus;
	}

	public Object getParentJobId() {
		return parentJobId;
	}

	public void setParentJobId(Object parentJobId) {
		this.parentJobId = parentJobId;
	}

	public Object getSystemJobId() {
		return systemJobId;
	}

	public void setSystemJobId(Object systemJobId) {
		this.systemJobId = systemJobId;
	}

	public Integer getNumInstances() {
		return numInstances;
	}

	public void setNumInstances(Integer numInstances) {
		this.numInstances = numInstances;
	}

	public Boolean getMigrateOffsets() {
		return migrateOffsets;
	}

	public void setMigrateOffsets(Boolean migrateOffsets) {
		this.migrateOffsets = migrateOffsets;
	}

	public Integer getStatsRefreshInterval() {
		return statsRefreshInterval;
	}

	public void setStatsRefreshInterval(Integer statsRefreshInterval) {
		this.statsRefreshInterval = statsRefreshInterval;
	}

	public String getRuntimeParameters() {
		return runtimeParameters;
	}

	public void setRuntimeParameters(String runtimeParameters) {
		this.runtimeParameters = runtimeParameters;
	}

	public Boolean getEdge() {
		return edge;
	}

	public void setEdge(Boolean edge) {
		this.edge = edge;
	}

	public Boolean getTimeSeries() {
		return timeSeries;
	}

	public void setTimeSeries(Boolean timeSeries) {
		this.timeSeries = timeSeries;
	}

	public Integer getForceStopTimeout() {
		return forceStopTimeout;
	}

	public void setForceStopTimeout(Integer forceStopTimeout) {
		this.forceStopTimeout = forceStopTimeout;
	}

	public Integer getMaxRetriesForFailedJob() {
		return maxRetriesForFailedJob;
	}

	public void setMaxRetriesForFailedJob(Integer maxRetriesForFailedJob) {
		this.maxRetriesForFailedJob = maxRetriesForFailedJob;
	}

	public ProvenanceMetaData getProvenanceMetaData() {
		return provenanceMetaData;
	}

	public void setProvenanceMetaData(ProvenanceMetaData provenanceMetaData) {
		this.provenanceMetaData = provenanceMetaData;
	}

	public Boolean getJobTemplate() {
		return jobTemplate;
	}

	public void setJobTemplate(Boolean jobTemplate) {
		this.jobTemplate = jobTemplate;
	}

	public Object getTemplateJobId() {
		return templateJobId;
	}

	public void setTemplateJobId(Object templateJobId) {
		this.templateJobId = templateJobId;
	}

	public Object getCdConfig() {
		return cdConfig;
	}

	public void setCdConfig(Object cdConfig) {
		this.cdConfig = cdConfig;
	}

}