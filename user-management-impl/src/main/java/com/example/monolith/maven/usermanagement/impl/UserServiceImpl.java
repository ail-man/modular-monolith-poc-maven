package com.example.monolith.maven.usermanagement.impl;

import com.example.monolith.maven.usermanagement.api.User;
import com.example.monolith.maven.usermanagement.api.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(String userId) {
		// In a real app, fetch from DB or external source
		return new User(userId, "Alice");
	}

}