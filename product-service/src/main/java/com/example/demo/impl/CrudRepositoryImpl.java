package com.example.demo.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.model.Product;
import java.io.*;

// By Adding this annotation this class will be registered as a bean
@Repository  
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
				
				String[] values = line.split(",");
				
				Product obj = new Product(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2]));
				
				this.productList.add(obj);
				
			}
		} catch ( IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
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
