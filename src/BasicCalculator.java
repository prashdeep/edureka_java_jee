
public class BasicCalculator {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	public int divide(int a, int b) {
		int result = a / b;
		return result;
	}
	
	public static void main(String[] args) {
		BasicCalculator obj = new BasicCalculator();
		System.out.println("The sum is "+ obj.add(6, 6));
		System.out.println("The subtracted value is "+ obj.sub(8, 6));
		System.out.println("The muyltiplied value is "+ obj.multiply(8, 6));
		System.out.println("The divided value is "+ obj.divide(8, 6));
	}

}
