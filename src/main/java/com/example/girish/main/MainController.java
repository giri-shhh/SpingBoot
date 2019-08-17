package com.example.girish.main;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/welcome")
	public List<Integer> welcome() {
		return List.of(1, 2, 3);
	}
}
