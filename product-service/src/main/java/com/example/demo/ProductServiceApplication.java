package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		
		// first arg is a primary source and second is args from main method
		// primary source is a java class annotated with @SpringBootApplication

		// ctx is representation of the IoC container

		
		ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceApplication.class, args);
	
		 Product productToAdd = ctx.getBean(Product.class);
		 
		 ProductService service = ctx.getBean(ProductService.class);
		 
		System.out.println("Is Added :=>"+service.add(productToAdd)); ;
		 
		ctx.close();
	
	}
	
	
	@Bean
	Product tv() {
		
		Product tv = new Product();

		
		try {
			tv.setRatePerUnit(5600.00);
			tv.setProductId(2030);
			tv.setProductName("samsung tv");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tv;

	}

}
