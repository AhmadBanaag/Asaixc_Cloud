package Default;
import java.util.Scanner;

public class arrayStudentGradeManager {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char again;
		
		do {
		System.out.print("Number of Students: ");
		int studentSize = input.nextInt();
		
		int[] allStudents = new int[studentSize];
		
		for(int i = 0; i < allStudents.length; i++) {
			System.out.print("Average Grade of Student #" + (i + 1) + ": ");
			allStudents[i] = input.nextInt();
		}
		
		System.out.print("Access: \n[A] All Average Grades Entered\n[B] Average Grade of all Students\n[C] Highest Grade\n[D] Lowest Grade\n[E] Exit\nChoice: ");
		char choice1 = input.next().charAt(0);
		
		char choice = Character.toUpperCase(choice1); 
		
		switch(choice) {
		case 'A':
			System.out.println("\n=== Average Grade of EACH Students ===\n");
				for(int i = 0; i < allStudents.length ; i++) {
				System.out.println("Average Grade of Student #" + (i + 1) + ": " + allStudents[i]);
				}
			break;
		case 'B':
			
			double studentAverage = 0;
		
			System.out.println("\n=== AVERAGE Grade of ALL Students ===\n");	
				for (int student : allStudents) {
					studentAverage += student;
				}
				
			studentAverage /= studentSize;
			
			System.out.printf("The AVERAGE Grade from all " + studentSize + " students: " + "%.1f\n", studentAverage);
			break;
		case 'C':
			System.out.println("\n=== HIGHEST Average Grade among ALL the Students ===\n");
		
			int highest = 0;
			int positionHighest = 0;
			
			for(int i = 0; i < allStudents.length; i++)  {
				if (allStudents[i] > highest) {
					highest = allStudents[i];
					positionHighest = (i + 1);
				}
			}
			System.out.println("The HIGHEST Grade among all the students is from Student #" + positionHighest + ": " + highest);
		
			break;
		case 'D':
			System.out.println("\n=== LOWEST Average Grade among ALL the Students ===\n");
		
			int lowest = 100;
			int positionLowest = 0;
		
			for(int i = 0; i < allStudents.length; i++) {
				if (allStudents[i] < lowest) {
					lowest = allStudents[i];
					positionLowest = i + 1;
				}
			}
			System.out.println("The LOWEST Grade among all the student is from Student #" + positionLowest + ": " + lowest);
	
			break;
		case 'E':
			System.out.println("Exiting Program...");
			break;
		default:
			System.out.println("! Invalid Input !");
			break;
		}
		
		System.out.println("\nDo you want to try the program again?\n[Y] or [N]");
		again = input.next().charAt(0);
		
		} while (again == 'y' || again == 'Y');
		
		System.out.println("===Have A Good Day!===");
		
		input.close();
	}

}
