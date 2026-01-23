package allAboutJ.writingAndReading;
import java.io.*;
import java.util.Scanner;

public class productRead {
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\Documents\\textFiles\\productList.txt"));
		
		String itemName = input.next();;
		double itemPrice = input.nextDouble();
		int itemQuantity = input.nextInt();
		
		double total = itemPrice * itemQuantity;
		
		//f = float or double
		//d = integer
		
		System.out.printf("Product Name: %s\nPrice: %.1f\nQuantity: %d\nTotal: %.1f", itemName, itemPrice, itemQuantity, total);
		input.close();
	}
}
