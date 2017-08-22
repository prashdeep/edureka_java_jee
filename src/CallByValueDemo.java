
public class CallByValueDemo {
	
	public static void main(String[] args) {
		int a = 22;
		new CallByValueDemo().method1(a);
		System.out.println("The value of  a inside the main method is "+a);
	}

	
	public void method1( int a){
		System.out.println("The value of a is "+a);
		a = 44;
		System.out.println("The value of a inside the method is "+a);
	}
}
