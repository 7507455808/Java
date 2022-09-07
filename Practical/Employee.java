package com.jpaeg;

import jakarta.persistence.*;

@Table(name="empdetails")
@Entity

public class Employee {
	
	@Id
	private int id;
	
	@Column(name="fname", length = 30, nullable = false)	
	private String fname;
	
	@Column(name= "lname", length = 30, nullable = false)
	private String lname;
	
	@Column(name="email", length = 30, unique = true)	
	private String email;
	
	@Column(name="phone", length = 11, nullable = false, unique = true)
	private long phone;
	
	@Column(name="designation", length = 10)
	private String designation;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
