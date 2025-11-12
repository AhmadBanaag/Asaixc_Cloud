package Default;
import java.util.Scanner;

public class salaryCalculator {
	public static void main(String[] args) {
		
		// 1st Laboratory Activity = Fundamentals of Programming 
		Scanner input  = new Scanner(System.in);
		
		String Name;
		int Days;
		
		System.out.print("What's the Employee's Name? "); // Take the employees Name
		Name = input.nextLine();
		
		System.out.print("For how long did you work? (in days): "); // How long did the employee worked
		Days = input.nextInt();
		
		int dailyRate = 500;
		int philHealth = 220;
		int SSS = 330;
		
		int monthlySalary = (dailyRate * Days) - (philHealth + SSS); // Formula for monthly salary
		
		System.out.println("Name: " + Name + "\n" + "Net Monthly Salary: " + "Php " + monthlySalary);
		
		input.close();
	}
}