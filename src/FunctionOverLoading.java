
public class FunctionOverLoading {
	
	public static int add(double a,double b){
		System.out.println("Called from the int definition");
		return (int)(a+b);
	}

	
	public static void main(String[] args) {
		int a=4; int b = 5; int c = 6;
		System.out.println(add(a,b));
	}

}
