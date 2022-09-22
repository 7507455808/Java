package com.sprint1.dao;

public interface CustomerDao {
	
	//fetch customer detail from db table
	public void getCustomerBy();
	
	//saving new customer detail into db table
	public void addCustomer();
	
	//changing existing customer detail from db table
	public void updateCustomer();
	
	//remove existing customer detail from db table
	public void deleteCustomer();
	

}
