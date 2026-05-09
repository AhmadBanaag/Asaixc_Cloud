package puzzles;
import java.util.Scanner;

public class studentScoreAnalyzer {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numOfStudents = new int[5], passingGrades = new int[5];
		String failingStudents = "";
		int highest = 0;
		int lowest = 100;
		double average = 0;
		int passedCounter = 0;
		int increasingOrder = 0;
		int orderCondition = 0;
		String order = "";
		
		for(int i = 0; i < numOfStudents.length; i++) {
			System.out.printf("\nEnter Grade of Student #%d: ", i + 1);
			numOfStudents[i] = input.nextInt();
			
			average += numOfStudents[i];
			
			if(numOfStudents[i] > increasingOrder) {
				increasingOrder = numOfStudents[i];
				orderCondition++;
				if(orderCondition == 5) {
					order = "Yes";
				} else {
					order = "No";
				}
			} 
			
			if(highest < numOfStudents[i]) {
				highest = numOfStudents[i];
			}
	
			if(lowest > numOfStudents[i]) {
				lowest = numOfStudents[i];
			}
			
			if(numOfStudents[i] > 75) {
				passedCounter++;
			} else  {
				failingStudents += numOfStudents[i] + " ";
			}
			
			if(numOfStudents[i] > 75) {
			passingGrades[i] = numOfStudents[i];
			}
			
		}
		
		average /= 8;
		
		int aboveAverage = 0;
		
		for(int numOfStud : numOfStudents) {	
			if(numOfStud > average) {
				aboveAverage++;
			}
		}
		
		System.out.printf("\nHighest Score: %d\nLowest Score: %d\nAverage Score: %f\nPassed Students: %d\nFailing Score/s: %s\nScores above average: %d\nStrictly increasing order? %s\nPassing scores array: [", highest, lowest, average, passedCounter, failingStudents, aboveAverage, order);
		
		for(int i = 0; i < passingGrades.length; i++) {
			System.out.print(passingGrades[i]);
				if(i < 4) {
					System.out.print(" ");
				}
		}
		System.out.println("]");
		
		input.close();
	}
}
