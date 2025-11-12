package Default;
import javax.swing.JOptionPane;

public class print_f {
	public static void main(String[] args) {
		
		//printf - to format output
		// String.format
		
		String name = "Spiderman"; // %s 
		char first_letter = 's'; // %c
		int age = 30; // %d
		double height = -600000.5; // %f and if want to limit the decimal places, add (.1 or .2 before after the percent sign.
		boolean isEmployed = false; // %b
		
		/* For double
		 * + - output a plus sign for positive numbers
		 * , - output grouping separators
		 * ( - negatives numbers are enclosed in ()
		 * space - display a minus if negative, space if positive
		 * 
		 * For int or double
		 * 0 - zero padding (%04.4f)
		 * number - right justified padding
		 * negative number - left justified padding
		 */
		
		System.out.printf("Hello %s\n", name);
		System.out.printf("Your name starts with %c\n", first_letter);
		System.out.printf("Your age is %d Year's old\n", age);
		System.out.printf("You height is %,.1f cm\n", height);
		
		System.out.printf("%d Before this is a number", age);
		
		//Example of using a string format in JOptionPane
		
		String str = String.format("Hello %S\n", name);
		JOptionPane.showMessageDialog(
				null,
				str,
				"title",
				JOptionPane.PLAIN_MESSAGE);
		
		if(isEmployed) {
			System.out.print("Bayot ka!");
		}
		else {
			System.out.println("Pogi tayo");
		}
		
		
	}

}
