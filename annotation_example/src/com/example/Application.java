package com.example;

import com.example.model.Book;
import com.example.stereostypes.Table;

public class Application {
	
	
	
	public static void main(String[] args) {
		
		
		
		Book book = new Book();
		
		Class cls =book.getClass();
		
		Table tbl =(Table) cls.getAnnotation(Table.class);
		
		String sql = "select * from "+tbl.name();
		
		
		System.out.println(sql);
		
	}

}
