package Default;
import javax.swing.JOptionPane;

public class atmMachine {
	public static void main(String[] args) {
		
		double balance = 0, deposit = 0, withdraw = 0;
		int choice = 0;
		
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(
					null, 
					"---Ahmad HackBank---" +
					"\n[1] Deposit" +
					"\n[2] Withdraw" +
					"\n[3] Check Balance" +
					"\n[4] Exit",
					"HackBank - Open 24/7", 
					JOptionPane.PLAIN_MESSAGE));
			
			switch(choice) {
				case 1:
					deposit = Integer.parseInt(JOptionPane.showInputDialog(
							null, 
							"---Ahmad HackBank---" +
							"\nEnter Amount to Deposit:",
							"HackBank - Open 24/7", 
							JOptionPane.PLAIN_MESSAGE));
					
					balance += deposit;
					
					JOptionPane.showMessageDialog(
							null,
							"---Ahmad HackBank---\n" +
							deposit +
							" Pesos deposited successfully!",
							"HackBank - Open 24/7", 
							JOptionPane.PLAIN_MESSAGE);
					break;
				case 2:
					withdraw = Integer.parseInt(JOptionPane.showInputDialog(
							null, 
							"---Ahmad MoneyBank---" +
							"\nEnter Amount to Withdraw:",
							"HackBank - Open 24/7", 
							JOptionPane.PLAIN_MESSAGE));
					
					if (withdraw <= deposit) {
						JOptionPane.showMessageDialog(
								null,
								"---Ahmad HackBank---\n" +
								withdraw +
								" Pesos withdrawn succesfully!",
								"HackBank - Open 24/7", 
								JOptionPane.PLAIN_MESSAGE);
						balance -= withdraw;
					} else {
						JOptionPane.showMessageDialog(
								null,
								"---Ahmad HackBank---" +
								"\nInsufficient Funds!",
								"HackBank - Open 24/7", 
								JOptionPane.PLAIN_MESSAGE);
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(
							null, 
							"---Ahmad MoneyBank---" +
							"\nCurrent Balance: " +
							balance +
							" Pesos",
							"HackBank - Open 24/7", 
							JOptionPane.PLAIN_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(
							null,
							"---Ahmad HackBank---" +
							"\nThank you for banking with us!",
							"HackBank - Open 24/7", 
							JOptionPane.PLAIN_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(
							null, 
							"---Ahmad MoneyBank---" +
							"\nChoice Invalid!",
							"HackBank - Open 24/7", 
							JOptionPane.PLAIN_MESSAGE);
					break;
					
			}
		} while (choice != 4);
	}
}
