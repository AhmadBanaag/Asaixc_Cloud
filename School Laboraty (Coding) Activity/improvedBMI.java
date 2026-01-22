package Default;
import javax.swing.JOptionPane;

public class improvedBMI {
	public static void main(String[] args) {
		
		String name = "", gender = "", result = "", bmi_format = "";
		double weight, height, bmi_result;
		int age; 
		
		name = JOptionPane.showInputDialog(
				null,
				"Enter your name:",
				"BMI Calculator",
				JOptionPane.PLAIN_MESSAGE);
		
		age = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Enter your age (years):",
				"BMI Calculator",
				JOptionPane.PLAIN_MESSAGE));
		
		gender = JOptionPane.showInputDialog(
				null,
				"Enter your gender (M/F):",
				"BMI Calculator",
				JOptionPane.PLAIN_MESSAGE);
		
		weight = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Enter your weight (kgs):",
				"BMI Calculator",
				JOptionPane.PLAIN_MESSAGE));
		
		height = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"Enter your height (m):",
				"BMI Calculator",
				JOptionPane.PLAIN_MESSAGE));
		
		bmi_result = weight / (height * height);
		bmi_format = String.format("%.2f", bmi_result);
		
		if (gender.equalsIgnoreCase("M")) {
			if (bmi_result < 20) {
				result = "Underweight";
			} else if (bmi_result >= 20 && bmi_result <= 25) {
				result = "Normal";
			} else if (bmi_result >= 26 && bmi_result <= 30) {
				result = "Overweight";
			} else if (bmi_result >= 31 && bmi_result <= 40) {
				result = "Obese";
			} else {
				result = "Severely Obese";
			}
		} else if (gender.equalsIgnoreCase("F")) {
			if (bmi_result < 19) {
				result = "Underweight";
			} else if (bmi_result >= 19 && bmi_result <= 24) {
				result = "Normal";
			} else if (bmi_result >= 25 && bmi_result <= 30) {
				result = "Overweight";
			} else if (bmi_result >= 31 && bmi_result <= 40) {
				result = "Obese";
			} else {
				result = "Severely Obese";
			}
		} else {
			result = "Error! Please Try Again!";
		}
		
		JOptionPane.showMessageDialog(
				null,
				"BMI Calculator Result" +
				"\nName: " +
				name +
				"\nAge: " +
				age +
				" years old" +
				"\nGender: " +
				gender +
				"\nWeight: " +
				weight +
				" kilograms" +
				"\nHeight: " +
				height +
				" meters" +
				"\nBody Mass Index: " +
				bmi_format +
				" kilograms per meter squared" +
				"\nBMI Meaning: You are " +
				result,
				"BMI Calculator",
				JOptionPane.PLAIN_MESSAGE);
	}
}
