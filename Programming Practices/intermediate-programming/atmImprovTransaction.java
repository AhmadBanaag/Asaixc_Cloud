package puzzles;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;

// FEATURES
/* DEPOSIT
 * WITHDRAW
 * ACCOUNT NUMBER
 * 
 * WHAT TO FIX?
 * Add breaking point in the loop for section 2
 * Add number to deposit and save again (add, combine, rewrite, save)
 *  
 *  
 * 
 * */

public class atmImprovTransaction {
	public static void main(String[] args) {
		
		try {
			
			Random accNum = new Random();
			
			int bankChoice = 0;
			int loginChoice = 0;
			int usrAcc = 0;
			int pinAcc = 0;
			
			Scanner viewMoneyAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt"));
			FileWriter addMoneyAccount = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt", true);
			
			Scanner findAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\accounts.txt"));
			
			int logIn = 0;
			int logPin = 0;
			
			do {
				
				loginChoice = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"WELCOME TO BANGKO SENTRAL!\n[1] LOGIN\n[2] SIGN UP\n[3] EXIT",
						"BANGKO SENTRAL",
						1));
				
				if (loginChoice == 1) {
					
					int countAttempt = 3;
					boolean activateError = false;
					
					do {
					logIn = Integer.parseInt(JOptionPane.showInputDialog(
							null,
							"ENTER ACCOUNT NUMBER: ",
							"BANGKO SENTRAL | ENTER ACCOUNT NUMBER",
							1));
					
					logPin = Integer.parseInt(JOptionPane.showInputDialog(
							null,
							"ENTER PIN: ",
							"BANGKO SENTRAL | PIN",
							1));
				
					findAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\accounts.txt"));
					
					while(findAccount.hasNext()) {
						
						usrAcc = findAccount.nextInt();
						System.out.println(usrAcc);
						
						String accFind = findAccount.nextLine();
						System.out.println(accFind);
						pinAcc = Integer.parseInt(accFind.substring(accFind.lastIndexOf("|") + 1).trim());
						System.out.println(pinAcc);
						
						if (logIn == usrAcc && logPin == pinAcc) {
							JOptionPane.showMessageDialog(
									null,
									"==================\nWELCOME USER " +
									usrAcc +
									"!\n==================",
									"BANGKO SENTRAL | WELCOME",
									1);
									activateError = true;
									break;
						} 
					if (logIn == usrAcc && logPin == pinAcc) {	
						break;
					} } 
					
					if ((logIn != usrAcc || logPin != pinAcc) && activateError == false) {
						JOptionPane.showMessageDialog(
								null,
								"========================\nYOUR ACCOUNT NUMBER OR \nPIN NUMBER IS INCORRECT\n========================",
								"BANGKO SENTRAL | SOMETHING WENT WRONG",
								0);
						
						countAttempt--;
						
						JOptionPane.showMessageDialog(
								null,
								"============================================\nLOG-IN ATTEMPTS REMAINING: " + countAttempt + "\n============================================",
								"BANGKO SENTRAL | SOMETHING WENT WRONG",
								0);	
						} 
					
					} while (countAttempt > 0 && (logIn != usrAcc || logPin != pinAcc));
					
					if (countAttempt == 0) {
						JOptionPane.showMessageDialog(
								null,
								"==================================\nPLEASE TRY AGAIN LATER!\n==================================",
								"BANGKO SENTRAL | TRY AGAIN",
								0);
								bankChoice = 4;
								break;
					}
					
					if (logIn == usrAcc && logPin == pinAcc) {
								break;
					}
					
				} else if (loginChoice == 2) {
					FileWriter printAccount = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\accounts.txt", true);
					FileWriter printMoneyAccount = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt", true);
					
					int accNumber = accNum.nextInt(9999 - 1000 + 1);
					
					String fstName = JOptionPane.showInputDialog(
							null,
							"ENTER FIRST NAME:",
							"BANGKO SENTRAL | ENTER NEW USERNAME",
							1);
					
					String lstName = JOptionPane.showInputDialog(
							null,
							"ENTER SURNAME NAME:",
							"BANGKO SENTRAL | ENTER NEW USERNAME",
							1);
					
					String usrName = (fstName.toUpperCase() + "_" + lstName.toUpperCase());
					
					int count = 0;
					
					do {
					int pin = Integer.parseInt(JOptionPane.showInputDialog(
							null,
							"ENTER A 4-DIGIT PIN: \n(Ex. 1xxx)",
							"BANGKO SENTRAL | ENTER NEW PIN",
							1));
					
					count = String.valueOf(pin).length();
					
					if (count == 4) {
						
						findAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\accounts.txt"));
						viewMoneyAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt"));
						
						boolean isAccExist = true;
						
					while (findAccount.hasNext()) {
						String tempSearchAcc = findAccount.next();
						
						if (tempSearchAcc.equals(usrName)) {
							JOptionPane.showMessageDialog(
									null,
									"ACCOUNT ALREADY EXIST!",
									"BANGKO SENTRAL | ACCOUNT EXISTS ALREADY",
									1);
									isAccExist = false;
									break;
						}
					}
					
					if (isAccExist) {
					JOptionPane.showMessageDialog(
							null,
							"HERE'S YOUR ACCOUNT:\nUSERNAME: " +
							usrName +
							"\nACCOUNT NUMBER: " +
							accNumber +
							"\nPIN: " +
							pin,
							"BANGKO SENTRAL | NEW ACCOUNT",
							1);
					printAccount.write(accNumber + " | " + usrName + " | " + pin + "\n");
					printMoneyAccount.write(accNumber + " | " + usrName + " | " + pin + " | " + "0.0" + "\n");
					printMoneyAccount.flush();
					printAccount.flush();
					printAccount.close();
					printMoneyAccount.close();
					break;
					}
						
					} else {
						
						JOptionPane.showMessageDialog(
								null,
								"PIN MUST BE 4-DIGITS LONG ONLY",
								"ERROR FOUND | MAXIMUM DIGITS REACHED",
								0);
						
					} } while(count != 4);
				
				} else if (loginChoice == 3) {
					bankChoice = 4;
				} else {
					JOptionPane.showMessageDialog(
							null,
							"INVALID INPUT",
							"ERROR FOUND | INVALID INPUT",
							0);
				}
				
			} while (loginChoice != 3);
			
			do {
				
				if (bankChoice == 4) {
					break; }
				
				bankChoice = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"[1] CHECK BALANCE\n[2] DEPOSIT\n[3] WITHDRAW\n[4] LOG-OUT and EXIT",
						"BANGKO SENTRAL",
						JOptionPane.PLAIN_MESSAGE));
				
				if (bankChoice == 1) {
					viewMoneyAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt"));
					// price = Double.parseDouble(line1.substring(line1.indexOf("|") + 1).trim())
					
					while (viewMoneyAccount.hasNext()) {
						
						String tempStoreData = viewMoneyAccount.nextLine();
						
						int userBankCode = Integer.parseInt(tempStoreData.substring(0, tempStoreData.indexOf("|")).trim());
						
						if (userBankCode == logIn) {
							double showBalance = Double.parseDouble(tempStoreData.substring(tempStoreData.lastIndexOf("|") + 1).trim());
							
							JOptionPane.showMessageDialog(
									null,
									"CURRENT BALANCE: " +
									showBalance +
									" PHP",
									"BANGKO SENTRAL",
									1);
							break;
							
						}
					}
					
				} else if (bankChoice == 2) {
						
					viewMoneyAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt"));
					
					while(viewMoneyAccount.hasNext()) {
						int tempUsr = viewMoneyAccount.nextInt();
						System.out.println(tempUsr);
						
						String tempLine = viewMoneyAccount.nextLine();
						
						Double tempPin = Double.parseDouble(tempLine.substring(tempLine.lastIndexOf("|") + 1).trim());
						
						if (logIn == tempUsr) {
							
							String[] tempArr = new String[7];
							boolean isTrigerred = false;
							int tempElement = 0;
							viewMoneyAccount = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\bankTrans\\money.txt"));
							
							for (int i = 0; i < tempArr.length; i++) {
								
								if (isTrigerred == false) {
								tempElement = viewMoneyAccount.nextInt();
								}
								
								String tempValue = "";
								
								if (tempElement == (logIn) || isTrigerred) {
									
									tempArr[0] = String.valueOf(tempElement); 
									isTrigerred = true;
									
									for (int j = 1; j < tempArr.length; j++) {
										tempValue = viewMoneyAccount.next();
										tempArr[j] = tempValue;
										System.out.println(tempArr[j]);
									}
									
									for (String arr : tempArr) {
										System.out.print(arr + " ");
									}
									
								break;	
								
								} else {
									String skipLine = viewMoneyAccount.nextLine();
								}
								// ADD BREAK LINE
							}
						}
						
					}
					
				} else if (bankChoice == 3) {
					
				} else if (bankChoice == 4) {
					
				} else {
					
				}
				
				
				
			} while (bankChoice != 4);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(
					null,
					e.getMessage(),
					"ERROR FOUND | 404",
					0);
		}
	}

}
