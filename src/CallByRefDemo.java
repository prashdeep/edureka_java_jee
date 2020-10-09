

public class CallByRefDemo {
	
	public static void main(String[] args) {
		int a[] = new int[]{4,5,6,7,8};
		new CallByRefDemo().method1(a);
		System.out.println("The value of  a inside the main method is "+a[0]);
	}

	
	public void method1( int[] a){
		System.out.println("The value of a is "+a[0]);
		a[0] = 88;
		System.out.println("The value of a inside the method is "+a[0]);
	}
}