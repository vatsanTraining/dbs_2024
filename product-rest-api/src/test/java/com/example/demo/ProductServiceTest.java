package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controllers.ProductController;
import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRepository;
import com.example.demo.services.ProductService;

@SpringBootTest
public class ProductServiceTest {

	 
	  @Autowired
	  ProductController controller;
	 
	  @InjectMocks
	  ProductService service;

	  @Mock
	  ProductRepository dao;

	 	  @Test
	  public void testCreateReadDelete() {
	 		    List<Product> list = new ArrayList<Product>();
	 		    
	 			Product tv = new Product(101,"sony tv",45000);
				Product mobile = new Product(102,"one plus",55000);
			
	 	
				list.add(tv);
				list.add(mobile);
				
	 		    when(dao.findAll()).thenReturn(list);

	 		    service.findAll();
	 		    
	 		    assertEquals(2, list.size());
	 		    verify(dao, times(1)).findAll();
 }

}
