package com.nagarro.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eCode;
	private String eName;
	private String location;
	private String email;
	private String dob;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eCode, String eName, String location, String email, String dob) {
		super();
		this.eCode = eCode;
		this.eName = eName;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}
	public int geteCode() {
		return eCode;
	}
	public void seteCode(int eCode) {
		this.eCode = eCode;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
