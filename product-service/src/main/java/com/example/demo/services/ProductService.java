package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;

@Service
public class ProductService {

	
	private CrudRepository repo;
	
	
	

	// Constructor DI

	@Autowired
	public ProductService(CrudRepository repo) {
		
		super();
		
		this.repo=repo;
		

	}

	
	public boolean add(Product prod) {
		
		return this.repo.add(prod);
	}
	
	public List<Product> findAll() {
		
		return this.repo.findAll();
	}
}
