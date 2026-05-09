package puzzles;

import javax.swing.JOptionPane;

public class Beverage {
	protected String manufacturer;
	protected String name;
	protected String containerType;
	protected double netContent;

	protected static int beverageCount;
	
	public Beverage() {
		beverageCount++;
	}
	
	public Beverage(String manufacturer, String name, String containerType, double netContent) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.containerType = containerType;
		this.netContent = netContent;
		beverageCount++;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = JOptionPane.showInputDialog(
				null,
				"ENTER MANUFACTURER:",
				"A and W",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = JOptionPane.showInputDialog(
				null,
				"ENTER NAME:",
				"A and W",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public String getContainerType() {
		return containerType;
	}
	
	public void setContainerType(String containerType) {
		this.containerType = JOptionPane.showInputDialog(
				null,
				"ENTER CONTAINER TYPE:",
				"A and W",
				JOptionPane.PLAIN_MESSAGE);
	}
	
	public double getNetContent() {
		return netContent;
	}
	
	public void setNetContent(double netContent) {
		this.netContent = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"ENTER NET CONTENT:",
				"A and W",
				JOptionPane.PLAIN_MESSAGE));
	}
	
	public String displayAll() {
		return "\nMANUFACTURER: " + getManufacturer() + 
			   "\nBEVERAGE NAME: " + getName() +
			   "\nCONTAINER TYPE: " + getContainerType() +
			   "\nNET CONTENT: " + getNetContent();
	}
	
}
