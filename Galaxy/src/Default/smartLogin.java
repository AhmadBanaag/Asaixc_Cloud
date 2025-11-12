package Default;
import java.util.Scanner;

public class smartLogin {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = input.nextLine();
		
		System.out.print("Password: ");
		String pass = input.nextLine();
		
		if (name.equalsIgnoreCase("admin") && pass.equals("12345")) {
			System.out.println("Login Succesful");
			
			System.out.println("\nPlease choose an Option:");
			System.out.println("[1] Calculate String Length.");
			System.out.println("[2] Convert to UPPERCASE.");
			System.out.println("[3] Check if string starts with an A.");
			System.out.println("[4] Arithmetic: Multiply two numbers.");
			System.out.println("[5] Exit");
			int choice = input.nextInt();
			
			System.out.println("\nInput: " + choice);
			
			switch (choice) {
				case 1:
					System.out.println("Enter a word: ");
					String word5 = input.next();
					System.out.println("Length of Word: " + word5.length());
				break;
				
				case 2:
					System.out.println("\nEnter a word: ");
					String word1 = input.next();
					System.out.println("Here's your word: " + word1.toUpperCase());
				break;
				
				case 3:
					System.out.println("\nEnter a word: ");
					String startA = input.next();
					
					if (startA.startsWith("A")) {
						System.out.println("Your word \"" + startA + "\"," + " starts with a letter A.");
					}
					else if (startA.startsWith("a")) {
						System.out.println("Your word \"" + startA + "\"," + " starts with a letter a.");
					}
					else {
						System.out.println("Your word \"" + startA + "\"," + " does not start with a letter A/a.");
					}
				break;
				
				case 4:
					System.out.println("\nEnter a number: ");
					double num1 = input.nextDouble();
					
					System.out.println("\nEnter another numbers: ");
					double num2 = input.nextDouble();
					
					double result = num1 * num2;
					
					System.out.println("Results: " + num1 + " * " + num2 + " = " + result);
				break;
				
				case 5:
					System.out.println("\nGoodbye!");
				break;
				
				default:
					System.out.println("Invalid Option!");
			}
	
		} else if (!name.equalsIgnoreCase("admin") && pass.equals("12345")) {
			System.out.println("Unknown User!");
			
		} else if (name.equals("admin") && !pass.equals("12345")) {
			System.out.println("Incorrect Password!");
			
		} else if (!name.equalsIgnoreCase("admin") && !pass.equals("12345")) {
			System.out.println("Access Denied!");
			
		}
		input.close();
	}

}
