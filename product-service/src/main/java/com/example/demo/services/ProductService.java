package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;

@Service
public class ProductService {

	
	private CrudRepository repo;
	
	
	

	// Constructor DI

	@Autowired
	public ProductService(@Qualifier("crudRepositoryImpl") CrudRepository repo) {
		
		super();
		
		this.repo=repo;
		
		System.out.println(repo.getClass().getName());

	}

	
	public boolean add(Product prod) {
		
		return this.repo.add(prod);
	}
	
	public List<Product> findAll() {
		
		return this.repo.findAll();
	}
}
