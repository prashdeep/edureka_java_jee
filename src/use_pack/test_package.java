package use_pack;

import java.util.Scanner;

import functions.function_pack;

public class test_package {

	public static void main(String[] args) {
		function_pack f1 = new function_pack();
		
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers...");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int reverse = f1.reverse(x);
		
		int fact = f1.factor(x);
		
		int sub = f1.subtract(x, y);
		int mul = f1.multiply(x, y);
		double div = f1.devide(x, y);
		
		System.out.println("Factorial of "+ x + " is "+ fact);
		System.out.println("Reverse of "+ x + " is "+ reverse); 
		System.out.println("Subtraction result is "+ sub); 
		System.out.println("Multiplicaton result is "+ mul); 
		System.out.println("Division result is "+ div); 
		
	}

}
