package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProvenanceMetaData {

	@SerializedName("dpm.source.url")
	@Expose
	private String dpmSourceUrl;
	@SerializedName("dpm.source.org")
	@Expose
	private String dpmSourceOrg;

	public String getDpmSourceUrl() {
		return dpmSourceUrl;
	}

	public void setDpmSourceUrl(String dpmSourceUrl) {
		this.dpmSourceUrl = dpmSourceUrl;
	}

	public String getDpmSourceOrg() {
		return dpmSourceOrg;
	}

	public void setDpmSourceOrg(String dpmSourceOrg) {
		this.dpmSourceOrg = dpmSourceOrg;
	}

}