package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

	
	private ProductService  service;

	// Constructor DI
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(produces = "application/json")
	public List<Product> findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable("id") int key){
		
		return this.service.findById(key);
	}
}
