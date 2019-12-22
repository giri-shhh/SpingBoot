package com.example.girish.main.controller;

import java.util.List;

import com.example.girish.main.service.RecipeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.girish.main.entity.User;
import com.example.girish.main.repo.UserRepo;

@RestController
public class MainController {

	private final UserRepo userRepo;
	private RecipeService recipeService;

	public MainController(UserRepo userRepo, RecipeService recipeService) {
		this.userRepo = userRepo;
		this.recipeService = recipeService;
	}

	@GetMapping("/welcome")
	public String welcome(Model model) {
		return "Welcome to App";
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Integer id) {
		return userRepo.findById(id).orElse(null);
	}

	@PutMapping("/addUser")
	public void saveUser(@RequestBody User user) {
		userRepo.save(user);
	}

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
