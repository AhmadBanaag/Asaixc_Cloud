package allAboutJ.writingAndReading;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class mailListingWithAppend {
	
	static void showMessage(){
		JOptionPane.showMessageDialog(
				null,
				"                  Welcome to Mail Lister!",
				"MAIL LISTING",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		
		try {
			FileWriter print = new FileWriter(
					"C:\\Users\\Ahmad Banaag\\Documents\\textFiles\\mailingList.txt", 
					true);
		
		showMessage();
		
		String name = JOptionPane.showInputDialog(
				null,
				"Enter your name: ",
				"MAIL LISTING",
				JOptionPane.PLAIN_MESSAGE);
		
		String phoneNum = JOptionPane.showInputDialog(
				null,
				"Enter your phone number: ",
				"MAIL LISTING",
				JOptionPane.PLAIN_MESSAGE);
		
		String address = JOptionPane.showInputDialog(
				null,
				"Enter your current address: ",
				"MAIL LISTING",
				JOptionPane.PLAIN_MESSAGE);
		
		String emailAdd = JOptionPane.showInputDialog(
				null,
				"Enter your email address: ",
				"MAIL LISTING",
				JOptionPane.PLAIN_MESSAGE);
		
		print.write(
				"\n" +
				"Name: " + name + 
				"\nPhone Number: " + phoneNum + 
				"\nCurrent Address: " + address + 
				"\nEmail Address: " + emailAdd);
		
		print.close();
		}
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(
					null,
					"Error Description: \n" + 
					e.getMessage(), 
					"ERROR",
					2);
		}
		
		finally {
			JOptionPane.showMessageDialog(
				null,
				"DATA SAVED!",
				"MAIL LISTING",
				JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

