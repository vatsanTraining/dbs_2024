package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;
import java.io.*;
public class CrudRepositoryImpl implements CrudRepository {
	
	
	
	private List<Product> productList;
	PrintWriter writer;

	

	public CrudRepositoryImpl() throws IOException {
		super();
		this.productList = new ArrayList<>();
		
		 
	}

	@Override
	public boolean add(Product object) {

		 boolean response =false;

		
		 try {
			writer =new PrintWriter(new FileWriter(new File("Product.txt"),true));
			writer.println(object);
            response=true;

		 } catch (IOException e) {
			e.printStackTrace();
		}finally {
		
			 writer.close();
		
		}
		
		
		
		return response;
	}

	@Override
	public List<Product> findAll() {
		
	
		BufferedReader reader=null;
		try {
			 reader = new BufferedReader(new FileReader(new File("Product.txt")));
			
			String line =null;
			
			while((line=reader.readLine())!=null){
				
				System.out.println(line);
			}
		} catch ( IOException e) {
			e.printStackTrace();
		}finally {
		
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		return this.productList;
	}

}
