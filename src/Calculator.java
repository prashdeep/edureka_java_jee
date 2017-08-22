
public class Calculator {
	
	public void sum (int a, double b ){
		System.out.println("The sum is "+(a+b));
	}
	
	public void sum (double a, int b ){
		System.out.println("The sum is "+(a+b));
	}
	public int sum (int a, int b, int c ){
		System.out.println("The sum is "+(a+b+c));
		return a+b;
	}
	
	public void sum (String a, String b ){
		System.out.println("The sum is "+(a+b));
	}
	
	public void sum (String a, int b ){
		System.out.println("The sum is "+(a+b));
	}
	
	public void sub(int a, int b ){
		System.out.println("The sub is"+(a - b));
	}
	
	public void multiply (int a, int b ){
		System.out.println("The product is"+(a * b));
	}
	
	public void divide (int a, int b ){
		System.out.println("The division is"+(a / b));
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//calc.sum(56, 42);
		//calc.sum(56, 42, 88);
		//calc.sum("a", "b");
		//calc.sum("a", 4);
	}

}
