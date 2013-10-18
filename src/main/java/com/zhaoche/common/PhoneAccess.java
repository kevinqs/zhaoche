package com.zhaoche.common;

import java.util.Date;

public class PhoneAccess implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String phoneId;
	private Date accessTime;
	private String action;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
