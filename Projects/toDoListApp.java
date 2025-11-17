package Default;
import javax.swing.JOptionPane;

public class toDoListApp {
	public static void main(String[] args) {
		
		String[] taskStorage = new String[50]; // Limit of Tasks
		int tasksCounter = 0, removeTasks, markTasks;
		boolean[] done = new boolean[50]; 
		String again = "N"; // Used for Repetition 
		
		JOptionPane.showMessageDialog(
				null,
				"Welcome to Asaixc To-Do-List!",
				"To-Do-List",
				JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(
				null,
				"NOTE: This App Can Only Take 50 Tasks!",
				"To-Do-List | NOTE",
				JOptionPane.WARNING_MESSAGE);
		
		do {
		String displayTasks = "";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"What To Do?" +
				"\n[1] Check Remaining Tasks" +
				"\n[2] Add Task" +
				"\n[3] Remove Task" +
				"\n[4] Mark Task" +
				"\n[5] Exit",
				"To-Do-List",
				JOptionPane.INFORMATION_MESSAGE));
		
		switch (choice) {
		
		case 1: // Remaining Tasks
			
			if(tasksCounter > 0) {
			JOptionPane.showMessageDialog(
					null,
					"Here are your remaining tasks!",
					"To-Do-List | Remaining Tasks",
					JOptionPane.PLAIN_MESSAGE);
			
			for (int i = 0; i < tasksCounter; i++) {
				displayTasks += (i + 1) + ". " + taskStorage[i] + " [" + (done[i] ? "NOT DONE" : "DONE") + "]\n" ;  
			}
		
			JOptionPane.showMessageDialog(
					null,
					displayTasks,
					"To-Do-List | Tasks Remaining",
					JOptionPane.PLAIN_MESSAGE);
		
			} else {
				JOptionPane.showMessageDialog(
						null,
						"You Already Finished your Tasks.",
						"To-Do-List | Tasks Finished",
						JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(
						null,
						"How About Adding New Tasks?",
						"To-Do-List | Tasks Finished",
						JOptionPane.QUESTION_MESSAGE);
			}
			break;
			
		case 2: // Add Tasks
			if (tasksCounter < 50 ) {
				String task = JOptionPane.showInputDialog(
						null, 
						"Add a Task:",
						"To-Do-List | Add Tasks",
						JOptionPane.PLAIN_MESSAGE);
				taskStorage[tasksCounter] = task;
				done[tasksCounter] = true;
				tasksCounter++; 
			} else {
				JOptionPane.showMessageDialog(
						null,
						"ERROR! \nFINISH OTHER TASKS BEFORE ADDING NEW TASKS",
						"To-Do-List | LIMIT EXCEEDED",
						JOptionPane.WARNING_MESSAGE);
			}
			break;
			
		case 3: // Remove Tasks
			
			if(tasksCounter > 0) {
				JOptionPane.showMessageDialog(
						null,
						"Removing Tasks?",
						"To-Do-List | Remove Task",
						JOptionPane.PLAIN_MESSAGE);
				
				JOptionPane.showMessageDialog(
						null,
						"Type the Number of the Task that you want to Remove",
						"To-Do-List | Remove Task",
						JOptionPane.INFORMATION_MESSAGE);
				
				for (int i = 0; i < tasksCounter; i++) {
					displayTasks += (i + 1) + ". " + taskStorage[i] + " [" + (done[i] ? "NOT DONE" : "DONE") + "]\n" ;  
				}
				
			    removeTasks = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						displayTasks,
						"To-Do-List | Remove Task",
						JOptionPane.INFORMATION_MESSAGE));
				
				for(int i = 0, j = 0; i < tasksCounter; i++) {
					if (i != removeTasks - 1) {
						taskStorage[j++] = taskStorage[i];
						done[removeTasks - 1] = done[j--];
					}
				}
			
				tasksCounter--;
				} else {
					JOptionPane.showMessageDialog(
							null,
							"You Already Finished your Tasks.",
							"To-Do-List | Tasks Finished",
							JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(
							null,
							"How About Adding New Tasks?",
							"To-Do-List | Tasks Finished",
							JOptionPane.QUESTION_MESSAGE);
				}
		break;
		
		case 4: // Marked Tasks
			
			if(tasksCounter > 0) {
			JOptionPane.showMessageDialog(
					null,
					"Mark Tasks Done by Typing the Number of the Task",
					"To-Do-List | Tasks Done?",
					JOptionPane.PLAIN_MESSAGE);
			
			for (int i = 0; i < tasksCounter; i ++) {
				displayTasks += (i + 1) + ". " + taskStorage[i] + " [" + (done[i] ? "NOT DONE" : "DONE") + "]\n" ;  
			}
			markTasks = Integer.parseInt(JOptionPane.showInputDialog(
					null,
					displayTasks,
					"To-Do-List | Tasks Done?",
					JOptionPane.PLAIN_MESSAGE));
			
			done[markTasks - 1] = false;
			} else {
				JOptionPane.showMessageDialog(
						null,
						"You Already Finished your Tasks.",
						"To-Do-List | Tasks Finished",
						JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(
						null,
						"How About Adding New Tasks?",
						"To-Do-List | Tasks Finished",
						JOptionPane.QUESTION_MESSAGE);
			}
			break;
			
		case 5: // Exit Program
			
			again = JOptionPane.showInputDialog(
					null, 
					"Do you really want to exit?\n[Y] or [N]",
					"To-Do-List | Program Closing?",
					JOptionPane.PLAIN_MESSAGE);
			break;
			
		default:
			
			JOptionPane.showMessageDialog(
					null,
					"ERROR! INVALID INPUT!",
					"To-Do-List | INVALID INPUT",
					JOptionPane.WARNING_MESSAGE);
		}
		
		} while (!again.equalsIgnoreCase("y"));
		
		JOptionPane.showMessageDialog(
				null,
				"Exiting Program....",
				"To-Do-List | Bye",
				JOptionPane.PLAIN_MESSAGE); 
		
	}
}
