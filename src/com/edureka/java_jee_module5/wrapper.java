package com.edureka.java_jee_module5;


public class wrapper {
	
	public static void main(String[] args) {
		Integer int_obj = 600;
		
		int int_var = int_obj;
		
		try{
			int val = Integer.parseInt("300");
		}catch(NumberFormatException exception){
			System.out.println(exception.getMessage());
		}
		System.out.println();;
		System.out.println(int_var);
		
		int_var = 700;
		int_obj = int_var;
		
		System.out.println(int_obj);
		
	}

}
