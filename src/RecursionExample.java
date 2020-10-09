
public class RecursionExample {
	
	private static int startIndex = 0;
	private static int endIndex = 40;

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		fibonacciSequence(n1, n2);
	}

	public static void fibonacciSequence(int n1, int n2) {
		// make sure we have set an ending point so this Java recursion
		// doesn't go on forever.
		if (startIndex == endIndex)
			return;
		
		System.out.println("index: " + startIndex + " -> " + n2);
		// make sure we increment our index so we make progress
		// toward the end.
		startIndex++;
		fibonacciSequence(n2, n1 + n2);
	}
}
