package com.example.demo.model;

import com.example.demo.exceptions.RangeCheckException;

//1
public class Product {

	
	//2
	private int productId;
	private String productName;
	private double ratePerUnit;
	
	//3
	public Product() {
		super();
	}

	public Product(int productId, String productName, double ratePerUnit) throws Exception {
		super();
		this.productId = productId;
		this.productName = productName;
		
		if(ratePerUnit>0) {
			
		this.ratePerUnit = ratePerUnit;
		
		} else {
			throw new RangeCheckException("Invalid Rate Per Unit - Should be Positive Number");
		}
	}

	//4
	public int getProductId() {
		return productId;
	}

	public void setProductId( int productId)  { //5
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit)  throws Exception{
		
		
		
		if(ratePerUnit>0) {
			
		this.ratePerUnit = ratePerUnit;
		
		} else {
			throw new RangeCheckException("Invalid Rate Per Unit - Should be Positive Number");
		}
	}

	@Override
	public String toString() {
		return this.productName + this.ratePerUnit;
	}
	
	
	
	
	
}
