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

	
	
	
}
