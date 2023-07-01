package com.prodapi.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.prodapi.ecommerce.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}
