package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CibilScore;
import com.example.demo.ifaces.CibilScoreRepo;

@SpringBootApplication
public class CibilScoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibilScoreServiceApplication.class, args);
	}

	
	
	@Bean
	CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			CibilScoreRepo repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new CibilScore(105, "Anand", "AA105",700 ));
				repo.save(new CibilScore(105, "Vikas", "AA106",300 ));
			}
		};
	}
}
