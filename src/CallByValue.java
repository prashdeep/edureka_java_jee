
public class CallByValue {

	int data = 100;

	void callByValue(int data) {
		data = data + 100;
		System.out.println("The value of data inside the function = " + data);
	}

	public static void main(String args[]) {
		CallByValue obj = new CallByValue();

		System.out.println("Before calling the add function >> " + obj.data);
		obj.callByValue(800);
		System.out.println("Before calling the add function >>  " + obj.data);

	}
}
