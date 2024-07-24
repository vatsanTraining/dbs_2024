package com.training.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizeExample {

	public static void main(String[] args) {

		
//		new UsePrintNames("Idly","Sambhar");
//		new UsePrintNames("Paratha","Achar");
//		new UsePrintNames("Pizza","Coke");
//		new UsePrintNames("Tea","Biscuit");
//		
		
	//ExecutorService service =	Executors.newFixedThreadPool(5);
	
		ExecutorService service =	Executors.newSingleThreadExecutor();
		
	service.execute(new UsePrintNames("Idly","Sambhar"));
	service.execute(new UsePrintNames("Paratha","Achar"));
	service.execute(new UsePrintNames("Pizza","Coke"));
	service.execute(new UsePrintNames("Tea","Biscuit"));
	
service.shutdown();

	}

}
