package puzzles;
import java.util.Scanner;

public class RPSDecision extends RPSChoices {
	
	private String[] atkChoices = {"ROCK", "PAPER", "SCISSORS"};	
	private String enemyChoices;
	private int atkChoice;
	
	
	public RPSDecision() {
	}
	
	public String getAtkDecision() {
		
		String statement = "";
		
		if (enemyChoices.equalsIgnoreCase(atkChoices[atkChoice - 1])) {
			statement = "\n==========================\n" + "IT'S A TIE!" + "\n==========================\n";
		} else if (!enemyChoices.equalsIgnoreCase(atkChoices[atkChoice - 1])) {
			
			if (enemyChoices.equalsIgnoreCase("PAPER") && atkChoices[atkChoice - 1].equalsIgnoreCase("ROCK")) {
				statement = "\n==========================\n" + "YOU HAVE BEEN DEFEATED!" + "\n==========================\n";
			}			
			
			if ( enemyChoices.equalsIgnoreCase("ROCK") && atkChoices[atkChoice - 1].equalsIgnoreCase("SCISSORS") ) {
				statement = "\n==========================\n" + "YOU HAVE BEEN DEFEATED!" + "\n==========================\n";
			}
			
			if (enemyChoices.equalsIgnoreCase("SCISSORS") && atkChoices[atkChoice - 1].equalsIgnoreCase("PAPER")) {
				statement = "\n==========================\n" + "YOU HAVE BEEN DEFEATED!" + "\n==========================\n";
			}

			if (enemyChoices.equalsIgnoreCase("ROCK") && atkChoices[atkChoice - 1].equalsIgnoreCase("PAPER")) {
				statement = "\n==========================\n" + "YOU HAVE WON!" + "\n==========================\n";
			}
			
			if (enemyChoices.equalsIgnoreCase("PAPER") && atkChoices[atkChoice - 1].equalsIgnoreCase("SCISSORS")) {
				statement = "\n==========================\n" + "YOU HAVE WON!" + "\n==========================\n";
			}
			
			if (enemyChoices.equalsIgnoreCase("SCISSORS") && atkChoices[atkChoice - 1].equalsIgnoreCase("ROCK")) {
				statement = "\n==========================\n" + "YOU HAVE WON!" + "\n==========================\n";
			}
		}
		return statement;	
	}
	
	public void setAtkDecision() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nWHAT TO THROW?\n[1] ROCK\n[2] PAPER\n[3] SCISSORS\n\nCHOICE: ");
		atkChoice = input.nextInt();
		
		enemyChoices = super.getOppsChoices();
		System.out.printf("\nYOUR OPPONENT THREW \"%s\"", enemyChoices);
		
	}
}
