package Default;
import javax.swing.JOptionPane;

public class loopsProblemMain {
	public static void main(String[] args) {
	
			int num, result = 1;
			
			num = Integer.parseInt(JOptionPane.showInputDialog(
					null,
					"Enter N:",
					"Factorial Calculator",
					JOptionPane.PLAIN_MESSAGE));
			
			for (int i = num; i >= 1; i--) {
				result *= i;
			}
			JOptionPane.showMessageDialog(
					null,
					"Factorial of " +
					num +
					"!" +
					" is equals to " +
					result,
					"Factorial Calculator",
					JOptionPane.PLAIN_MESSAGE);
	}
}
