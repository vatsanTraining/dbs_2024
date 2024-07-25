package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductRestApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestApiClientApplication.class, args);
	}

	
	@Bean
	@LoadBalanced
	RestTemplate template() {
		
		return new RestTemplate();
	}
	
	
	
	
}
