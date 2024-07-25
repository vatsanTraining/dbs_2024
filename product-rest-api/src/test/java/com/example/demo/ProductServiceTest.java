package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRepository;
import com.example.demo.services.ProductService;

@SpringBootTest
public class ProductServiceTest {
	
	
	@Mock
	ProductRepository repo;
	
	
	@InjectMocks
	ProductService service;
	
	Product tv;
	@BeforeEach

	void init() {
		
		tv = new Product(101,"sony tv",45000);
		
		Optional<Product> resp = Optional.of(tv);
		
		    when(repo.findById(101)).thenReturn(resp);


	}
	
	@Test
	void testFindByIdThrowsException() {
		

		  assertThrows(RuntimeException.class, () -> service.findById(1001));	
		  

	}

	@Test
	void testFindByIdDoesNotThrowsException() {
		

		
		  assertDoesNotThrow(()->service.findById(101));	
		  
		  

	}

	@Test
	void testFindByIdReturnValue() {
		
		
		  assertEquals(45000,  service.findById(101).getRatePerUnit());
	}
	
	

}
