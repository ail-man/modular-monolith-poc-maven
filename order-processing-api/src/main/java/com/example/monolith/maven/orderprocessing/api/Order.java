package com.example.monolith.maven.orderprocessing.api;

public record Order(String orderId, String userId, String productId) {
}
