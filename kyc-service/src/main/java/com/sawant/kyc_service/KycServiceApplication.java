package com.sawant.kyc_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KycServiceApplication {

	@GetMapping ("/KycService")
	public String KycServiceApplication() {
		return "Welcome to Kyc-Service Application on sawant.com hosted on k8S!";
	}



	public static void main(String[] args) {
		SpringApplication.run(KycServiceApplication.class, args);
	}

}
