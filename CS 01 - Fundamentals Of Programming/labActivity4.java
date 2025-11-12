package Default;
import javax.swing.JOptionPane;

public class labActivity4 {
	public static void main(String[] args) {
		
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"What's your number?",
				"Posi or Nega",
				JOptionPane.PLAIN_MESSAGE));
		
		if (num < 0) {
			JOptionPane.showMessageDialog(
					null,
					"The input number is " +
					num +
					" is NEGATIVE",
					"Posi or Nega",
					JOptionPane.PLAIN_MESSAGE);
		} else if (num > 0) {
			JOptionPane.showMessageDialog(
					null,
					"The input number is " +
					num +
					" is POSITIVE",
					"Posi or Nega",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(
					null,
					"The input number is " +
					num +
					" is between POSITIVE and NEGATIVE numbers",
					"Posi or Nega",
					JOptionPane.PLAIN_MESSAGE);
		}
	}

}
