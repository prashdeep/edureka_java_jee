
public class StaticDemo {

	private static int counter = 0;
	private int count;

	public StaticDemo() {
		counter = counter + 1;
		count++;
	}

	public static int getCounterValue() {
		return counter;
	}

	public int getCount() {

		return count;
	}

}
