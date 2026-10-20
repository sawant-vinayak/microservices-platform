package com.sawant.profile_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class ProfileServiceApplication {

	@GetMapping ("/Profile")
	public String ProfileApplication() {
		return "Welcome to Profile Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}

}
