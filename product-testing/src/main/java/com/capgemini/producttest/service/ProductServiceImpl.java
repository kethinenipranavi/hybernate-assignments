package com.capgemini.producttest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.producttest.dao.ProductDao;
import com.capgemini.producttest.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;
	
	@Override
	public Product addProduct(Product product) {
		Product p = dao.save(product);
		return p;
	}

	@Override
	public boolean updateProduct(Product product) {
		Optional<Product> existingProduct = dao.findById(product.getId());
		if(existingProduct.isPresent())
		{
			dao.save(product);
			return true;
		}
		return false;
	}

	@Override
	public Optional<Product> findProductById(int id) {
		Optional<Product> existingProduct = dao.findById(id);
		return existingProduct;
	}

	@Override
	public boolean deleteProduct(int id) {
		Optional<Product> existingProduct = dao.findById(id);
		if(existingProduct.isPresent()) {
			dao.deleteById(id);
			return true;
		}
		return false;
	}

}
