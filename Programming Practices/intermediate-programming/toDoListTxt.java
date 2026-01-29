package puzzles;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

//WHAT TO ADD NEXT?
// - introduction 
// - removing a task
// - saving a task without exiting the program


public class toDoListTxt {
	public static void main(String[] args) {
		
	try {
		Scanner input = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\inputsToDoList.txt"));
		FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\inputsToDoList.txt", true);
		
		String choice = "";
		
		String[] listOfTasks = new String[99];
		int count = 0;
		//PUTS INFO IN AN ARRAY 
		for(int i = 0; input.hasNext(); i++) {
			listOfTasks[i] = input.nextLine();
			count++;
		}
		
		do {
			
		choice = JOptionPane.showInputDialog(
				null,
				"[1] Add Tasks\n[2] View your Tasks\n[3] Save Data?",
				"TO-DO-LIST",
				1);
		
		if (choice.equals("1")) {
			String addTask = JOptionPane.showInputDialog(
					null,
					"Enter Task:",
					"ADD-TASKS",
					1);
			
			//PRINTS TASK IN A TEXT FILE
			print.write(addTask + "\n");
		} else if (choice.equals("2")) {
			
			String showTasks = "";
			
			for(int j = 0; j < count; j++) {
				showTasks += "[" + (j + 1) + "] " + listOfTasks[j] + "\n";
			}
			
			System.out.println(showTasks);
			
			//ASSIGNS THE ITEMS OF THE ARRAY TO A VARIABLE
			JOptionPane.showMessageDialog(
					null,
					"Tasks Remaining: " +
					count + 
					"\n" +
					showTasks,
					"TASKS",
					1);
			
		} else if (choice.equals("3")) {
			JOptionPane.showMessageDialog(
					null,
					"DATA SAVED!",
					"TO-DO-LIST",
					1);
			
			JOptionPane.showMessageDialog(
					null,
					"THANK YOU FOR USING OUR APP!",
					"TO-DO-LIST",
					1);
			
		} else {
			JOptionPane.showMessageDialog(
					null,
					"ERROR!\n\n" +
					"ERROR DESCRIPTION:\n" +
					"Invalid Input (Input should be between 1-3)!",
					"ERROR FOUND!",
					0); 
			}
		} while (!choice.equals("3"));
		
		print.close();
		input.close();
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(
				null,
				"ERROR!\n\n" +
				"ERROR DESCRIPTION:\n" +
				e.getMessage(),
				"ERROR FOUND!",
				0
				);
		}	
	}
}
