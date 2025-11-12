package Default;
import java.util.Scanner;

public class forLoopsProblem {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		double subjects, grade, sum = 0, average;
		
		System.out.print("How many subjects do you? ");
		subjects = input.nextInt();
		
		for (int i = 1; i <= subjects; i++) {
			System.out.print("Grade for subject " + i + ": ");
			grade = input.nextInt();
			
			if (grade >= 0 || grade <= 100) {
				sum += grade;
			} else {
				System.out.println("Invalid Grade");
				break;
			}
		}
		
		average = sum / subjects;
		
		System.out.println("Average grade: " + average);
		input.close();
	}
}