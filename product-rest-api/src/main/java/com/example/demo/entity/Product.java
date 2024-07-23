package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_2024")
public class Product {

	
	@Id
	@Column(name = "product_id")
	private int productId;
	
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "rate_per_unit")
	private double ratePerUnit;

	public Product() {
		super();
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
		return "Product [productId=" + productId + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit
				+ "]";
	}
	
	

}
