package puzzles;
import java.util.Random;

public class RPSChoices {
	
	public RPSChoices() {
	}
	
	public String getOppsChoices() {
		
	    Random rand = new Random();
		
		String[] oppsChoices = {"PAPER", "PAPER", "PAPER", "ROCK", "SCISSORS", "SCISSORS", "ROCK", "ROCK", "SCISSORS"};
		
		return oppsChoices[rand.nextInt(0, 9)];
	}
}
