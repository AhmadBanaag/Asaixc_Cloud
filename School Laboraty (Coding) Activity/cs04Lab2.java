package allAboutJ.writingAndReading;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class cs04Lab2 {
	public static void main(String[] args) {
		
	try {
	
		Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Input.txt"));
		FileWriter print = new FileWriter("C:\\\\Users\\\\Ahmad Banaag\\\\OneDrive\\\\Documents\\\\textFiles\\\\cs04Lab2Output.txt", true);
		
		String viewProd = "";
		String prodPurchase = "";
		double prodTotal = 0;
		double payment = 0;
		double change = 0;
		 	
		String choice = "0";
		
		do {
			
			while (input.hasNext()) {
				viewProd += "\n" + input.nextLine() + "\n=======================";
			}
			
			choice = JOptionPane.showInputDialog(
					null,
					"[1] View Products\n[2] Buy Products \n[3] Print Receipt \n[4] Exit",
					"Rotin STORE",
					1);
			
			if (choice.equals("1")) {
				
				JOptionPane.showMessageDialog(
						null,
						"LIST OF PRODUCTS" +
						viewProd,
						"Rotin STORE",
						1);
				
			} else if (choice.equals("2")) {
				
				String buy = "";
				int quantity01 = 0;
				int quantity02 = 0;
				int quantity03 = 0;
				boolean isBuy01 = false;
				boolean isBuy02 = false;
				boolean isBuy03 = false;
				String safeGuard = "";
				String silKa = "";
				String palmoLive = "";
				
				do {
					
				buy = JOptionPane.showInputDialog(
						null,
						"LIST OF THE PRODUCTS:\n" +
						viewProd + 
						"\nEnter product code that your want to BUY:",
						"Rotin STORE",
						1);
				
				if (buy.equals("01")) {
					prodTotal += 15;
					quantity01++;
					
					safeGuard = "01 | Safeguard | 15.00 php | " + quantity01;
					
					isBuy01 = true;
					
				} else if (buy.equals("02")) {
					prodTotal += 25;
					quantity02++;
					
					silKa = "02 | Silka | 25.00 php | " + quantity02;
					
					isBuy02 = true;
					
				} else if (buy.equals("03")) {
					prodTotal += 10;
					quantity03++;
					
					palmoLive = "03 | Palmolive | 10.00 php | " + quantity03;
					
					isBuy03 = true;
					
				} else if (buy.equals("")) {
					
				} else {
					JOptionPane.showMessageDialog(
							null,
							"Product Code can't be found!",
							"Rotin Store",
							0);
				
				} } while (!buy.equals("")); 
				
				if (isBuy01) {
					prodPurchase += safeGuard + "\n";
				} if (isBuy02) {
					prodPurchase += silKa + "\n";
				} if (isBuy03) {
					prodPurchase += palmoLive + "\n";
				}
				
				do {
				
				payment += Double.parseDouble(JOptionPane.showInputDialog(
						null,
						"Total Payment: " +
						prodTotal +
						"\nEnter Payment:",
						"Rotin STORE",
						1));
				
				if (payment < prodTotal) {
					
					double balance = prodTotal - payment;
					
					JOptionPane.showMessageDialog(
							null,
							"Insufficient Balance:\n" +
							"BALANCE: " +
							balance,
							"Rotin STORE",
							1);
					
				} if (payment >= prodTotal) {
					
					change += payment - prodTotal;
					
				} } while (payment < prodTotal);
				
			} else if (choice.equals("3")) {
				
				print.write("\n=========================\n" + "\nSTORE NAME: ROTIN STORE\nDATE: 1/29/2026\nTIME: 3:30\nCODE | PRODUCT NAME | PRICE | QUANTITY\n" + prodPurchase + "\nTOTAL PURCHASE: " + prodTotal + " php\nAMOUNT TENDERED: " + payment + " php\nCHANGE: " + change + " php\n\n=========================");
				
				JOptionPane.showMessageDialog(
						null,
						"RECEIPT PRINTED!",
						"Rotin STORE",
						1);
				
			} else if (choice.equals("4")) {
				
				JOptionPane.showMessageDialog(
						null,
						"THANK YOU FOR USING OUR PROGRAM!",
						"Rotin STORE",
						1);
			
			} else {
				JOptionPane.showMessageDialog(
						null,
						"INVALID INPUT!",
						"ERROR!",
						0);
			}
		} while (!choice.equals("4"));
		
		print.close();
		input.close();
	}
	
	catch (Exception e) {
		JOptionPane.showMessageDialog(
				null,
				"ERROR\n" +
				e.getMessage(),
				"ERROR!",
				0);
		}	
	}
}
