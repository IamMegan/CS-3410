import java.util.Random;
import java.util.Scanner;

public class Lab01 {
	
	private int row;
	private int col;
	private int[][] matrix = new int[this.row][this.col];
	Random rand = new Random();
	
	
	
	public void setRowCol(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
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
			System.out.print("Col " + i + " max is: " + maxCol + "\n");
		}
	}
	
	public static void main(String[] args) {
		Lab01 matrix = new Lab01();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a size: ");
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		matrix.setRowCol(row, col);
		matrix.populateMatrix();
		matrix.printMatrix();
		matrix.maxCol();
		scan.close();
	}
	
}
	
