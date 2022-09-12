package com.tph.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value="Discount")

public class FeesDiscount extends Student {
	
	private int discount;
	private double fees;
	private String course;
	public int getDiscount() {
		return discount;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	

}
