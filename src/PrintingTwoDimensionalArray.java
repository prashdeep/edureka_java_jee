
public class PrintingTwoDimensionalArray {

	public static void main(String args[]) {
		int twoD[][] = new int[5][5];
		int row, column, data = 10;
		for (row = 0; row < 5; row++)
			for (column = 0; column < 5; column++) {
				twoD[row][column] = data;
				data++;
			}
		for (row = 0; row < 5; row++) {
			for (column = 0; column < 5; column++)
				System.out.print(twoD[row][column] + " ");
			System.out.println();
		}
	}

}
