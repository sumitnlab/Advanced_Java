package com.service;


import com.dao.UserDao;
import com.dao.UserDaoImple;
import com.dto.User;

public class UserServiceImple implements UserService {
	private UserDao userdao;
	public UserServiceImple() {
		userdao = new UserDaoImple();
	}

	@Override
	public int RegUser(User user) {
		return userdao.insertUser(user);
	}

	@Override
	public boolean loginUser(User user) {
		return userdao.login(user);
	}
}