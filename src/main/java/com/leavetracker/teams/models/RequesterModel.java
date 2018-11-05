package com.leavetracker.teams.models;

public class RequesterModel {
	
	private int Requester_Id;
	private String first_name,last_name,email,password,is_approver;
	public int getRequester_Id() {
		return Requester_Id;
	}
	public void setRequester_Id(int requester_Id) {
		Requester_Id = requester_Id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email_id) {
		this.email = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIs_approver() {
		return is_approver;
	}
	public void setIs_approver(String is_approver) {
		this.is_approver = is_approver;
	}
	
	
	
	
	public RequesterModel() {
		super();
	}


}
