package com.training.demo;

public class PrintNames {

	
	public static synchronized void print(String str1, String str2) {
		
		System.out.println(str1);
		
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		System.out.println(str2);
	}
}
