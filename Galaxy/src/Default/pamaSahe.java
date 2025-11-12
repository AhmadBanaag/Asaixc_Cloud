package Default;
import java.util.Scanner;

public class pamaSahe {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String passengerType; 
		
		System.out.print("Ano ngalan mo? ");
		String name = input.nextLine();
		
		System.out.println("Hi, " + name);
		System.out.println("Unsa man aton?");
		
		System.out.println("[1] Senior Citizen (15%)" + "\n[2] PWD (10%)" + "\n[3] Regular");
		passengerType = input.nextLine();
		
		if (passengerType.equals("1")) {
			System.out.println("Hi!");
			
		}
		
		System.out.println("Passenger Type: " + passengerType);
		
		System.out.println("[1] Libungan - 30 Php" + "\n[2] Midsayap - 40 Php");
		String route = input.nextLine();
		
		switch (route) {
		
		
		}
		
		input.close();
		
				
				
				
		}
				
	}

