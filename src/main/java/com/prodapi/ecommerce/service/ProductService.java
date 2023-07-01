package com.prodapi.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapi.ecommerce.dao.ProductDao;
import com.prodapi.ecommerce.entity.Product;

@Service
public class ProductService {
	
    @Autowired
    private ProductDao productDao;

	public Product addNewProduct(Product product) {
		return productDao.save(product);
	}

}
