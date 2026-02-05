package allAboutJ.writingAndReading;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* 	 NEED TO UPDATE
 * - Fix price formula BUG
 * - Fix list BUG
 * */

public class cs04Lab2 {
	public static void main(String[] args) {
		
	try {
		
		Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Input.txt"));
		FileWriter print = new FileWriter("C:\\\\Users\\\\Ahmad Banaag\\\\OneDrive\\\\Documents\\\\textFiles\\\\cs04Lab2Output.txt", true);
		
		String recOutput = "";
		double prodTotal = 0;
		double payment = 0;
		double change = 0;
		int prodCode = 0;
		
		String choice = "";
		
		do {
			
			String viewProd = "";
			// SEPARATE THE TWO SO THAT THE FIRST WILL JUST ADD A CODE WHILE THE OTHER WILL ADD THE ACTUAL PRODUCT DESCRIPTION
			while (input.hasNextLine()) {
				String skipLine = input.nextLine(); //TO BE USED TO READ THE LINE
				prodCode++;
				}
			
			input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Input.txt"));
			
			while (input.hasNextLine()) {
				viewProd += input.nextLine() + "\n=======================\n";
			}
			
			choice = JOptionPane.showInputDialog(
					null,
					"[1] Add Product\n[2] View Products\n[3] Buy Products \n[4] Print Receipt \n[5] Exit",
					"Rotin STORE",
					1);
			
			if (choice.equals("1")) {
				
				String addProductName = JOptionPane.showInputDialog(
						null,
						"ENTER PRODUCT's NAME:",
						"Rotin STORE",
						1);
				
				double addProdPrice = Double.parseDouble(JOptionPane.showInputDialog(
						null,
						"HOW MUCH IS " +
						addProductName.toUpperCase() +
						"?",
						"Rotin STORE",
						1));
				
				FileWriter addPrice = new FileWriter("C:\\\\Users\\\\Ahmad Banaag\\\\OneDrive\\\\Documents\\\\textFiles\\\\cs04Lab2Prices.txt", true);
				
				addPrice.write((prodCode + 1) + " | " +  (int) addProdPrice + ".0\n");
				addPrice.flush();
				addPrice.close();
				
				String formatProduct = (prodCode + 1) + " | " + addProductName + " | " + addProdPrice + " php\n";
				
				FileWriter addProd = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Input.txt", true);
				
				addProd.write(formatProduct);
				addProd.flush();
				addProd.close();
				
				prodCode++;
			} else if (choice.equals("2")) {
				
				JOptionPane.showMessageDialog(
						null,
						"LIST OF PRODUCTS: \nCODE | PRODUCT NAME | PRICE\n" +
						viewProd,
						"Rotin STORE",
						1);
				
			} else if (choice.equals("3")) {
				
				String buy = "";
				String  line = "";
				int prodQuantity = 0;
				Double price = 0.0;
				
				do {
				
				buy = JOptionPane.showInputDialog(
						null,
						"LIST OF THE PRODUCTS:\nCODE | PRODUCT NAME | PRICE\n" +
						viewProd + 
						"\nEnter product code that your want to BUY:",
						"Rotin STORE",
						1);
				
				input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Input.txt"));
				// GET QUANTITY OF PURCHASE
				
				String prodFirstCode = "";
				
				while (input.hasNextLine()) {
					
					if (buy.equals("")) {
						break;
					}
					
					line = input.nextLine();
					
					if(!line.isEmpty()) {
						
						prodFirstCode = String.valueOf(line.charAt(0));
						System.out.println(prodFirstCode);
						if (buy.equalsIgnoreCase(prodFirstCode)) {
							prodQuantity = Integer.parseInt(JOptionPane.showInputDialog(
								null,
								"HOW MANY?",
								"Rotin STORE",
								1));
							//PRICE FORMULA / BLOCK
							Scanner prodPrices = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Prices.txt"));
							// MULTIPLY QUANTITY TO PRICE
							while (prodPrices.hasNext()) {
								
								if (buy.equals("")) {
									break;
								}
								
								String line1 = prodPrices.nextLine();	
								
								if (!line1.isEmpty()) {
									
									String prodPrice = String.valueOf(line1.charAt(0));
									
									if (buy.equals(prodPrice)) {
										
										price = Double.parseDouble(line1.substring(line1.indexOf("|") + 1).trim());
										
										price *= prodQuantity;
										
										prodTotal += price;
										
										prodPrices.close();
										break;
									}
								}
							} break;
						} 
					} 
				}
				
				// OUTPUT FOR RECEIPT ORDER 
				// FIX THIS OUTPUT
				
				input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab2Input.txt"));
				
				while (input.hasNext()) {
					
					String line2 = input.nextLine();
					line2 = String.valueOf(line2.charAt(0));
					
						if (line2.equals(buy)) {
							recOutput +=  line + " | " + prodQuantity + "\n";
							System.out.println(recOutput);
							break;
						}								
					}
				
				input.close();
				
				if (!buy.equals(prodFirstCode)) {
					JOptionPane.showMessageDialog(
							null,
							"Product Code can't be found!",
							"Rotin Store",
							0);  
				}
				
				} while (!buy.equals("")); 
				
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
				
			} else if (choice.equals("4")) {
				
				LocalDate date = LocalDate.now();
				LocalTime time = LocalTime.now();
				
				DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
				String newTime = time.format(formatTime);
				
				print.write("\n=========================\n" + "\nSTORE NAME: ROTIN STORE\nDATE: " + date + "\nTIME: " + newTime + "\nCODE | PRODUCT NAME | PRICE | QUANTITY\n" + recOutput + "\nTOTAL PURCHASE: " + prodTotal + " php\nAMOUNT TENDERED: " + payment + " php\nCHANGE: " + change + " php\n\n=========================");
				
				JOptionPane.showMessageDialog(
						null,
						"RECEIPT PRINTED!",
						"Rotin STORE",
						1);
				
			} else if (choice.equals("5")) {
				
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
		} while (!choice.equals("5"));
		
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
