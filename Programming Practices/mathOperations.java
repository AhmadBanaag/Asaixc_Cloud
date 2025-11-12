package Default;
import java.lang.Math;

public class mathOperations {
	public static void main(String[] args) {
		
		/*
		 *  Math.floor () - Round down
		 *  Math.ceil () - Round up
		 *  Math.abs() - convert negative values to positive
		 *  Math.floorDiv() - round down to the nearest negative integer 
		 *  Math.max() - return the BIGGEST among two values 
		 *  Math.min() - return the SMALLEST among the two values
		 *  Math.round() - normal math rule of rounding.
		 *  Math.random() - returns a value of a random floating number between 0 and 1. 
		 * 	Math.exp() - return a Euler's number
		 * 	Math.log() - provides the logarithm of the given parameter.
		 * 	Math.pow() - takes two parameter, the x for the whole value and the y for the power.
		 * 	Math.sqrt() - calculates the square root of the parameter given to it.
		 * 
		 * */
		
		double result3 = Math.floorDiv(-100,9);
		System.out.println("result3: " + result3);
		
		double random = Math.random() * 100F;
		System.out.println(random);
	}

}
