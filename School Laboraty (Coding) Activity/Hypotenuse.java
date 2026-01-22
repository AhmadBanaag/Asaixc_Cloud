package Default;
import java.util.Scanner;

public class Hypotenuse {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What's side a? ");
		double sideA = input.nextDouble();
		
		System.out.print("What's side b? ");
		double sideB = input.nextDouble();
		
		double c = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		
		System.out.println("The hypotune of a right triangle is " + c + " inch");	
		
		input.close();
	}

}
