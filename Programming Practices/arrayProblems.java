package Default;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class arrayProblems {
	public static void main(String[] args) {
		
		int arraySize = Integer.parseInt(JOptionPane.showInputDialog(
				"Enter Array Size"));
		
		JOptionPane.showMessageDialog(
				null,
				"Enter the following Elements!");
		
		int[] element = new int[arraySize];
		
		for(int i = 0; i < element.length; i++) {
			element[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter Element #" + (i + 1) + ":"));
		}
		
		int[] oldElements = Arrays.copyOf(element, element.length);
		
		int oldValue = Integer.parseInt(JOptionPane.showInputDialog(
				"Enter Value to Replace:"));
		
		int newValue = Integer.parseInt(JOptionPane.showInputDialog(
				"Enter New Value:"));
		
		for(int i = 0; i < arraySize; i++) {
			if(element[i] == oldValue) {
				element[i] = newValue;
			}
		}
		
		String Old = "";
		String New = "";
		
		for(int oldElement : oldElements) { 
			Old += oldElement + " ";
			}
		
		JOptionPane.showMessageDialog(
				null,
				"Array before Replacement:\n" +
				Old);
		
		for(int newElement : element) {
			New += newElement + " ";
		}
			JOptionPane.showMessageDialog(
					null,
					"Array after Replacement:\n" +
					New);	
			
		}
	}