package com.crud.starter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.starter.entity.Product;
import com.crud.starter.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	//POST METHOD 
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	//POST METHOD IN LIST
	
	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}
	
	//GET METHOD 
	
	public List<Product>getProducts(){
		return productRepository.findAll();
	}
	
	//GET METHOD BY ID
	public Product getProductsById(int id){
		return productRepository.findById(id).orElse(null);
	}
	
	//GET METHOD BY NAME
	public Product getProductsByName(String name){
		return productRepository.findByName(name);
	}
	
	//DELETE METHOD
	
	public String deleteProductById(int id) {
		productRepository.deleteById(id);
		return "Product Removed!! "+ id;
	}
	
	//UPDATE METHOD
	
	public Product updateProduct(Product product) {
		
		Product currProduct = productRepository.findById(product.getId()).orElse(null);
		currProduct.setName(product.getName());
		currProduct.setPrices(product.getPrices());
		currProduct.setQuanity(product.getQuanity());
		return productRepository.save(currProduct); 
		
		
	}
	
	
	
	
	
	
}
