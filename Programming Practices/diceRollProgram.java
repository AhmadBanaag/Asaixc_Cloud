package Default;
import java.util.Scanner;
import java.util.Random;

public class diceRollProgram {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	
	int total = 0;
	
	System.out.print("Enter the Number of Dice to Roll: ");
	int dice = input.nextInt();
	
	if (dice > 0) {
		
		for (int i = 1; i < dice + 1; i++) {
			int roll = random.nextInt(1,7);
			printDie(roll);
			System.out.println("Roll " + i + " is " + roll);
			total += roll;
		}
		System.out.println("The Total Number of Rolls is " + total);
	} else {
		System.out.println("The Number of Dice MUST BE Greater than 0!");
		}
	
	System.out.println("-----------------------------");
	System.out.println("Thank you for using the dice!");
	
	input.close();
	
	}
	
	static void printDie(int roll) {
		String die1 =  """ 
				 -------
				|		|
				|	0	|
				|		|
				 -------
				""";
		String die2 =  """ 
				 -------
				|0		|
				|	0	|
				|		|
				 -------
				""";
		String die3 =  """ 
				 -------
				|0	   0	|
				|	0	|
				|		|
				 -------
				""";
		String die4 =  """ 
				 -------
				|0	   0	|
				|	0  	|
				|	   0	|
				 -------
				""";
		String die5 =  """ 
				 -------
				|0	   0|
				|	0  	|
				|0	   0	|
				 -------
				""";
		
		switch (roll) {
		case 1 -> System.out.print(die1);
		case 2 -> System.out.print(die2);
		case 3 -> System.out.print(die3);
		case 4 -> System.out.print(die4);
		case 5 -> System.out.print(die5);
		default -> System.out.print("Invalid Roll");
		
		}
		
	}
	
}
