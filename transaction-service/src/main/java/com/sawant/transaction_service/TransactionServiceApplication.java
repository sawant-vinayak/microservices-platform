package com.sawant.transaction_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TransactionServiceApplication {


	@GetMapping ("/Transaction")
	public String TransactionApplication() {
		return "Welcome to Transaction Application on sawant.com hosted on k8S!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
	}

}
