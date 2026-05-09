package puzzles;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class HangmanMain {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner read = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\handmanWords.txt"));
		Random dice = new Random();
		
		int indexOfWord = dice.nextInt(1, 15);
		
		int numOfWord = 0;
		String word = "";
		
		
		while(read.hasNext() && numOfWord < indexOfWord) {
			word = read.next();
			numOfWord++;
		}
		
		Scanner get = new Scanner(System.in);
		
		ArrayList<Character> numOfLetters = new ArrayList<>();
		int wrongGuesses = 0;
		
		for (int i = 0; i < word.length(); i++) {
			 numOfLetters.add('_');
		}
		
		System.out.println("---------------------");
		System.out.println("WELCOME TO TAO BITAY!");
		System.out.println("--------------------- ");
		
		do {
		
		System.out.println("WORD: ");
		
		for (char lettersCount : numOfLetters) {
			System.out.print(lettersCount + " ");
		}
		
		System.out.print("\nGUESS A LETTER: ");
		char userGuess = get.next().toLowerCase().charAt(0);
		
		if(word.indexOf(userGuess) >= 0) {
			System.out.println("CORRECT GUESS!\n");
			
			for(int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == userGuess) {
					numOfLetters.set(i, userGuess);
				}
			}
			
		} else {
			System.out.println("WRONG GUESS!");
			wrongGuesses++;
			System.out.println(getHangmanArt(wrongGuesses));
		}
		
		String wordTempCheck = "";
		
		for (char wordCheck : numOfLetters) {
			wordTempCheck += Character.toString(wordCheck);
		}
		
		if (wordTempCheck.equalsIgnoreCase(word)) {
			System.out.printf("CONGRATULATIONS! YOU CORRECTLY GUESSED THE WORD [%s]!", word);
			break;
		 }
		
		if (wrongGuesses == 6) {
			System.out.print("You KILLED youself! Please try again!");
			break;
		}
		
		} while (wrongGuesses < 6);
		
		get.close();
		read.close();
	}
	
	private static String getHangmanArt(int wrongGuesses) {
		
		return switch(wrongGuesses) {
		
		case 0 -> """
					
					
					
				  """;
		
		case 1 -> """
				   O
				
		
				  """;		
				  
		case 2 -> """
				   O
				   |

				  """;	
				  
		case 3 -> """
				   O
				  /|

				  """;	
				  
		case 4 -> """
				   O
				  /|\\

				  """;	
				  
		case 5 -> """
				   O
				  /|\\
				  /
				  """;
				  
		case 6 -> """
				   O
				  /|\\
				  /	\\
				  """;		
		
		default -> """
				   """; 
		};
	}

}
