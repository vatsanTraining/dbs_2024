package com.example.demo.services;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;

public class ProductService {

	
	private CrudRepository repo;
	
	public ProductService() {
		
		super();
		
		this.repo=new CrudRepositoryImpl();
		
		
		
	}

	
	public boolean add(Product prod) {
		
		return this.repo.add(prod);
	}
	
	public Product[] findAll() {
		
		return this.repo.findAll();
	}
}
