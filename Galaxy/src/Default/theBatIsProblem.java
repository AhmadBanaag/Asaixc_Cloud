package Default;
import javax.swing.JOptionPane;

public class theBatIsProblem {
	public static void main(String[] args) {
		
		double passingRate, numericalEquivalent = 0, exam, quiz, assign, examGrade = 0, quizLoop, quizGrade = 0, sumOfAllGrade, quizAverage = 0, assignLoop, assignGrade = 0, assignAverage = 0;
		int again = 0;
		String result = ""; 
		
		do {
		exam = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Enter exam percentage:",
				"Grade Workssheet",
				JOptionPane.PLAIN_MESSAGE));
		quiz = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Enter quiz percentage:",
				"Grade Workssheet",
				JOptionPane.PLAIN_MESSAGE));
		assign = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Enter assignment percentage:",
				"Grade Workssheet",
				JOptionPane.PLAIN_MESSAGE));
		
		sumOfAllGrade = exam + quiz + assign;
		
		if (sumOfAllGrade == 100) {
			
			examGrade = Double.parseDouble(JOptionPane.showInputDialog(
					null,
					"Enter exam grade:",
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE));
			
			quizLoop = Double.parseDouble(JOptionPane.showInputDialog(
					null,
					"How many quizzes did you have:",
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE));
			
			for(int i = 1; i <= quizLoop; i++) {
				quizGrade += Double.parseDouble(JOptionPane.showInputDialog(
						null,
						"Enter quiz " + i + " grade:",
						"Grade Workssheet",
						JOptionPane.PLAIN_MESSAGE));
					} 
			
			quizAverage = quizGrade / quizLoop;
		
			JOptionPane.showMessageDialog(
					null,
					"Average Grade for Quiz is " +
					quizAverage,
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE);
			
			assignLoop = Double.parseDouble(JOptionPane.showInputDialog(
					null,
					"How many assignments did you have:",
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE));
			
			for(int i = 1; i <= assignLoop; i++) {
				assignGrade += Double.parseDouble(JOptionPane.showInputDialog(
						null,
						"Enter quiz " + i + " grade:",
						"Grade Workssheet",
						JOptionPane.PLAIN_MESSAGE));
					}
	
			assignAverage = assignGrade / assignLoop;
			
			JOptionPane.showMessageDialog(
					null,
					"Average Grade for Assignments is " +
					assignAverage,
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE);
			
			numericalEquivalent = Math.round((examGrade * (exam / 100)) + (quizAverage * (quiz / 100)) + (assignAverage * (assign / 100)));
			
			if (numericalEquivalent >= 98 && numericalEquivalent <= 100) {
				passingRate = 1.0;
				result = "PASSED";
			} else if (numericalEquivalent >= 95 && numericalEquivalent <= 97) {
				passingRate = 1.25;
				result = "PASSED";
			} else if (numericalEquivalent >= 92 && numericalEquivalent <= 94) {
				passingRate = 1.5;
				result = "PASSED";
			} else if (numericalEquivalent >= 89 && numericalEquivalent <= 91) {
				passingRate = 1.75;
				result = "PASSED";
			} else if (numericalEquivalent >= 86 && numericalEquivalent <= 88) {
				passingRate = 2.0;
				result = "PASSED";
			} else if (numericalEquivalent >= 83 && numericalEquivalent <= 85) {
				passingRate = 2.25;
				result = "PASSED";
			} else if (numericalEquivalent >= 80 && numericalEquivalent <= 82) {
				passingRate = 2.5;
				result = "PASSED";
			} else if (numericalEquivalent >= 77 && numericalEquivalent <= 79) {
				passingRate = 2.75;
				result = "PASSED";
			} else if (numericalEquivalent >= 75 && numericalEquivalent <= 76) {
				passingRate = 3.0;
				result = "PASSED";
			} else if (numericalEquivalent < 75) {
				passingRate = 5.0;
				result = "FAILED";
			} else {
				JOptionPane.showMessageDialog(
						null,
						"Grade invalid!",
						"Grade Workssheet",
						JOptionPane.PLAIN_MESSAGE);
						continue;
			}
			
			JOptionPane.showMessageDialog(
					null,
					"Numerical Equivalent is " +
					numericalEquivalent,
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE);
			
			JOptionPane.showMessageDialog(
					null,
					"Rating: " +
					passingRate,
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE);
			
			JOptionPane.showMessageDialog(
					null,
					result,
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(
					null,
					"The GRADING SYSTEM should be exactly 100.0!",
					"Grade Workssheet",
					JOptionPane.PLAIN_MESSAGE);
			}
		
		again = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Try Again?" +
				"\n[1] Yes" +
				"\n[2	] No",
				"Grade Workssheet",
				JOptionPane.PLAIN_MESSAGE));
		
		} while (again == 1);
	} 
}
