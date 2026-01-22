package Default;
import javax.swing.JOptionPane;
import java.util.Arrays;	

public class cs01Assignment5 {
	public static void main(String[] args) {
		
	String[] names = new String[10];
	int count = 0;
	
	for(int i = 0; i < names.length; i++) {
		names[i] = JOptionPane.showInputDialog(
				null,
				"Enter name #" + (i + 1) + ":",
				"Student's Name",
				JOptionPane.PLAIN_MESSAGE);	
	}

	String nameCount = JOptionPane.showInputDialog(
			null,
			Arrays.toString(names) +
			"\nPick a Name to be Counted:",
			"Count Name",
			JOptionPane.PLAIN_MESSAGE); 
		
	for(int i = 0; i < names.length; i++) {
		if (nameCount.equals(names[i])) {
			count++;
		}
	}
	
	JOptionPane.showMessageDialog(
			null,
			"The name \"" +
			nameCount +
			"\" appeared " +
			count +
			" times in the list.",
			"Count Appearance",
			JOptionPane.INFORMATION_MESSAGE);

	}
}
