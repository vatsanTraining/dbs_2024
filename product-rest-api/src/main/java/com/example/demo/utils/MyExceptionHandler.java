package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class MyExceptionHandler {

	
	
	@ExceptionHandler(RuntimeException.class)
	public ErrorMessage handlRunTimeException(WebRequest req,Exception ex) {
		
		return new  ErrorMessage(req.getDescription(false),ex.getMessage(),LocalDateTime.now());
	}


	

}
