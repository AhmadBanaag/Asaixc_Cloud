package Default;
import javax.swing.JOptionPane;

public class randomApp1point0 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(
				null,
				"Hello User!",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE);	
		JOptionPane.showMessageDialog(
				null,
				"Welcome to Asaixc App 1.0",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(
				null,
				"This is an app that I'll be building just for FUN!",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(
				null,
				"It will contain anything that I want to do"
				+ "\nusing the things that I learned from school!",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(
				null,
				"LET'S START!",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE);
		
		String again = "";
		
		do {
		
		int pass;
		String username;
	
		username = JOptionPane.showInputDialog(
				null,
				"Enter Username:",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE);
		
		pass = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"Enter Password:",
				"Asaixc App",
				JOptionPane.PLAIN_MESSAGE));
		
		if (username.equals("ahmad") && pass == 987123) {
			
			int num1;
			
			JOptionPane.showMessageDialog(
					null,
					"Please PICK A NUMBER on what you want to USE!",
					"Asaixc App",
					JOptionPane.PLAIN_MESSAGE);
			
			do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog(
					null,
					"[1] Simple CALCULATOR\n[2] School Average CALCULATOR\n[3] Guessing GAME!"
					+ "\n[4] Rock, Paper, Scissors GAME!\n[5] Electric Bill CALCULATOR",
					"Asaixc App",
					JOptionPane.PLAIN_MESSAGE));
			
			switch (num1) {
				
			case 1:
				do {
				double cal_num1, cal_num2, add, subtract, multiply, divide;
				int operation;
				
				operation = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"What operation will you use?\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division",
						"Asaixc App | Simple Calculator",
						JOptionPane.PLAIN_MESSAGE));
				
				cal_num1 = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"Enter your First Number",
						"Asaixc App | Simple Calculator",
						JOptionPane.PLAIN_MESSAGE));
				
				cal_num2 = Integer.parseInt(JOptionPane.showInputDialog(
						null,
						"Enter your Second Number",
						"Asaixc App | Simple Calculator",
						JOptionPane.PLAIN_MESSAGE));
				
				switch (operation) {
				
				case 1:
					add = cal_num1 + cal_num2;
					
					JOptionPane.showMessageDialog(
							null,
							cal_num1 +
							" + " + 
							cal_num2 +
							" = " +
							add + "!",
							"Asaixc App | Sum",
							JOptionPane.PLAIN_MESSAGE);
					break;
				case 2: 
					subtract = cal_num1 - cal_num2;
					
					JOptionPane.showMessageDialog(
							null,
							cal_num1 +
							" - " + 
							cal_num2 +
							" = " +
							subtract + "!",
							"Asaixc App | Difference",
							JOptionPane.PLAIN_MESSAGE);
					break;
					
				case 3:
					multiply = cal_num1 * cal_num2;
					
					JOptionPane.showMessageDialog(
							null,
							cal_num1 +
							" × " + 
							cal_num2 +
							" = " +
							multiply + "!",
							"Asaixc App | Product",
							JOptionPane.PLAIN_MESSAGE);
					break;
				case 4:
					divide = cal_num1 / cal_num2;
					
					JOptionPane.showMessageDialog(
							null,
							cal_num1 +
							" ÷ " + 
							cal_num2 +
							" = " +
							divide + "!",
							"Asaixc App | Quotient",
							JOptionPane.PLAIN_MESSAGE);
				default:
					JOptionPane.showMessageDialog(
							null,
							"Error!",
							"Asaixc App | Simple Cal - ERROR",
							JOptionPane.PLAIN_MESSAGE);
				}
			do {
				again = JOptionPane.showInputDialog(
						null,
						"Do you want use simple calculator again?",
						"Asaixc App | Try Again",
						JOptionPane.QUESTION_MESSAGE);
					} while (!again.equalsIgnoreCase("Yes") && !again.equalsIgnoreCase("No"));
					
				} while (again.equalsIgnoreCase("Yes"));
				
				
				again = JOptionPane.showInputDialog(
						null,
						"Do you want to try the other features?",
						"Asaixc App | Try Again",
						JOptionPane.QUESTION_MESSAGE);
					} while (!again.equalsIgnoreCase("Yes") && !again.equalsIgnoreCase("No"));
			} while (again.equalsIgnoreCase("Yes"));
			
		} else if (!username.equals("ahmad") && pass == 987123) {
			JOptionPane.showMessageDialog(
					null,
					"Access Denied!\nUSERNAME IS INCORRECT!",
					"Asaixc App | Error",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(
					null,
					"Please Try Again!",
					"Asaixc App | Error",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(
					null,
					"The app is still in development, bear with us!\nTHANK YOU!",
					"Asaixc App",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (username.equals("ahmad") && pass != 987123) {
			JOptionPane.showMessageDialog(
					null,
					"Access Denied!\nPASSWORD IS INCORRECT!",
					"Asaixc App | Error",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(
					null,
					"Please Try Again!",
					"Asaixc App | Error",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(
					null,
					"The app is still in development, bear with us!\nTHANK YOU!",
					"Asaixc App",
					JOptionPane.INFORMATION_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(
					null,
					"Access Denied!",
					"Asaixc App | Breaking in?",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(
					null,
					"Please Try Again!",
					"Asaixc App | Breaking in?",
					JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(
					null,
					"The app is still in development, bear with us!\nTHANK YOU!",
					"Asaixc App",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		// Checks if the user wants to try again
		do {
		again = JOptionPane.showInputDialog(
				null,
				"Do you want to try again!",
				"Asaixc App | Try Again",
				JOptionPane.QUESTION_MESSAGE);
		} while (!again.equalsIgnoreCase("Yes") && !again.equalsIgnoreCase("No"));
		
		} while (again.equalsIgnoreCase("Yes"));
	}

}
