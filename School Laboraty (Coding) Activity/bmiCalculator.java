package Default;
import javax.swing.JOptionPane;

public class bmiCalculator {
	public static void main(String[] args) {
		
		// 2nd Laboratory Activity = Fundamentals of Programming
		
		//Name
		String name = JOptionPane.showInputDialog(null, "Get name: ", "NAME", JOptionPane.PLAIN_MESSAGE);
		
		//Age
		String age = JOptionPane.showInputDialog(null, "Get Age: ", "AGE", JOptionPane.PLAIN_MESSAGE);
		
		double weight, height, bmi;
		
		//Weight
		weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Get Weight (kg): ", "WEIGHT", JOptionPane.PLAIN_MESSAGE));
		
		//Height
		height = Double.parseDouble(JOptionPane.showInputDialog(null, "Get Height (m): ", "HEIGHT", JOptionPane.PLAIN_MESSAGE));
	
		//BMI Formula
		bmi = weight / (height * height);
		
		//Result
		JOptionPane.showMessageDialog(
				null,
				"BMI Calculator Result" +
				"\nName: " +
				name + 
				"\nAge: " +
				age +
				" years old" +
 				"\nWeight: " + 
				weight +
				" kilograms" +
				"\nHeight: " +
				height + 
				" meters" +
				"\nBody Mass Index: " +
				bmi +
				" kilograms per meters squared",
				"Body Mass Index", 
				JOptionPane.PLAIN_MESSAGE
				);
	}

}
