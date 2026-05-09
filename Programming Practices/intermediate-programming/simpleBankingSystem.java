package puzzles;
import javax.swing.JOptionPane;


public class simpleBankingSystem {
	
	static double[] bankBalance = {50};
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		do {
			
		choice = Integer.parseInt(JOptionPane.showInputDialog("###########################\n         BANKING SYSTEM               \n###########################\n[1] CHECK BALANCE\n[2] DEPOSIT\n[3] WITHDRAW\n[4] EXIT\n###########################"));
		
		if (choice == 1) {
			 checkBalance();
		} else if (choice == 2) {
			double tempDeposit = Double.parseDouble(JOptionPane.showInputDialog(null, "ENTER THE AMOUNT OF MONEY \nYOU WANT TO DEPOSIT:", "BANK", 1));
			
			if (tempDeposit <= 0) {
				JOptionPane.showMessageDialog(
						null,
						"THE AMOUNT OF MONEY THAT YOU WANT TO DEPOSIT\nSHOULD BE GREATER THAN 0!",
						"BANK",
						0);
			} else {
				bankDeposit(tempDeposit);
			}
			
		} else if (choice == 3) {
			
			double tempWithdraw = Double.parseDouble(JOptionPane.showInputDialog(null, "ENTER THE AMOUNT OF MONEY \nYOU WANT TO WITHDRAW:", "BANK", 1));
			
			if (bankBalance[0] < tempWithdraw) {
			if (tempWithdraw <= 0) {
				JOptionPane.showMessageDialog(
						null,
						"THE AMOUNT OF MONEY THAT YOU WANT TO WITHDRAW\nSHOULD NOT BE A NEGATIVE NUMBER OR ZERO!",
						"BANK",
						0);
			} else {
				bankWithdraw(tempWithdraw);
			} } else {
				JOptionPane.showMessageDialog(
						null,
						"INSUFFICIENT BALANCE!",
						"BANK",
						0);
			}
			
			
		} else if (choice == 4) {
			JOptionPane.showMessageDialog(
					null,
					"THANK YOU FOR USING OUR SYSTEM!",
					"BANK",
					1);
		} else {
			JOptionPane.showMessageDialog(
					null,
					"INPUT SHOULD BE 1 TO 4 ONLY!",
					"BANK",
					0);
		}
		
		} while (choice != 4);
		
	}
	
	static void checkBalance() {
		JOptionPane.showMessageDialog(
				null,
				"BALANCE REMAINING: " +
				bankBalance[0],
				"BANK",
				1);
	}
	
	static double bankDeposit(double tempDeposit) {
		return bankBalance[0] += tempDeposit;
	}
	
	static double bankWithdraw(double tempWithdraw) {
		return bankBalance[0] -= tempWithdraw;
	}

}
