
public class FunctionOverLoading {

	public static double add(double a, double b) {
		System.out.println("Called from the double definition");
		return a + b;
	}

	public static int add(int a, int b) {
		System.out.println("Called from the int definition");
		return (int) (a + b);
	}

	public static int add(double a, double b, double c) {
		System.out.println("Called from the int definition for three elements");
		return (int) (a + b + c);
	}

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 6;
		System.out.println(add(a, b, c));
	}

}
