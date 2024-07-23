package com.example.demo;

import java.io.IOException;
import java.sql.*;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;
import com.example.demo.services.ProductService;
import com.example.demo.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) {

		
		
		
		try(Connection con = ConnectionUtils.getMySqlConnection();
				) {
			
			
			CrudRepositoryImpl repo = new CrudRepositoryImpl(con);
			
			ProductService service = new ProductService(repo);
			
			//boolean result =service.add(new Product(405, "smartwatch", 46000));
			
			//System.out.println("is Row Added:=>"+ result);
			
			
			service.findAll().forEach(System.out::println);

			System.out.println("Found:=>"+service.findById(404));
			
			
		} catch (Exception  e) {
			e.printStackTrace();
		}
		
		

	
	}

}
