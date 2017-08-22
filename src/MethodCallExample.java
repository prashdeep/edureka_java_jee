
public class MethodCallExample {
	
	public static void main(String[] args) {
		new MethodCallExample().method1();
		System.out.println("Called after invoking method1");
	}
	
	public void method1(){
		System.out.println("Called from method1");
		method2();
		System.out.println("Called after invoking method2");
	}
	public void method2(){
		System.out.println("Called from method2");
		method3();
		System.out.println("Called after invoking method3");
	}
	
	public void method3(){
		System.out.println("Called from method3");
		method4();
		System.out.println("Called after invoking method4");
	}
	
	public void method4(){
		System.out.println("Called from method4");
	}

}
