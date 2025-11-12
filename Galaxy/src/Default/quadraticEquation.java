package Default;
import javax.swing.JOptionPane;

public class quadraticEquation {
	public static void main(String[] args) {
		
		double coefficientA = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Input First Coefficient: ",
				"Quadratic Formula Calculator",
				JOptionPane.PLAIN_MESSAGE));
		double coefficientB = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Input Second Coefficient: ",
				"Quadratic Formula Calculator",
				JOptionPane.PLAIN_MESSAGE));
		double coefficientC = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Input Third Coefficient: ",
				"Quadratic Formula Calculator",
				JOptionPane.PLAIN_MESSAGE));
		//Calculating the discriminant
		double discriminant = (Math.pow(coefficientB, 2)) - (4 * (coefficientA * coefficientC));
		
		// Calculating the roots
		double root1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
		double root2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
		
		JOptionPane.showMessageDialog( 
				null,
				"The two roots are: " + 
				root1 +
				" and " + 
				root2,
				"Quadratic Formula Calculator",
				JOptionPane.PLAIN_MESSAGE);
		
	}

}
