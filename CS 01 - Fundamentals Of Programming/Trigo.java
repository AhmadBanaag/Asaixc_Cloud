package Default;
import java.util.Scanner;

public class Trigo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double exponent = 2.0;
			
		System.out.print("What's side A? ");
		double sideA = input.nextDouble();
		
		System.out.print("What's side B? ");
		double sideB = input.nextDouble();

		System.out.print("What's side C? ");
		double sideC = input.nextDouble();
		
		double powerA = Math.pow(sideA, exponent);
		
		double powerB = Math.pow(sideB, exponent);
		
		double powerC = Math.pow(sideC, exponent); 
		
		// Angle A = b^2 = c^2 + c^2 - 2(bc) 
		
		double angleA = powerB + powerC / -(2*(sideB * sideC));
		
		// Angle B = a^2 + c^2 - 2(ab)  
		double angleB = powerA + powerC / -(2*(sideA * sideC));
		
		// Angle C = a^2 + b^2 - 2(ab)
		double angleC = powerA + powerB / -(2*(sideA * sideB));
		
		// Sum of all angles
		double sum = angleA + angleB + angleC;
		System.out.println(sum);
		
		// to be continued 
		
		input.close();
		
	}
}
