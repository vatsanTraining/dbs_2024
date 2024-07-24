package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin(origins = "*")  //to avoid CORS error
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
	
	@GetMapping("/srch/name/{name}")
	public Product findById(@PathVariable("name") String name){
		
		return this.service.findByProductName(name).orElseThrow(() -> new RuntimeException("Name Not Found"));
		
	}
	
	@GetMapping("/srch/rpu/{rpu}")
	public List<Product> findByRpuGrtThan(@PathVariable("rpu") double rpu){
		
		return this.service.findByRpuGrtThan(rpu);
						
	}
	
	@PostMapping
	public ResponseEntity<Product> save(@RequestBody Product entity){
		
		     Product addedEntity= this.service.save(entity);
		     
		     return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
	}
	
	@PutMapping
	public Product update(@RequestBody Product entity){
		
	     return this.service.update(entity);
	     
	     
}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int key){
		
		 boolean result =this.service.remove(key);
		 
		 String message =result?"Record Delted":"Record Not Found";
		 
		 return ResponseEntity.ok(message);
	}
	
	
}
