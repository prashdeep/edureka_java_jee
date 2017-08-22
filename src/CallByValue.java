
public class CallByValue {

	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		int data = 50;
		System.out.println("The initial value of data is " + data);
		obj.modifyData(data);
		System.out.println("The final value of data is " + data);
	}

	public void modifyData(int data) {
		System.out.println("The value of data inside the method is "+data);
		System.out.println("Changing the value of data >> ");
		data = 30;
		
	}

}
