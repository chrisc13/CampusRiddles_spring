package com.campusriddles.entities;

import javax.persistence.Entity;

@Entity
public class Explorer extends AbstractEntity{
	private String username;
	private String password;
	private String school;
	private String campus;
	private String pictureURL;
	private boolean riddler;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getPictureURL() {
		return pictureURL;
	}
	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}
	public boolean isRiddler() {
		return riddler;
	}
	public void setRiddler(boolean riddler) {
		this.riddler = riddler;
	}
}
