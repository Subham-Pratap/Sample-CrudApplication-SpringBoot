package com.crud.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.starter.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
