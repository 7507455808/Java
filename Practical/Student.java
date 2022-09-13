package com.tpc.entity;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value="Student")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 20, nullable = false)
	private String sname;
	
	@Column(length = 10, nullable = false)
	private String edu;
	
	@Column(length = 11, nullable = false, unique = true)
	private long phone;
	@Column(length = 10, nullable = false)
	private String caste;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	

}
