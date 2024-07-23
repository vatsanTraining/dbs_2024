package com.example.demo.services;

import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.SortingRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;

public class ProductService {

	
	private SortingRepository repo;
	
	
	


	public ProductService(SortingRepository repo) {
		
		super();
		
		this.repo=repo;
		

	}

	
	public boolean add(Product prod) {
		
		return this.repo.add(prod);
	}
	
	public List<Product> findAll() {
		
		return this.repo.findAll();
	}


	public List<Product> sort(String string) {
		return this.repo.sort(string);
	}
}
