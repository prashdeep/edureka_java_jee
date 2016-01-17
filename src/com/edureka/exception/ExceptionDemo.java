package com.edureka.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		int x;
		int[] array = { 2, 3, 4, 8 };
		try {
			x = 5 / calc();
    		
		} catch (ArithmeticException exception) {
			System.out.println("Arithmetic Exception because the calc function returned 0" + exception.getMessage());
			x = 0;
	
		
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Arithmetic Exception because the calc function returned 0" + exception.getMessage());
			x = 0;
		} finally{
			try{
			System.out.println(array[9]);
			}catch(Exception e){
				
			}
		}
	
		System.out.println("The value of x is " + x);

	}

	static int calc() {
		return 0;
	}

}
