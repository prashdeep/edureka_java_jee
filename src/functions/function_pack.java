package functions;

public class function_pack {
	
 	public int reverse(int x)
	{
		int rem, rev=0;

		for (;x > 0; x = x / 10)
		{
			rem = x % 10;
			rev = rev * 10 + rem;

		}
		return rev;
	}
	
	
	public int factor (int x)
	{
		int fact = 1;
		for (int i = 1; i <= x; ++ i)
			fact = fact * i;
		return fact;
	}
	
	
	public int subtract (int a, int b)
	{
		return a - b;
	}

	public int multiply (int a, int b)
	{
		return a * b;
	}

	public double devide (int a, int b)
	{
		return (double) a / b;
	}

}
