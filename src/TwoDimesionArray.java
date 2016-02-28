
public class TwoDimesionArray {

	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		int[][] twoDimArray = new int[][]{{1,2,3},{2,3,4}, {4,3,4},{7,6,5,3}};

		int initValue = 10;

		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				twoDimArray[x][y] = initValue;
				initValue++;
			}
		}
		
		//print the elements of the array
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				System.out.print(twoDimArray[x][y]+" " );
			}
			System.out.println();
		}
	}

}
