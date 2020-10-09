package com.edureka.java_jee.module_4;

public class InvalidAgeException extends Exception {

	
	public InvalidAgeException(){
		super();
	}
	
	public InvalidAgeException(String message){
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
