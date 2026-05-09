package puzzles;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class saleSummarySystem {
	public static void main(String[] args) {
		
		try {
		Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\sales.txt"));
		FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\summary.txt", true);
		
		double total = 0;
		String prodName = "";
		double price = 0;
		int quant = 0;
		double sum = 0;
		double highest = 0; 
		String highestItem = "";
		double lowest = 100;
		String lowestItem = "";
		int count = 0;
		
		while (input.hasNextLine()) {
			
			prodName = input.next();
			price = input.nextDouble();
			quant = input.nextInt();
			total = (price * quant);
			sum += price * quant;
			
			
			System.out.println(total);
			
			if (highest < total) {
				highest = total;
				highestItem = prodName;
			}
			if (lowest > total) {
				lowest = total;
				lowestItem = prodName;
			}
			if (price > 40) {
				count++;
			}
		}
		
		
		print.write("----- SALES SUMMARY -----\nTotal Sales: " 
		+ sum + "\nHighest Item: " + highestItem + "(" + highest + ")\nLowest Item: " 
				+ lowestItem + "(" + lowest + ")\nItems Above 40: " + count + "\n----------------------\n");
		
		print.close();
		input.close();
		
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
