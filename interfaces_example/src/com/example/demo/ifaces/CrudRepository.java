package com.example.demo.ifaces;

import com.example.demo.model.Product;

public interface CrudRepository {

	
	public boolean add(Product object);
	public Product[] findAll();
	
}
