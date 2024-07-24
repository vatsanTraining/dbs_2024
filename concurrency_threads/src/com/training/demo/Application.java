package com.training.demo;

public class Application {
	
	
	public static void main(String[] args) {
		
		
		
		Runnable task = () -> {
		
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread1 = new Thread(task,"Ash");
		Thread thread2 = new Thread(task,"Bash");
		
		thread1.start();
		thread2.start();
		

	}

	
	
}
