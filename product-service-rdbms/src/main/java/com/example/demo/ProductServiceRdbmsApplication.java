package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.services.ProductService;

@SpringBootApplication
public class ProductServiceRdbmsApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceRdbmsApplication.class, args);
	
	
		 ctx.getBean(ProductService.class)
		      .findAll()
		       .forEach(System.out::println);
		 
		 
		 
		 ctx.close();
	
	}

}
