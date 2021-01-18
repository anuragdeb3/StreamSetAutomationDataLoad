package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PipelineOffset {

	@SerializedName("sdcId")
	@Expose
	private String sdcId;
	@SerializedName("pipelineId")
	@Expose
	private String pipelineId;
	@SerializedName("offset")
	@Expose
	private String offset;
	@SerializedName("resetOffset")
	@Expose
	private Boolean resetOffset;

	public String getSdcId() {
		return sdcId;
	}

	public void setSdcId(String sdcId) {
		this.sdcId = sdcId;
	}

	public String getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public Boolean getResetOffset() {
		return resetOffset;
	}

	public void setResetOffset(Boolean resetOffset) {
		this.resetOffset = resetOffset;
	}

}