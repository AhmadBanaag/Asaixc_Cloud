package Default;
import java.util.Scanner;

public class emailChecker {
	public static void main(String[] Ahmadmain) {
		
		String email;
		String domain;
		String username;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Email: ");
		
		email = input.nextLine();
		
		if (email.contains("@")) {
			domain = email.substring(0, email.indexOf("@"));
			username = email.substring(email.indexOf("@") + 1);
			
			System.out.println("Domain: " + domain + "\n" + "Username: " + username);
		}
		else {
			System.out.println("Email must contain a '@' to proceed.");
			
		}
		
		System.out.println("Thank you for checking with us!");
		
		input.close();
	}
}
