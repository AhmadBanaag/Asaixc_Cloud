package puzzles;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class studentRecord {
	public static void main(String[] args) {
	
		try {
		Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\studentRecord.txt"));
		FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\studentRecord.txt", true);
		
		String choice = "";
		
		do {
			choice = JOptionPane.showInputDialog(
					null,
					"[1] Add Student\n[2] View Students\n[3] Search Student\n[4] Exit",
					"STUDENT RECORDS",
					1);
			
			if (choice.equals("1")) {
				
				String studName = JOptionPane.showInputDialog(
						null,
						"ENTER STUDENT NAME:",
						"STUDENT RECORDS",
						1);
				
				String studID = JOptionPane.showInputDialog(
						null,
						"ENTER STUDENT ID:",
						"STUDENT RECORDS",
						1);
				
				print.write("\nID: " + studID + " | Name: " + studName);
				print.flush(); //SAVES DATA WITHOUT CLOSING PROGRAM
				
			} else if (choice.equals("2")) {
				input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\studentRecord.txt"));
				
				String students = "";
				
				while (input.hasNext()) {
					students += input.nextLine() + "\n---------------------\n";
				}
				
				JOptionPane.showMessageDialog(
						null,
						"List of Students:\n" +
						students,
						"STUDENT RECORDS",
						1);
				
			} else if (choice.equals("3")) {
				input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\studentRecord.txt"));
				
				String findID = JOptionPane.showInputDialog(
						null,
						"--------------------\nENTER STUDENT ID:",
						"STUDENT RECORDS",
						1);
				
				boolean found = false;
				
				while (input.hasNext()) {
					
					String find = input.nextLine();
							
					if(find.contains(findID)) {
						JOptionPane.showMessageDialog(
								null,
								"FOUND STUDENT | " +
								find,
								"STUDENT RECORDS",
								1);
						found = true;
						break;
					} 
				}
				
				if (found == false) {
					JOptionPane.showMessageDialog(
							null,
							"--------------------\nSTUDENT NOT FOUND\n--------------------",
							"STUDENT RECORDS",
							0);
				}
				
				
			} else if (choice.equals("4")) {
				
				JOptionPane.showMessageDialog(
						null,
						"EXITING PROGRAM...",
						"STUDENT RECORDS",
						JOptionPane.PLAIN_MESSAGE);
				
			} else {
				JOptionPane.showMessageDialog(
						null,
						"--------------------\nINVALID INPUT!\n--------------------",
						"STUDENT RECORDS",
						0);
			}
			
		} while(!choice.equals("4"));
		
		input.close();
		print.close();
		
		JOptionPane.showMessageDialog(
				null,
				"THANK YOU FOR USING MY PROGRAM!",
				"STUDENT RECORDS",
				1);
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(
					null,
					"ERROR!\n" +
					e.getMessage(),
					"ERROR FOUND",
					0);
		}
		
	}
}
