package Default;
import java.util.Scanner;

public class forLoops {
	public static void main(String[] args) {
		
		/*
		 *  When to use for Loops? while Loops?
		 * 	
		 *  for loops when we know that limit of the loop.
		 *  while loops if we don't know that limit because it will depend on the person.
		 * 
		 * */
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number of rows: ");
	int rows = input.nextInt(); // int row = 5;
	
	System.out.println("Enter the number of columns: ");
	int columns = input.nextInt(); // int column = 5;
	
	System.out.println("Enter symbol: ");
	char symbol = input.next().charAt(0);
	
	for (int i = 1; i <= columns; i++) {
		for (int j = 1; j <= rows; j++) {
		System.out.print(symbol);
		}
		System.out.println();
	}
	input.close();
	}
}