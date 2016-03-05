
public class DataTypeExample {

	public static void main(String[] args) {

		String name = "Pradeep";

		// One way of creating an array - int[] states = new int[10];
		// second way of initializing the array int[] states =
		// {1,2,3,4,5,6,7,8,9};
		// third way of initializing the array int[] states = new
		// int[]{1,2,3,4,5,6,7,8,9};
		int states[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int value = 10;

		for (int loop = 0; loop < states.length; loop++) {
			states[loop] = value;
			value = value + 1;
		}

		System.out.println("The number of elements in the array is " + states.length);

		for (int val : states) {
			System.out.println("The value of the element is " + val);
		}
	}

}
