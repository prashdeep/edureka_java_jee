import java.util.Scanner;

interface a
{
	int add (int a, int b);
	int mul (int a, int b); 
	
	int attribute = 600;
}

interface c
{
	int sub (int a, int b);
	
}

interface b extends a, c
{
	int add (int a, int b, int c);
	int div (int a, int b);	
}


public class Interface1 implements b
{
	@Override
	public int add(int a, int b) 
	{		 
		return (a+b);
	}
	
	@Override
	public int add(int a, int b, int c) {
		return a+b+c;
	}
  
	
	@Override
	public int mul(int a, int b) 
	{		 
		return (a*b);
	}
	
	@Override
	public int div(int a, int b) 
	{		 
		return (a/b);
	}
	
	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	


	public static void main(String[] args) 
	{		 
		
		Interface1 i1 = new Interface1();
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result_add = i1.add(x, y);
		int result_multiply = i1.mul(x, y);
		int result_div = i1.div(x, y);
		
		System.out.println("Added result is "+result_add);
		System.out.println("Multiplied value is "+result_multiply);
		System.out.println("Div result is "+result_div);
		
 		System.out.println("Value of attributr is " + i1.attribute);
	}

}
