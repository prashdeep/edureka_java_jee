import java.util.Scanner;

public class InterativeArgumentDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int a = sc.nextInt();
		System.out.println("Please enter another number");
		int b = sc.nextInt();
		System.out.println("The sum is "+(a+b));
		sc.close();
		
	}

}
