
public class CallByValue {
	
	public static int data = 50;
	
	public static void setData(int data){
		data = data;
	}
	
	public static void main(String[] args) {
	
		System.out.println("The initial value of data is "+data);
		setData(100);
		System.out.println("The final value of data is "+data);
	}

}
