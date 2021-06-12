package com.practice.pojo.restassured;

public class POJOCLass {

	public String name;
	public String job;
	public String[] skills;
	public Details details;
	
	
	public POJOCLass(String name, String job, String[] skills, Details details) {
		
		this.name = name;
		this.job = job;
		this.skills = skills;
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	
	
}
