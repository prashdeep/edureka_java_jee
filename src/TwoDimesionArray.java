
 public class TwoDimesionArray {

	public static void main(String[] argv) {
		
		int result = 0;
		for (int i = 0; i < argv.length; i++){
			result = result +Integer.parseInt(argv[i]);
		}
		System.out.println("Result >> "+result);
		int row = 4;
		int col = 4;
		int[][] twoDimArray = new int[4][4]; 

		int initValue = 10;

		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				twoDimArray[x][y] = initValue;
				initValue++;
			}
		}

		// print the elements of the array
		/*for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				System.out.print(twoDimArray[x][y] + " ");
			}
			System.out.println();
			
			//java 7/8 feature
			Long salary = 10_000_000_000l;
		}*/
		
		//variable naming rules
		int $_a2lphan3434$_umeric = 0;
	}

}

