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
	
	
	ProductService service 	= ctx.getBean(ProductService.class);
	
		      
		 
		 Product toAdd = ctx.getBean(Product.class);
		 
		 service.save(toAdd);
		 
		 toAdd.setRatePerUnit(999.99);
		 
		 service.update(toAdd);
		 
         System.out.println("Is Deleted:=>"+service.remove(103));

         
     	service.findAll()
	       .forEach(System.out::println);
	 
     	
     	service.findById(103);

		 
		 ctx.close();
	
	}

	
	@Bean
	Product tv() {
		
		Product tv = new Product();

		
			tv.setRatePerUnit(5700.00);
			tv.setProductId(2032);
			tv.setProductName("samsung watch");

		
		return tv;

	}

}
