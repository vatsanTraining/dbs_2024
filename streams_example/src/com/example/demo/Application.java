package com.example.demo;

import java.sql.Connection;
import java.util.Map;

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
			
			
			System.out.println("Average Rate "+service.getAverageRpu());
			
			
			service.getProductNames().forEach(System.out::println);
			
			
			Map<String,Double> map = service.getProductNameWithRpu(40000);
			
			
			for(Map.Entry<String, Double> eachElement: map.entrySet()) {
				
				System.out.println(eachElement.getKey() + ","+ eachElement.getValue());
				
			}
			
						
		} catch (Exception  e) {
			e.printStackTrace();
		}

	}

}
