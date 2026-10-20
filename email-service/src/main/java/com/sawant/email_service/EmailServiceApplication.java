package com.sawant.email_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class EmailServiceApplication {

	@GetMapping ("/Email")
	public String EmailApplication() {
		return "Welcome to Email Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
