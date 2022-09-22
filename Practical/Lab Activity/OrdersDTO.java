package com.sprint1.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class OrdersDTO {
	@Id
	private int oid;
	
	@NotNull(message = "Please enter product name")
	private String pname;
	
	private int quantity;
	
	@NotNull(message = "Please enter price")
	private double price;
	
	private String orderdate;

}
