package allAboutJ.writingAndReading;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class mailListing {
	
	static void showMessage(){
		JOptionPane.showMessageDialog(
				null,
				"                  Welcome to Mail Lister!",
				"MAIL LISTING",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream print = new PrintStream("C:\\Users\\Ahmad Banaag\\Documents\\textFiles\\mailingList.txt");
		
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
		
		String output = "Name: " + name + "\nPhone Number: " + phoneNum + "\nCurrent Address: " + address + "\nEmail Address: " + emailAdd;
		
		print.println(output);
		
		JOptionPane.showMessageDialog(
				null,
				"DATA SAVED!",
				"MAIL LISTING",
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
