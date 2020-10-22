package com.service;

import com.dto.User;

public interface UserService {
	int RegUser(User user);
	boolean loginUser(User user);
}
