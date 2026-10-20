package com.sawant.wallet_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class WalletServiceApplication {

	@GetMapping ("/Wallet")
	public String WalletApplication() {
		return "Welcome to Wallet Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}

}
