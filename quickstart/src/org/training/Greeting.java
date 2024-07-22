/**
 * 
 */
package org.training;

/**
 * @author srivatsan
 * @since 2024
 * @version 1.0
 */


public class Greeting {

	
	// Static method
		public static String greet() {
			
			return "Hello World";
		}
		
		
	// NON Static Method - Instance Method
	
	public String getMessage() {
		
		
		return "Welcome to Java Programming";
	}
	
	
	//overloaded method - its a one argument method 
	
	protected String getMessage(String firstName) {
		
		// mutable string buffer
		StringBuffer buffer = new StringBuffer(firstName);
		buffer.append(",").append("Welcome to Java Programming");
		
		return buffer.toString();
		
		// string are immutable
		//return firstName+"Welcome to Java Programming";
		
		
	}
	
	String getMessage(String firstName, String message) {

		StringBuffer buffer = new StringBuffer(firstName);
		buffer.append(",").append(message);
		
		return buffer.toString();

		
	}
	
	
}
