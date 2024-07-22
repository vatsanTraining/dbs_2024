package com.example.demo.impl;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;

public class CrudRepositoryImpl implements CrudRepository {
	
	
	
	private Product[] productList;
	
	private int idxPos= 1;
	

	public CrudRepositoryImpl() {
		super();
		this.productList = new Product[5];
	}

	@Override
	public boolean add(Product object) {

		
		this.productList[idxPos]= object;
		
		idxPos++;
		
		return idxPos<4?true:false;
	}

	@Override
	public Product[] findAll() {
		
		return this.productList;
	}

}
