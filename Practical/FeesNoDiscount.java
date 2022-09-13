package com.tps.entity;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="sid")
//@AttributeOverrides({
	//@AttributeOverride(name="id",column = @Column(name="id")),
	//@AttributeOverride(name="sname",column = @Column(name="sname")),
	//@AttributeOverride(name="edu",column = @Column(name="edu")),
	//@AttributeOverride(name="phone",column = @Column(name="phone")),
	//@AttributeOverride(name="caste",column = @Column(name="caste")),
//})

//@DiscriminatorValue(value="No Discount")

public class FeesNoDiscount extends Student {

	private String course;
	private double fees;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
