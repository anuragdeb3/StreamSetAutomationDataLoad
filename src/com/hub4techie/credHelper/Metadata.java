package com.hub4techie.credHelper;

public class Metadata {
	 private String created_time;
	 private String deletion_time;
	 private boolean destroyed;
	 private float version;


	 // Getter Methods 

	 public String getCreated_time() {
	  return created_time;
	 }

	 public String getDeletion_time() {
	  return deletion_time;
	 }

	 public boolean getDestroyed() {
	  return destroyed;
	 }

	 public float getVersion() {
	  return version;
	 }

	 // Setter Methods 

	 public void setCreated_time(String created_time) {
	  this.created_time = created_time;
	 }

	 public void setDeletion_time(String deletion_time) {
	  this.deletion_time = deletion_time;
	 }

	 public void setDestroyed(boolean destroyed) {
	  this.destroyed = destroyed;
	 }

	 public void setVersion(float version) {
	  this.version = version;
	 }
	}
