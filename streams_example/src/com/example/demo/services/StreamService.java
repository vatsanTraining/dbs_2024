package com.example.demo.services;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;

public class StreamService {
	
	
  private CrudRepository repo;
	
	
	
   List<Product> list = null;

	public StreamService(CrudRepository repo) {
		
		super();
		
		this.repo=repo;
		
		this.list = repo.findAll();

	}


	public List<Product> filterByRpuLessThan(double price){
		
		
		return this.list.stream()
		      .filter(e -> e.getRatePerUnit()<price)
		       .collect(Collectors.toList());
		
		
	}
	
	public Set<String> getProductNames(){
		
		
		return this.list.stream().map(e -> e.getProductName()).collect(Collectors.toSet());
	}
	
	
	public Map<String,Double> getProductNameWithRpu(double price){
		
		
		return this.list.stream()
			      .filter(e -> e.getRatePerUnit()>price)
                  .collect(Collectors.toMap(Product::getProductName, Product::getRatePerUnit));
	}
	
	
	public double getAverageRpu() {
		
		return this.list.stream().mapToDouble(e -> e.getRatePerUnit()).average().getAsDouble();
		
	}
	
}
