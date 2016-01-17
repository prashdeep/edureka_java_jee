
public class StackExample {
	
	public static void main(String[] args) {
		function1();
		System.out.println("Called from main method");
	}
	
	private static void function1(){
		
		function2();
		System.out.println("Called from function 1");
	}
	
	private static void function2(){
		
		function3();
		System.out.println("Called from function 2");
		
	}
	
	private static void function3(){
		System.out.println("Called from function 3");
	}

}
