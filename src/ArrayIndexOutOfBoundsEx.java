
public class ArrayIndexOutOfBoundsEx  {

	public static void main(String[] args) {
		
		try
		{
			int a[] = new int [5];
			a [10] = 200;			
		}
		catch (ArrayIndexOutOfBoundsException  ex)
		{
			System.out.println("In the Array Index Out Of BoundsException " + ex);
		}
		finally
		{
			System.out.println("In the finally block...");
		}

	}

}
