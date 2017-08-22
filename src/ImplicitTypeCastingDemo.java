
public class ImplicitTypeCastingDemo {
	
	public static void main(String[] args) {
		byte b1 = 12;
		int i1 = b1;
				
		//System.out.println("The value of i  is "+i1);
		
		byte b2 = 127;
		int i2 = b2;
		
		byte b3 = (byte) 129;
		System.out.println("The value of b3 is "+b3);
		
		int i4 = 12;
		byte b4 = (byte)i4;
		
		System.out.println("The value of b4 is "+b4);
		
		int i5 = 450;
		byte b5 = (byte)i5;
		
		System.out.println("The value of b5 is "+b5);
	}

}
