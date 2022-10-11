package com.sprint1project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Table(name="patients_details")
@Entity

//patients entity

public class Patients {
	@Id
	private int pid;
	private String pname;
	private String diesease;
	private double fees;
	private String padrr;
	
	

}
