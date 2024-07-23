/**
 * 
 */
package com.training;

import java.util.ResourceBundle;

import org.training.Greeting;

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting welcome= new Greeting();
		
		
		
				
				
		// All classes in java extend Object class
		// so Object class public methods are also accessible to welcome object
	
		        
		String response=welcome.getMessage();  // if the method is returning a value capture it
		// if further manipulation of response is required
		//System.out.println(response);
		
		// if the response need not to processed just print it or pass it another method
		
		//System.out.println(welcome.getMessage()); // if the method is returning a value pass it another method
		                                          // we are passing it println method
		
		   //  int abc =welcome.notifyAll(); // not allowed since method return type is void
		
		//system is class , out is a field referring printstream in io package and println is the method
		 System.out.println(Greeting.greet());
		
		  welcome.greet();  // accessing static method in a non-static way
		  //Greeting.getMessage();  // exception code will not compile
		  
		  //System.out.println(welcome.getMessage("Ramesh"));
		  
		 // System.out.println(welcome.getMessage("Suresh", "Happy Birthday"));
		  
	}

}
