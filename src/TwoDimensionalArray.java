
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int [][] twoDimArray = new int[4][4];
		for(int i = 0; i < 4; i ++){
			for ( int j = 0; j < 4; j++){
				System.out.print(twoDimArray[i][j]+" ");
			}
			System.out.println();
		}
		
		int startIndex = 1;
		for(int i = 0; i < 4; i ++){
			for ( int j = 0; j < 4; j++){
				twoDimArray[i][j] = startIndex;
				startIndex++;
			}
		}
		
		for(int i = 0; i < 4; i ++){
			for ( int j = 0; j < 4; j++){
				System.out.print(twoDimArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
