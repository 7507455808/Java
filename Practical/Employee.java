package com.HbOnetoOneBi.Entity;

import jakarta.persistence.*;

@Entity

public class Employee {
	@Id
	@PrimaryKeyJoinColumn
	
	private int eid;
	@Column(length=30, nullable = false)
	
	private String ename;
	@Column(length = 10, nullable = false)
	
	private String dept;
	@Column(length = 30, nullable = false)
	
	private String profile;
	@Column(length = 11, nullable = false, unique = true)
	
	private long ephone;
	
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	} //has a relationship
	
	
	
	
	

}
