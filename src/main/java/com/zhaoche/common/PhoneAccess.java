package com.zhaoche.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Table;

@Entity
@Table(name = "phone_access")
public class PhoneAccess implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String phoneId;
	private Date accessTime;
	private String action;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)	
	@Column(name = "PHONE_ACCESS_ID", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "PHONE_ID", unique = false, nullable = false, length = 45)	
	public String getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	@Column(name = "ACCESS_TIME", nullable = false)	
	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	@Column(name = "ACTION", unique = false, nullable = false, length = 45)	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
