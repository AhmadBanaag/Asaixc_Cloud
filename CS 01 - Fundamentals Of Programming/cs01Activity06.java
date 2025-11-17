package Default;
import javax.swing.JOptionPane;

public class cs01Activity06 {
	public static void main(String[] args) {
		
		String again = "";
		
		do {
		String userOld = JOptionPane.showInputDialog(
				null,
				"Enter Username:",
				"USERNAME REGISTRATION",
				JOptionPane.PLAIN_MESSAGE);
		
		String passOld = JOptionPane.showInputDialog(
				null,
				"Enter Password:",
				"PASSWORD REGISTRATION",
				JOptionPane.PLAIN_MESSAGE);
		
		String userNew = JOptionPane.showInputDialog(
				null,
				"Username:",
				"LOGIN",
				JOptionPane.PLAIN_MESSAGE);
		
		String passNew = JOptionPane.showInputDialog(
				null,
				"Password:",
				"LOGIN",
				JOptionPane.PLAIN_MESSAGE);
		
		if (userNew.equals(userOld) && passNew.equals(passOld)) {
			
			JOptionPane.showMessageDialog(
					null,
					"Username and Password is Correct! You are now logged In.",
					"Message",
					JOptionPane.PLAIN_MESSAGE);
			
		} else if (!userNew.equals(userOld) && passNew.equals(passOld)) {
			
			JOptionPane.showMessageDialog(
					null,
					"The Username you Entered is Incorrect. Please Try Again.",
					"Message",
					JOptionPane.PLAIN_MESSAGE);
			
		} else {
			
			JOptionPane.showMessageDialog(
					null,
					"The Password you Entered is Incorrect. Please Try Again.",
					"Message",
					JOptionPane.PLAIN_MESSAGE);
			
		} 
		
		again =  JOptionPane.showInputDialog(
				null,
				"Do you want to Try Again?",
				"TRY AGAIN?",
				JOptionPane.PLAIN_MESSAGE);
		
		} while (again.equalsIgnoreCase("yes"));
	}
}
