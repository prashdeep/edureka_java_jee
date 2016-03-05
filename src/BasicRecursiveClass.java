
public class BasicRecursiveClass {

	public static void main(String[] args) {
		printRecursive();
	}

	private static void printRecursive() {
		System.out.println("Calling the printRecursie function");
		printRecursive();

	}

}
