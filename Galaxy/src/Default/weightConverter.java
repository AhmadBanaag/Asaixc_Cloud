package Default;
import java.util.Scanner;

public class weightConverter {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome to WEIGHT CONVERSION CALCULATOR" + "\nPlease Choose an Option:" + "\n[1] Convert kgs to lbs" + "\n[2] Convert lbs to kgs");
	
	System.out.print("Enter Choice: ");
	int choice = scanner.nextInt();
	
		if(choice==1) {
			System.out.print("Enter Kilograms: ");
			double kilograms = scanner.nextDouble();
			
			double lbs = kilograms * 2.204;
			System.out.printf("Kilo nimo sa pounds kay %.2f lbs", lbs);
		} else if (choice==2) {
			System.out.print("Enter Pounds: ");
			double pounds = scanner.nextDouble(); 
			
			double kgs = pounds * 2.204;
			System.out.printf("Kilo nimo sa kilograms kay %.2f kgs", kgs);
		} else {
			System.out.println("Liwata kol beh.");
		}
		scanner.close();
	}
}
