package puzzles;
import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;



public class RPSMain {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int again = 1;
		
		System.out.println("==========================");
		System.out.println("ROCK, PAPERS, AND SCISSORS");
		System.out.println("==========================");
		
		System.out.print("[1] START\n[2] EXIT\n\nCHOICE: ");
		int choice = input.nextInt();
		
		do {
		
		switch(choice) {
		
		case 1: 
			
			System.out.println("\n==========================");
			
			int i = 0;
			
			while (i < 10) {
				
				RPSDecision decision = new RPSDecision();
				
				decision.setAtkDecision();
				System.out.println("\n" + decision.getAtkDecision()); 
				
				if (decision.getAtkDecision().contains("WON")) {
					break;
				}
				
				if (decision.getAtkDecision().contains("DEFEATED")) {
					break;
				}
				
				if (decision.getAtkDecision().contains("TIE")) {
				}
			} 
			
			System.out.print("DO YOU WANT TO TRY AGAIN?\n[1] YES\n[2] NO\n\nCHOICE: ");
			again = input.nextInt();
			
		break;
		case 2:
			again = 2;
		break;
		default:
			System.out.println("ERROR!");
		break;	
		}
		
		} while (again == 1);
		
		System.out.println("\n==========================");
		
		System.out.println("\nTHANK YOU FOR PLAYING!");
		
		input.close();
	}
}
