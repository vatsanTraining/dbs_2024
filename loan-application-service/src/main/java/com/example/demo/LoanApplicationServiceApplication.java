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
			LoanApplicationRepo repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new LoanApplication(1024,"Anand", "AA105", 500000, "PENDING"));
				repo.save(new LoanApplication(1025,"Vikas", "AA106", 500000, "PENDING"));
				
				


			}
		};
	}
}
