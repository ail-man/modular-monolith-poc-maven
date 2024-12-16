package com.example.monolith.maven.productcatalog.impl;

import java.util.List;

import com.example.monolith.maven.productcatalog.api.Product;
import com.example.monolith.maven.productcatalog.api.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> listAllProducts() {
		return List.of(
			new Product("p1", "Laptop", 1200.0),
			new Product("p2", "Smartphone", 799.0)
		);
	}

}