package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;

public class InMemoryImpl implements CrudRepository {

	
private List<Product> productList;
	
	

	public InMemoryImpl() {
		super();
		this.productList = new ArrayList<>();
	}

	@Override
	public boolean add(Product object) {

		
		
		return this.productList.add(object);
	}

	@Override
	public List<Product> findAll() {
		
		return this.productList;
	}

}
