
import java.util.Scanner;

public class exception1 {
	int div(int a, int b) throws Exception {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		try {
			exception1 e1 = new exception1();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();

			int result = e1.div(x, y);
			System.out.println("Result is " + result);

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception : " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
