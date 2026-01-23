package allAboutJ.writingAndReading;
import javax.swing.JOptionPane;
import java.io.*;


public class writeIO {
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream diskWriter = new PrintStream("C:\\Users\\Ahmad Banaag\\Documents\\textFiles\\textFiles.txt");
	
		double unitPrice = Double.parseDouble(JOptionPane.showInputDialog(
				null, 
				"Please input UNIT PRICE of product: ", 
				"UNIT PRICE",
				JOptionPane.PLAIN_MESSAGE));
		
		int quantity = Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"Please input QUANTITY of product: ", 
				"UNIT PRICE",
				JOptionPane.PLAIN_MESSAGE));
		
		double total = quantity * unitPrice;
	
		String output = "Unit Price: " + unitPrice + " pesos\nQuantity: " + quantity + 
						" pieces\nTotal: " + total +" pesos";
		diskWriter.println(output);
		
		JOptionPane.showMessageDialog(
				null,
				output,
				"OUTPUT",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}
}
