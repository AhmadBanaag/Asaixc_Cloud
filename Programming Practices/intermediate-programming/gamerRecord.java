package allAboutJ.writingAndReading;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;

public class gamerRecord {
	public static void main(String[] args) throws FileNotFoundException {
		
		String inputFilePath = "C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\gamerScores.txt";
		String outputFilePath = "C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\gamerlogs.txt";
		
		Scanner input = new Scanner(new File(inputFilePath));
		
		try {
			FileWriter print = new FileWriter(outputFilePath, true);
		
		//Game title
		String gameTitle = input.nextLine();
		
		//Player Name
		String playerName = input.next();
		
		//SCORES
		int score1 = input.nextInt();
		int score2 = input.nextInt();
		int score3 = input.nextInt();
		int score4 = input.nextInt();
		int score5 = input.nextInt();
		
		int totalScores = score1 + score2 + score3 + score4 + score5;
		
		//AVERAGE SCORES
		double average = totalScores / 5;
		
		print.write("\nGame Title: " 
					+ gameTitle + 
					"\nPlayer's Name: " + 
					playerName + 
					"\nTotal Score: " + 
					totalScores + 
					"\nAverage Score: " + 
					average + 
					"\n___________________________________");
		
		input.close();
		print.close();
		}
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(
					null,
					"ERROR! ERROR! ERROR!\nPlease Try Again.\n\nDescription: " +
					e.getMessage(),
					"Input - Output ERROR",
					JOptionPane.WARNING_MESSAGE);
		}
		finally {
			JOptionPane.showMessageDialog(
					null,
					"DATA SAVED.",
					"SAVED",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
