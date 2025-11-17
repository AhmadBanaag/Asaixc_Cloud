package Default;

public class varArgs {
	public static void main(String[] args) {
		
		
		/*varargs = allows a method to accept a varying # of arguments 
		 * makes methods more flexible , no need for overloaded methods.
		 * 
		 * ...(ellipsis)
		 * 
		 * 
		 * 
		 */
		
		System.out.println(add(1, 2, 3, 4));
		
		System.out.println(average(3, 2, 1));
		
	}
		
		static int add(int... numbers) {
			
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
		
		static double average(double... numbers) {
			
			double sum = 0;
			
			for (double number : numbers) {
				sum += number;
			}
			
			return sum / numbers.length;
		}

}
