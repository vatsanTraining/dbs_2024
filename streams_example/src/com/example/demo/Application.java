package com.example.demo;

import java.sql.Connection;

import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.services.StreamService;
import com.example.demo.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) {
		try(Connection con = ConnectionUtils.getMySqlConnection();
				) {
			
			
			CrudRepositoryImpl repo = new CrudRepositoryImpl(con);
			
			StreamService service = new StreamService(repo);
			
			
			service.filterByRpuLessThan(40000).forEach(System.out::println);
			
			
						
		} catch (Exception  e) {
			e.printStackTrace();
		}

	}

}
