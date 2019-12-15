package com.example.girish.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.girish.main.entity.User;
import com.example.girish.main.repo.UserRepo;

@RestController
public class MainController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/")
	public String welcome() {
		return "Welcome To Demo App";
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Integer id) {
		return userRepo.findById(id).orElse(null);
	}

	@PutMapping("/adduser")
	public void saveUser(@RequestBody User user) {
		userRepo.save(user);
	}

	@GetMapping("/getallusers")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
