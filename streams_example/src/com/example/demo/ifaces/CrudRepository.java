package com.example.demo.ifaces;
import java.util.*;

import com.example.demo.model.Product;

public interface CrudRepository {

	
	public boolean add(Product object);
	public List<Product> findAll();
	public Product findById(int key);
	public boolean remove(int key);
	
}
