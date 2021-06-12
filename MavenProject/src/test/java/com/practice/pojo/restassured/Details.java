package com.practice.pojo.restassured;

public class Details {
	public String companyName;
	public String emailId;
	
	
	public Details(String companyName, String emailId) {
	
		this.companyName = companyName;
		this.emailId = emailId;
	}
	public String getCompanyName() {
		return companyName;
		
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
