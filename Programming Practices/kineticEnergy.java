package Default;
import java.util.Scanner;

public class kineticEnergy {
	public static void main(String[] args) {
		
		// 3rd Laboratory Activity = Fundamentals of Programming
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("What kind of an object is it? ");
		String object = input.nextLine();
		
		System.out.print("What is the mass of your " + object + "? (in kilograms) ");
		double mass = input.nextDouble();
		
		System.out.print("Whaat is the velocity of your " + object + "? (m/s) " );
		double velocity = input.nextDouble();
		
		double kineticEnergy = (0.5 * mass * (velocity * velocity));
		
		System.out.println("The kinetic energy of your " + object + " with a mass of " + mass + " kilograms and a velocity of " + velocity + " m/s" + " is " + kineticEnergy + " Joules."  );
		
		input.close();
	}

}
