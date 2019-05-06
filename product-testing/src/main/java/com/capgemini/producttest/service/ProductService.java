package com.capgemini.producttest.service;

import java.util.Optional;

import com.capgemini.producttest.entity.Product;

public interface ProductService {
	public Product addProduct(Product product);
	public Optional<Product> findProductById(int id);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int id);
}
