package com.example.demo;

import java.util.List;

public class ResultService {

	
	// Write Junit Test cases for the following Method
	
	// if the mark scored by the student is less than or equal to 60 
	// assign grade B if its between 60 and 80 assign grade A else 
	// assign grade O
	
	
	
	
	public String findGrade(Student entity) {
		
		if(entity.getMarkScored()<0) {
			throw new RuntimeException("ERR-102");
		}
		
		String result ="O";
		if(entity.getMarkScored()<=60) {
			
			result ="B";
		} else if(entity.getMarkScored()>60 && entity.getMarkScored()<=80) {
			result ="A";
		}
		return result;
	}
	
	// Test Elements in Odd position should not be 0
	
	public List<Integer> getNumbers(){
		
		List<Integer> list =List.of(90,90,12,60,0,40);
		
		return list;

	}

	public List<Student> getStudents() {
		
	Student ram = new Student(101,"Anand",92);
		
		Student shyam = new Student(102,"Shyam",72);

		Student shiv = new Student(103,"Shiv",56);

		return List.of(ram,shyam,shiv);
	}
	
	
}
