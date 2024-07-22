package com.training;

import org.training.Greeting;

public class CustomGreet extends Greeting {

	// Since GreetUtils is in the same package as 
		// Greeting it has access to both default and protected method
		public String invoke() {
			
			
			
			greet();     // static 
			String message1= getMessage();   // instance method with public modifier
			String message2=getMessage("Magesh");  // protected method 
			
			
			// default method not accessible even though its a subclass its in a different package
			
			//getMessage("Kanth","Happy Holi");  
			
			
			return message1+message2;
			
		}
}
