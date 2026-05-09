package puzzles;

import javax.swing.JOptionPane;

public class Teacher extends People{
	private String subject;
	private double salary;
	
	public Teacher() {
		super();
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = JOptionPane.showInputDialog("ENTER SUBJECT: ");
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = Double.parseDouble(JOptionPane.showInputDialog("ENTER SALARY: "));
	}
	
	@Override
	public void displayRole() {
		JOptionPane.showMessageDialog(null, "NAME: " + getName().toUpperCase() + "\nID: " + getID() + "\nDEPARTMENT: " + getSubject().toUpperCase() + "\nPOSITION: " + getSalary());
	}

}
