package allAboutJ.writingAndReading;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class cs04Lab1 {
	public static void main(String[] args) throws FileNotFoundException{
		
		String isAgain  = "";
		
		//INPUT
		do {
		String studName = JOptionPane.showInputDialog(null, "Enter FULL Name: ", "Student Name", 1);
		double studMidtermGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter MIDTERM GRADE: ", "Midterm Grade", 1));
		double studFinalTermGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter FINALTERM GRADE: ", "Final Term", 1));
		
		//FORMULA
		double finalGrade = (0.5 * studMidtermGrade) + (0.5 * studFinalTermGrade);
		
		String remarks = "";
		
		if (finalGrade >= 75) {
			remarks = "Passed";
		}  else {
			remarks = "Failed";
		}
		
		isAgain = JOptionPane.showInputDialog(null, "Do you want to add another student?", "Another Student", 1);
		
		try { 
			
			FileWriter output = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\gradeOutput.txt", true);
		
		//OUTPUT
		output.write("Name of the Student: " + studName + "\nFinal Grade: " + finalGrade + "\nRemarks: " + remarks + "\n_______________________________\n");
		
		output.close();
		}
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(
					null,
					"ERROR! ERROR! ERROR!" +
					"Description: " +
					e.getMessage(),
					"Error Found",
					JOptionPane.WARNING_MESSAGE);
		}
		
		finally {
			JOptionPane.showMessageDialog(
					null,
					"DATA SAVED",
					"Saved",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		} while (isAgain.equals("yes"));
	}
}
