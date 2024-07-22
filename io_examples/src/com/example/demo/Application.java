/**
 * 
 */
package com.example.demo;

import java.util.List;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Product tv;
		Product mobile;
		
		ProductService service=null;
		try {
		
			tv = new Product(101,"sony tv",45000);
			mobile = new Product(102,"one plus",55000);
			
			
			CrudRepository repo = new CrudRepositoryImpl();

			service = new ProductService(repo);
			
			  service.add(tv);
			  service.add(mobile);
		
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	  
		  
		  List<Product> list =service.findAll();
		  
		  
//		  for(Product eachProduct:list) {
//			  
//				  System.out.println(eachProduct);
//			  
//		  }
//		
		  
	//	  list.forEach((e) -> System.out.println(e));
		  
		  list.forEach(System.out::println); // method reference means , use println method with each element
		  
		  
		  
	}

}
