/**
 * 
 */
package com.example.demo;

import java.util.List;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.SortingRepository;
import com.example.demo.impl.CrudRepositoryImpl;
import com.example.demo.impl.SortingRepoImpl;
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
			
			
			SortingRepository repo = new SortingRepoImpl();

			service = new ProductService(repo);
			
			  service.add(tv);
			  service.add(mobile);
			  service.add(new Product(103,"printer",25000));
		
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		 
		
		
		  
		  
		  List<Product> list =service.findAll();
		  
		  
		  
		  for(Product eachProduct:list) {
			  
				  System.out.println(eachProduct);
			  
		  }
	
		  
		  System.out.println("Sorted List By Rate Per Unit ");
		  
     List<Product> sortedList =service.sort("rateperunit");
		  
		  
		  for(Product eachProduct:sortedList) {
			  
				  System.out.println(eachProduct);
			  
		  }
		  
		
		  System.out.println("Sorted List By Product Id ");
		  
		     List<Product> sortedById =service.sort("productid");
				  
				  
				  for(Product eachProduct:sortedById) {
					  
						  System.out.println(eachProduct);
					  
				  }
				
		  
		  
	}

}
