package com.example.girish.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.girish.main.dao.UserDao;
import com.example.girish.user.entity.User;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public List<User> getAllUserDetails() {
		return userDao.getAllUserDetails();
	}

}
