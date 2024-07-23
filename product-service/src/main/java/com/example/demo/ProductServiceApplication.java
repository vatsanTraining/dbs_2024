package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		
		// first arg is a primary source and second is args from main method
		// primary source is a java class annotated with @SpringBootApplication
		ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceApplication.class, args);
	
		// ctx is representation of the IoC container
		ctx.close();
	
	}

}
