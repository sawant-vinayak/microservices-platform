package com.sawant.loan_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoanServiceApplication {

	@GetMapping ("/Loan")
	public String LoanApplication() {
		return "Welcome to Loan Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

}
