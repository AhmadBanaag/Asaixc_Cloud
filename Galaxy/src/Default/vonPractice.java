package Default;
import java.util.Scanner;

/*
 * Write the input of a average grade (0–100). Based on the grade, output the corresponding letter grade using the following rules:

90–100 → A

80–89 → B

70–79 → C

60–69 → D

Below 60 → F

Additionally:

If the grade is exactly 100, print "Perfect Score!"

If the grade is below 0 or above 100, print "Invalid grade input!"
 */

public class vonPractice {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pila grade nimo? ");
		int grade = input.nextInt();
		
		if (grade>101 || grade<0) {
			System.out.println("Invalid grade input");
		}
		else if (grade==100) {
			System.out.println("Perfect Score");
		}
		 else if (grade>90) {
			System.out.println("A");
		}
		else if (grade>80) {
			System.out.println("B");
		}
		else if (grade>70) {
			System.out.println("C");
		}
		else if (grade>60) {
			System.out.println("D");
		}
		else if (grade<60) {
			System.out.println("F");
		}
		
		input.close();
		 
	}
}