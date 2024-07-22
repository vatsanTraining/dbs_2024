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
		// TODO Auto-generated method stub

		
		Product tv = new Product(101,"sony tv",45000);
	
		Product mobile = new Product(102,"one plus",55000);
		
		
		
		ProductService service = new ProductService();
		
		  service.add(tv);
		  service.add(mobile);
		  
		  
		  Product[] list =service.findAll();
		  
		  
		  for(Product eachProduct:list) {
			  
			  if(eachProduct!=null) {
				  
				  System.out.println(eachProduct);
			  }
		  }
		
	}

}
