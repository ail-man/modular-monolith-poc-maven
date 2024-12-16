package com.example.monolith.maven.app;

import com.example.monolith.maven.orderprocessing.api.Order;
import com.example.monolith.maven.orderprocessing.api.OrderService;
import com.example.monolith.maven.orderprocessing.impl.OrderServiceImpl;
import com.example.monolith.maven.productcatalog.api.ProductService;
import com.example.monolith.maven.productcatalog.impl.ProductServiceImpl;
import com.example.monolith.maven.usermanagement.api.UserService;
import com.example.monolith.maven.usermanagement.impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		final UserService userService = new UserServiceImpl();
		final ProductService productService = new ProductServiceImpl();
		final OrderService orderService = new OrderServiceImpl(userService, productService);

		var order = new Order("o123", "u1", "p1");
		orderService.processOrder(order);
	}
}