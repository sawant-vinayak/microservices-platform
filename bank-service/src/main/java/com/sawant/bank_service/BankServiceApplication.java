package com.sawant.bank_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class BankServiceApplication {

	@GetMapping ("/bank")
	public String BankApplication() {
		return "Welcome to Bank Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(BankServiceApplication.class, args);
	}

}
