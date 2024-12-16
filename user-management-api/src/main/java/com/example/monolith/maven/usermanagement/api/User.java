package com.example.monolith.maven.usermanagement.api;

import lombok.Builder;

@Builder(toBuilder = true)
public record User(String id, String name) {
}
