package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ResultServiceTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	Student ram;
	Student shyam;
	Student shiv;
	static ResultService service;
	
	@BeforeAll
	static void preconstruct() {
		
		service = new ResultService();
	}
	
	@BeforeEach
	void init() {
		ram = new Student(101,"Ramesh",92);
		
		shyam = new Student(102,"Shyam",72);

		shiv = new Student(103,"Shiv",56);

	}
	

	@Test
	@DisplayName("Test Find Grade Method returns the correct Grade -Condition One")
	void testFindGradeConditionOne() {
		
		
		String actual = service.findGrade(shiv);
		
		assertEquals("B", actual);
	}
	
	@Test
	@DisplayName("Test Find Grade Method returns the correct Grade -Condition Two ")
	void testFindGradeConditionTwo() {
		
		
			String actual =service.findGrade(shyam);
			assertEquals("A", actual);

	}

	@Test
	@DisplayName("Test Find Grade Method returns the correct Grade -Condition  Three")
	void testFindGradeConditionThree() {
		

		String actual =service.findGrade(ram);
		assertEquals("O", actual);


	}
	
	@Test
	@DisplayName("Test Findgrade Method throws RuntimeException when mark is negative")
	void testForExeption() {
		
		
		Throwable exception =
	            assertThrows(RuntimeException.class, ()-> {
	        		service.findGrade(new Student(102,"Gandhi",-20));

	            } );                  		
            
		  assertEquals("ERR-102", exception.getMessage());
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5})
	    void checkingForNullInList(int idxPos) {
	      
	    assertNotEquals(0,service.getNumbers().get(idxPos));
	    }

	
	
	@DisplayName("Test getStudents method return a List of size 3 and the Student in the +"
			+ "first postion name starts with A ")
	@Test
	void testgetStudents() {
		
        List<Student> list = service.getStudents();
        

        assertAll(() ->{
        	assertNotNull(list);
        },
        		()->{
        	assertEquals(3, list.size());
        },
        		()->{
        			assertEquals('A', list.get(0).getStudentName().charAt(0));
        		}
        		);
	
	}
	
}
