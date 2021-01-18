package com.hub4techie.dsc.streamsetAPI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class CurrentStatus implements Serializable
{
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
	    private Integer lastReportedTime;
	    @SerializedName("worker")
	    @Expose
	    private List<Object> worker = new ArrayList<Object>();
	    @SerializedName("message")
	    @Expose
	    private Object message;
	    @SerializedName("clusterMode")
	    @Expose
	    private Boolean clusterMode;
	    private final static long serialVersionUID = -2334046663536170272L;
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

	    public Integer getLastReportedTime() {
	        return lastReportedTime;
	    }

	    public void setLastReportedTime(Integer lastReportedTime) {
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

	    @Override
	    public String toString() {
	        return ToStringBuilder.reflectionToString(this);
	    }

	    @Override
	    public int hashCode() {
	        return new HashCodeBuilder().append(sdcId).append(name).append(title).append(jobId).append(localPipeline).append(status).append(lastReportedTime).append(worker).append(message).append(clusterMode).toHashCode();
	    }

	    @Override
	    public boolean equals(Object other) {
	        if (other == this) {
	            return true;
	        }
	        if ((other instanceof CurrentStatus) == false) {
	            return false;
	        }
	        CurrentStatus rhs = ((CurrentStatus) other);
	        return new EqualsBuilder().append(sdcId, rhs.sdcId).append(name, rhs.name).append(title, rhs.title).append(jobId, rhs.jobId).append(localPipeline, rhs.localPipeline).append(status, rhs.status).append(lastReportedTime, rhs.lastReportedTime).append(worker, rhs.worker).append(message, rhs.message).append(clusterMode, rhs.clusterMode).isEquals();
	    }

	}