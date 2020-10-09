
public class MethodOverloading {

	public static int add(double a, int b) {
		System.out.println("Called sum with double and int parameters");
		return (int)a + b;
	}

	public static int add(int a, int b, int c) {
		System.out.println("Called sum with both int parameters");
		return a + b;
	}
	
	public static int add(char a, int b) {
		System.out.println("Called sum with char and int parameters");
		return a + b;
	}

	public static void main(String[] args) {
		int returnVar = add(4, 5);
		
		System.out.println("The returned value is " + returnVar);
		//System.out.println("The returned value is " + returnedValue);
	}

	
}
