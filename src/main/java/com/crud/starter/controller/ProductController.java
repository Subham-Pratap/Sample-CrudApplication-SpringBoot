package com.crud.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.starter.entity.Product;
import com.crud.starter.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProductList(@RequestBody List<Product> product) {
		
		return productService.saveProducts(product);
	}
	
	@GetMapping("/Products")
	public List<Product> receiveProductList() {
		
		return productService.getProducts();
	}
	
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductsById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductsByName(name);
    }
    
    
    @PutMapping("/update")
    public Product updateProductS(@PathVariable Product product) {
    	return productService.updateProduct(product);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProductS(@PathVariable int id) {
    	return productService.deleteProductById(id);
    }
    
    
    
    
    
    

}
