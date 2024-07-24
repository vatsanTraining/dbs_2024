package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.controllers.ProductController;
import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@SpringBootTest

class ProductRestApiApplicationTests {

	  @InjectMocks
	  ProductController controller;
	 
	    @Mock
	    private ProductService service;

	  @Test
	  public void testCreateReadDelete() {
	    
        when(service.findAll()).thenReturn(List.of(new Product(104,"tv",4500)));
        
	    List<Product> result = controller.findAll();
	                      
	    assertThat(result).first().hasFieldOrPropertyWithValue("productId", 101);
	 
	    //assertThrows(RuntimeException.class, () -> controller.findById(1001));	    

	  }


}
