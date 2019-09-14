package com.example.girish.main.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.girish.main.dao.UserDao;
import com.example.girish.user.entity.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public List<User> getAllUserDetails() {
		return new ArrayList<User>();
	}
 
}
