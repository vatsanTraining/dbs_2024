package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.LoanApplication;
import com.example.demo.ifaces.LoanApplicationRepo;
import com.example.demo.services.LoanApplicationService;

@SpringBootApplication
public class LoanApplicationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplicationServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate template() {
		
		return new RestTemplate();
	}
	
	@Bean
	CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			LoanApplicationService service;
			
			@Override
			public void run(String... args) throws Exception {
				
				service.save(new LoanApplication(1024,"Anand", "AA104", 500000, "PENDING"));
				service.save(new LoanApplication(1025,"Vikas", "AA103", 500000, "PENDING"));
				
				


			}
		};
	}
}
