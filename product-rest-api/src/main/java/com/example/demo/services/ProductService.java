package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRepository;
import java.lang.reflect.*;
@Service
public class ProductService {

	
	private ProductRepository repo;

	// ProductRepository Implementation will be Injected Here
	// @Autowired is not required since there is only one constructor
	// Adding a @autowired may show a warning
	
	
	public ProductService(ProductRepository repo) {
		super();
		
		System.out.println(repo.getClass().getName());
		
		Method[] methods =repo.getClass().getMethods();
		
		for(Method eachMethod : methods) {
	      
			System.out.println(eachMethod.getName());
		}
		this.repo = repo;
	}
	
	public List<Product> findAll(){
		
		return this.repo.findAll();
	}
	
	
	public Product  save(Product obj) {
		
		return this.repo.save(obj);
	}
	
	
	public Product findById(int key) {
	
		return this.repo.findById(key).orElseThrow(
				 () -> new RuntimeException("Product with Given Id Not Found"));
	}
	
	
	public Optional<Product> findByProductName(String  name) {
		
		Optional<Product> response = Optional.empty();
		
		Product obj = this.repo.findByProductName(name);
		
		response = Optional.of(obj);
		
		
		return response;
		
				
	}
	
	
	public List<Product> findByRpuGrtThan(double  value) {
		
		return this.repo.getByRpuGrtThan(value);
	}
	
	

	public Product update(Product obj) {
		
		return this.repo.save(obj);
	}
	
	public boolean remove(int key) {
		
		boolean isDeleted =false;
		if(this.repo.existsById(key)) {
			
			this.repo.deleteById(key);
			
			isDeleted = true;
		}
		
		
		return isDeleted;
		
	}
	
	
	
	
}
