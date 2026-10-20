package com.sawant.cart_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class CartServiceApplication {

	@GetMapping ("/Cart")
	public String CartApplication() {
		return "Welcome to Cart Application on sawant.com hosted on k8S!";
	}


	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}

}
