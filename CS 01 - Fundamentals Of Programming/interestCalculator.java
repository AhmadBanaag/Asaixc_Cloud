package Default;
import java.util.Scanner;

public class interestCalculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double principal;
		double interest;
		int times;
		int years;
		
		System.out.print("Enter the principal amount: $");
		principal = input.nextDouble();
		
		System.out.print("Enter the interest rate: ");
		interest = input.nextDouble();
		
		System.out.print("Enter the # of times compounded per year: ");
		times = input.nextInt();
		
		System.out.print("Enter the # of years: ");
		years = input.nextInt();
		
		double interest2 = interest / 100; 
		
		double power = times * years; 
		
		double results = (principal * (Math.pow(1 + (interest2 / times), power))); 
		
		System.out.printf("The amount of interest after %d year is $ %.2f\n", years, results);
		
		input.close();
		
	}

}
