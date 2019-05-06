package com.capgemini.producttest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.producttest.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
