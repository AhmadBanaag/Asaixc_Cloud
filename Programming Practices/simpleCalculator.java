package Default;
import javax.swing.JOptionPane;

public class simpleCalculator {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(
				null,
				"Welcome to Simple Calculator!",
				"Simple Calculator",
				JOptionPane.PLAIN_MESSAGE);
		
		// Operation
		int operation = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Please select an operation!" +
				"\n[1] +" +
				"\n[2] -" +
				"\n[3] *" +
				"\n[4] /", 
				"Simple Calculator",
				JOptionPane.PLAIN_MESSAGE));
		// First Number to Operation
		double num1 = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Enter 1st Number: ",
				"Simple Calculator",
				JOptionPane.PLAIN_MESSAGE));
		// Second Number to Operation
		double num2 = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Enter 2nd Number: ",
				"Simple Calculator",
				JOptionPane.PLAIN_MESSAGE));
		
		if (operation==1) {
			double addition = num1 + num2;
			JOptionPane.showMessageDialog(
					null, 
					"The sum of the numbers is " +
					addition,
					"Simple Calculator",
					JOptionPane.PLAIN_MESSAGE);
		} else if (operation==2) {
			double subtraction = num1 - num2;
			JOptionPane.showMessageDialog(
					null, 
					"The difference of the two numbers is " +
					subtraction,
					"Simple Calculator",
					JOptionPane.PLAIN_MESSAGE);
		} else if (operation==3) {
			double multiply = num1 * num2;
			JOptionPane.showMessageDialog(
					null, 
					"The product of the two numbers is " +
					multiply,
					"Simple Calculator",
					JOptionPane.PLAIN_MESSAGE);
		} else if (operation==4) {
			double divide = num1 / num2;
			JOptionPane.showMessageDialog(
					null, 
					"The quotient of the two numbers is " +
					divide,
					"Simple Calculator",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(
					null, 
					"Invalid Input!",
					"error",
					JOptionPane.PLAIN_MESSAGE);
		}
	}

}
