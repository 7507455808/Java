package com.sprint1.entity;

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

@Table(name="cust_details")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

//customer entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cfname;
	private String clname;
	private String cemail;
	private long cphone;
	private String caddr;
	
	//@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	//@JoinColumn(name="cid")
	//private List<Orders> orders;
	

}
