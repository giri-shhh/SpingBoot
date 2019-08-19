package com.example.girish.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.girish.user.entity.User;

@RestController
public class MainController {

	@RequestMapping("/welcome")
	public User welcome() {
		return new User(12, "Dummy");
	}
}
