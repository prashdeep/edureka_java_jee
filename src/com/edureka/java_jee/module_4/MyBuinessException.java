package com.edureka.java_jee.module_4;

public class MyBuinessException extends Exception{
	

	public MyBuinessException(){
		super();
	}
	public MyBuinessException(String message){
		super(message);
	}
	

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
	

}
