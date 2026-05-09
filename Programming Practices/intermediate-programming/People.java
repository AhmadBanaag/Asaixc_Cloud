package puzzles;

import javax.swing.JOptionPane;

public abstract class People {
	protected String name;
	protected int id;
	
	public People() {
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = JOptionPane.showInputDialog("ENTER NAME: ");
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = Integer.parseInt(JOptionPane.showInputDialog("ENTER ID: "));
	}
	
	
	public abstract void displayRole();
}
