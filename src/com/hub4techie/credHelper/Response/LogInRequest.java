package com.hub4techie.credHelper.Response;

public class LogInRequest {
	 private String role_id;
	 private String secret_id;


	 // Getter Methods 

	 public String getRole_id() {
	  return role_id;
	 }

	 public String getSecret_id() {
	  return secret_id;
	 }

	 // Setter Methods 

	 public void setRole_id(String role_id) {
	  this.role_id = role_id;
	 }

	 public void setSecret_id(String secret_id) {
	  this.secret_id = secret_id;
	 }
	}
