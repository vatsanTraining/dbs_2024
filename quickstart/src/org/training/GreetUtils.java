package org.training;

public class GreetUtils {


	// Since GreetUtils is in the same package as 
	// Greeting it has access to both default and protected method
	public String invoke() {
		
		Greeting grt = new Greeting();
		String message1=grt.getMessage("Non subclass");
		String message2=grt.getMessage("Non Subclass","Protected");
		
		return message1+message2;
	}
	
	
}
