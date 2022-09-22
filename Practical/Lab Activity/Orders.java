package com.sprint1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Table(name="order_details")
@Entity

//order entity

public class Orders {
	@Id
	private int oid;
	private String pname;
	private int quantity;
	private double price;
	private String orderdate;
}
