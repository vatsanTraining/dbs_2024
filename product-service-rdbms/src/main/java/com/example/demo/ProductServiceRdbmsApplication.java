package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.demo","org.example"})
public class ProductServiceRdbmsApplication {

	public static void main(String[] args) {
		
		 ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceRdbmsApplication.class, args);
	
	
		 ctx.getBean(ProductService.class)
		      .findAll()
		       .forEach(System.out::println);
		 
		 
		 Product toAdd = ctx.getBean(Product.class);
		 
		 ctx.getBean(ProductService.class).save(toAdd);
		 
		 
		 
		 
		 ctx.close();
	
	}

	
	@Bean
	Product tv() {
		
		Product tv = new Product();

		
			tv.setRatePerUnit(5600.00);
			tv.setProductId(2030);
			tv.setProductName("samsung tv");

		
		return tv;

	}

}
