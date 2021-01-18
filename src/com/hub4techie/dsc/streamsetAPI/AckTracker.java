package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AckTracker {

	@SerializedName("sdcId")
	@Expose
	private String sdcId;
	@SerializedName("createTime")
	@Expose
	private BigInteger createTime;
	@SerializedName("ackStatus")
	@Expose
	private String ackStatus;
	@SerializedName("message")
	@Expose
	private Object message;
	@SerializedName("eventType")
	@Expose
	private String eventType;

	public String getSdcId() {
		return sdcId;
	}

	public void setSdcId(String sdcId) {
		this.sdcId = sdcId;
	}

	public BigInteger getCreateTime() {
		return createTime;
	}

	public void setCreateTime(BigInteger createTime) {
		this.createTime = createTime;
	}

	public String getAckStatus() {
		return ackStatus;
	}

	public void setAckStatus(String ackStatus) {
		this.ackStatus = ackStatus;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

}
