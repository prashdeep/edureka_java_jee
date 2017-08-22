/**
 * This is for the documentation purpose. This class is responsible for
 * demonstrating the various programming constructs.
 * 
 * @author Prashdeep
 * @version 1.0
 * @since 1.0
 *
 */
public class IfElseTest {

	public static void main(String[] args) {
		int salary = 1000;

		// This logic is used to compare the value of salary
		// TODO
		/*
		 * This is a multi line comment if (salary > 100) { System.out.println(
		 * "Salary is greater than 100"); } else if (salary == 100) {
		 * System.out.println("Salary is equal to 100"); } else {
		 * System.out.println("Salary is less than 100"); }
		 */
		/*
		switch (salary) {
		case 1000:
			System.out.println("The salary is 1000");
			break;
		case 1001:
			System.out.println("The salary is 1001");
			break;
		case 2000:
			System.out.println("The salary is 2000");
			break;
		default:
			System.out.println("THis is the default case statement");
			break;
		}
		
		//looping structs
		for (int i = 0; i < 10; i++){
			System.out.println("Value of i is "+i);
		}*/
		
		int i =0;
		//while loop
		while(i <= 0){
			System.out.println("The value of i is "+i);
			i++;
		}
		
		//do while 
		
		do{
			System.out.println("The value of i is "+i);
			i++;
		}while(i <= 0);

	}

}
