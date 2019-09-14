package com.example.girish.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.girish.main.dao.UserDao;
import com.example.girish.main.dao.impl.UserDaoImpl;
import com.example.girish.main.service.UserService;
import com.example.girish.main.service.UserServiceImpl;

@Configuration
public class SpringBootConfiguration {


	@Bean 
	public UserService getUserService() {
		return new UserServiceImpl();
	}

	@Bean
	public UserDao getUserDao( ) {
		return new UserDaoImpl();
	}

}
