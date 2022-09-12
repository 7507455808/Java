package com.tph.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value="No Discount")

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
