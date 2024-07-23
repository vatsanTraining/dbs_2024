package com.example.demo.impl;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;
import com.mysql.cj.xdevapi.Result;

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
		
		String sql = "select * from  product_2024 ";
		
		List<Product> productList  = new ArrayList<>();
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
		
				
				productList.add(rowMapper(rs));

			}
					
		} catch (SQLException |RangeCheckException e) {
			
			e.printStackTrace();
		}

		
		return productList;
	}

	private Product rowMapper(ResultSet rs) throws RangeCheckException,SQLException{
		
		int productId = rs.getInt("product_id");
		String productName = rs.getString("product_name");
		double ratePerUnit =rs.getDouble("rate_per_unit");
		
		Product obj  = new Product(productId, productName, ratePerUnit);

		return obj;
	}
	
	
	@Override
	public Product findById(int key) {
		
		String sql ="select * from  product_2024 where product_id=? ";
		
		Product obj = null;

     try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
    	 pstmt.setInt(1, key);
    	 
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
		
				
				obj =rowMapper(rs);

			}
					
		} catch (SQLException |RangeCheckException e) {
			
			e.printStackTrace();
		}

		
		
		return obj;
	}

	@Override
	public boolean remove(int key) {

		String sql ="delete from  product_2024 where product_id=? ";
		
		int rowDeleted =0;

     try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
    	 pstmt.setInt(1, key);
    	 
			 rowDeleted = pstmt.executeUpdate();
			
								
		} catch (SQLException  e) {
			
			e.printStackTrace();
		}

		
		return rowDeleted==1?true:false;
	}

}
