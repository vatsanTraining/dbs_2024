package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		
		// first arg is a primary source and second is args from main method
		// primary source is a java class annotated with @SpringBootApplication

		// ctx is representation of the IoC container

		
		ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceApplication.class, args);
		
		// If there exist only one Bean of the type Product use the One argument getBean method

		// Product productToAdd = ctx.getBean(Product.class);

		
		// If there exist more than  one Bean of the type Product use the Two argument getBean method
		// with the first argument being id of the bean

		 Product productToAdd = ctx.getBean("mobile",Product.class);
		 
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

	@Bean
	Product mobile() {
		
		Product tv = new Product();

		
		try {
			tv.setRatePerUnit(6600.00);
			tv.setProductId(3030);
			tv.setProductName("samsung phone");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tv;

	}

}
