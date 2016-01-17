

public class ScannerExample {
	private static int counter = 0;
	
	public static void main(String args[]){
		
		for(int i = 0; i < args.length; i++){
			counter = counter + Integer.parseInt(args[i]);
		}
		System.out.println("The sum is "+counter);
	}

}
