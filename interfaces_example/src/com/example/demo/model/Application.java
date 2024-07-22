/**
 * 
 */
package com.example.demo.model;

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
			mobile = new Product(102,"one plus",-55000);

			service = new ProductService();
			
			  service.add(tv);
			  service.add(mobile);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		 
		
		
		  
		  
		  Product[] list =service.findAll();
		  
		  
		  for(Product eachProduct:list) {
			  
			  if(eachProduct!=null) {
				  
				  System.out.println(eachProduct);
			  }
		  }
		
	}

}
