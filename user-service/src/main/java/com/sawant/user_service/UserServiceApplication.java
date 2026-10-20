package com.sawant.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class UserServiceApplication {

	@GetMapping ("/User")
	public String userServiceApplication() {
		return "Welcome to user-service Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
