package com.hub4techie.credHelper.Response;

public class LogInResponse {
	 private String request_id;
	 private String lease_id;
	 private boolean renewable;
	 private float lease_duration;
	 private String data = null;
	 private String wrap_info = null;
	 private String warnings = null;
	 Auth AuthObject;


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

	 public String getData() {
	  return data;
	 }

	 public String getWrap_info() {
	  return wrap_info;
	 }

	 public String getWarnings() {
	  return warnings;
	 }

	 public Auth getAuth() {
	  return AuthObject;
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

	 public void setData(String data) {
	  this.data = data;
	 }

	 public void setWrap_info(String wrap_info) {
	  this.wrap_info = wrap_info;
	 }

	 public void setWarnings(String warnings) {
	  this.warnings = warnings;
	 }

	 public void setAuth(Auth authObject) {
	  this.AuthObject = authObject;
	 }
	}
