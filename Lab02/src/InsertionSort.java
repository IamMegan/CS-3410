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
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
	
	
	public void IncInsertion() {
		 int size = arr.length;

		 for (int step = 1; step < size; step++) {
		   int key = arr[step];
		   int j = step - 1;

		   // Compare key with each element on the left of it until an element smaller than
		   // it is found.
		   // For descending order, change key<array[j] to key>array[j].
		   while (j >= 0 && key < arr[j]) {
		     arr[j + 1] = arr[j];
		     --j;
		   }

		   // Place key at after the element just smaller than it.
		   arr[j + 1] = key;
		 }
		}
	
	public static void main(String[] args) {
		InsertionSort array = new InsertionSort();
		array.populateArr();
		array.printArr();
		array.IncInsertion();
		array.printArr();
		
	}
	
		
}
