package com.example.demo.exceptions;

public class RangeCheckException extends Exception {

	
	private String message;

	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {

		return this.message;
	}
	
	
}
