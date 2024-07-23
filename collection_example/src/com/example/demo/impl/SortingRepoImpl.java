package com.example.demo.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.demo.ifaces.SortingRepository;
import com.example.demo.model.Product;

public class SortingRepoImpl implements SortingRepository {

private List<Product> productList;
	
	

	public SortingRepoImpl() {
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

	@Override
	public List<Product> sort(String prop) {
		
		
		 Collections.sort(this.productList,comparatorFactory(prop));
		 
		 return this.productList;
		 
	}

	
	private Comparator<Product> comparatorFactory(String prop){
		
		Comparator<Product> comparator = null;
		
		switch (prop.toLowerCase()) {
		
		case "rateperunit":
			comparator = (e1, e2) -> Double.compare(e1.getRatePerUnit(), e2.getRatePerUnit());
			break;

		case "productname":
			comparator = (e1, e2) -> e1.getProductName().compareTo(e2.getProductName());
			break;

		default:
			comparator = (e1, e2) -> Integer.compare(e2.getProductId(), e1.getProductId());
		}
		
		
		return comparator;
	}
}
