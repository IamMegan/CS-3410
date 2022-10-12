import java.util.Scanner;

public class Main
{
    public static int mult5sum(int n){
        if(n == 0)
            return 0;
        else
            return 5*(2*n-1) + mult5sum(n-1);
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		System.out.printf("The result is: %d", mult5sum(scan.nextInt()));
	}
}
