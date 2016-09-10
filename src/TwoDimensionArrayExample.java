
public class TwoDimensionArrayExample {

	public static void main(String[] var) {
		int[][] twoDArray = new int[4][4];
		int counter = 10;
		int _$943543545OTAL_COUNT = 10;
		for (int row = 0; row < 4; row++) {
			
			for (int col = 0; col < 4; col++) {
				twoDArray [row] [ col] =  counter;
				counter++;
			}
		}

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print(twoDArray[row][col] + " ");
			}
			System.out.println();
		}
	}

}
