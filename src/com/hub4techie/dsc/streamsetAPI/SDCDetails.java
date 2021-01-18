package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SDCDetails {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("organization")
	@Expose
	private String organization;
	@SerializedName("httpUrl")
	@Expose
	private String httpUrl;
	@SerializedName("version")
	@Expose
	private String version;
	@SerializedName("labels")
	@Expose
	private List<String> labels = null;
	@SerializedName("reportedLabels")
	@Expose
	private List<String> reportedLabels = null;
	@SerializedName("lastReportedTime")
	@Expose
	private BigInteger lastReportedTime;
	@SerializedName("offsetProtocolVersion")
	@Expose
	private Integer offsetProtocolVersion;
	@SerializedName("edge")
	@Expose
	private Boolean edge;
	@SerializedName("cpuLoad")
	@Expose
	private Double cpuLoad;
	@SerializedName("totalMemory")
	@Expose
	private Double totalMemory;
	@SerializedName("usedMemory")
	@Expose
	private Double usedMemory;
	@SerializedName("pipelinesCount")
	@Expose
	private Integer pipelinesCount;
	@SerializedName("responding")
	@Expose
	private Boolean responding;
	@SerializedName("idSeparator")
	@Expose
	private String idSeparator;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<String> getReportedLabels() {
		return reportedLabels;
	}

	public void setReportedLabels(List<String> reportedLabels) {
		this.reportedLabels = reportedLabels;
	}

	public BigInteger getLastReportedTime() {
		return lastReportedTime;
	}

	public void setLastReportedTime(BigInteger lastReportedTime) {
		this.lastReportedTime = lastReportedTime;
	}

	public Integer getOffsetProtocolVersion() {
		return offsetProtocolVersion;
	}

	public void setOffsetProtocolVersion(Integer offsetProtocolVersion) {
		this.offsetProtocolVersion = offsetProtocolVersion;
	}

	public Boolean getEdge() {
		return edge;
	}

	public void setEdge(Boolean edge) {
		this.edge = edge;
	}

	public Double getCpuLoad() {
		return cpuLoad;
	}

	public void setCpuLoad(Double cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	public Double getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(Double totalMemory) {
		this.totalMemory = totalMemory;
	}

	public Double getUsedMemory() {
		return usedMemory;
	}

	public void setUsedMemory(Double usedMemory) {
		this.usedMemory = usedMemory;
	}

	public Integer getPipelinesCount() {
		return pipelinesCount;
	}

	public void setPipelinesCount(Integer pipelinesCount) {
		this.pipelinesCount = pipelinesCount;
	}

	public Boolean getResponding() {
		return responding;
	}

	public void setResponding(Boolean responding) {
		this.responding = responding;
	}

	public String getIdSeparator() {
		return idSeparator;
	}

	public void setIdSeparator(String idSeparator) {
		this.idSeparator = idSeparator;
	}

}