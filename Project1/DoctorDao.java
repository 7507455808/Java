package com.sprint1project.dao;

public interface DoctorDao {
	
	//fetch doctor details from db table
	public void getDoctorBy();
	
	//saving new doctor details into db table
	public void addDoctorBy();
	
	//changing existing doctor detail from db table 
	public void updateDoctor();
	
	//remove existing doctor detail from db table
	public void deleteDoctor();
	

}
