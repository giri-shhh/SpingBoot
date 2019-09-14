package com.example.girish.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.girish.main.service.UserService;
import com.example.girish.user.entity.User;

@RestController
public class MainController {

	@Autowired
	private UserService userSerice;
	
	@RequestMapping("/welcome")
	public User welcome() {
		return new User(12, "Dummy");
	}
	
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsersDetail() {
		return userSerice.getAllUserDetails();
	}
}
