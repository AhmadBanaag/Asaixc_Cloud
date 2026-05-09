package puzzles;

import javax.swing.JOptionPane;

public class AlcoholicBeverage extends Beverage {
	private double alcoholContent;
	
	public AlcoholicBeverage() {
		super();
	}
	
	public AlcoholicBeverage(String manufacturer, String name, String containerType, double netContent, double alcoholContent) {
		super(manufacturer, name, containerType, netContent);
		this.alcoholContent = alcoholContent;	
	}
	
	public double getAlcoholicContent() {
		return alcoholContent;
	}
	
	public void setAlcoholContent(double alcoholContent) {
		this.alcoholContent = Double.parseDouble(JOptionPane.showInputDialog(
				null,
				"ENTER ALCOHOL CONTENT:",
				"A and W",
				JOptionPane.PLAIN_MESSAGE));
	}
	
	@Override
	public String displayAll() {
		return super.displayAll() +
			   "\nALCOHOL CONTENT: " + getAlcoholicContent();		
	}
	
}
