package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	Greeting grtObj=null;
	
	@BeforeEach
	void init() {
		
		 grtObj = new Greeting();

	}
	@Test
	void testGetMessageReturnNull() {
		
		
		String actual = grtObj.getMessage();
		
		assertNotEquals(null, actual);
		
	}
	
	@Test
	@DisplayName("Test Get Message method returns Hello World")
	void testGetMessageReturnValue() {
		
		
		String actual = grtObj.getMessage();
		
		assertEquals("Hello World", actual);
		
	}
	@AfterEach
	void destory() {
		
		System.out.println("Called After Each Method");
	}
}
