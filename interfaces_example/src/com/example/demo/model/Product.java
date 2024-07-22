package com.example.demo.model;

public class Product {

	
	private int productId;
	private String productName;
	private double ratePerUnit;
	
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
			throw new Exception("Invalid Rate Per Unit - Should be Positive Number");
		}
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	@Override
	public String toString() {
		return this.productName + this.ratePerUnit;
	}
	
	
	
	
	
}
