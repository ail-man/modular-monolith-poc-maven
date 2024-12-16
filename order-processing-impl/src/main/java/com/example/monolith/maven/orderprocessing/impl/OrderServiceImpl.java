package com.example.monolith.maven.orderprocessing.impl;

import com.example.monolith.maven.orderprocessing.api.Order;
import com.example.monolith.maven.orderprocessing.api.OrderService;
import com.example.monolith.maven.productcatalog.api.ProductService;
import com.example.monolith.maven.usermanagement.api.UserService;

public class OrderServiceImpl implements OrderService {

	private final UserService userService;
	private final ProductService productService;

	public OrderServiceImpl(UserService userService, ProductService productService) {
		this.userService = userService;
		this.productService = productService;
	}

	@Override
	public void processOrder(Order order) {
		var user = userService.getUserById(order.userId());
		var products = productService.listAllProducts();
		var product = products.stream().filter(p -> p.id().equals(order.productId())).findFirst();
		if (product.isPresent()) {
			System.out.println("Processing order " + order.orderId() + " for user " + user.name() + " -> Product: " + product.get().name());
		} else {
			System.out.println("Product not found for order " + order.orderId());
		}
	}

}