package com.capgemini.producttest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.producttest.entity.Product;
import com.capgemini.producttest.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/new")
	public Product addNewProduct(@RequestBody Product product) {
		service.addProduct(product);
		return product;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getProductById(@PathVariable int id){
		Optional<Product> existingProduct = service.findProductById(id);
		if(existingProduct.isPresent()) {
			return ResponseEntity.ok(existingProduct);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable int id){
		//Optional<Product> existingProduct = service.findProductById(id);
		if(service.updateProduct(product))
		{
			product.setQuantity(product.getQuantity());
			return ResponseEntity.ok(product);
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable int id){
		if(service.deleteProduct(id)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}
