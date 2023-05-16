package com.wdm.google.request;

public class ResponseUser {

	
	private long userId;
	
	private String userName;
	
	private String emailId;
	
	private String userRole;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public ResponseUser(long userId, String userName, String emailId, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.userRole = userRole;
	}
	
	
	
	
}
