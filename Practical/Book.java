package com.spring.entity;

public class Book {
	
	private int bid;
	private String bname;
	private double bprice;
	private String bauthor;
	
	
	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public double getBprice() {
		return bprice;
	}


	public void setBprice(double bprice) {
		this.bprice = bprice;
	}


	public String getBauthor() {
		return bauthor;
	}


	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}


	public void display() {
		System.out.print(bid + " " + bname + " " + bprice + " " + bauthor);
	}

}
