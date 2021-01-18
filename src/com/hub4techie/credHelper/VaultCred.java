package com.hub4techie.credHelper;

public class VaultCred {
	 private String request_id;
	 private String lease_id;
	 private boolean renewable;
	 private float lease_duration;
	 Data DataObject;
	 private String wrap_info = null;
	 private String warnings = null;
	 private String auth = null;


	 // Getter Methods 

	 public String getRequest_id() {
	  return request_id;
	 }

	 public String getLease_id() {
	  return lease_id;
	 }

	 public boolean getRenewable() {
	  return renewable;
	 }

	 public float getLease_duration() {
	  return lease_duration;
	 }

	 public Data getData() {
	  return DataObject;
	 }

	 public String getWrap_info() {
	  return wrap_info;
	 }

	 public String getWarnings() {
	  return warnings;
	 }

	 public String getAuth() {
	  return auth;
	 }

	 // Setter Methods 

	 public void setRequest_id(String request_id) {
	  this.request_id = request_id;
	 }

	 public void setLease_id(String lease_id) {
	  this.lease_id = lease_id;
	 }

	 public void setRenewable(boolean renewable) {
	  this.renewable = renewable;
	 }

	 public void setLease_duration(float lease_duration) {
	  this.lease_duration = lease_duration;
	 }

	 public void setData(Data dataObject) {
	  this.DataObject = dataObject;
	 }

	 public void setWrap_info(String wrap_info) {
	  this.wrap_info = wrap_info;
	 }

	 public void setWarnings(String warnings) {
	  this.warnings = warnings;
	 }

	 public void setAuth(String auth) {
	  this.auth = auth;
	 }
	}
