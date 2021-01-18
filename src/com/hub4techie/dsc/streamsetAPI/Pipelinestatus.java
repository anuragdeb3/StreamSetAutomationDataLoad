package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pipelinestatus {

	@SerializedName("sdcId")
	@Expose
	private String sdcId;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("jobId")
	@Expose
	private String jobId;
	@SerializedName("localPipeline")
	@Expose
	private Boolean localPipeline;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("lastReportedTime")
	@Expose
	private BigInteger lastReportedTime;
	@SerializedName("worker")
	@Expose
	private List<Object> worker = null;
	@SerializedName("message")
	@Expose
	private Object message;
	@SerializedName("clusterMode")
	@Expose
	private Boolean clusterMode;

	public String getSdcId() {
		return sdcId;
	}

	public void setSdcId(String sdcId) {
		this.sdcId = sdcId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Boolean getLocalPipeline() {
		return localPipeline;
	}

	public void setLocalPipeline(Boolean localPipeline) {
		this.localPipeline = localPipeline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigInteger getLastReportedTime() {
		return lastReportedTime;
	}

	public void setLastReportedTime(BigInteger lastReportedTime) {
		this.lastReportedTime = lastReportedTime;
	}

	public List<Object> getWorker() {
		return worker;
	}

	public void setWorker(List<Object> worker) {
		this.worker = worker;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public Boolean getClusterMode() {
		return clusterMode;
	}

	public void setClusterMode(Boolean clusterMode) {
		this.clusterMode = clusterMode;
	}

}