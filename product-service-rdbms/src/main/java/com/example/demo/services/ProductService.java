package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRepository;

@Service
public class ProductService {

	
	private ProductRepository repo;

	// ProductRepository Implementation will be Injected Here
	// @Autowired is not required since there is only one constructor
	// Adding a @autowired may show a warning
	
	
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Product> findAll(){
		
		return this.repo.findAll();
	}
	
	
}
