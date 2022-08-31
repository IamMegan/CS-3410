import java.util.Random;

public class Lab01 {
	private int[][] matrix = new int[5][5];
	Random rand = new Random();
	
	
	public void populateMatrix() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = rand.nextInt(100);
			}
		}
	}
	
	public void printMatrix() {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println();
	}
	
	public void maxCol() {
		for(int i = 0; i < matrix.length; i++) {
			int maxCol = 0;
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[j][i] > maxCol) {
					maxCol = matrix[j][i];
				}
			}
			System.out.print("Col" + i + "max is:" + maxCol + "\n");
		}
	}
	
	public static void main(String[] args) {
		Lab01 matrix = new Lab01();
		
		matrix.populateMatrix();
		matrix.printMatrix();
		matrix.maxCol();
	}
	
}
	

