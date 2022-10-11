package com.sprint1project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="doct_details")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

//doctor entity

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String dfname;
	private String dlname;
	private String demail;
	private long dphone;
	private String daddr;
	
	@OneToMany(  cascade = CascadeType.ALL)
	@JoinColumn(name="did")
	private List<Patients> patients;

	
	}
	
	
	

