package com.example.demo.utils;

import java.time.LocalDateTime;

public class ErrorMessage {

	
	private String errorCode;
	private String errorMessage;
	private LocalDateTime dateTime;
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorMessage(String errorCode, String errorMessage, LocalDateTime dateTime) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.dateTime = dateTime;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "ErrorMessage [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", dateTime=" + dateTime
				+ "]";
	}
	
	
	
}
