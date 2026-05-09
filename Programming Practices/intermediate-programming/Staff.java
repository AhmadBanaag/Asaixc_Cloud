package puzzles;

import javax.swing.JOptionPane;

public class Staff extends People {
	private String department;
	private String position;
	
	public Staff() {
		super();
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = JOptionPane.showInputDialog("ENTER DEPARTMENT: ");
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = JOptionPane.showInputDialog("ENTER POSITION: ");
	}

	@Override
	public void displayRole() {
		JOptionPane.showMessageDialog(null, "NAME: " + getName().toUpperCase() + "\nID: " + getID() + "\nDEPARTMENT: " + getDepartment().toUpperCase() + "\nPOSITION: " + getPosition().toUpperCase());
	}
	

}
