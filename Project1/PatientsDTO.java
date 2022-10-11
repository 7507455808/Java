package com.spirnt1project.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class PatientsDTO {
	@Id
	private int pid;
	
	@NotNull(message = "Please enter product name")
	private String pname;
	
	private String diesease;
	
	@NotNull(message = "Please enter fees")
	private double fees;
	
	private String paddr;
	
	
	

}
