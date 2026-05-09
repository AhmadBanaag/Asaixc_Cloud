package puzzles;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class atmTransaction {
	public static void main(String[] args) {
		
		try {
			
			Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\transaction.txt"));
			FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\atm_report.txt", true);
			
			int AccNum = 0;
			String type = "";
			double amount = 0;
			double netBalance = 0;
			
			double deposit = 0;
			double withdraw = 0;
			double highNet = 0;
			double lowNet = 100;
			
			int countWith = 0;
			
			while (input.hasNext()) {
				
				AccNum = input.nextInt();
				type = input.next();
				amount = input.nextDouble();
				
				if (type.equalsIgnoreCase("w")) {
					withdraw += amount;
					countWith++;
				} else if (type.equalsIgnoreCase("d")) {
					deposit += amount;
				} 
				
				if (highNet < amount) {
					highNet = amount;
				}
				if (lowNet > amount) {
					lowNet = amount;
				}
			}
			
			print.write("----- ATM REPORT -----\nTotal Deposits: " + deposit + "\nTotal Withdrawals: " + withdraw + "\nHighest Balance: " + highNet + "\nLowest Balance: " + lowNet + "\nWithdrawal Count: " + countWith + "\n----------------------\n");
			print.close();
			input.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
