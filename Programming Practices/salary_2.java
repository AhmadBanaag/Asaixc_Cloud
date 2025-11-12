// FOP lab 1
package Default;
import javax.swing.JOptionPane;

public class salary_2 {
	public static void main(String[] args) {
		
	String Name;
	int Days;
	
	Name = JOptionPane.showInputDialog("Enter the Employee's Name: ");
	Days = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Days: "));
	
	int dailyRate = 500;
	int philHealth = 220;
	int SSS = 330; 
	
	int monthlySalary = (dailyRate * Days) - (philHealth + SSS);
	
	JOptionPane.showMessageDialog(null, "Name: " + Name + "\n" + "Net Monthly Salary: " + "Php " + monthlySalary);
	
	}
}
