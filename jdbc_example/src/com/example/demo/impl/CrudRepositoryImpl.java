package com.example.demo.impl;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;
import java.io.*;
public class CrudRepositoryImpl implements CrudRepository {
	
	
	
	Connection con;
	
	

	public CrudRepositoryImpl(Connection con) throws IOException {
		super();
		
		this.con = con;
		 
	}

	@Override
	public boolean add(Product object) {

			String sql = "insert into product_2024 values(?,?,?)";
			
			int rowAdded = 0;
			try(PreparedStatement pstmt = con.prepareStatement(sql)) {
				
				pstmt.setInt(1, object.getProductId());
				pstmt.setString(2, object.getProductName());
				pstmt.setDouble(3, object.getRatePerUnit());
				
				rowAdded = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
			return rowAdded==1?true:false;
		}

	@Override
	public List<Product> findAll() {
		
		
		
		return null;
	}

	@Override
	public Product findById(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int key) {
		// TODO Auto-generated method stub
		return false;
	}

}
