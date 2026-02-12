package allAboutJ.writingAndReading;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class cs04Lab3 {
	public static void main(String[] args) {
		
		try {
		
			Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
			FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\receipts.txt", true);
			FileWriter print9128 = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\transacts_9128.txt", true);
			FileWriter print9127 = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\transacts_9127.txt", true);
			FileWriter print1293 = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\transacts_1293.txt", true);
			
			LocalDate date = LocalDate.now();
			LocalTime time = LocalTime.now();
			
			DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
			String newTime = time.format(formatTime);
			
			int getLogin = 0;
			int tempAccNum = 0;
			int countAcc = 0;
			double withdraw = 0;
			
			while (input.hasNext()) {
				input.nextLine();
				
				countAcc++;
				}
			
			do {
				getLogin = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"ENTER ACCOUNT NUMBER",
						"LAROTIN BANK",
						1));
				
				int count = 0;
				input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
				
				while (input.hasNext()) {
					
					count++;
					
					tempAccNum = input.nextInt();
					String tempSkipLine = input.nextLine();
					
					if (getLogin == tempAccNum) {
						
						JOptionPane.showMessageDialog(
								null,
								"WELCOME TO LAROTIN BANK!",
								"WELCOME!",
								1);
						break;
					} 
					
					if ((tempAccNum != getLogin) && (countAcc == count)){
						
						JOptionPane.showMessageDialog(
								null,
								"INVALID ACCOUNT NUMBER!",
								"ERROR",
								0);
						break;
					}
				}	
				if (getLogin == tempAccNum) {
					break;
				}
				
			} while (getLogin != tempAccNum);
			
			int getChoice = 0;
			
			
			do {
				
				getChoice = Integer.parseInt((JOptionPane.showInputDialog(
						null,
						"[1] BALANCE INQUIRY\n[2] DEPOSIT\n[3] WITHDRAW\n[4] EXIT",
						"LAROTIN BANK",
						1)));
				
				int pin = 0;
				boolean isContinue = false;
				
				if (getChoice != 4) {
				pin = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"ENTER PIN:",
						"LAROTIN BANK",
						1));
				input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
				
				isContinue = false;
				
				while (input.hasNext()) {
					int tempAcc = input.nextInt();
					int tempPin = input.nextInt();
					double tempMoney = input.nextDouble();
					
					if (tempPin == pin) {
						isContinue = true;
					}
				} }
				
				if (isContinue) {
				switch(getChoice) {
				
				case 1:	
					
				if (getLogin == 9128) {
					input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
					
					while (input.hasNext()) {
						int tempAcc = input.nextInt();
						int tempPin = input.nextInt();
						double money = input.nextDouble();
						
						if (tempAcc == getLogin) {
							JOptionPane.showMessageDialog(
									null,
									"BALANCE: " +
									money);
							print9128.write("USER CHECKED BALANCE - " + newTime + "\n");
							print9128.flush();
							print.write("USER: 9128\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: CHECK BALANCE\n\n");
							print.flush();
							break;
						} 
					}
					
					
					
				} else if (getLogin == 9127) {
					input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
					
					while (input.hasNext()) {
						int tempAcc = input.nextInt();
						int tempPin = input.nextInt();
						double money = input.nextDouble();
						
						if (tempAcc == getLogin) {
							JOptionPane.showMessageDialog(
									null,
									"BALANCE: " +
									money);
							print9127.write("USER CHECKED BALANCE - " + newTime + "\n");
							print9127.flush();
							print.write("USER: 9127\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: CHECK BALANCE\n\n");
							print.flush();
							break;
						} 
					}
					
				} else if (getLogin == 1293) {
					input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
					
					while (input.hasNext()) {
						int tempAcc = input.nextInt();
						int tempPin = input.nextInt();
						double money = input.nextDouble();
						
						if (tempAcc == getLogin) {
							JOptionPane.showMessageDialog(
									null,
									"BALANCE: " +
									money);
							print1293.write("USER CHECKED BALANCE - " + newTime + "\n");
							print1293.flush();
							print.write("USER: 1293\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: CHECK BALANCE\n\n");
							print.flush();
							break;
						} 
				}
					
				}
						
				break;
				
				case 2:
					
					if (getLogin == 9128) {
						input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
						
						while (input.hasNext()) {
							int tempAcc = input.nextInt();
							int tempPin = input.nextInt();
							double money = input.nextDouble();
							int tempAcc2 = input.nextInt();
							int tempPin2 = input.nextInt();
							double money2 = input.nextDouble();
							int tempAcc3 = input.nextInt();
							int tempPin3 = input.nextInt();
							double money3 = input.nextDouble();
								
								double deposit1 = Double.parseDouble(JOptionPane.showInputDialog(
										null,
										"ENTER MONEY TO DEPOSIT:",
										"LAROTIN BANK",
										1));
								PrintStream output = new PrintStream("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt");
								
								money += deposit1;
								
								output.println(tempAcc + " " + tempPin + " " + money + "\n" + tempAcc2 + " " + tempPin2 + " " + money2 + "\n" + tempAcc3 + " " + tempPin3 + " " + money3);
								output.flush();
								output.close();
								print9128.write("USER DEPOSITED " + money + "php - " + newTime + "\n");
								print9128.flush();
								print.write("USER: 9128\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: DEPOSIT\n" + "AMOUNT DEPOSITED: " + deposit1 + "php\n\n");
								print.flush();
								break;
							} 
						
					} else if (getLogin == 9127) {
						input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
						
						while (input.hasNext()) {
							int tempAcc = input.nextInt();
							int tempPin = input.nextInt();
							double money = input.nextDouble();
							int tempAcc2 = input.nextInt();
							int tempPin2 = input.nextInt();
							double money2 = input.nextDouble();
							int tempAcc3 = input.nextInt();
							int tempPin3 = input.nextInt();
							double money3 = input.nextDouble();
								
								double deposit2 = Double.parseDouble(JOptionPane.showInputDialog(
										null,
										"ENTER MONEY TO DEPOSIT:",
										"LAROTIN BANK",
										1));
								PrintStream output = new PrintStream("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt");
								
								money2 += deposit2;
								
								output.println(tempAcc + " " + tempPin + " " + money + "\n" + tempAcc2 + " " + tempPin2 + " " + money2 + "\n" + tempAcc3 + " " + tempPin3 + " " + money3);
								output.flush();
								print9127.write("USER DEPOSITED " + money + "php - " + newTime + "\n");
								print9127.flush();
								output.close();
								print.write("USER: 9127\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: DEPOSIT\n" + "AMOUNT DEPOSITED: " + deposit2 + "php\n\n");
								print.flush();
								break;
							} 
					} else if (getLogin == 1293) {
						input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
						
						while (input.hasNext()) {
							int tempAcc = input.nextInt();
							int tempPin = input.nextInt();
							double money = input.nextDouble();
							int tempAcc2 = input.nextInt();
							int tempPin2 = input.nextInt();
							double money2 = input.nextDouble();
							int tempAcc3 = input.nextInt();
							int tempPin3 = input.nextInt();
							double money3 = input.nextDouble();
								
								double deposit3 = Double.parseDouble(JOptionPane.showInputDialog(
										null,
										"ENTER MONEY TO DEPOSIT:",
										"LAROTIN BANK",
										1));
								PrintStream output = new PrintStream("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt");
								
								money3 += deposit3;
								
								output.println(tempAcc + " " + tempPin + " " + money + "\n" + tempAcc2 + " " + tempPin2 + " " + money2 + "\n" + tempAcc3 + " " + tempPin3 + " " + money3);
								output.flush();
								print1293.write("USER DEPOSITED " + money + "php - " + newTime + "\n");
								print1293.flush();
								output.close();
								print.write("USER: 1293\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: DEPOSIT\n" + "AMOUNT DEPOSITED: " + deposit3 + "php\n\n");
								print.flush();
								break;
							} 	
					}
					
				
				break;
				case 3:
					if (getLogin == 9128) {
						input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
						
						while (input.hasNext()) {
							int tempAcc = input.nextInt();
							int tempPin = input.nextInt();
							double money = input.nextDouble();
							int tempAcc2 = input.nextInt();
							int tempPin2 = input.nextInt();
							double money2 = input.nextDouble();
							int tempAcc3 = input.nextInt();
							int tempPin3 = input.nextInt();
							double money3 = input.nextDouble();
								
								withdraw = Double.parseDouble(JOptionPane.showInputDialog(
										null,
										"ENTER MONEY TO WITHDRAW:",
										"LAROTIN BANK",
										1));
								
								if (withdraw > money) {
									withdraw = 0;
									JOptionPane.showMessageDialog(
											null,
											"INSUFFICIENT MONEY! \n YOU CAN'T WITHDRAW ANY MONEY",
											"LAROTIN BANK",
											0);
								}
								
								if (money > 0) {
									money -= withdraw;
								} else {
									JOptionPane.showMessageDialog(
											null,
											"INSUFFICIENT MONEY!",
											"LAROTIN BANK",
											0);
								}
								
								PrintStream output = new PrintStream("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt");
								
								output.println(tempAcc + " " + tempPin + " " + money + "\n" + tempAcc2 + " " + tempPin2 + " " + money2 + "\n" + tempAcc3 + " " + tempPin3 + " " + money3);
								output.flush();
								print9128.write("USER WITHDRAW " + money + "php - " + newTime + "\n");
								print9128.flush();
								output.close();
								print.write("USER: 9128\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: DEPOSIT\n" + "AMOUNT WITHDRAWED: " + withdraw + "php\n\n");
								print.flush();
								break;
							} 
						
					} else if (getLogin == 9127) {
						input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
						
						while (input.hasNext()) {
							int tempAcc = input.nextInt();
							int tempPin = input.nextInt();
							double money = input.nextDouble();
							int tempAcc2 = input.nextInt();
							int tempPin2 = input.nextInt();
							double money2 = input.nextDouble();
							int tempAcc3 = input.nextInt();
							int tempPin3 = input.nextInt();
							double money3 = input.nextDouble();
								
								withdraw = Double.parseDouble(JOptionPane.showInputDialog(
										null,
										"ENTER MONEY TO WITHDRAW:",
										"LAROTIN BANK",
										1));
								
								if (withdraw > money) {
									withdraw = 0;
									JOptionPane.showMessageDialog(
											null,
											"INSUFFICIENT MONEY!\n YOU CAN'T WITHDRAW ANY MONEY",
											"LAROTIN BANK",
											0);
								}
								
								if (money2 > 0) {
									money2 -= withdraw;
								} else {
									JOptionPane.showMessageDialog(
											null,
											"INSUFFICIENT MONEY!",
											"LAROTIN BANK",
											0);
								}
								
								PrintStream output = new PrintStream("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt");
								
								output.println(tempAcc + " " + tempPin + " " + money + "\n" + tempAcc2 + " " + tempPin2 + " " + money2 + "\n" + tempAcc3 + " " + tempPin3 + " " + money3);
								output.flush();
								print9127.write("USER WITHDRAW " + money + "php - " + newTime + "\n");
								print9127.flush();
								output.close();
								print.write("USER: 9127\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: DEPOSIT\n" + "AMOUNT WITHDRAWED: " + withdraw + "php\n\n");
								print.flush();
								break;
							} 
					} else if (getLogin == 1293) {
						input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt"));
						
						while (input.hasNext()) {
							int tempAcc = input.nextInt();
							int tempPin = input.nextInt();
							double money = input.nextDouble();
							int tempAcc2 = input.nextInt();
							int tempPin2 = input.nextInt();
							double money2 = input.nextDouble();
							int tempAcc3 = input.nextInt();
							int tempPin3 = input.nextInt();
							double money3 = input.nextDouble();
							
							withdraw = Double.parseDouble(JOptionPane.showInputDialog(
									null,
									"ENTER MONEY TO WITHDRAW:",
									"LAROTIN BANK",
									1));
							
							if (withdraw > money) {
								withdraw = 0;
								JOptionPane.showMessageDialog(
										null,
										"INSUFFICIENT MONEY!\n YOU CAN'T WITHDRAW ANY MONEY",
										"LAROTIN BANK",
										0);
							}
							
							if (money3 > 0) {
								money3 -= withdraw;
							} else {
								JOptionPane.showMessageDialog(
										null,
										"INSUFFICIENT MONEY!",
										"LAROTIN BANK",
										0);
							}
							
							PrintStream output = new PrintStream("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\cs04Lab3\\accDetails.txt");
							
							output.println(tempAcc + " " + tempPin + " " + money + "\n" + tempAcc2 + " " + tempPin2 + " " + money2 + "\n" + tempAcc3 + " " + tempPin3 + " " + money3);
							output.flush();
							print1293.write("USER WITHDRAW " + money + "php - " + newTime + "\n");
							print1293.flush();
							output.close();
							print.write("USER: 1293\n" + "DATE: " + date + "\nTIME: " + newTime + "\nTRANSACTION MADE: DEPOSIT\n" + "AMOUNT WITHDRAWED: " + withdraw + "php\n\n");
							print.flush();
							break;
							} 	
					}
				break;
				case 4:
					JOptionPane.showMessageDialog(
							null,
							"THANK YOU FOR USING OUR SYSTEM!",
							"LAROTIN BANK",
							1);
				break;	
				default:
					JOptionPane.showMessageDialog(
							null,
							"INVALID INPUT CHOICE",
							"LAROTIN BANK",
							0);
				}
			}
			} while (getChoice != 4);
				JOptionPane.showMessageDialog(
						null,
						"THANK YOU FOR USING OUR SYSTEM",
						"LAROTIN STORE",
						1);
				
			print.close();
			print1293.close();
			print9127.close();
			print9128.close();
		}
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(
					null,
					"ERROR DESCRIPTION: " +
					e.getMessage(),
					"LAROTIN BANK",
					0);
		}	
	}
}

