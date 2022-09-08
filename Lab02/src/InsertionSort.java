import java.util.Random;
public class InsertionSort {
	int[] arr = new int[6];
	Random rand = new Random();
	
	
	public void populateArr() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(6);
		}
		
	}
	
	public void printArr() {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
	
	
	public void IncInsertion() {
		 for(int i = 1; i < arr.length; i++){
			 int x = arr[i];
			 int y = i-1;
			 	while(y >= 0 && arr[y] > x){
			 		arr[y+1] = arr[y];
			 		y--;
			 	}
			 	arr[y+1] = x;
		 	}	
		}
	
	public void DecInsertion() {
		 for(int i = 1; i < arr.length; i++){
			 int x = arr[i];
			 int y = i-1;
			 	while(y >= 0 && arr[y] < x){
			 		arr[y+1] = arr[y];
			 		y--;
			 	}
			 	arr[y+1] = x;
		 	}	
		}
	
	public static void main(String[] args) {
		InsertionSort array = new InsertionSort();
		array.populateArr();
		array.printArr();
		array.IncInsertion();
		array.printArr();
		array.DecInsertion();
		array.printArr();
		
	}
	
		
}
