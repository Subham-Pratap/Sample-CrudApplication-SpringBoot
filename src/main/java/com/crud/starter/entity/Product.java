package com.crud.starter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product_TBL")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String quanity;
	private double prices;
	
	

}
