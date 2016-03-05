
public class CallByReference {

	int[] array = new int[8];

	public void addItemsIntoArray(int[] array) {
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
	}

	public void printArray() {
		for (int item = 0; item < array.length; item++) {
			System.out.println("Element at position " + item + " is = " + array[item]);

		}
	}

	public static void main(String[] args) {
		CallByReference obj = new CallByReference();
		obj.array[0] = 1;
		obj.array[1] = 2;
		obj.array[2] = 3;

		System.out.println("The array before calling the function > ");
		obj.printArray();
		obj.addItemsIntoArray(obj.array);
		System.out.println("The array  after  calling the function > ");
		obj.printArray();
	}
}
