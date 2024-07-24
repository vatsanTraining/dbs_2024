package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;

import jakarta.websocket.server.PathParam;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//DSL findByPropName => if prop bookName it will findByBookName
	
	
	public Product findByProductName(String name);
	
	//JPQL Java Persistence Query Language
	// Uses concise query with className and property name instead of 
	// tableName and column Name
	
	
	@Query(value="from Product where ratePerUnit>:srchValue",nativeQuery = false)
	public List<Product> getByRpuGrtThan(@Param("srchValue") double rpu);
	
}
